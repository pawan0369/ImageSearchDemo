package com.demo.imagesearch.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/demo/imagesearch/di/AppComponent;", "", "inject", "Lcom/demo/imagesearch/AppController;", "app", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.demo.imagesearch.di.AppModule.class, com.demo.imagesearch.di.ApiModule.class, com.demo.imagesearch.di.DBModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.demo.imagesearch.AppController inject(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.AppController app);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/demo/imagesearch/di/AppComponent$Builder;", "", "application", "Lcom/demo/imagesearch/AppController;", "build", "Lcom/demo/imagesearch/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.demo.imagesearch.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.demo.imagesearch.AppController application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.demo.imagesearch.di.AppComponent build();
    }
}