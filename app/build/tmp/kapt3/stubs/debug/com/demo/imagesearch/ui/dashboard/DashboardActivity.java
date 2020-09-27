package com.demo.imagesearch.ui.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0012\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u001b0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/DashboardActivity;", "Lcom/demo/imagesearch/ui/base/DataBindingActivity;", "Lcom/demo/imagesearch/databinding/ActivityDashboardBinding;", "()V", "hasNext", "", "imageAdapter", "Lcom/demo/imagesearch/ui/dashboard/adapter/ImagesListAdapter;", "getImageAdapter", "()Lcom/demo/imagesearch/ui/dashboard/adapter/ImagesListAdapter;", "imageAdapter$delegate", "Lkotlin/Lazy;", "imageList", "Ljava/util/ArrayList;", "Lcom/demo/imagesearch/ui/dashboard/model/ImageResult;", "layoutRes", "", "getLayoutRes", "()I", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "pageNumber", "searchDataObserver", "Landroidx/lifecycle/Observer;", "searchKey", "", "searchObserver", "Lcom/demo/imagesearch/network/ApiResult;", "Lcom/demo/imagesearch/ui/dashboard/model/SearchImageResponse;", "viewModel", "Lcom/demo/imagesearch/ui/dashboard/viewmodel/DashboardViewModel;", "initObserver", "", "initRecycler", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DashboardActivity extends com.demo.imagesearch.ui.base.DataBindingActivity<com.demo.imagesearch.databinding.ActivityDashboardBinding> {
    private final java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult> imageList = null;
    private com.demo.imagesearch.ui.dashboard.viewmodel.DashboardViewModel viewModel;
    private int pageNumber = 1;
    private boolean hasNext = true;
    private java.lang.String searchKey = "";
    private final kotlin.Lazy imageAdapter$delegate = null;
    private final androidx.lifecycle.Observer<com.demo.imagesearch.network.ApiResult<com.demo.imagesearch.ui.dashboard.model.SearchImageResponse, java.lang.String>> searchObserver = null;
    private final androidx.lifecycle.Observer<java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult>> searchDataObserver = null;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    private final com.demo.imagesearch.ui.dashboard.adapter.ImagesListAdapter getImageAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecycler() {
    }
    
    private final void initObserver() {
    }
    
    public DashboardActivity() {
        super();
    }
}