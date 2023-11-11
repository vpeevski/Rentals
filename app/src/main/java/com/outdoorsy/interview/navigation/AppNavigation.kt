package com.outdoorsy.interview.navigation

interface AppNavigation {
    val route: String
}

object AllRentals : AppNavigation {
    override val route: String = "all-rentals"
}

object SingleRentalDetails : AppNavigation {
    override val route: String = "rental-details"
}