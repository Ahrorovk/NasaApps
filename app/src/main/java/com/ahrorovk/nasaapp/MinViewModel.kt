package com.ahrorovk.nasaapp

//import android.text.format.DateFormat
//import android.util.Log
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.setValue
//import androidx.lifecycle.ViewModel
//import com.ahrorovk.nasaapp.Constants.BASE_URL
//import com.ahrorovk.nasaapp.model.NasaProject.NasaFirstProject
//import com.ahrorovk.nasaapp.remote.NasaInterface
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class MinViewModel:ViewModel() {
//    var listOfNews by mutableStateOf<NasaFirstProject>(NasaFirstProject(0,0,0, listOf(),0))
//    var error by mutableStateOf("")
//
//    //Retrofit
//    val retrofit = Retrofit
//        .Builder()
//        .baseUrl(BASE_URL)
//        .client(
//            OkHttpClient.Builder().addInterceptor(
//                HttpLoggingInterceptor()
//                    .setLevel(HttpLoggingInterceptor.Level.BODY)
//            )
//                .build()
//        )
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    fun getNews(api_key: String) {
//        val newsApi = retrofit.create(NasaInterface::class.java)
//        newsApi.getNewsAndroid("",api_key).enqueue(object : Callback<NasaFirstProject> {
//            override fun onResponse(
//                call: Call<NasaFirstProject>,
//                response: Response<NasaFirstProject>
//            ) {
//                if (response.isSuccessful) {
//                    Log.e("Log","${response.body()!!} -asd")
//                    listOfNews = response.body()!!
//                } else
//                    error = response.message()
//            }
//
//            override fun onFailure(call: Call<NasaFirstProject>, t: Throwable) {
//                error = t.message.toString()
//            }
//        })
//    }
//}