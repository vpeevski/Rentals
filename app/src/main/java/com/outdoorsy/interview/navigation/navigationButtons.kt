package com.outdoorsy.interview.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Composable
fun BackNavigationButton(
    appBarState: AppBarState,
    onBackPressed: () -> Unit = {}
) {
    val screen = appBarState.currentScreen
    LaunchedEffect(key1 = screen) {
        screen?.buttonsFlow?.onEach { button ->
            when (button) {
                ActionMenuItemType.Back -> onBackPressed()
                else -> {}
            }
        }?.launchIn(this)
    }
}