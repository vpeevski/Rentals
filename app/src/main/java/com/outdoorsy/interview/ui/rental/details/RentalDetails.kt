package com.outdoorsy.interview.ui.rental.details

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RentalDetails(rentalId: String?) {
    rentalId?.let {
        Text(text = "Single rental details, id: $rentalId")
    }
}