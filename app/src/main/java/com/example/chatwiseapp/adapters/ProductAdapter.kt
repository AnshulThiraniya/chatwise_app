package com.example.chatwiseapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chatwiseapp.databinding.ProductItemBinding
import com.example.chatwiseapp.models.ProductResponse
import com.squareup.picasso.Picasso

class ProductAdapter(var context: Context, var list: ProductResponse):RecyclerView.Adapter<ProductAdapter.ViewHolder>(){
    inner class ViewHolder(var binding:ProductItemBinding):RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=ProductItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.Products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = list.Products[position]
        holder.binding.pdPrice.text = "Price-${product.price}"
        holder.binding.pdTitle.text = "Title-${product.title}"
        holder.binding.pdBrand.text = "Brand-${product.brand}"
        holder.binding.pdCategroy.text = "Category-${product.category}"
        holder.binding.pdId.text = "Product-${product.id}"
        holder.binding.pdDiscription.text = "Description-${product.description}"
        Picasso.get().load("${product.thumbnail}").into(holder.binding.pdImage)

    }

}