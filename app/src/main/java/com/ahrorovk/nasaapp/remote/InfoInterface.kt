package com.ahrorovk.nasaapp.remote

import com.ahrorovk.nasaapp.NewsInfo.News

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface InfoInterface {
    @GET("news")
    fun getNewsAndroid(@Query("category") technology:String): Call<News>
/*
    @GET("news?category=ios")
    fun getNewsIos(): Call<News>

    @GET("news?category=apple")
    fun getNewsApple(): Call<News>

    @GET("news?category=samsung")
    fun getNewsSamsung(): Call<News>

    @GET("news?category=technology")
    fun getNewsTechnology(): Call<News>
    @GET("news?category=amazon")
    fun getNewsAmazon(): Call<News>
    @GET("news?category=science")
    fun getNewsScience(): Call<News>
    @GET("news?category=cars")
    fun getNewsCars(): Call<News>
    @GET("news?category=honda")
    fun getNewsHonda(): Call<News>
    @GET("news?category=bmw")
    fun getNewsBmw(): Call<News>
    @GET("news?category=mercedes")
    fun getNewsMercedes(): Call<News>
    @GET("news?category=usa")
    fun getNewsUsa(): Call<News>
    @GET("news?category=europe")
    fun getNewsEurope(): Call<News>*/


}