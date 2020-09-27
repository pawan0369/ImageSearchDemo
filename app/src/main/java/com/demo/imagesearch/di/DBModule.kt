package com.demo.imagesearch.di

import android.content.Context
import androidx.room.Room
import com.demo.imagesearch.room.AppDatabase
import com.demo.imagesearch.room.imagedetails.ImageDetailsDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DBModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Context): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "search_database")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun provideImageDetailsDao(database: AppDatabase): ImageDetailsDao {
        return database.imageDetailsDao
    }
}