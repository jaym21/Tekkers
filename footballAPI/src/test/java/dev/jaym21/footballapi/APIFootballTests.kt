package dev.jaym21.footballapi

import dev.jaym21.footballapi.clients.ApiFootballClient
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Test

class APIFootballTests {

    val api = ApiFootballClient.api

    @Test
    fun `Get leagues`() = runBlocking {
        val response = api.getLeagues()
        assertNotNull(response.body())
    }
}