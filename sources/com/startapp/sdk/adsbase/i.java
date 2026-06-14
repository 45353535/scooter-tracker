package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f64060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f64061b;

    public i(StartAppAd startAppAd, AdEventListener adEventListener) {
        this.f64061b = startAppAd;
        this.f64060a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        ((z6) ((y6) this.f64061b.eventTracer.a())).c(this.f64061b, ii.f64702g);
        ((z6) ((y6) this.f64061b.eventTracer.a())).b(this.f64061b, ii.f64696a);
        StartAppAd startAppAd = this.f64061b;
        a0.a(startAppAd.context, this.f64060a, startAppAd, false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        ((z6) ((y6) this.f64061b.eventTracer.a())).c(this.f64061b, ii.f64701f);
        ((z6) ((y6) this.f64061b.eventTracer.a())).b(this.f64061b, ii.f64696a);
        StartAppAd startAppAd = this.f64061b;
        a0.b(startAppAd.context, this.f64060a, startAppAd, false);
    }
}
