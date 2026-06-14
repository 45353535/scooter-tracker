package io.appmetrica.analytics.coreutils.internal.cache;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f75253a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f75253a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f75253a.f75249c.shouldUpdate()) {
            this.f75253a.f75250d.f75252a.f75248b.updateLastKnown();
        }
    }
}
