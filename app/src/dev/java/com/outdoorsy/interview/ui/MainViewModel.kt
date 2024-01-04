package com.outdoorsy.interview.ui

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.SnackbarHostState
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    init {
        println("MainViewModel init...")
    }

    var drawerState: DrawerState = DrawerState(DrawerValue.Closed)
    val snackbarHostState: SnackbarHostState = SnackbarHostState()

    fun showDrawer(coroutineScope: CoroutineScope) {
        coroutineScope.launch {
            drawerState.open()
        }
    }

    fun hideDrawer(coroutineScope: CoroutineScope) {
        coroutineScope.launch {
            drawerState.close()
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