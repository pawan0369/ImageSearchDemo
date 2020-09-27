package com.demo.imagesearch.room.imagedetails

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface ImageDetailsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(topics: ImageDetails)

    @Query("SELECT comment FROM ImageDetails WHERE id = :imageID")
    fun getComment(imageID:Int): Flowable<String>

    @Query("UPDATE ImageDetails SET comment = :comment WHERE id = :imageID")
    fun updateComment(imageID: Int, comment:String)
}