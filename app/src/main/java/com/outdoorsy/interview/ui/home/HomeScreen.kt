package com.outdoorsy.interview.ui.home

import androidx.activity.ComponentActivity
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.outdoorsy.interview.ui.ActionMenuItemType
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.MainViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Composable
fun HomeScreen(
    appBarState: AppBarState,
    mainViewModel: MainViewModel = hiltViewModel(LocalContext.current as ComponentActivity),
    onLoginClick: () -> Unit = {},
    onSearchRentalsClick: () -> Unit = {}
) {
    val screen = appBarState.currentScreen
    LaunchedEffect(key1 = screen) {
        screen?.buttonsFlow?.onEach { button ->
            when (button) {
                ActionMenuItemType.Login -> {
                    onLoginClick()
                    mainViewModel.showSnackBar("HomeScreen: Clicked on ${button.name}", this)
                }

                ActionMenuItemType.Drawer -> {
                    mainViewModel.showDrawer(this)
                }

                else -> {}
            }
        }?.launchIn(this)
    }
    Text(modifier = Modifier.clickable {
        onSearchRentalsClick()
    }, text = "Search Rentals...")

}