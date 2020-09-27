package com.demo.imagesearch.ui.dashboard.model

data class AdConfig(
    val highRiskFlags: List<Any>,
    val safeFlags: List<String>,
    val showsAds: Boolean,
    val unsafeFlags: List<String>,
    val wallUnsafeFlags: List<Any>
)