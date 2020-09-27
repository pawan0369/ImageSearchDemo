package com.demo.imagesearch.di;

import java.lang.System;

/**
 * Dagger2 AppComponent configuration
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/demo/imagesearch/di/ActivityComponent;", "", "Builder", "app_debug"})
@dagger.Subcomponent()
@ActivityScope()
public abstract interface ActivityComponent {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/demo/imagesearch/di/ActivityComponent$Builder;", "", "activity", "Landroid/app/Activity;", "build", "Lcom/demo/imagesearch/di/ActivityComponent;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.demo.imagesearch.di.ActivityComponent.Builder activity(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.demo.imagesearch.di.ActivityComponent build();
    }
}