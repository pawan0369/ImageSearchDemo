package com.demo.imagesearch.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.demo.imagesearch.R
import com.demo.imagesearch.databinding.ListSearchImagesBinding
import com.demo.imagesearch.ui.dashboard.model.ImageResult

class ImagesListAdapter(private val list: ArrayList<ImageResult>, val click:(ImageResult) -> Unit): RecyclerView.Adapter<ImagesListAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListSearchImagesBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.list_search_images, parent, false
        )
        return ImageViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val data = list[position]
        holder.binding.model = data
        holder.binding.executePendingBindings()
        holder.setClick(data)
    }

    inner class ImageViewHolder(val binding: ListSearchImagesBinding): RecyclerView.ViewHolder(binding.root){
        fun setClick(item: ImageResult){
            binding.root.setOnClickListener {
                click(item)
            }
        }
    }
}