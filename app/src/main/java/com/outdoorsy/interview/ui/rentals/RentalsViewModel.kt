package com.outdoorsy.interview.ui.rentals

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.filter
import androidx.paging.insertHeaderItem
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.repository.RentalsRepository
import com.outdoorsy.interview.ui.Action
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class RentalsViewModel @Inject constructor(
    rentalsRepository: RentalsRepository
) : ViewModel() {

    private val userActions = MutableStateFlow<List<Action<Rental>>>(emptyList())

    val filter = MutableStateFlow("")
    val rentalsResult =
        filter.flatMapLatest { searchText ->
            rentalsRepository
                .fetchRentals(searchText)
                .cachedIn(viewModelScope)
                .combine(userActions) { pagingData, userActions ->
                    userActions.fold(pagingData) { paging, action ->
                        applyActions(paging, action)
                    }
                }
        }

    fun onApplyUserAction(action: Action<Rental>) {
        userActions.value += action
    }

    private fun applyActions(
        paging: PagingData<Rental>,
        action: Action<Rental>
    ): PagingData<Rental> {
        return when (action) {
            is Action.Remove -> paging.filter {
                action.item != it
            }
            is Action.Insert -> paging.insertHeaderItem(item = action.item)
            // else -> paging
        }
    }

}