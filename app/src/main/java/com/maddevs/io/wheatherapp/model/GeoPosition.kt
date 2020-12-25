package com.example.weatherapp.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class GeoPosition {
    @SerializedName("Latitude")
    @Expose
    var latitude: Double? = null

    @SerializedName("Longitude")
    @Expose
    var longitude: Double? = null

    @SerializedName("Elevation")
    @Expose
    var elevation: Elevation? = null
}