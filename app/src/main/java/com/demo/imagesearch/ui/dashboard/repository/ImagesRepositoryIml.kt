package com.demo.imagesearch.ui.dashboard.repository

import android.util.Log
import com.demo.imagesearch.network.ApiInterface
import com.demo.imagesearch.network.ApiResult
import com.demo.imagesearch.ui.dashboard.model.SearchImageResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class ImagesRepositoryIml @Inject constructor(private val request: ApiInterface) : ImageRepository {
    override suspend fun getSearchedImages(count: String, searchKey: String): ApiResult<SearchImageResponse, String> =
        suspendCoroutine { continuation ->
            request.getListenerTrainingResult(count, searchKey).enqueue(object : Callback<SearchImageResponse> {
                override fun onFailure(call: Call<SearchImageResponse>, t: Throwable) {
                    continuation.resume(ApiResult.OnFailure(ERROR_RESPONSE))
                    Log.e("P-Error", t?.message)
                }

                override fun onResponse(
                    call: Call<SearchImageResponse>,
                    response: Response<SearchImageResponse>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        continuation.resume(ApiResult.OnSuccess(response.body()!!))
                    } else {
                        continuation.resume(ApiResult.OnFailure(ERROR_RESPONSE))
                    }
                }

            })
        }

    companion object {
        const val ERROR_RESPONSE = "Something went wrong,Please try again later."
    }
}