package com.demo.imagesearch.ui.dashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/adapter/ImagesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/imagesearch/ui/dashboard/adapter/ImagesListAdapter$ImageViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/demo/imagesearch/ui/dashboard/model/ImageResult;", "Lkotlin/collections/ArrayList;", "click", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ImageViewHolder", "app_debug"})
public final class ImagesListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.imagesearch.ui.dashboard.adapter.ImagesListAdapter.ImageViewHolder> {
    private final java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult> list = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.demo.imagesearch.ui.dashboard.model.ImageResult, kotlin.Unit> click = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.imagesearch.ui.dashboard.adapter.ImagesListAdapter.ImageViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.adapter.ImagesListAdapter.ImageViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.demo.imagesearch.ui.dashboard.model.ImageResult, kotlin.Unit> getClick() {
        return null;
    }
    
    public ImagesListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.demo.imagesearch.ui.dashboard.model.ImageResult> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.demo.imagesearch.ui.dashboard.model.ImageResult, kotlin.Unit> click) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/adapter/ImagesListAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/demo/imagesearch/databinding/ListSearchImagesBinding;", "(Lcom/demo/imagesearch/ui/dashboard/adapter/ImagesListAdapter;Lcom/demo/imagesearch/databinding/ListSearchImagesBinding;)V", "getBinding", "()Lcom/demo/imagesearch/databinding/ListSearchImagesBinding;", "setClick", "", "item", "Lcom/demo/imagesearch/ui/dashboard/model/ImageResult;", "app_debug"})
    public final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.demo.imagesearch.databinding.ListSearchImagesBinding binding = null;
        
        public final void setClick(@org.jetbrains.annotations.NotNull()
        com.demo.imagesearch.ui.dashboard.model.ImageResult item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.demo.imagesearch.databinding.ListSearchImagesBinding getBinding() {
            return null;
        }
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        com.demo.imagesearch.databinding.ListSearchImagesBinding binding) {
            super(null);
        }
    }
}