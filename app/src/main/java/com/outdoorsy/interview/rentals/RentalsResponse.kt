package com.outdoorsy.interview.rentals

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RentalsResponse(val data: List<Rental>, val included: List<Inclusion>) : Parcelable
