package com.example.adhipradanatest.data

import com.example.adhipradanatest.model.LatestList
import retrofit2.Response

class ApiLatestDeal(private val latestDealService: LatestDealService) {
    suspend fun getLatestDeal(): Response<LatestList> =
        latestDealService.getLatestDeal()
}