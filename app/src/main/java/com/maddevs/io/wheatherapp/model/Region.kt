package com.example.weatherapp.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Region {
    @SerializedName("ID")
    @Expose
    var iD: String? = null

    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String? = null

    @SerializedName("EnglishName")
    @Expose
    var englishName: String? = null
}