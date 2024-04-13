package com.example.chatwiseapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.chatwiseapp.R
import com.example.chatwiseapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnProduct.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val intent=Intent(this,ProductActivity::class.java)
        startActivity(intent)
    }
}