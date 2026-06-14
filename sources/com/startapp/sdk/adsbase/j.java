package com.startapp.sdk.adsbase;

import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f64062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f64063b;

    public j(StartAppAd startAppAd, i iVar) {
        this.f64063b = startAppAd;
        this.f64062a = iVar;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        ExternalConfig externalConfigU = MetaData.E().u();
        if (externalConfigU == null || !externalConfigU.getLoadInnerAdIfNoExternal()) {
            this.f64062a.onFailedToReceiveAd(this.f64063b);
        } else {
            StartAppAd.a(this.f64063b, this.f64062a);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        this.f64062a.onReceiveAd(ad2);
    }
}
