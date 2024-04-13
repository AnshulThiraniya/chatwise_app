package com.example.chatwiseapp.repository

import androidx.lifecycle.MutableLiveData
import com.example.chatwiseapp.models.ProductResponse
import com.example.chatwiseapp.retrofit.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProductRepo {
    val liveResponse: MutableLiveData<ProductResponse> = MutableLiveData<ProductResponse>()
    var resloding: MutableLiveData<Boolean> = MutableLiveData<Boolean>().apply {
        value=true
    }

    fun GetResponse(): MutableLiveData<ProductResponse> {

        val call= Retrofit.ApiCall.GetProducts()
        call.enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                if(response.isSuccessful){
                    resloding.value=false
                    liveResponse.value=response.body()
                }
            }
            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                resloding.value=false
            }

        })

        return liveResponse
    }

}