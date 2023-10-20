package com.outdoorsy.interview.ui

import androidx.lifecycle.ViewModel
import com.outdoorsy.interview.repository.RentalsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RentalsViewModel @Inject constructor(
    rentalsRepository: RentalsRepository
) : ViewModel() {

    var filter: String = "";
    val rentalsPager = rentalsRepository.fetchRentals(filter)
}