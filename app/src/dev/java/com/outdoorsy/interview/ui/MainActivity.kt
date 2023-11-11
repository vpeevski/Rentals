package com.outdoorsy.interview.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.outdoorsy.interview.navigation.OutdoorsyNavHost
import com.outdoorsy.interview.ui.rentals.RentalsViewModel
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
        OutdoorsyNavHost(
            modifier = Modifier,
            navController = navController
        )
    }
}
