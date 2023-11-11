package com.outdoorsy.interview.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.ui.rentals.RentalsPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RentalsRepository @Inject constructor(
    private val outdoorsyApi: OutdoorsyApi
) {
    fun fetchRentals(filter: String): Flow<PagingData<Rental>> = Pager(
        config = PagingConfig(pageSize = 6, initialLoadSize = 6, enablePlaceholders = false),
        pagingSourceFactory = { RentalsPagingSource(outdoorsyApi, filter) }
    ).flow

}