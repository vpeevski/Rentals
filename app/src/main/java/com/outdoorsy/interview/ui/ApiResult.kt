package com.outdoorsy.interview.ui

import com.outdoorsy.interview.api.ErrorCode

sealed class ApiResult<out R> {
    object Loading : ApiResult<Nothing>()

    data class Success<out T>(val data: T) : ApiResult<T>()
    data class Error(val error: ErrorCode) : ApiResult<Nothing>()
}