package com.outdoorsy.interview.ui.rentals

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.outdoorsy.interview.api.ErrorCode
import com.outdoorsy.interview.api.OutdoorsyApi
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.rentals.RentalsResponse
import com.outdoorsy.interview.ui.ApiResult
import retrofit2.HttpException

class RentalsPagingSource(
    private val outdoorsyApi: OutdoorsyApi,
    private val filter: String
) : PagingSource<Int, Rental>() {
    override fun getRefreshKey(state: PagingState<Int, Rental>): Int? {
        return state.anchorPosition?.let { position ->
            val page = state.closestPageToPosition(position)
            page
                ?.prevKey?.minus(state.config.pageSize)
                ?: page?.nextKey?.plus(state.config.pageSize)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Rental> {
        val limit = if (params.loadSize == 0) null else params.loadSize
        val offset = (params.key ?: 0)
        return when (val rentalsResult = getRentals(filter, limit, offset)) {
            is ApiResult.Success -> {
                LoadResult.Page(
                    data = rentalsResult.data.data,
                    prevKey = if (offset == 0) null else offset - limit!!,
                    nextKey = if (rentalsResult.data.data.isEmpty()) null else offset + limit!!
                );
            }

            is ApiResult.Error -> {
                LoadResult.Error(Throwable(message = rentalsResult.error.message))
            }
            is ApiResult.Loading -> {
                return LoadResult.Page(
                    data = emptyList(),
                    prevKey = null,
                    nextKey = null
                )
            }
        }


    }

    private suspend fun getRentals(
        searchText: String,
        limit: Int?,
        offset: Int
    ): ApiResult<RentalsResponse> {
        return try {
            val rentals = outdoorsyApi.fetchRentals(filter, limit, offset)
            rentals.data.forEach { rental ->
                val inclusion =
                    rentals.included.find { inclusion ->
                        inclusion.id == rental.relationships?.primaryImage?.data?.id &&
                                inclusion.type == "images"
                    }
                rental.primaryImageUrl = inclusion?.attributes?.url
            }
            ApiResult.Success(rentals)
        } catch (e: Exception) {
            when (e) {
                is HttpException ->
                    ApiResult.Error(ErrorCode.NetworkError);
                else -> {
                    Log.d("Api ERROR: ", e.toString())
                    ApiResult.Error(ErrorCode.NotFount)
                }

            }
        }
    }
}