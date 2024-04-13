package com.example.chatwiseapp.retrofit

import com.example.chatwiseapp.methods.ApiMethod
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private val RetrofitClient : Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl("https://dummyjson.com")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
    }

    val ApiCall: ApiMethod by lazy {
        RetrofitClient.build().create(ApiMethod::class.java)
    }
}