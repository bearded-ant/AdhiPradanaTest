package com.example.adhipradanatest.model

import com.squareup.moshi.Json

data class FlashSale(
    val category: String,
    val discount: Int,
    @Json(name = "image_url")
    val imageUrl: String,
    val name: String,
    val price: Double
)