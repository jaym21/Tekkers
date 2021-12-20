package dev.jaym21.footballapi.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import dev.jaym21.footballapi.models.entities.Country
import dev.jaym21.footballapi.models.entities.League
import dev.jaym21.footballapi.models.entities.Season

@JsonClass(generateAdapter = true)
data class LeaguesResponse(
    @Json(name = "league")
    val league: League?,
    @Json(name = "country")
    val country: Country?,
    @Json(name = "seasons")
    val seasons: List<Season>?
)