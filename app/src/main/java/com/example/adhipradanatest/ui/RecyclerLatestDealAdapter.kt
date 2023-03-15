package com.example.adhipradanatest.ui

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.adhipradanatest.R
import com.example.adhipradanatest.model.Latest
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class RecyclerLatestDealAdapter(
    private var internalData: List<Latest>
) : RecyclerView.Adapter<RecyclerLatestDealAdapter.LastDealViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LastDealViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_small, parent, false)
        return LastDealViewHolder(view)
    }

    override fun onBindViewHolder(holder: LastDealViewHolder, position: Int) {
        val latestDeal = internalData[position]
        holder.latestName.text = latestDeal.name
        holder.latestCategory.text = latestDeal.name
        holder.latestPrice.text = latestDeal.price.toString()
        holder.latestImage.showIcon(latestDeal.imageUrl)
    }

    override fun getItemCount(): Int = internalData.size

    class LastDealViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val latestImage: ShapeableImageView = view.findViewById(R.id.item_small_image)
        val latestCategory: Button = view.findViewById(R.id.item_small_category_btn)
        val latestName: TextView = view.findViewById(R.id.item_small_head_txt)
        val latestPrice: TextView = view.findViewById(R.id.item_small_price)
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