package com.demo.imagesearch.ui.dashboard.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/repository/ImageRepository;", "", "getSearchedImages", "Lcom/demo/imagesearch/network/ApiResult;", "Lcom/demo/imagesearch/ui/dashboard/model/SearchImageResponse;", "", "count", "searchKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ImageRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSearchedImages(@org.jetbrains.annotations.NotNull()
    java.lang.String count, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.demo.imagesearch.network.ApiResult<com.demo.imagesearch.ui.dashboard.model.SearchImageResponse, java.lang.String>> p2);
}