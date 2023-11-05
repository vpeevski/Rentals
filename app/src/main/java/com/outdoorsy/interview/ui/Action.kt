package com.outdoorsy.interview.ui

sealed class Action<T>() {
    data class Remove<R>(val item: R) : Action<R>()
    data class Insert<R>(val item: R) : Action<R>()
}
