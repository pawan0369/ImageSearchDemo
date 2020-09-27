package com.demo.imagesearch.ui.dashboard.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b_\b\u0086\b\u0018\u00002\u00020\u0001B\u00bf\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010$\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\'\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010*\u001a\u00020\u0001\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0001\u0012\u0006\u0010-\u001a\u00020\u0005\u00a2\u0006\u0002\u0010.J\t\u0010[\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0001H\u00c6\u0003J\t\u0010]\u001a\u00020\u0007H\u00c6\u0003J\t\u0010^\u001a\u00020\tH\u00c6\u0003J\t\u0010_\u001a\u00020\u0001H\u00c6\u0003J\t\u0010`\u001a\u00020\u0007H\u00c6\u0003J\t\u0010a\u001a\u00020\tH\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010e\u001a\u00020\tH\u00c6\u0003J\t\u0010f\u001a\u00020\u0001H\u00c6\u0003J\t\u0010g\u001a\u00020\tH\u00c6\u0003J\t\u0010h\u001a\u00020\tH\u00c6\u0003J\t\u0010i\u001a\u00020\u0007H\u00c6\u0003J\t\u0010j\u001a\u00020\tH\u00c6\u0003J\t\u0010k\u001a\u00020\u0007H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0001H\u00c6\u0003J\t\u0010n\u001a\u00020\u0001H\u00c6\u0003J\t\u0010o\u001a\u00020\"H\u00c6\u0003J\t\u0010p\u001a\u00020\u0001H\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010r\u001a\u00020\u0001H\u00c6\u0003J\t\u0010s\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00010\'H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010w\u001a\u00020\u0001H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0001H\u00c6\u0003J\t\u0010z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010{\u001a\u00020\u0007H\u00c6\u0003J\t\u0010|\u001a\u00020\tH\u00c6\u0003J\t\u0010}\u001a\u00020\u000bH\u00c6\u0003J\t\u0010~\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0090\u0003\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u00052\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u0005H\u00c6\u0001J\u0015\u0010\u0082\u0001\u001a\u00020\t2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0011\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0011\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u0011\u0010\u0018\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0011\u0010\u0019\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00107R\u0011\u0010\u001a\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u00107R\u0011\u0010\u001b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0011\u0010\u001c\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00107R\u0011\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0011\u0010\u001f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0011\u0010 \u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010#\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00100R\u0011\u0010$\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00100R\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010(\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00105R\u0013\u0010)\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00105R\u0011\u0010*\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00100R\u0011\u0010+\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0011\u0010,\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00100R\u0011\u0010-\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00103\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/model/Image;", "", "account_id", "account_url", "ad_type", "", "ad_url", "", "animated", "", "bandwidth", "", "comment_count", "datetime", "description", "downs", "edited", "favorite", "favorite_count", "gifv", "has_sound", "height", "hls", "id", "in_gallery", "in_most_viral", "is_ad", "link", "looping", "mp4", "mp4_size", "nsfw", "points", "processing", "Lcom/demo/imagesearch/ui/dashboard/model/Processing;", "score", "section", "size", "tags", "", "title", "type", "ups", "views", "vote", "width", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;ZJLjava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Lcom/demo/imagesearch/ui/dashboard/model/Processing;Ljava/lang/Object;Ljava/lang/Object;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;I)V", "getAccount_id", "()Ljava/lang/Object;", "getAccount_url", "getAd_type", "()I", "getAd_url", "()Ljava/lang/String;", "getAnimated", "()Z", "getBandwidth", "()J", "getComment_count", "getDatetime", "getDescription", "getDowns", "getEdited", "getFavorite", "getFavorite_count", "getGifv", "getHas_sound", "getHeight", "getHls", "getId", "getIn_gallery", "getIn_most_viral", "getLink", "getLooping", "getMp4", "getMp4_size", "getNsfw", "getPoints", "getProcessing", "()Lcom/demo/imagesearch/ui/dashboard/model/Processing;", "getScore", "getSection", "getSize", "getTags", "()Ljava/util/List;", "getTitle", "getType", "getUps", "getViews", "getVote", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Image {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object account_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object account_url = null;
    private final int ad_type = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ad_url = null;
    private final boolean animated = false;
    private final long bandwidth = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object comment_count = null;
    private final int datetime = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object downs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String edited = null;
    private final boolean favorite = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object favorite_count = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gifv = null;
    private final boolean has_sound = false;
    private final int height = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hls = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final boolean in_gallery = false;
    private final boolean in_most_viral = false;
    private final boolean is_ad = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String link = null;
    private final boolean looping = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mp4 = null;
    private final int mp4_size = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object nsfw = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object points = null;
    @org.jetbrains.annotations.NotNull()
    private final com.demo.imagesearch.ui.dashboard.model.Processing processing = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object score = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object section = null;
    private final int size = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ups = null;
    private final int views = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object vote = null;
    private final int width = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAccount_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAccount_url() {
        return null;
    }
    
    public final int getAd_type() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAd_url() {
        return null;
    }
    
    public final boolean getAnimated() {
        return false;
    }
    
    public final long getBandwidth() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getComment_count() {
        return null;
    }
    
    public final int getDatetime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDowns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEdited() {
        return null;
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFavorite_count() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGifv() {
        return null;
    }
    
    public final boolean getHas_sound() {
        return false;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final boolean getIn_gallery() {
        return false;
    }
    
    public final boolean getIn_most_viral() {
        return false;
    }
    
    public final boolean is_ad() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLink() {
        return null;
    }
    
    public final boolean getLooping() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMp4() {
        return null;
    }
    
    public final int getMp4_size() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getNsfw() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.Processing getProcessing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSection() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUps() {
        return null;
    }
    
    public final int getViews() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getVote() {
        return null;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public Image(@org.jetbrains.annotations.NotNull()
    java.lang.Object account_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object account_url, int ad_type, @org.jetbrains.annotations.NotNull()
    java.lang.String ad_url, boolean animated, long bandwidth, @org.jetbrains.annotations.NotNull()
    java.lang.Object comment_count, int datetime, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.Object downs, @org.jetbrains.annotations.NotNull()
    java.lang.String edited, boolean favorite, @org.jetbrains.annotations.NotNull()
    java.lang.Object favorite_count, @org.jetbrains.annotations.NotNull()
    java.lang.String gifv, boolean has_sound, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String hls, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean in_gallery, boolean in_most_viral, boolean is_ad, @org.jetbrains.annotations.NotNull()
    java.lang.String link, boolean looping, @org.jetbrains.annotations.NotNull()
    java.lang.String mp4, int mp4_size, @org.jetbrains.annotations.NotNull()
    java.lang.Object nsfw, @org.jetbrains.annotations.NotNull()
    java.lang.Object points, @org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.model.Processing processing, @org.jetbrains.annotations.NotNull()
    java.lang.Object score, @org.jetbrains.annotations.NotNull()
    java.lang.Object section, int size, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.Object ups, int views, @org.jetbrains.annotations.NotNull()
    java.lang.Object vote, int width) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final int component16() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean component21() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    public final boolean component23() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.Processing component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component30() {
        return null;
    }
    
    public final int component31() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component35() {
        return null;
    }
    
    public final int component36() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component37() {
        return null;
    }
    
    public final int component38() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.Image copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object account_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object account_url, int ad_type, @org.jetbrains.annotations.NotNull()
    java.lang.String ad_url, boolean animated, long bandwidth, @org.jetbrains.annotations.NotNull()
    java.lang.Object comment_count, int datetime, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.Object downs, @org.jetbrains.annotations.NotNull()
    java.lang.String edited, boolean favorite, @org.jetbrains.annotations.NotNull()
    java.lang.Object favorite_count, @org.jetbrains.annotations.NotNull()
    java.lang.String gifv, boolean has_sound, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String hls, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean in_gallery, boolean in_most_viral, boolean is_ad, @org.jetbrains.annotations.NotNull()
    java.lang.String link, boolean looping, @org.jetbrains.annotations.NotNull()
    java.lang.String mp4, int mp4_size, @org.jetbrains.annotations.NotNull()
    java.lang.Object nsfw, @org.jetbrains.annotations.NotNull()
    java.lang.Object points, @org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.model.Processing processing, @org.jetbrains.annotations.NotNull()
    java.lang.Object score, @org.jetbrains.annotations.NotNull()
    java.lang.Object section, int size, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.Object ups, int views, @org.jetbrains.annotations.NotNull()
    java.lang.Object vote, int width) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}