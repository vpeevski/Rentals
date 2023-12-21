package com.outdoorsy.interview.repository

interface IRentalRepository<R> {
    fun fetchRentals(filter: String): R
}