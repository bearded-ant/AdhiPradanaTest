package com.example.adhipradanatest.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NetworkLayer {

    private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
    private val latestDealService: LatestDealService by lazy { retrofit.create(LatestDealService::class.java) }
    private val flashSaleService: FlashSaleService by lazy { retrofit.create(FlashSaleService::class.java) }

    val apiLatestDeal = ApiLatestDeal(latestDealService)
    val apiFlashSale = ApiFlashSale(flashSaleService)
}