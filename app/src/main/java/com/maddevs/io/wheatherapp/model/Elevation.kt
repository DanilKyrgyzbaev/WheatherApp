package com.example.weatherapp.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Elevation {
    @SerializedName("Metric")
    @Expose
    var metric: Metric? = null

    @SerializedName("Imperial")
    @Expose
    var imperial: Imperial? = null
}