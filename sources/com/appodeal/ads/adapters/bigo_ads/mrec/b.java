package com.appodeal.ads.adapters.bigo_ads.mrec;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerAd f12168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12169b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        com.appodeal.ads.adapters.bigo_ads.b adUnitParams2 = (com.appodeal.ads.adapters.bigo_ads.b) adUnitParams;
        UnifiedMrecCallback callback = (UnifiedMrecCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12169b = new a(this, callback);
        BannerAdRequest bannerAdRequestBuild = new BannerAdRequest.Builder().withSlotId(adUnitParams2.f12156a).withAdSizes(AdSize.MEDIUM_RECTANGLE).build();
        BannerAdLoader bannerAdLoaderBuild = new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.f12169b).build();
        Intrinsics.checkNotNullExpressionValue(bannerAdLoaderBuild, "build(...)");
        bannerAdLoaderBuild.loadAd(bannerAdRequestBuild);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerAd bannerAd = this.f12168a;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
        this.f12168a = null;
        this.f12169b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        super.onPrepareToShow(activity, adTypeParams);
        BannerAd bannerAd = this.f12168a;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(this.f12169b);
        }
    }
}
