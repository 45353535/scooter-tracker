package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.Cache;

/* JADX INFO: loaded from: classes7.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j10, long j11);

    boolean requiresCacheSpanTouches();
}
