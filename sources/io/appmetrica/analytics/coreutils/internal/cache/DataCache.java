package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CacheUpdateScheduler f75246a;

    @NonNull
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j10, long j11, @NonNull String str) {
        String.format("[DataCache-%s]", str);
        this.mCachedData = new CachedDataProvider.CachedData<>(j10, j11, str);
    }

    @NonNull
    @VisibleForTesting
    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    @Nullable
    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f75246a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(@NonNull CacheUpdateScheduler cacheUpdateScheduler) {
        this.f75246a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    protected abstract boolean shouldUpdate(@NonNull T t10);

    public void updateCacheControl(long j10, long j11) {
        this.mCachedData.setExpirationPolicy(j10, j11);
    }

    public void updateData(@NonNull T t10) {
        if (shouldUpdate(t10)) {
            this.mCachedData.setData(t10);
            CacheUpdateScheduler cacheUpdateScheduler = this.f75246a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
