package com.example.pokedex.speciesdata


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class GrowthRate(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
) : Serializable