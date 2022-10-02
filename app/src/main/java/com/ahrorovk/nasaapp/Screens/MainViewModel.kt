package com.ahrorovk.nasaapp.Screens

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovk.nasaapp.local.NewsDao
import com.ahrorovk.nasaapp.local.NewsRoom
import com.ahrorovk.nasaapp.Screen
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutNasaScreen.Informations.NASA_1
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutNasaScreen.Informations.NASA_2
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutNasaScreen.Informations.NASA_3
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutNasaScreen.Informations.NASA_4
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_1
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_2
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_3
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_4
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_5
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_6
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_7
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_8
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InformationsAboutTelescope.Tele_9
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel:ViewModel() {
    var count1 by mutableStateOf(0)
    var count2 by mutableStateOf(0)
    var count3 by mutableStateOf(0)
    var count4 by mutableStateOf(0)
    var count5 by mutableStateOf(0)
    var countOfFirstQuestion by  mutableStateOf(0)
    var countOfSecondQuestion by  mutableStateOf(0)
    var countOfThirdQuestion by  mutableStateOf(0)
    var countOfFourthQuestion by  mutableStateOf(0)
    var countOfFifthQuestion by  mutableStateOf(0)
    var username = mutableStateOf("")
    var email = mutableStateOf("")
    var phoneNumber = mutableStateOf("")
    var category by mutableStateOf("")
    var searchTextField by mutableStateOf("")
    var listOfNewsOfNasa = listOf(NASA_1, NASA_2,NASA_3,NASA_4)
    var listOfNewsOfTeleScope = listOf(Tele_1, Tele_2,Tele_3,Tele_4,Tele_5,Tele_6,Tele_7,Tele_8,Tele_9 )
    var error by mutableStateOf("")
    var counter by mutableStateOf(0)
    var testButton by mutableStateOf(0)
    var statusOfNews by mutableStateOf(true)
    var colorOfFirst1 by mutableStateOf(Color.LightGray)
    var colorOfFirst2 by mutableStateOf(Color.LightGray)
    var colorOfFirst3 by mutableStateOf(Color.LightGray)
    var colorOfSecond1 by mutableStateOf(Color.LightGray)
    var colorOfSecond2 by mutableStateOf(Color.LightGray)
    var colorOfSecond3 by mutableStateOf(Color.LightGray)
    var colorOfThird1 by mutableStateOf(Color.LightGray)
    var colorOfThird2 by mutableStateOf(Color.LightGray)
    var colorOfThird3 by mutableStateOf(Color.LightGray)
    var colorOfFourth1 by mutableStateOf(Color.LightGray)
    var colorOfFourth2 by mutableStateOf(Color.LightGray)
    var colorOfFourth3 by mutableStateOf(Color.LightGray)
    var colorOfFifth1 by mutableStateOf(Color.LightGray)
    var colorOfFifth2 by mutableStateOf(Color.LightGray)
    var colorOfFifth3 by mutableStateOf(Color.LightGray)
    //Room
    val news = mutableStateListOf<NewsRoom>()
    val newsDatabase = mutableStateOf<List<NewsRoom>>(listOf())
    lateinit var dao: NewsDao
    fun setCount11(text:Int){
        count1 = text
    }
    fun setCount22(text:Int){
        count2 = text
    }
    fun setCount33(text:Int){
        count3 = text
    }
    fun setCount44(text:Int){
        count4 = text
    }
    fun setCount55(text:Int){
        count5 = text
    }
    fun setCountOfFirst(text:Int){
        countOfFirstQuestion = text
    }
    fun setColorFirst1(text:Color){
        colorOfFirst1 = text
    }
    fun setColorFirst2(text:Color){
        colorOfFirst2 = text
    }
    fun setColorFirst3(text:Color){
        colorOfFirst3 = text
    }
    fun setCountOfSecond(text:Int){
        countOfSecondQuestion = text
    }
    fun setColorSecond1(text:Color){
        colorOfSecond1 = text
    }
    fun setColorSecond2(text:Color){
        colorOfSecond2 = text
    }
    fun setColorSecond3(text:Color){
        colorOfSecond3 = text
    }
    fun setCountOfThird(text:Int){
        countOfThirdQuestion= text
    }
    fun setColorThird1(text:Color){
        colorOfThird1 = text
    }
    fun setColorThird2(text:Color){
        colorOfThird2 = text
    }
    fun setColorThird3(text:Color){
        colorOfThird3 = text
    }
    fun setCountOfFourth(text:Int){
        countOfFourthQuestion = text
    }
    fun setColorFourth1(text:Color){
        colorOfFourth1 = text
    }
    fun setColorFourth2(text:Color){
        colorOfFourth2 = text
    }
    fun setColorFourth3(text:Color){
        colorOfFourth3 = text
    }
    fun setCountOfFifth(text:Int){
        countOfFifthQuestion = text
    }
    fun setColorFifth1(text:Color){
        colorOfFifth1 = text
    }
    fun setColorFifth2(text:Color){
        colorOfFifth2 = text
    }
    fun setColorFifth3(text:Color){
        colorOfFifth3 = text
    }

    val listOfScreens = listOf(Screen.INFO_ABOUT_NASA_SCREEN.route,Screen.INFO_ABOUT_TELESCOPE_SCREEN.route)
    fun setStatusOfNew(bool:Boolean){
        statusOfNews = bool
    }
    fun testButton(text:Int){
        testButton = text
    }
    fun firstNews(text:Int){
        counter = text
    }

    fun deleteNote(id: Int?) {
        val newses = news.find {
            it.id == id
        }
        this.news.remove(newses)
    }

    fun getAllNews() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                newsDatabase.value = dao.getAllNews()
            }
        }
    }

    fun addNews(news: NewsRoom) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                dao.addNews(news)
                getAllNews()
            }
        }
    }

    fun getNews(
        title:String,
        content:String,
        imageUrl: Int,
        countOfIconBookMark:Int
        ){
        val newsRoom = NewsRoom(
            title = title,
            content = content,
            imageUrl = imageUrl,
            counterOfIconBookMark = countOfIconBookMark%2
        )
        addNews(newsRoom)
    }
    fun setUsername(text: String) {
        if (text.isNotEmpty())
            username.value = text
    }

    fun setEmail(text: String) {
        if (text.isNotEmpty())
            email.value = text

    }

    fun setPhonenumber(text: String) {
        if (text.isNotEmpty())
            phoneNumber.value = text
    }

    fun setSearch(text: String) {
        searchTextField = text
    }

    fun setTopAppBarCategory(text: String) {
        category = text
    }

   /* //Retrofit
    val retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .client(
            OkHttpClient.Builder().addInterceptor(
                HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY)
            )
                .build()
        )
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getNewsAndroid(technology: String) {
        val newsApi = retrofit.create(InfoInterface::class.java)
        newsApi.getNewsAndroid(technology).enqueue(object : Callback<News> {
            override fun onResponse(call: Call<News>, response: Response<News>) {
                if (response.isSuccessful) {
                    listOfNews = response.body()!!
                } else
                    error = response.message()
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                error = t.message.toString()
            }
        })
    }*/
}