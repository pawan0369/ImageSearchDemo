package com.demo.imagesearch.di

import android.app.Application
import android.content.Context
import com.demo.imagesearch.AppController
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        UiModule::class
    ],
    subcomponents = [ActivityComponent::class]
)
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(application: AppController): Application {
        return application
    }

    @Provides
    @Singleton
    fun provideContext(application: AppController): Context {
        return application.applicationContext
    }
}
