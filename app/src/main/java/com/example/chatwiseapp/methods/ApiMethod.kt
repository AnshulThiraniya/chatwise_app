package com.example.chatwiseapp.methods

import com.example.chatwiseapp.models.ProductResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiMethod {
    @GET("/products")
    fun GetProducts(): Call<ProductResponse>

}