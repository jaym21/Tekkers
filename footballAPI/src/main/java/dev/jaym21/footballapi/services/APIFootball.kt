package dev.jaym21.footballapi.services

import dev.jaym21.footballapi.models.responses.Leagues
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIFootball {

    @Headers("x-apisports-key: 6ec6c0cca0338c91ec1d355a5cbf2bc1")
    @GET("leagues")
    suspend fun getLeagues(
        @Query("season")
        season: Int = 2021,
        @Query("current")
        current: String = "true"
    ): Response<Leagues>
}