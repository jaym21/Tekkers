package dev.jaym21.footballapi.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Fixtures(
    @Json(name = "events")
    val events: Boolean?,
    @Json(name = "lineups")
    val lineups: Boolean?,
    @Json(name = "statistics_fixtures")
    val statisticsFixtures: Boolean?,
    @Json(name = "statistics_players")
    val statisticsPlayers: Boolean?
)