package com.demo.imagesearch.util

import android.graphics.Bitmap
import android.graphics.Color
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.demo.imagesearch.R

@BindingAdapter("loadImage")
fun setImageFormUrl(imageView: ImageView, image: String?) {
    Glide.with(imageView.context).load(image).apply(
        RequestOptions()
            .centerCrop()
    ).error(R.drawable.ic_error_outline_24)
        .into(imageView)
}