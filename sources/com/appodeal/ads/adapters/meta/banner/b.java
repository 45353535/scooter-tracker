package com.appodeal.ads.adapters.meta.banner;

import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSize f12468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdView f12469b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        com.appodeal.ads.adapters.meta.b bVar = (com.appodeal.ads.adapters.meta.b) adUnitParams;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        if (((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext)) {
            this.f12468a = AdSize.BANNER_HEIGHT_90;
        } else {
            this.f12468a = AdSize.BANNER_HEIGHT_50;
        }
        AdView adView = new AdView(applicationContext, bVar.f12465a, this.f12468a);
        this.f12469b = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new a(this, unifiedBannerCallback)).build());
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        AdView adView = this.f12469b;
        if (adView != null) {
            adView.destroy();
            this.f12469b = null;
        }
        this.f12468a = null;
    }
}
