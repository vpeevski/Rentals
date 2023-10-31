package com.outdoorsy.interview.ui

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.rentals.Rental

class RentalsPagingSource(
    private val outdoorsyApi: OutdoorsyApi,
    private val filter: String
) : PagingSource<Int, Rental>() {
    override fun getRefreshKey(state: PagingState<Int, Rental>): Int? {
        return 0
//        return state.anchorPosition?.let { position ->
//            val page = state.closestPageToPosition(position)
//            page
//                ?.prevKey?.minus(state.config.pageSize) ?: page?.nextKey?.plus(state.config.pageSize)
//        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Rental> {
        val limit = if (params.loadSize == 0) null else params.loadSize
        val offset = (params.key ?: 0)
        val rentals = outdoorsyApi.fetchRentals(filter, limit, offset)
        rentals.data.forEach { rental ->
            val inclusion =
                rentals.included.find { inclusion ->
                    inclusion.id == rental.relationships?.primaryImage?.data?.id &&
                            inclusion.type == "images"
                }
            rental.primaryImageUrl = inclusion?.attributes?.url
        }
        return LoadResult.Page(
            data = rentals.data,
            prevKey = if (offset == 0) null else offset - limit!!,
            nextKey = if (rentals.data.isEmpty()) null else offset + limit!!
        );
    }
}