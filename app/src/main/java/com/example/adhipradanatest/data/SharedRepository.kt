package com.example.adhipradanatest.data

import com.example.adhipradanatest.model.FlashSaleList
import com.example.adhipradanatest.model.LatestList

class SharedRepository {
    suspend fun getLatestDeal(): LatestList? {
        val request = NetworkLayer().apiLatestDeal.getLatestDeal()
        if (request.isSuccessful)
            return request.body()
        return null
    }

    suspend fun getFlashSale(): FlashSaleList? {
        val request = NetworkLayer().apiFlashSale.getFlashSale()
        if (request.isSuccessful)
            return request.body()
        return null
    }
}