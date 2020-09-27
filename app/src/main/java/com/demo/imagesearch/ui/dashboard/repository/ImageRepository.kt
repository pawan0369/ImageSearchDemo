package com.demo.imagesearch.ui.dashboard.repository

import com.demo.imagesearch.network.ApiResult
import com.demo.imagesearch.ui.dashboard.model.SearchImageResponse

interface ImageRepository {
    suspend fun getSearchedImages(count: String, searchKey: String) : ApiResult<SearchImageResponse, String>
}