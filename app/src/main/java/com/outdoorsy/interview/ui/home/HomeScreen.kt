package com.outdoorsy.interview.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.outdoorsy.interview.snackbar.showSnackBar
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.HomeScreenState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Composable
fun HomeScreen(
    appBarState: AppBarState,
    snackbarHostState: SnackbarHostState,
    onLoginClick: () -> Unit = {},
    onSearchRentalsClick: () -> Unit = {}
) {
    val screen = appBarState.currentScreen
    LaunchedEffect(key1 = screen) {
        screen?.buttonsFlow?.onEach { button ->
            when (button) {
                ActionMenuItemType.Login -> {
                    onLoginClick()
                    showSnackBar("HomeScreen: Clicked on ${button.name}", snackbarHostState, this)
                }

                else -> {}
            }
        }?.launchIn(this)
    }
    Text(modifier = Modifier.clickable {
        onSearchRentalsClick()
    }, text = "Search Rentals...")

}