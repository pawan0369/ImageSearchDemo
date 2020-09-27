package com.demo.imagesearch.room.imagedetails;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\'\u00a8\u0006\r"}, d2 = {"Lcom/demo/imagesearch/room/imagedetails/ImageDetailsDao;", "", "getComment", "Lio/reactivex/Flowable;", "", "imageID", "", "insert", "", "topics", "Lcom/demo/imagesearch/room/imagedetails/ImageDetails;", "updateComment", "comment", "app_debug"})
public abstract interface ImageDetailsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.room.imagedetails.ImageDetails topics);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT comment FROM ImageDetails WHERE id = :imageID")
    public abstract io.reactivex.Flowable<java.lang.String> getComment(int imageID);
    
    @androidx.room.Query(value = "UPDATE ImageDetails SET comment = :comment WHERE id = :imageID")
    public abstract void updateComment(int imageID, @org.jetbrains.annotations.NotNull()
    java.lang.String comment);
}