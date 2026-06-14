package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class SynchronizedDataCache<T> extends DataCache<T> {
    public SynchronizedDataCache(long j10, long j11, @NonNull String str) {
        super(j10, j11, str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    @Nullable
    public synchronized T getData() {
        return (T) super.getData();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache, io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    @AnyThread
    public synchronized boolean shouldUpdate() {
        return super.shouldUpdate();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public synchronized void updateData(@NonNull T t10) {
        super.updateData(t10);
    }
}
