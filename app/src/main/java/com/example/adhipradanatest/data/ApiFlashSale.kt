package com.example.adhipradanatest.data

import com.example.adhipradanatest.model.FlashSaleList
import retrofit2.Response

class ApiFlashSale(private val flashSaleService: FlashSaleService) {
    suspend fun getFlashSale(): Response<FlashSaleList> =
        flashSaleService.getFlashSale()
}