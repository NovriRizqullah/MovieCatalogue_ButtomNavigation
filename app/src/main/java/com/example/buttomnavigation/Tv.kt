package com.example.buttomnavigation

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tv (
    @SerializedName("id")
    val id : String ?,

    @SerializedName("name")
    val name : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("first_air_date")
    val first_air_date : String?,

    @SerializedName("original_language")
    val original_language : String?

) : Parcelable {
    constructor() : this("", "", "", "","")
}