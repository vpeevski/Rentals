package com.outdoorsy.interview.ui

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.SnackbarHostState
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    init {
        println("MainViewModel init...")
    }

    var drawerState: DrawerState = DrawerState(DrawerValue.Closed)
    val snackbarHostState: SnackbarHostState = SnackbarHostState()

    private val _snackbarMessages = MutableStateFlow<String?>(null)
    val snackbarMessages: StateFlow<String?> = _snackbarMessages

    fun updateSnackbarMessage(message: String) {
        _snackbarMessages.value = message
    }

    fun showDrawer(coroutineScope: CoroutineScope) {
        coroutineScope.launch {
            drawerState.open()
        }
    }

    fun showSnackBar(
        text: String,
        scope: CoroutineScope
    ) {
        scope.launch {
            snackbarHostState.showSnackbar(text, withDismissAction = true)
        }
    }
}