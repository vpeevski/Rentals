package com.outdoorsy.interview.snackbar

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

fun showSnackBar(
    text: String,
    snackbarHostState: SnackbarHostState,
    scope: CoroutineScope
) {
    scope.launch {
        snackbarHostState.showSnackbar(text)
    }
}