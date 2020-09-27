package com.demo.imagesearch.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.afollestad.materialdialogs.MaterialDialog

/**
 * [BaseActivity] that adds helper methods for data binding.
 */
abstract class DataBindingActivity<TBinding : ViewDataBinding> : BaseActivity() {

    var loader: MaterialDialog? = null
    /**
     * The Layout Resource ID for the fragment. This is inflated automatically.
     */
    abstract val layoutRes: Int
        @LayoutRes get

    protected lateinit var binding: TBinding
    /**
     * Creates the [ViewDataBinding] for this view.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        binding.lifecycleOwner = this
        loader = MaterialDialog.Builder(this).title("Loading")
            .progressIndeterminateStyle(true)
            .progress(true, 0)
            .cancelable(false)
            .build()
    }

    /**
     * Creates a [ViewModel] and binds it to the [ViewDataBinding] for this view.
     */
    protected inline fun <reified T : ViewModel> bindViewModel(
        noinline f: (TBinding.(T) -> Unit)? = null
    ): T {
        val viewModel = getViewModel(T::class.java)
        f?.invoke(binding, viewModel)
        binding.executePendingBindings()
        return viewModel
    }



}