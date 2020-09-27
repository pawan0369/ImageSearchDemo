package com.demo.imagesearch.room.imagedetails

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ImageDetails(
    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "id")
    var id:Int,

    @ColumnInfo(name = "comment")
    var comment:String
)