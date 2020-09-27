package com.demo.imagesearch.ui.dashboard.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\by\b\u0086\b\u0018\u00002\u00020\u0001B\u00a3\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001e\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00106\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0001\u0012\u0006\u0010<\u001a\u00020\u0003\u00a2\u0006\u0002\u0010=J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0001H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u000bH\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0012\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020/H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002040\u001eH\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0005H\u00c6\u0003J\u008c\u0004\u0010\u00a8\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00032\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001e2\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010<\u001a\u00020\u0003H\u00c6\u0001J\u0015\u0010\u00a9\u0001\u001a\u00020\u000b2\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00ac\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010?R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010?R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u0011\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010?R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010?R\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010GR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010?R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0011\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010GR\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010?R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010AR\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010AR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010?R\u0011\u0010!\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010GR\u0011\u0010\"\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010GR\u0011\u0010#\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010GR\u0011\u0010$\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010GR\u0011\u0010%\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010GR\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0011\u0010\'\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u0011\u0010(\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010GR\u0011\u0010)\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010?R\u0011\u0010+\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010GR\u0011\u0010,\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010?R\u0011\u0010-\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0011\u0010.\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u00100\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010?R\u0011\u00101\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010AR\u0011\u00102\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010?R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010[R\u0011\u00105\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010AR\u0011\u00106\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010AR\u0011\u00107\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010?R\u0011\u00108\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010AR\u0011\u00109\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010?R\u0011\u0010:\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010?R\u0011\u0010;\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010PR\u0011\u0010<\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010?\u00a8\u0006\u00ad\u0001"}, d2 = {"Lcom/demo/imagesearch/ui/dashboard/model/SearchData;", "", "account_id", "", "account_url", "", "ad_config", "Lcom/demo/imagesearch/ui/dashboard/model/AdConfig;", "ad_type", "ad_url", "animated", "", "bandwidth", "", "comment_count", "cover", "cover_height", "cover_width", "datetime", "description", "downs", "edited", "favorite", "favorite_count", "gifv", "has_sound", "height", "hls", "id", "images", "", "Lcom/demo/imagesearch/ui/dashboard/model/Image;", "images_count", "in_gallery", "in_most_viral", "include_album_ads", "is_ad", "is_album", "layout", "link", "looping", "mp4", "mp4_size", "nsfw", "points", "privacy", "processing", "Lcom/demo/imagesearch/ui/dashboard/model/ProcessingX;", "score", "section", "size", "tags", "Lcom/demo/imagesearch/ui/dashboard/model/Tag;", "title", "topic", "topic_id", "type", "ups", "views", "vote", "width", "(ILjava/lang/String;Lcom/demo/imagesearch/ui/dashboard/model/AdConfig;ILjava/lang/String;ZJILjava/lang/String;IIILjava/lang/Object;IIZILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZZZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Lcom/demo/imagesearch/ui/dashboard/model/ProcessingX;ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/Object;I)V", "getAccount_id", "()I", "getAccount_url", "()Ljava/lang/String;", "getAd_config", "()Lcom/demo/imagesearch/ui/dashboard/model/AdConfig;", "getAd_type", "getAd_url", "getAnimated", "()Z", "getBandwidth", "()J", "getComment_count", "getCover", "getCover_height", "getCover_width", "getDatetime", "getDescription", "()Ljava/lang/Object;", "getDowns", "getEdited", "getFavorite", "getFavorite_count", "getGifv", "getHas_sound", "getHeight", "getHls", "getId", "getImages", "()Ljava/util/List;", "getImages_count", "getIn_gallery", "getIn_most_viral", "getInclude_album_ads", "getLayout", "getLink", "getLooping", "getMp4", "getMp4_size", "getNsfw", "getPoints", "getPrivacy", "getProcessing", "()Lcom/demo/imagesearch/ui/dashboard/model/ProcessingX;", "getScore", "getSection", "getSize", "getTags", "getTitle", "getTopic", "getTopic_id", "getType", "getUps", "getViews", "getVote", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class SearchData {
    private final int account_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String account_url = null;
    @org.jetbrains.annotations.NotNull()
    private final com.demo.imagesearch.ui.dashboard.model.AdConfig ad_config = null;
    private final int ad_type = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ad_url = null;
    private final boolean animated = false;
    private final long bandwidth = 0L;
    private final int comment_count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cover = null;
    private final int cover_height = 0;
    private final int cover_width = 0;
    private final int datetime = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object description = null;
    private final int downs = 0;
    private final int edited = 0;
    private final boolean favorite = false;
    private final int favorite_count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gifv = null;
    private final boolean has_sound = false;
    private final int height = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hls = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.demo.imagesearch.ui.dashboard.model.Image> images = null;
    private final int images_count = 0;
    private final boolean in_gallery = false;
    private final boolean in_most_viral = false;
    private final boolean include_album_ads = false;
    private final boolean is_ad = false;
    private final boolean is_album = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String layout = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String link = null;
    private final boolean looping = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mp4 = null;
    private final int mp4_size = 0;
    private final boolean nsfw = false;
    private final int points = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String privacy = null;
    @org.jetbrains.annotations.NotNull()
    private final com.demo.imagesearch.ui.dashboard.model.ProcessingX processing = null;
    private final int score = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String section = null;
    private final int size = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.demo.imagesearch.ui.dashboard.model.Tag> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topic = null;
    private final int topic_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int ups = 0;
    private final int views = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object vote = null;
    private final int width = 0;
    
    public final int getAccount_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccount_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.AdConfig getAd_config() {
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
    
    public final int getComment_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCover() {
        return null;
    }
    
    public final int getCover_height() {
        return 0;
    }
    
    public final int getCover_width() {
        return 0;
    }
    
    public final int getDatetime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDescription() {
        return null;
    }
    
    public final int getDowns() {
        return 0;
    }
    
    public final int getEdited() {
        return 0;
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final int getFavorite_count() {
        return 0;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.demo.imagesearch.ui.dashboard.model.Image> getImages() {
        return null;
    }
    
    public final int getImages_count() {
        return 0;
    }
    
    public final boolean getIn_gallery() {
        return false;
    }
    
    public final boolean getIn_most_viral() {
        return false;
    }
    
    public final boolean getInclude_album_ads() {
        return false;
    }
    
    public final boolean is_ad() {
        return false;
    }
    
    public final boolean is_album() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLayout() {
        return null;
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
    
    public final boolean getNsfw() {
        return false;
    }
    
    public final int getPoints() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivacy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.ProcessingX getProcessing() {
        return null;
    }
    
    public final int getScore() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSection() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.demo.imagesearch.ui.dashboard.model.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopic() {
        return null;
    }
    
    public final int getTopic_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int getUps() {
        return 0;
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
    
    public SearchData(int account_id, @org.jetbrains.annotations.NotNull()
    java.lang.String account_url, @org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.model.AdConfig ad_config, int ad_type, @org.jetbrains.annotations.NotNull()
    java.lang.String ad_url, boolean animated, long bandwidth, int comment_count, @org.jetbrains.annotations.NotNull()
    java.lang.String cover, int cover_height, int cover_width, int datetime, @org.jetbrains.annotations.NotNull()
    java.lang.Object description, int downs, int edited, boolean favorite, int favorite_count, @org.jetbrains.annotations.NotNull()
    java.lang.String gifv, boolean has_sound, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String hls, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.util.List<com.demo.imagesearch.ui.dashboard.model.Image> images, int images_count, boolean in_gallery, boolean in_most_viral, boolean include_album_ads, boolean is_ad, boolean is_album, @org.jetbrains.annotations.NotNull()
    java.lang.String layout, @org.jetbrains.annotations.NotNull()
    java.lang.String link, boolean looping, @org.jetbrains.annotations.NotNull()
    java.lang.String mp4, int mp4_size, boolean nsfw, int points, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy, @org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.model.ProcessingX processing, int score, @org.jetbrains.annotations.NotNull()
    java.lang.String section, int size, @org.jetbrains.annotations.NotNull()
    java.util.List<com.demo.imagesearch.ui.dashboard.model.Tag> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, int topic_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int ups, int views, @org.jetbrains.annotations.NotNull()
    java.lang.Object vote, int width) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.AdConfig component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.demo.imagesearch.ui.dashboard.model.Image> component23() {
        return null;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final boolean component25() {
        return false;
    }
    
    public final boolean component26() {
        return false;
    }
    
    public final boolean component27() {
        return false;
    }
    
    public final boolean component28() {
        return false;
    }
    
    public final boolean component29() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    public final boolean component32() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final boolean component35() {
        return false;
    }
    
    public final int component36() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.ProcessingX component38() {
        return null;
    }
    
    public final int component39() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    public final int component41() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.demo.imagesearch.ui.dashboard.model.Tag> component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component44() {
        return null;
    }
    
    public final int component45() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component46() {
        return null;
    }
    
    public final int component47() {
        return 0;
    }
    
    public final int component48() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component49() {
        return null;
    }
    
    public final int component50() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.imagesearch.ui.dashboard.model.SearchData copy(int account_id, @org.jetbrains.annotations.NotNull()
    java.lang.String account_url, @org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.model.AdConfig ad_config, int ad_type, @org.jetbrains.annotations.NotNull()
    java.lang.String ad_url, boolean animated, long bandwidth, int comment_count, @org.jetbrains.annotations.NotNull()
    java.lang.String cover, int cover_height, int cover_width, int datetime, @org.jetbrains.annotations.NotNull()
    java.lang.Object description, int downs, int edited, boolean favorite, int favorite_count, @org.jetbrains.annotations.NotNull()
    java.lang.String gifv, boolean has_sound, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String hls, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.util.List<com.demo.imagesearch.ui.dashboard.model.Image> images, int images_count, boolean in_gallery, boolean in_most_viral, boolean include_album_ads, boolean is_ad, boolean is_album, @org.jetbrains.annotations.NotNull()
    java.lang.String layout, @org.jetbrains.annotations.NotNull()
    java.lang.String link, boolean looping, @org.jetbrains.annotations.NotNull()
    java.lang.String mp4, int mp4_size, boolean nsfw, int points, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy, @org.jetbrains.annotations.NotNull()
    com.demo.imagesearch.ui.dashboard.model.ProcessingX processing, int score, @org.jetbrains.annotations.NotNull()
    java.lang.String section, int size, @org.jetbrains.annotations.NotNull()
    java.util.List<com.demo.imagesearch.ui.dashboard.model.Tag> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, int topic_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int ups, int views, @org.jetbrains.annotations.NotNull()
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