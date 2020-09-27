package com.demo.imagesearch.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/demo/imagesearch/di/AppModule;", "", "()V", "provideApplication", "Landroid/app/Application;", "application", "Lcom/demo/imagesearch/AppController;", "provideContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module(includes = {com.demo.imagesearch.di.UiModule.class}, subcomponents = {com.demo.imagesearch.di.ActivityComponent.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.AppController application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.AppController application) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}