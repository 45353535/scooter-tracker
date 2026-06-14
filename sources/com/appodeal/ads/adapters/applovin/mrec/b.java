package com.appodeal.ads.adapters.applovin.mrec;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppLovinAdView f11973a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        Context applicationContext = contextProvider.getApplicationContext();
        AppLovinAdSize appLovinAdSize = AppLovinAdSize.MREC;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.round(UnifiedAdUtils.getScreenDensity(applicationContext) * appLovinAdSize.getWidth()), Math.round(UnifiedAdUtils.getScreenDensity(applicationContext) * appLovinAdSize.getHeight()), 1);
        AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinAdSize, ((com.appodeal.ads.adapters.applovin.b) adUnitParams).f11961a);
        this.f11973a = appLovinAdView;
        a aVar = new a((UnifiedMrecCallback) unifiedAdCallback, appLovinAdView);
        appLovinAdView.setLayoutParams(layoutParams);
        this.f11973a.setAdLoadListener(aVar);
        this.f11973a.setAdClickListener(aVar);
        this.f11973a.loadNextAd();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        AppLovinAdView appLovinAdView = this.f11973a;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.f11973a = null;
        }
    }
}
