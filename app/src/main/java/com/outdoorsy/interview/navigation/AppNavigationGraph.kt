package com.outdoorsy.interview.navigation

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.outdoorsy.interview.ui.Action
import com.outdoorsy.interview.ui.AppBarState
import com.outdoorsy.interview.ui.ShowFullSizeCentered
import com.outdoorsy.interview.ui.home.HomeScreen
import com.outdoorsy.interview.ui.rental.details.RentalDetailsScreen
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

        rentalsGraph(navController, appBarState)

        composable(route = Home.route) { navBackStackEntry ->
            navBackStackEntry.viewModelStore
            HomeScreen(
                appBarState = appBarState,
                onLoginClick = {
                    println("Login clicked...")
                },
                onRentalsClick = {
                    println("Rentals clicked...")
                    navController.navigate(RentalsNavGraph.route)
                })
        }

//        composable(
//            route = SingleRentalDetails.routeWithArguments,
////            arguments = SingleRentalDetails.routeArguments
//        ) { // navBackStackEntry ->
//            // val rentalId = navBackStackEntry.arguments?.getString(SingleRentalDetails.rentalIdParam)
////            RentalDetailsScreen(
////                appBarState = appBarState,
////                // rentalId = rentalId,
////                onBackPressed = {
////                    navController.popBackStack()
////                })
//        }
    }
}

fun NavGraphBuilder.rentalsGraph(navController: NavController, appBarState: AppBarState) {
    navigation(startDestination = SearchRentals.route, route = RentalsNavGraph.route) {
        composable(SearchRentals.route) {
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
        composable(SingleRentalDetails.routeWithArguments) {
            RentalDetailsScreen(
                appBarState = appBarState,
                // rentalId = rentalId,
                onBackPressed = {
                    navController.popBackStack()
                })
        }
    }
}

@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return hiltViewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return hiltViewModel(parentEntry)
}