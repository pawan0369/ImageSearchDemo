package com.demo.imagesearch.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/imagesearch/di/UiModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/demo/imagesearch/di/ViewModelFactory;", "contributeDashboardActivity", "Lcom/demo/imagesearch/ui/dashboard/DashboardActivity;", "contributeImageDetailsActivity", "Lcom/demo/imagesearch/ui/dashboard/ImageDetailsActivity;", "app_debug"})
@dagger.Module(includes = {com.demo.imagesearch.di.ViewModelModule.class})
public abstract class UiModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.demo.imagesearch.ui.dashboard.DashboardActivity contributeDashboardActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.demo.imagesearch.ui.dashboard.ImageDetailsActivity contributeImageDetailsActivity();
    
    public UiModule() {
        super();
    }
}