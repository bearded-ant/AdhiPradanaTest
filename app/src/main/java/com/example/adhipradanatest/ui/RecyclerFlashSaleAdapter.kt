package com.example.adhipradanatest.ui

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.adhipradanatest.R
import com.example.adhipradanatest.model.FlashSaleList
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class RecyclerFlashSaleAdapter(
    private var internalData: FlashSaleList
) : RecyclerView.Adapter<RecyclerFlashSaleAdapter.FlashSaleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlashSaleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_big, parent, false)
        return FlashSaleViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlashSaleViewHolder, position: Int) {
        val flashSale = internalData.flashSale[position]
        holder.flashName.text = flashSale.name
        holder.flashCategory.text = flashSale.category
        holder.flashPrice.text = flashSale.price.toString()
        holder.flashImage.showIcon(flashSale.imageUrl)
        holder.flashDiscount.text = flashSale.discount.toString()
    }

    override fun getItemCount(): Int = internalData.flashSale.size

    class FlashSaleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val flashImage: ShapeableImageView = view.findViewById(R.id.item_big_image)
        val flashCategory: Button = view.findViewById(R.id.item_big_category_btn)
        val flashName: TextView = view.findViewById(R.id.item_big_name_tw)
        val flashPrice: TextView = view.findViewById(R.id.item_big_price_tw)
        val flashDiscount: Button = view.findViewById(R.id.item_big_discount_btn)
    }
}

private fun ShapeableImageView.showIcon(icon: String, placeHolderRes: Int = R.drawable.google) {
    Picasso.get()
        .load(icon)
        .config(Bitmap.Config.RGB_565)
        .fit()
        .centerCrop()
        .noFade()
        .placeholder(placeHolderRes)
        .into(this)
}