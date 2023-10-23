package com.outdoorsy.interview.api

import com.outdoorsy.interview.rentals.RentalsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface OutdoorsyApi {

    @GET("rentals")
    suspend fun fetchRentals(
        @Query("filter[keywords]") filter: String,
        @Query("page[limit]") limit: Int? = 20,
        @Query("page[offset]") offset: Int? = 0
    ): RentalsResponse
}