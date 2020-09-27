package com.demo.imagesearch.ui.dashboard.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/repository/ImagesRepositoryIml;", "Lcom/demo/imagesearch/ui/dashboard/repository/ImageRepository;", "request", "Lcom/demo/imagesearch/network/ApiInterface;", "(Lcom/demo/imagesearch/network/ApiInterface;)V", "getSearchedImages", "Lcom/demo/imagesearch/network/ApiResult;", "Lcom/demo/imagesearch/ui/dashboard/model/SearchImageResponse;", "", "count", "searchKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class ImagesRepositoryIml implements com.demo.imagesearch.ui.dashboard.repository.ImageRepository {
    private final com.demo.imagesearch.network.ApiInterface request = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_RESPONSE = "Something went wrong,Please try again later.";
    public static final com.demo.imagesearch.ui.dashboard.repository.ImagesRepositoryIml.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSearchedImages(@org.jetbrains.annotations.NotNull()
    java.lang.String count, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.demo.imagesearch.network.ApiResult<com.demo.imagesearch.ui.dashboard.model.SearchImageResponse, java.lang.String>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public ImagesRepositoryIml(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.network.ApiInterface request) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/repository/ImagesRepositoryIml$Companion;", "", "()V", "ERROR_RESPONSE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}