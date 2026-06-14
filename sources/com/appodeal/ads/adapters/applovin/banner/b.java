package com.appodeal.ads.adapters.applovin.banner;

import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppLovinAdView f11963a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        AppLovinAdView appLovinAdView = new AppLovinAdView(((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(contextProvider.getApplicationContext()) ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER, ((com.appodeal.ads.adapters.applovin.b) adUnitParams).f11961a);
        this.f11963a = appLovinAdView;
        a aVar = new a(unifiedBannerCallback, appLovinAdView);
        appLovinAdView.setAdLoadListener(aVar);
        this.f11963a.setAdClickListener(aVar);
        this.f11963a.loadNextAd();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        AppLovinAdView appLovinAdView = this.f11963a;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.f11963a = null;
        }
    }
}
