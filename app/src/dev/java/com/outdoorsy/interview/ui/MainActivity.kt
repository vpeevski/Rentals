package com.outdoorsy.interview.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.outdoorsy.interview.navigation.OutdoorsyNavHost
import com.outdoorsy.interview.ui.drawer.drawerBody
import com.outdoorsy.interview.ui.drawer.drawerHeader
import com.outdoorsy.interview.ui.theme.OutdoorsyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OutdoorsyTheme(dynamicColor = false) {
                AppContent(mainViewModel = mainViewModel)
            }
            LaunchedEffect(key1 = mainViewModel.snackbarHostState) {
                mainViewModel.snackbarMessages.collect { message ->
                    message?.let {
                        println(message)
                        mainViewModel.showSnackBar(it, this)
//                        showSnackBar(it, mainViewModel.snackbarHostState, this)
                    }
                }
            }
        }
    }

    @Preview
    @Composable
    fun AppContent(mainViewModel: MainViewModel = viewModel()) {
        val navController = rememberNavController()
        val appBarState = rememberAppBarState(navController)
        val scope = rememberCoroutineScope()
        ModalNavigationDrawer(
            drawerState = mainViewModel.drawerState,
            gesturesEnabled = mainViewModel.drawerState.isOpen,
            drawerContent = {
                ModalDrawerSheet {
                    drawerHeader()
                    drawerBody(
                        items = listOf(
                            ActionMenuItem.AlwaysShown(
                                type = ActionMenuItemType.Settings,
                                onClick = {
                                    mainViewModel.updateSnackbarMessage("Drawer: Settings Clicked..")
                                    mainViewModel.hideDrawer(scope)
                                },
                                title = "Settings",
                                icon = Icons.Default.Settings,
                                contentDescription = "App settings"
                            ),
                            ActionMenuItem.AlwaysShown(
                                type = ActionMenuItemType.Login,
                                onClick = {
                                    mainViewModel.updateSnackbarMessage("Drawer: Login Clicked..")
                                    mainViewModel.hideDrawer(scope)
                                },
                                title = "Login",
                                icon = Icons.Default.Person,
                                contentDescription = "Login"
                            )
                        )
                    )
                }

            }
        ) {
            Scaffold(
                topBar = {
                    TopActionsBar(appBarState)
                },
                snackbarHost = { SnackbarHost(mainViewModel.snackbarHostState) }
            ) { paddingValues ->
                OutdoorsyNavHost(
                    modifier = Modifier.padding(paddingValues),
                    navController = navController,
                    appBarState = appBarState
                )
            }
        }


    }
}
