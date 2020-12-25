package com.example.weatherapp.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class AdministrativeArea {
    @SerializedName("ID")
    @Expose
    var iD: String? = null

    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String? = null

    @SerializedName("EnglishName")
    @Expose
    var englishName: String? = null

    @SerializedName("Level")
    @Expose
    var level: Int? = null

    @SerializedName("LocalizedType")
    @Expose
    var localizedType: String? = null

    @SerializedName("EnglishType")
    @Expose
    var englishType: String? = null

    @SerializedName("CountryID")
    @Expose
    var countryID: String? = null
}