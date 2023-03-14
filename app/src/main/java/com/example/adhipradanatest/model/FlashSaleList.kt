package com.example.adhipradanatest.model

import com.squareup.moshi.Json

data class FlashSaleList(
    @Json(name = "flash_sale")
    val flashSale: List<FlashSale>
)