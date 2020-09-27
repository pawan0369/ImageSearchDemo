package com.demo.imagesearch.network

import com.demo.imagesearch.ui.dashboard.model.SearchImageResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @GET("gallery/search/{count}")
    fun getListenerTrainingResult(@Path("count") count: String?, @Query("q") searchKey:String): Call<SearchImageResponse>
}