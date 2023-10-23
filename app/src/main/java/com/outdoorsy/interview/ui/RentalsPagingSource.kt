package com.outdoorsy.interview.ui

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.outdoorsy.interview.api.OutdoorsyApi

class RentalsPagingSource(
    private val outdoorsyApi: OutdoorsyApi,
    private val filter: String
) : PagingSource<Int, Any>() {
    override fun getRefreshKey(state: PagingState<Int, Any>): Int? {
        return state.anchorPosition?.let { position ->
            val page = state.closestPageToPosition(position)
            page
                ?.prevKey?.minus(1) ?: page?.nextKey?.plus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Any> {
        val limit = if (params.loadSize == 0) null else 2
        val offset = (params.key ?: 0)
        val rentals = outdoorsyApi.fetchRentals(filter, limit, offset)
        return LoadResult.Page(
            data = rentals.data,
            prevKey = if (offset == 0) null else offset - params.loadSize,
            nextKey = if (rentals.data.isEmpty()) null else offset + params.loadSize
        );
    }
}