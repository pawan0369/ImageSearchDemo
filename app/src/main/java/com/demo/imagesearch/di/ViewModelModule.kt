package com.demo.imagesearch.di

import androidx.lifecycle.ViewModel
import com.demo.imagesearch.ui.dashboard.viewmodel.DashboardViewModel
import com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindDashboardViewModel(
        viewModel: DashboardViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ImageDetailsViewModel::class)
    abstract fun bindImageDetailsViewModel(
        viewModel: ImageDetailsViewModel
    ): ViewModel

}
