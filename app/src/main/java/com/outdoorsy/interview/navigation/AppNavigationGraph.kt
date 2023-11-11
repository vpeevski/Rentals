package com.outdoorsy.interview.navigation

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.outdoorsy.interview.ui.ShowFullSizeCentered
import com.outdoorsy.interview.ui.rentals.SearchRentals

@Composable
fun OutdoorsyNavHost(
    modifier: Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        startDestination = AllRentals.route,
        navController = navController
    ) {

        composable(route = Loading.route) {
            ShowFullSizeCentered {
                CircularProgressIndicator()
            }
        }

        composable(route = AllRentals.route) {
            SearchRentals(hiltViewModel())
        }
    }
}