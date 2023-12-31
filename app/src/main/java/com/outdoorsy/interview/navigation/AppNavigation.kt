package com.outdoorsy.interview.navigation

interface AppNavigation {
    val route: String
    val title: String?
        get() = ""
}

object Home : AppNavigation {
    override val route: String = "home"
    override val title: String?
        get() = "Outdoorsy home page"
}

object RentalsNavGraph : AppNavigation {
    override val route: String = "rentals"
    override val title: String?
        get() = "Rentals"
}

object SearchRentals : AppNavigation {
    override val route: String = "rentals-search"
    override val title: String?
        get() = "Search rentals"
}

object SingleRentalDetails : AppNavigation {
    override val route: String = "rental-details"
    override val title: String?
        get() = "Rental details"
    const val rentalIdParam = "rental_id"
    val routeWithArguments = "$route/{$rentalIdParam}"
//    val routeArguments = listOf(
//        navArgument(rentalId) { type = NavType.StringType }
//    )
}

object Loading : AppNavigation {
    override val route: String = "loading"
}

object ErrorReload : AppNavigation {
    override val route: String = "error-reload"
}