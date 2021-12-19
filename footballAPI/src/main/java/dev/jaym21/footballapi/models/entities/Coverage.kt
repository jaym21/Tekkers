package dev.jaym21.footballapi.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coverage(
    @Json(name = "fixtures")
    val fixtures: Fixtures?,
    @Json(name = "standings")
    val standings: Boolean?,
    @Json(name = "players")
    val players: Boolean?,
    @Json(name = "top_scorers")
    val topScorers: Boolean?,
    @Json(name = "top_assists")
    val topAssists: Boolean?,
    @Json(name = "top_cards")
    val topCards: Boolean?,
    @Json(name = "injuries")
    val injuries: Boolean?,
    @Json(name = "predictions")
    val predictions: Boolean?,
    @Json(name = "odds")
    val odds: Boolean?
)