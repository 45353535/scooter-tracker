package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f75247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f75248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f75249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f75250d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f75251e = new b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f75247a = iCommonExecutor;
        this.f75248b = iLastKnownUpdater;
        this.f75249c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f75247a.remove(this.f75250d);
        this.f75247a.executeDelayed(this.f75250d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f75247a.execute(this.f75251e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f75247a.remove(this.f75250d);
        this.f75247a.remove(this.f75251e);
    }
}
