package com.appodeal.ads.adapters.applovin.mrec;

import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.appodeal.ads.adapters.applovin.e;
import com.appodeal.ads.unified.UnifiedMrecCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppLovinAdView f11972c;

    public a(UnifiedMrecCallback unifiedMrecCallback, AppLovinAdView appLovinAdView) {
        super(unifiedMrecCallback);
        this.f11972c = appLovinAdView;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        ((UnifiedMrecCallback) this.f11967b).onAdLoaded(this.f11972c);
    }
}
