package dev.jaym21.footballapi.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeaguesResponse(
    @Json(name = "league")
    val league: League?,
    @Json(name = "country")
    val country: Country?,
    @Json(name = "seasons")
    val seasons: List<Season>?
)