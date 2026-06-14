package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {
    static {
        CacheKeyFactory cacheKeyFactory = CacheKeyFactory.DEFAULT;
    }

    public static /* synthetic */ String a(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
