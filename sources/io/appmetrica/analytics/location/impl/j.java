package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f78694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f78695b;

    public j(k kVar, i iVar) {
        this.f78695b = kVar;
        this.f78694a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f78695b.f78698c;
        i iVar = this.f78694a;
        pVar.f78715a = iVar;
        CacheArguments cacheArguments = iVar.f78693b;
        pVar.f78716b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
