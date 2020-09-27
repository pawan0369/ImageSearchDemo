package com.demo.imagesearch.di

import androidx.lifecycle.ViewModelProvider
import com.demo.imagesearch.ui.dashboard.DashboardActivity
import com.demo.imagesearch.ui.dashboard.ImageDetailsActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelModule::class])
abstract class UiModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector()
    abstract fun contributeDashboardActivity(): DashboardActivity

    @ContributesAndroidInjector()
    abstract fun contributeImageDetailsActivity(): ImageDetailsActivity

}
