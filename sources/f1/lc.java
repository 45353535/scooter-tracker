package f1;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lc {
    public static final int b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j10 = cacheSpan.lastTouchTimestamp;
        long j11 = cacheSpan2.lastTouchTimestamp;
        return j10 - j11 == 0 ? cacheSpan.compareTo(cacheSpan2) : j10 < j11 ? -1 : 1;
    }
}
