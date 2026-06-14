package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* JADX INFO: loaded from: classes11.dex */
public final class ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc f64689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest$RequestReason f64690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f64691c;

    public ic(lc lcVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        this.f64689a = lcVar;
        this.f64690b = metaDataRequest$RequestReason;
        this.f64691c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f64689a.a(this.f64690b, this.f64691c);
    }
}
