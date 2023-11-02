package com.outdoorsy.interview.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.outdoorsy.interview.repository.RentalsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class RentalsViewModel @Inject constructor(
    rentalsRepository: RentalsRepository
) : ViewModel() {

    val filter = MutableStateFlow("")
    val rentalsResult =
        filter.flatMapLatest { searchText ->
            rentalsRepository
                .fetchRentals(searchText)
                .catch { error ->
                    println("Error: $error")
                }
        }.cachedIn(viewModelScope)
}