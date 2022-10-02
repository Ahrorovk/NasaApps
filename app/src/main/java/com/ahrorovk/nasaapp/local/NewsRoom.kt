package com.ahrorovk.nasaapp.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ahrorovk.nasaapp.R

@Entity(tableName = "news_table")
data class NewsRoom (
    @PrimaryKey(autoGenerate = true)val id:Int? = null,
    var title:String?,
    var content:String?,
    var imageUrl: Int?,
    var counterOfIconBookMark:Int
        )