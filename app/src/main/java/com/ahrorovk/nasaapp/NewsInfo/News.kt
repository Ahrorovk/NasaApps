package com.ahrorovk.nasaapp.NewsInfo

import com.ahrorovk.nasaapp.NewsInfo.Data

data class News(
    val category: String,
    val `data`: List<Data>,
    val success: Boolean
)