package com.vkpriesniakov.greencafe

import android.graphics.drawable.Drawable

data class Dishes(
    val image: Drawable,
    val title: String,
    val descr: String,
    val size: String,
    val price: String
)
