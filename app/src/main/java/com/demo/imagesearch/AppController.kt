package com.demo.imagesearch

import android.app.Activity
import android.app.Application
import android.content.Context
import com.demo.imagesearch.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class AppController : Application(), HasActivityInjector {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        configureDagger()
    }

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    private fun configureDagger() {
        val component = DaggerAppComponent.builder().application(this).build()
        component.inject(this)
    }


    override fun onCreate() {
        super.onCreate()
    }

}