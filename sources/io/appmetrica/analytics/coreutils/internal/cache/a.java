package io.appmetrica.analytics.coreutils.internal.cache;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f75252a;

    public a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f75252a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75252a.f75248b.updateLastKnown();
    }
}
