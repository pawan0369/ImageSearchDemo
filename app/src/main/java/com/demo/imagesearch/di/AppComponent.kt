package com.demo.imagesearch.di

import com.demo.imagesearch.AppController
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ApiModule::class,
        DBModule::class
    ]
)
interface AppComponent {

    fun inject(app: AppController): AppController

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: AppController): Builder

        fun build(): AppComponent
    }
}
