package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.qd;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd f63846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdPreferences f63847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f63848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f63849d;

    public j(StartAppNativeAd startAppNativeAd, qd qdVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.f63849d = startAppNativeAd;
        this.f63846a = qdVar;
        this.f63847b = nativeAdPreferences;
        this.f63848c = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        if (ad2 != null) {
            this.f63849d.setErrorMessage(ad2.getErrorMessage());
        }
        ((z6) ((y6) ((Ad) this.f63849d).eventTracer.a())).c(this.f63849d, ii.f64702g);
        ((z6) ((y6) ((Ad) this.f63849d).eventTracer.a())).b(this.f63849d, ii.f64697b);
        a0.a(((Ad) this.f63849d).context, this.f63848c, this.f63849d, false);
        this.f63849d.loading.set(false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        this.f63849d.initNativeAdList(this.f63846a, this.f63847b, this.f63848c);
    }
}
