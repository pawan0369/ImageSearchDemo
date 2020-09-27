package com.demo.imagesearch.ui.dashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/viewmodel/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "imagesRepositoryIml", "Lcom/demo/imagesearch/ui/dashboard/repository/ImagesRepositoryIml;", "(Lcom/demo/imagesearch/ui/dashboard/repository/ImagesRepositoryIml;)V", "resultSearchList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/demo/imagesearch/ui/dashboard/model/ImageResult;", "getResultSearchList", "()Landroidx/lifecycle/MutableLiveData;", "searchList", "getSearchResult", "Landroidx/lifecycle/LiveData;", "Lcom/demo/imagesearch/network/ApiResult;", "Lcom/demo/imagesearch/ui/dashboard/model/SearchImageResponse;", "", "count", "searchKey", "setSearchData", "", "list", "", "Lcom/demo/imagesearch/ui/dashboard/model/SearchData;", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult>> searchList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult>> resultSearchList = null;
    private final com.demo.imagesearch.ui.dashboard.repository.ImagesRepositoryIml imagesRepositoryIml = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult>> getResultSearchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.demo.imagesearch.network.ApiResult<com.demo.imagesearch.ui.dashboard.model.SearchImageResponse, java.lang.String>> getSearchResult(@org.jetbrains.annotations.NotNull()
    java.lang.String count, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
        return null;
    }
    
    public final void setSearchData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.demo.imagesearch.ui.dashboard.model.SearchData> list) {
    }
    
    @javax.inject.Inject()
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.repository.ImagesRepositoryIml imagesRepositoryIml) {
        super();
    }
}