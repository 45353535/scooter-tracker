package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.e7;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f64064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f64065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f64066c;

    public k(StartAppAd startAppAd, i iVar, AdPreferences adPreferences) {
        this.f64066c = startAppAd;
        this.f64064a = iVar;
        this.f64065b = adPreferences;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        if (e7.a(true, this.f64065b.getAdTag(), false, this.f64066c.f63950g == StartAppAd.AdMode.REWARDED_VIDEO)) {
            this.f64066c.b(this.f64064a, 2);
        } else {
            this.f64064a.onFailedToReceiveAd(ad2);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        this.f64064a.onReceiveAd(ad2);
    }
}
