package com.outdoorsy.interview.navigation

interface AppNavigation {
    val route: String
}

object AllRentals : AppNavigation {
    override val route: String = "all-rentals"
}

object Loading : AppNavigation {
    override val route: String = "loading"
}

object ErrorReload : AppNavigation {
    override val route: String = "error-reload"
}

object SingleRentalDetails : AppNavigation {
    override val route: String = "rental-details"
}