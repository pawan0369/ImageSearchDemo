package com.demo.imagesearch.ui.base

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.demo.imagesearch.di.ActivityComponent
import com.demo.imagesearch.di.ViewModelFactory
import com.demo.imagesearch.util.isNetworkConnected
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Provider

/**
 * Base class with convenience methods for Movie activities.
 */
abstract class BaseActivity : DaggerAppCompatActivity() {

    override fun setTitle(title: CharSequence?) {
        super.setTitle(title)
        supportActionBar?.title = title
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var activityComponentProvider: Provider<ActivityComponent.Builder>

    lateinit var activityComponent: ActivityComponent

    /**
     * Get the ViewModel using the Dagger2 [ViewModelFactory].
     */
    protected fun <T : ViewModel?> getViewModel(java: Class<T>): T {
        return ViewModelProvider(this, viewModelFactory).get(java)
    }

    /**
     * Apply custom group color
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent = activityComponentProvider.get()
            .activity(this)
            .build()
    }

    fun showToast(message: String?) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }


    fun isNetworkConnected(): Boolean {
        return isNetworkConnected(applicationContext)
    }

    fun showSnackBar(message: String?) {
        if (null != message) {
            Snackbar.make(findViewById(android.R.id.content),
                message, Snackbar.LENGTH_SHORT
            ).show()
        }
    }

    fun showSnackBar(view: View, message: String) = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .apply { show() }

    protected fun headerBackPressed(){
        onBackPressed()
    }

}