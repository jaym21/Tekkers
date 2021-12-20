package dev.jaym21.footballapi.services

import dev.jaym21.footballapi.clients.ApiFootballClient
import dev.jaym21.footballapi.models.responses.LeaguesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIFootball {

    @Headers(ApiFootballClient.apikey)
    @GET("leagues")
    suspend fun getLeagues(
        @Query("season")
        season: Int = 2021,
        @Query("current")
        current: String = "true"
    ): Response<LeaguesResponse>
}