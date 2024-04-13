package com.example.chatwiseapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chatwiseapp.R
import com.example.chatwiseapp.adapters.ProductAdapter
import com.example.chatwiseapp.databinding.ActivityProductBinding
import com.example.chatwiseapp.viewmodel.PdViewModel

class ProductActivity : AppCompatActivity() {
    private lateinit var binding:ActivityProductBinding
    lateinit var viewModel: PdViewModel
    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_product)

       viewModel=ViewModelProvider(this)[PdViewModel::class.java]
        viewModel.getProduct().observe(this,Observer{
            adapter= ProductAdapter(this,it)
            binding.rvProduct.layoutManager=LinearLayoutManager(this)
            binding.rvProduct.adapter=adapter
        })
        setTitle("Products")
    }
}