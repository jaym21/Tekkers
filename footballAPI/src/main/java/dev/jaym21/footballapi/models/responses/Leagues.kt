package dev.jaym21.footballapi.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import dev.jaym21.footballapi.models.entities.LeaguesResponse
import dev.jaym21.footballapi.models.entities.Paging
import dev.jaym21.footballapi.models.entities.Parameters

@JsonClass(generateAdapter = true)
data class Leagues(
    @Json(name = "get")
    val `get`: String?,
    @Json(name = "parameters")
    val parameters: Parameters?,
    @Json(name = "errors")
    val errors: List<Any>?,
    @Json(name = "results")
    val results: Int?,
    @Json(name = "paging")
    val paging: Paging?,
    @Json(name = "response")
    val leaguesResponse: List<LeaguesResponse>?
)