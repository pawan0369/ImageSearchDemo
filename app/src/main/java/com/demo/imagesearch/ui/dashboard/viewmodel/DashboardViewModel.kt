package com.demo.imagesearch.ui.dashboard.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.demo.imagesearch.network.ApiResult
import com.demo.imagesearch.ui.dashboard.model.ImageResult
import com.demo.imagesearch.ui.dashboard.model.SearchData
import com.demo.imagesearch.ui.dashboard.repository.ImagesRepositoryIml
import com.demo.imagesearch.util.TYPE_IMAGE
import kotlinx.coroutines.launch
import javax.inject.Inject

class DashboardViewModel @Inject constructor(private val imagesRepositoryIml: ImagesRepositoryIml) :
    ViewModel() {

    private val searchList = MutableLiveData<ArrayList<ImageResult>>()
    val resultSearchList = searchList

    fun getSearchResult(count: String, searchKey: String) = liveData {
        emit(ApiResult.OnLoading)
        when (val result = imagesRepositoryIml.getSearchedImages(count, searchKey)) {
            is ApiResult.OnFailure -> emit(ApiResult.OnFailure(result.exception))
            is ApiResult.OnSuccess -> emit(ApiResult.OnSuccess(result.response))
        }
    }

    fun setSearchData(list: List<SearchData>) {
        val imagesList = ArrayList<ImageResult>()
        viewModelScope.launch {
            list.forEach { data ->
                val imageTitle = data.title
                data.images?.let {
                    it.forEach { image ->
                        image.type?.let {type ->
                            if (type.contains(TYPE_IMAGE)) {
                                imagesList.add(
                                    ImageResult(image.datetime,
                                        image.link,
                                        image.title ?: imageTitle
                                    )
                                )
                            }
                        }
                    }
                }
            }
            if (imagesList.size > 0){
                searchList.postValue(imagesList)
            }
        }
    }

}