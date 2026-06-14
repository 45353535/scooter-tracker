package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class CacheStats {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f29050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f29051f;

    public CacheStats(long j10, long j11, long j12, long j13, long j14, long j15) {
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j12 >= 0);
        Preconditions.checkArgument(j13 >= 0);
        Preconditions.checkArgument(j14 >= 0);
        Preconditions.checkArgument(j15 >= 0);
        this.f29046a = j10;
        this.f29047b = j11;
        this.f29048c = j12;
        this.f29049d = j13;
        this.f29050e = j14;
        this.f29051f = j15;
    }

    public double averageLoadPenalty() {
        long jSaturatedAdd = LongMath.saturatedAdd(this.f29048c, this.f29049d);
        if (jSaturatedAdd == 0) {
            return 0.0d;
        }
        return this.f29050e / jSaturatedAdd;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CacheStats) {
            CacheStats cacheStats = (CacheStats) obj;
            if (this.f29046a == cacheStats.f29046a && this.f29047b == cacheStats.f29047b && this.f29048c == cacheStats.f29048c && this.f29049d == cacheStats.f29049d && this.f29050e == cacheStats.f29050e && this.f29051f == cacheStats.f29051f) {
                return true;
            }
        }
        return false;
    }

    public long evictionCount() {
        return this.f29051f;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f29046a), Long.valueOf(this.f29047b), Long.valueOf(this.f29048c), Long.valueOf(this.f29049d), Long.valueOf(this.f29050e), Long.valueOf(this.f29051f));
    }

    public long hitCount() {
        return this.f29046a;
    }

    public double hitRate() {
        long jRequestCount = requestCount();
        if (jRequestCount == 0) {
            return 1.0d;
        }
        return this.f29046a / jRequestCount;
    }

    public long loadCount() {
        return LongMath.saturatedAdd(this.f29048c, this.f29049d);
    }

    public long loadExceptionCount() {
        return this.f29049d;
    }

    public double loadExceptionRate() {
        long jSaturatedAdd = LongMath.saturatedAdd(this.f29048c, this.f29049d);
        if (jSaturatedAdd == 0) {
            return 0.0d;
        }
        return this.f29049d / jSaturatedAdd;
    }

    public long loadSuccessCount() {
        return this.f29048c;
    }

    public CacheStats minus(CacheStats cacheStats) {
        return new CacheStats(Math.max(0L, LongMath.saturatedSubtract(this.f29046a, cacheStats.f29046a)), Math.max(0L, LongMath.saturatedSubtract(this.f29047b, cacheStats.f29047b)), Math.max(0L, LongMath.saturatedSubtract(this.f29048c, cacheStats.f29048c)), Math.max(0L, LongMath.saturatedSubtract(this.f29049d, cacheStats.f29049d)), Math.max(0L, LongMath.saturatedSubtract(this.f29050e, cacheStats.f29050e)), Math.max(0L, LongMath.saturatedSubtract(this.f29051f, cacheStats.f29051f)));
    }

    public long missCount() {
        return this.f29047b;
    }

    public double missRate() {
        long jRequestCount = requestCount();
        if (jRequestCount == 0) {
            return 0.0d;
        }
        return this.f29047b / jRequestCount;
    }

    public CacheStats plus(CacheStats cacheStats) {
        return new CacheStats(LongMath.saturatedAdd(this.f29046a, cacheStats.f29046a), LongMath.saturatedAdd(this.f29047b, cacheStats.f29047b), LongMath.saturatedAdd(this.f29048c, cacheStats.f29048c), LongMath.saturatedAdd(this.f29049d, cacheStats.f29049d), LongMath.saturatedAdd(this.f29050e, cacheStats.f29050e), LongMath.saturatedAdd(this.f29051f, cacheStats.f29051f));
    }

    public long requestCount() {
        return LongMath.saturatedAdd(this.f29046a, this.f29047b);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("hitCount", this.f29046a).add("missCount", this.f29047b).add("loadSuccessCount", this.f29048c).add("loadExceptionCount", this.f29049d).add("totalLoadTime", this.f29050e).add("evictionCount", this.f29051f).toString();
    }

    public long totalLoadTime() {
        return this.f29050e;
    }
}
