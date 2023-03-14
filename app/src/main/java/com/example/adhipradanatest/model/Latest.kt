package com.example.adhipradanatest.model

import com.squareup.moshi.Json

data class Latest(
    val category: String,
    @Json(name = "image_url")
    val imageUrl: String,
    val name: String,
    val price: Int
)