package dev.jaym21.footballapi.clients

import dev.jaym21.footballapi.services.APIFootball
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiFootballClient {

    private const val BASE_URL = "https://v3.football.api-sports.io/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val api by lazy {
        retrofit.create(APIFootball::class.java)
    }
}