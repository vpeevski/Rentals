package com.outdoorsy.interview.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.ui.RentalsPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RentalsRepository @Inject constructor(
    private val outdoorsyApi: OutdoorsyApi
) {
    fun fetchRentals(filter: String): Flow<PagingData<Any>> = Pager<Int, Any>(
        config = PagingConfig(pageSize = 20, enablePlaceholders = false),
        pagingSourceFactory = { RentalsPagingSource(outdoorsyApi, filter) }
    ).flow

}