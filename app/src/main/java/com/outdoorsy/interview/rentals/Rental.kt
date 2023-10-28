package com.outdoorsy.interview.rentals

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Rental private constructor (
    val id: String,
    val attributes: RentAttributes,
    var primaryImageUrl: String?
) : Parcelable {
    var relationships: Relationships? = null
    constructor(
        id: String,
        attributes: RentAttributes,
        relationships: Relationships?,
        primaryImageUrl: String?
    ) : this(id, attributes, primaryImageUrl) {
        this.relationships = relationships
    }
}

@Parcelize
data class RentAttributes(val name: String) : Parcelable

@Parcelize
data class Relationships(@SerializedName("primary_image") val primaryImage: PrimaryImage) :
    Parcelable

@Parcelize
data class PrimaryImage(val data: PrimaryImageData) : Parcelable

@Parcelize
data class PrimaryImageData(val id: String, val type: String) : Parcelable

@Parcelize
data class Inclusion(val id: String, val type: String, val attributes: Attributes) : Parcelable

@Parcelize
data class Attributes(val url: String) : Parcelable
