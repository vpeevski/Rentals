package com.outdoorsy.interview.api

enum class ErrorCode(val message: String) {
    NetworkError("Unable to connect. Check your internet connection."),
    NotFount("Empty result")
}