package dev.jaym21.footballapi.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import dev.jaym21.footballapi.models.entities.Coverage

@JsonClass(generateAdapter = true)
data class Season(
    @Json(name = "year")
    val year: Int?,
    @Json(name = "start")
    val start: String?,
    @Json(name = "end")
    val end: String?,
    @Json(name = "current")
    val current: Boolean?,
    @Json(name = "coverage")
    val coverage: Coverage?
)