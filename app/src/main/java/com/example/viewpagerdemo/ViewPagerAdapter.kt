package com.example.viewpagerdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerdemo.databinding.SingleItemViewBinding

class ViewPagerAdapter(private val images:List<Int>): RecyclerView.Adapter<ViewPagerAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(private val binding: SingleItemViewBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(tesla: Int){
            binding.imageView.setImageResource(tesla)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = SingleItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
         val currentImg = images[position]
         holder.bind(currentImg)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}