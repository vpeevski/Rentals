package com.outdoorsy.interview.navigation

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.outdoorsy.interview.ui.Action
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.ShowFullSizeCentered
import com.outdoorsy.interview.ui.home.HomeScreen
import com.outdoorsy.interview.ui.rental.details.RentalDetails
import com.outdoorsy.interview.ui.rentals.RentalsViewModel
import com.outdoorsy.interview.ui.rentals.SearchRentals

@Composable
fun OutdoorsyNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: AppNavigation = Home,
    appBarState: AppBarState
) {
    NavHost(
        modifier = modifier,
        startDestination = startDestination.route,
        navController = navController
    ) {

        composable(route = Loading.route) {
            ShowFullSizeCentered {
                CircularProgressIndicator()
            }
        }

        composable(route = AllRentals.route) {
            val rentalsViewModel = hiltViewModel<RentalsViewModel>()
            val filter = rentalsViewModel.filter.collectAsState().value
            SearchRentals(
                appBarState = appBarState,
                filter = filter,
                onFilterChanged = { newFilter ->
                    rentalsViewModel.filter.value = newFilter
                },
                onRentalClick = { rentalId ->
                    navController.navigate("${SingleRentalDetails.route}/$rentalId")
                },
                pagingRentals = rentalsViewModel.rentalsResult,
                onRemoveRental = { rental ->
                    rentalsViewModel.onApplyUserAction(
                        Action.Remove(
                            rental
                        )
                    )
                },
                onBackPressed = {
                    navController.popBackStack()
                },
                onSettingsPressed = {
                    println("Settings pressed...")
                }
            )
        }

        composable(route = Home.route) {
            HomeScreen(
                appBarState = appBarState,
                onLoginClick = {
                    println("Login clicked...")
                },
                onSearchRentalsClick = {
                    println("Search Rentals clicked...")
                    navController.navigate(AllRentals.route)
                })
        }

        composable(
            route = SingleRentalDetails.routeWithArguments,
//            arguments = SingleRentalDetails.routeArguments
        ) { navBackStackEntry ->
            val rentalId = navBackStackEntry.arguments?.getString(SingleRentalDetails.rentalIdParam)
            RentalDetails(rentalId)
        }
    }
}