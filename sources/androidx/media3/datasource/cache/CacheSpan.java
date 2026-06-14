package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.C4240b4;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public class CacheSpan implements Comparable<CacheSpan> {

    @Nullable
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j10, long j11) {
        this(str, j10, j11, -9223372036854775807L, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        return C4240b4.j.f42672d + this.position + ", " + this.length + C4240b4.j.f42674e;
    }

    public CacheSpan(String str, long j10, long j11, long j12, @Nullable File file) {
        this.key = str;
        this.position = j10;
        this.length = j11;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j12;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j10 = this.position - cacheSpan.position;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }
}
