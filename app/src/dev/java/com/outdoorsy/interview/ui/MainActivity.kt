package com.outdoorsy.interview.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.outdoorsy.interview.navigation.OutdoorsyNavHost
import com.outdoorsy.interview.ui.drawer.drawerBody
import com.outdoorsy.interview.ui.drawer.drawerHeader
import com.outdoorsy.interview.ui.theme.OutdoorsyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OutdoorsyTheme(dynamicColor = false) {
                AppContent()
            }
        }
    }

    @Preview
    @Composable
    fun AppContent() {
        val navController = rememberNavController()
        val snackbarHostState = remember { SnackbarHostState() }
        val appBarState = rememberAppBarState(navController)
        val drawerState = rememberDrawerState(DrawerValue.Closed)
//        val composableScope = rememberCoroutineScope()
        ModalNavigationDrawer(
            drawerState = drawerState,
            gesturesEnabled = drawerState.isOpen,
            drawerContent = {
                Column(modifier = Modifier.background(MaterialTheme.colorScheme.primaryContainer)) {
                    drawerHeader()
                    drawerBody(
                        items = listOf(
                            ActionMenuItem.AlwaysShown(
                                type = ActionMenuItemType.Settings,
                                title = "Settings",
                                icon = Icons.Default.Settings,
                                contentDescription = "App settings"
                            ),
                            ActionMenuItem.AlwaysShown(
                                type = ActionMenuItemType.Login,
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
                snackbarHost = { SnackbarHost(snackbarHostState) }
            ) { paddingValues ->
                OutdoorsyNavHost(
                    modifier = Modifier.padding(paddingValues),
                    navController = navController,
                    appBarState = appBarState,
                    drawerState = drawerState,
                    snackbarHostState = snackbarHostState,
                )
            }
        }


    }
}
