package com.demo.imagesearch.ui.base;

import java.lang.System;

/**
 * [BaseActivity] that adds helper methods for data binding.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0015\u001a\u0002H\u0016\"\n\b\u0001\u0010\u0016\u0018\u0001*\u00020\u00172!\b\n\u0010\u0018\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u00a2\u0006\u0002\b\u001bH\u0084\b\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\f8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/demo/imagesearch/ui/base/DataBindingActivity;", "TBinding", "Landroidx/databinding/ViewDataBinding;", "Lcom/demo/imagesearch/ui/base/BaseActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "layoutRes", "", "getLayoutRes", "()I", "loader", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getLoader", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setLoader", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "bindViewModel", "T", "Landroidx/lifecycle/ViewModel;", "f", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/ViewModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class DataBindingActivity<TBinding extends androidx.databinding.ViewDataBinding> extends com.demo.imagesearch.ui.base.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private com.afollestad.materialdialogs.MaterialDialog loader;
    @org.jetbrains.annotations.NotNull()
    protected TBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.afollestad.materialdialogs.MaterialDialog getLoader() {
        return null;
    }
    
    public final void setLoader(@org.jetbrains.annotations.Nullable()
    com.afollestad.materialdialogs.MaterialDialog p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.NotNull()
    protected final TBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    TBinding p0) {
    }
    
    /**
     * Creates the [ViewDataBinding] for this view.
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public DataBindingActivity() {
        super();
    }
}