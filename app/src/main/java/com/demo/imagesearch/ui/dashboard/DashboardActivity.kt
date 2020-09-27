package com.demo.imagesearch.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.imagesearch.R
import com.demo.imagesearch.databinding.ActivityDashboardBinding
import com.demo.imagesearch.network.ApiResult
import com.demo.imagesearch.ui.base.DataBindingActivity
import com.demo.imagesearch.ui.dashboard.adapter.ImagesListAdapter
import com.demo.imagesearch.ui.dashboard.model.ImageResult
import com.demo.imagesearch.ui.dashboard.model.SearchImageResponse
import com.demo.imagesearch.ui.dashboard.viewmodel.DashboardViewModel
import com.demo.imagesearch.util.GridDividerItemDecoration
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : DataBindingActivity<ActivityDashboardBinding>() {

    override val layoutRes: Int
        get() = R.layout.activity_dashboard

    private val imageList = ArrayList<ImageResult>()
    private lateinit var viewModel: DashboardViewModel

    private var pageNumber = 1
    private var hasNext = true
    private var searchKey = ""

    private val imageAdapter: ImagesListAdapter by lazy {
        ImagesListAdapter(imageList) {
            startActivity(Intent(this, ImageDetailsActivity::class.java).putExtra("result", it))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = getViewModel(DashboardViewModel::class.java)
            .also { binding.vm = it }
        initRecycler()
        initObserver()

        binding.ivSearch.setOnClickListener {
            if (isNetworkConnected()) {
                searchKey = binding.etSearch.text.toString()
                viewModel.getSearchResult(pageNumber.toString(), searchKey)
                    .observe(this, searchObserver)
            }else{
                showSnackBar(getString(R.string.err_connection))
            }
        }
    }

    private fun initRecycler() {
        binding.rvImages.apply {
            layoutManager = GridLayoutManager(this.context, 4)
            val divider = ContextCompat.getDrawable(this@DashboardActivity, R.drawable.divider)
            val decorator = GridDividerItemDecoration(divider!!, divider,4)
            addItemDecoration(decorator)
            addItemDecoration(
                DividerItemDecoration(
                    this.context,
                    DividerItemDecoration.HORIZONTAL
                )
            )
            addOnScrollListener(onScrollListener)
            adapter = imageAdapter
        }
    }

    private fun initObserver() {
        binding.etSearch.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                if (isNetworkConnected()) {
                    searchKey = v.text.toString()
                    viewModel.getSearchResult(pageNumber.toString(), searchKey)
                        .observe(this, searchObserver)
                }else{
                    showSnackBar(getString(R.string.err_connection))
                }
                return@setOnEditorActionListener true
            }
            return@setOnEditorActionListener false
        }
        viewModel.resultSearchList.observe(this, searchDataObserver)
    }

    private val searchObserver =
        androidx.lifecycle.Observer<ApiResult<SearchImageResponse, String>> { state ->
            when (state) {
                is ApiResult.OnLoading -> {
                    if (pageNumber > 1){
                        pb_bottom.visibility = View.VISIBLE
                    }else if (!loader?.isShowing!!) loader?.show()
                }
                is ApiResult.OnFailure -> {
                    if (pb_bottom.isVisible) pb_bottom.visibility = View.GONE
                    if (loader?.isShowing!!) loader?.dismiss()
                    showSnackBar(state.exception)
                }
                is ApiResult.OnSuccess -> {
                    binding.etSearch.setText("")
                    val resultResponse = state.response.data
                    Log.d("P-Response", resultResponse.toString())
                    hasNext = resultResponse.isNotEmpty()
                    if (hasNext) viewModel.setSearchData(resultResponse)
                    else showSnackBar(getString(R.string.no_data))

                    if (pb_bottom.isVisible) pb_bottom.visibility = View.GONE
                    if (loader?.isShowing!!) loader?.dismiss()
                }
            }
        }

    private val searchDataObserver = Observer<ArrayList<ImageResult>> {
        if (it.size > 0) {
            val initialSize = imageList.size
            imageList.addAll(it)
            val updatedSize = imageList.size + initialSize
            imageAdapter.notifyItemRangeInserted(initialSize, updatedSize)
        }
    }

    private val onScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            val manager = binding.rvImages.layoutManager as GridLayoutManager
            val visibleItemCount: Int = manager.childCount
            val totalItemCount: Int = manager.itemCount
            val firstVisibleItemPosition: Int = manager.findFirstVisibleItemPosition()

            if (visibleItemCount + firstVisibleItemPosition >= totalItemCount
            ) {
                pageNumber++
                viewModel.getSearchResult(pageNumber.toString(), searchKey)
                    .observe(this@DashboardActivity, searchObserver)
            }
        }
    }
}