package com.outdoorsy.interview.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.outdoorsy.interview.navigation.OutdoorsyNavHost
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
                snackbarHostState = snackbarHostState,
            )
        }

    }
}
