package com.outdoorsy.interview.ui.rental.details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.outdoorsy.interview.navigation.SingleRentalDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RentalDetailsViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    val rentalId: String
        get() {
            return savedStateHandle[SingleRentalDetails.rentalIdParam] ?: "-1"
        }
}