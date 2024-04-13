package com.example.chatwiseapp.models

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("products")
    var Products:ArrayList<ProductModel>
)
