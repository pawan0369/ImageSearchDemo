package com.demo.imagesearch.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/demo/imagesearch/di/ViewModelModule;", "", "()V", "bindDashboardViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/demo/imagesearch/ui/dashboard/viewmodel/DashboardViewModel;", "bindImageDetailsViewModel", "Lcom/demo/imagesearch/ui/dashboard/viewmodel/ImageDetailsViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.demo.imagesearch.ui.dashboard.viewmodel.DashboardViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.viewmodel.DashboardViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindImageDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}