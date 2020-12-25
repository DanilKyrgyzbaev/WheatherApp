package com.example.weatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Weather {
    @SerializedName("Version")
    @Expose
    var version: Int? = null

    @SerializedName("Key")
    @Expose
    var key: String? = null

    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Rank")
    @Expose
    var rank: Int? = null

    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String? = null

    @SerializedName("EnglishName")
    @Expose
    var englishName: String? = null

    @SerializedName("PrimaryPostalCode")
    @Expose
    var primaryPostalCode: String? = null

    @SerializedName("Region")
    @Expose
    var region: Region? = null

    @SerializedName("Country")
    @Expose
    var country: Country? = null

    @SerializedName("AdministrativeArea")
    @Expose
    var administrativeArea: AdministrativeArea? = null

    @SerializedName("TimeZone")
    @Expose
    var timeZone: TimeZone? = null

    @SerializedName("GeoPosition")
    @Expose
    var geoPosition: GeoPosition? = null

    @SerializedName("IsAlias")
    @Expose
    var isAlias: Boolean? = null

    @SerializedName("SupplementalAdminAreas")
    @Expose
    var supplementalAdminAreas: List<Any>? = null

    @SerializedName("DataSets")
    @Expose
    var dataSets: List<String>? = null
}