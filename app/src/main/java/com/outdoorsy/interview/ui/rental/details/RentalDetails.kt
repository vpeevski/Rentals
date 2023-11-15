package com.outdoorsy.interview.ui.rental.details

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RentalDetails(rentalDetailsViewModel: RentalDetailsViewModel) {
    Text(text = "Single rental details, id: ${rentalDetailsViewModel.rentalId}")
}