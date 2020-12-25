package com.example.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TimeZone {
    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("GmtOffset")
    @Expose
    var gmtOffset: Double? = null

    @SerializedName("IsDaylightSaving")
    @Expose
    var isDaylightSaving: Boolean? = null

    @SerializedName("NextOffsetChange")
    @Expose
    var nextOffsetChange: Any? = null
}