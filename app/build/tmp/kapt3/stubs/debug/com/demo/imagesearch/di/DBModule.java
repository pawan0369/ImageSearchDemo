package com.demo.imagesearch.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/demo/imagesearch/di/DBModule;", "", "()V", "provideDatabase", "Lcom/demo/imagesearch/room/AppDatabase;", "application", "Landroid/content/Context;", "provideImageDetailsDao", "Lcom/demo/imagesearch/room/imagedetails/ImageDetailsDao;", "database", "app_debug"})
@dagger.Module()
public final class DBModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.imagesearch.room.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.imagesearch.room.imagedetails.ImageDetailsDao provideImageDetailsDao(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.room.AppDatabase database) {
        return null;
    }
    
    public DBModule() {
        super();
    }
}