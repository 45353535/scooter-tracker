package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;

/* JADX INFO: loaded from: classes10.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j10, long j11);
}
