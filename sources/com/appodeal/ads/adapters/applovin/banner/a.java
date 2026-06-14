package com.appodeal.ads.adapters.applovin.banner;

import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.appodeal.ads.adapters.applovin.e;
import com.appodeal.ads.unified.UnifiedBannerCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppLovinAdView f11962c;

    public a(UnifiedBannerCallback unifiedBannerCallback, AppLovinAdView appLovinAdView) {
        super(unifiedBannerCallback);
        this.f11962c = appLovinAdView;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        ((UnifiedBannerCallback) this.f11967b).onAdLoaded(this.f11962c, appLovinAd.getSize().getHeight());
    }
}
