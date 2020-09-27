package com.demo.imagesearch.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build

fun isNetworkConnected(context: Context): Boolean {
    val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        cm.run {

            var isConnected = false

            if (this.activeNetworkInfo != null) {
                isConnected = this.activeNetworkInfo.isConnected
            }

            cm.getNetworkCapabilities(cm.activeNetwork)?.run {
                if (hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                    return isConnected
                } else if (hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                    return isConnected
                }
            }
        }
    } else {
        cm.run {
            cm.activeNetworkInfo?.run {
                if (type == ConnectivityManager.TYPE_WIFI) {
                    return this.isConnected
                } else if (type == ConnectivityManager.TYPE_MOBILE) {
                    return this.isConnected
                }
            }
        }
    }
    return false
}