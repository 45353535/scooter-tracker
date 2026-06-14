package com.appodeal.ads.adapters.applovin.interstitial;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.appodeal.ads.adapters.applovin.e;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e implements AppLovinAdDisplayListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11968c;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback, b bVar) {
        super(unifiedInterstitialCallback);
        this.f11968c = bVar;
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adDisplayed(AppLovinAd appLovinAd) {
        ((UnifiedInterstitialCallback) this.f11967b).onAdShown();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        ((UnifiedInterstitialCallback) this.f11967b).onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        this.f11968c.f11971c = appLovinAd;
        ((UnifiedInterstitialCallback) this.f11967b).onAdLoaded();
    }
}
