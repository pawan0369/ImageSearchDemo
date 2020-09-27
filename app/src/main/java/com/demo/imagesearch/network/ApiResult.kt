package com.demo.imagesearch.network

/**
 * Result state for response
 */
sealed class ApiResult<out R, out E> {

    object OnLoading : ApiResult<Nothing, Nothing>()

    data class OnSuccess<out R>(val response: R): ApiResult<R, Nothing>()

    data class OnFailure<out E>(val exception: E): ApiResult<Nothing, E>()
}