package dev.jaym21.footballapi.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Country(
    @Json(name = "name")
    val name: String?,
    @Json(name = "code")
    val code: String?,
    @Json(name = "flag")
    val flag: String?
)