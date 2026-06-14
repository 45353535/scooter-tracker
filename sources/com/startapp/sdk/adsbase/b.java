package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.lc;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f64010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f64011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ad f64013d;

    public b(Ad ad2, AdPreferences adPreferences, a aVar, String str) {
        this.f64013d = ad2;
        this.f64010a = adPreferences;
        this.f64011b = aVar;
        this.f64012c = str;
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        ((z6) ((y6) this.f64013d.eventTracer.a())).c(this, ii.f64708m);
        this.f64013d.loadAds(this.f64010a, this.f64011b, this.f64012c);
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        ((z6) ((y6) this.f64013d.eventTracer.a())).c(this, ii.f64709n);
        this.f64013d.loadAds(this.f64010a, this.f64011b, this.f64012c);
    }
}
