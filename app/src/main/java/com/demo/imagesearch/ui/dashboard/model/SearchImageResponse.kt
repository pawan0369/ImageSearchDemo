package com.demo.imagesearch.ui.dashboard.model

data class SearchImageResponse(
    val `data`: List<SearchData>,
    val status: Int,
    val success: Boolean
)