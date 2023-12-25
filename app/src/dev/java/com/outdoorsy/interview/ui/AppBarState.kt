package com.outdoorsy.interview.ui

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.outdoorsy.interview.navigation.Home
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

// AppBarState holds state of the top app navigation bar.
// Properties are taken from current instance of screen state
// through navController.
class AppBarState(
    val navController: NavController,
    scope: CoroutineScope
) {

    init {
        navController.currentBackStackEntryFlow
            .distinctUntilChanged()
            .onEach { navBackStackEntry ->
                currentScreen = screenForRoute(navBackStackEntry.destination.route)
            }.launchIn(scope)
    }

//    private val currentRoute: String?
//        @Composable get() = navController.currentBackStackEntryAsState().value?.destination?.route

    var currentScreen by mutableStateOf<ScreenWithButtons?>(null)
        private set


    val isVisible: Boolean
        @Composable get() = currentScreen?.isTopBarVisible ?: false

    val title: String
        @Composable get() = currentScreen?.title.orEmpty()

    val actions: List<ActionMenuItem>
        @Composable get() = currentScreen?.actions.orEmpty()

    val navigationAction: ActionMenuItem?
        @Composable get() = currentScreen?.navigationAction
}

@Composable
fun rememberAppBarState(
    navController: NavController,
    scope: CoroutineScope = rememberCoroutineScope()
) = remember {
    AppBarState(navController, scope)
}