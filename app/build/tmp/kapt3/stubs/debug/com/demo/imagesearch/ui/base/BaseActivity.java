package com.demo.imagesearch.ui.base;

import java.lang.System;

/**
 * Base class with convenience methods for Movie activities.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0016\u001a\u0002H\u0017\"\n\b\u0000\u0010\u0017*\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001aH\u0004\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0010\u0010&\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u0010,\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010+R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006-"}, d2 = {"Lcom/demo/imagesearch/ui/base/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "activityComponent", "Lcom/demo/imagesearch/di/ActivityComponent;", "getActivityComponent", "()Lcom/demo/imagesearch/di/ActivityComponent;", "setActivityComponent", "(Lcom/demo/imagesearch/di/ActivityComponent;)V", "activityComponentProvider", "Ljavax/inject/Provider;", "Lcom/demo/imagesearch/di/ActivityComponent$Builder;", "getActivityComponentProvider", "()Ljavax/inject/Provider;", "setActivityComponentProvider", "(Ljavax/inject/Provider;)V", "viewModelFactory", "Lcom/demo/imagesearch/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/demo/imagesearch/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/demo/imagesearch/di/ViewModelFactory;)V", "getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "java", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "headerBackPressed", "", "isNetworkConnected", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "title", "", "showSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "view", "Landroid/view/View;", "message", "", "showToast", "app_debug"})
public abstract class BaseActivity extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.demo.imagesearch.di.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public javax.inject.Provider<com.demo.imagesearch.di.ActivityComponent.Builder> activityComponentProvider;
    @org.jetbrains.annotations.NotNull()
    public com.demo.imagesearch.di.ActivityComponent activityComponent;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.inject.Provider<com.demo.imagesearch.di.ActivityComponent.Builder> getActivityComponentProvider() {
        return null;
    }
    
    public final void setActivityComponentProvider(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<com.demo.imagesearch.di.ActivityComponent.Builder> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.di.ActivityComponent getActivityComponent() {
        return null;
    }
    
    public final void setActivityComponent(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.di.ActivityComponent p0) {
    }
    
    /**
     * Get the ViewModel using the Dagger2 [ViewModelFactory].
     */
    protected final <T extends androidx.lifecycle.ViewModel>T getViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> java) {
        return null;
    }
    
    /**
     * Apply custom group color
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final boolean isNetworkConnected() {
        return false;
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.snackbar.Snackbar showSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    protected final void headerBackPressed() {
    }
    
    public BaseActivity() {
        super();
    }
}