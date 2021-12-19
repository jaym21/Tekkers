package dev.jaym21.footballapi.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Parameters(
    @Json(name = "current")
    val current: String?,
    @Json(name = "season")
    val season: String?
)