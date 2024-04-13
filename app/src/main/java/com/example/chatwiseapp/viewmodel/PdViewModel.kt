package com.example.chatwiseapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.chatwiseapp.models.ProductResponse
import com.example.chatwiseapp.repository.ProductRepo

class PdViewModel:ViewModel() {
    var ProductRepository= ProductRepo()

    var ProductLoad : MutableLiveData<Boolean> = ProductRepository.resloding

    fun getProduct(): LiveData<ProductResponse> {
        return ProductRepository.GetResponse()
    }


}