package com.demo.imagesearch.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.imagesearch.room.imagedetails.ImageDetails
import com.demo.imagesearch.room.imagedetails.ImageDetailsDao

@Database(
    entities = [ImageDetails::class],
    version = AppDatabase.DB_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    companion object{
        const val DB_VERSION = 1
    }

    abstract val imageDetailsDao: ImageDetailsDao
}