package com.appodeal.ads.adapters.bigo_ads.banner;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerAd f12159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12160b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        AdSize BANNER;
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        com.appodeal.ads.adapters.bigo_ads.b adUnitParams2 = (com.appodeal.ads.adapters.bigo_ads.b) adUnitParams;
        UnifiedBannerCallback callback = (UnifiedBannerCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        this.f12160b = new a(this, callback);
        if (adTypeParams.useSmartBanners(applicationContext)) {
            setRefreshOnRotate(true);
            BANNER = AdSize.getAdaptiveAdSize(applicationContext, adTypeParams.getMaxWidth(applicationContext));
            Intrinsics.checkNotNull(BANNER);
        } else if (adTypeParams.needLeaderBoard(applicationContext)) {
            BANNER = AdSize.LEADERBOARD;
            Intrinsics.checkNotNullExpressionValue(BANNER, "LEADERBOARD");
        } else {
            BANNER = AdSize.BANNER;
            Intrinsics.checkNotNullExpressionValue(BANNER, "BANNER");
        }
        BannerAdRequest bannerAdRequestBuild = new BannerAdRequest.Builder().withSlotId(adUnitParams2.f12156a).withAdSizes(BANNER).build();
        BannerAdLoader bannerAdLoaderBuild = new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.f12160b).build();
        Intrinsics.checkNotNullExpressionValue(bannerAdLoaderBuild, "build(...)");
        bannerAdLoaderBuild.loadAd(bannerAdRequestBuild);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerAd bannerAd = this.f12159a;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
        this.f12159a = null;
        this.f12160b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        super.onPrepareToShow(activity, adTypeParams);
        BannerAd bannerAd = this.f12159a;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(this.f12160b);
        }
    }
}
