package com.outdoorsy.interview.ui.rental.details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.outdoorsy.interview.navigation.SingleRentalDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RentalDetailsViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _isFavorite = MutableStateFlow(false)
    val isFavorite: StateFlow<Boolean> = _isFavorite
    val rentalId: String
        get() {
            return savedStateHandle[SingleRentalDetails.rentalIdParam] ?: "-1"
        }

    fun toggleFavorite() {
        _isFavorite.value = !_isFavorite.value
    }
}