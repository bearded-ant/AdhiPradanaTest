package com.example.adhipradanatest.data

import com.example.adhipradanatest.model.LatestList
import retrofit2.Response
import retrofit2.http.GET

interface LatestDealService {
    @GET(value = "cc0071a1-f06e-48fa-9e90-b1c2a61eaca7")
    suspend fun getLatestDeal(): Response<LatestList>
}