package com.example.adhipradanatest.data

import com.example.adhipradanatest.model.FlashSaleList
import retrofit2.Response
import retrofit2.http.GET

interface FlashSaleService {
    @GET(value = "a9ceeb6e-416d-4352-bde6-2203416576ac")
    suspend fun getFlashSale(): Response<FlashSaleList>
}