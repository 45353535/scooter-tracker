package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes12.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f75241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f75242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f75243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f75244d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f75245e = null;

        public CachedData(long j10, long j11, @NonNull String str) {
            this.f75241a = String.format("[CachedData-%s]", str);
            this.f75242b = j10;
            this.f75243c = j11;
        }

        @Nullable
        public T getData() {
            return (T) this.f75245e;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.f75243c;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.f75242b;
        }

        public final boolean isEmpty() {
            return this.f75245e == null;
        }

        public void setData(@Nullable T t10) {
            this.f75245e = t10;
            this.f75244d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j10, long j11) {
            this.f75242b = j10;
            this.f75243c = j11;
        }

        public final boolean shouldClearData() {
            if (this.f75244d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f75244d;
            return jCurrentTimeMillis > this.f75243c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f75244d;
            return jCurrentTimeMillis > this.f75242b || jCurrentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f75241a + "', refreshTime=" + this.f75242b + ", expiryTime=" + this.f75243c + ", mCachedTime=" + this.f75244d + ", mCachedData=" + this.f75245e + '}';
        }
    }
}
