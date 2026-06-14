package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes11.dex */
public final class la implements AdEventListener {
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        com.startapp.sdk.adsbase.e eVar = ma.f64919a;
        if (eVar.f64050e.showAd()) {
            eVar.f64048c = System.currentTimeMillis();
            eVar.f64049d = 0;
        }
    }
}
