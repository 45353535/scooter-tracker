package com.appodeal.ads.adapters.vungle.banner;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.vungle.ads.Ad;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdSize;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerAd f12598a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        com.appodeal.ads.adapters.vungle.a adUnitParams2 = (com.appodeal.ads.adapters.vungle.a) adUnitParams;
        UnifiedBannerCallback callback = (UnifiedBannerCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        String str = adUnitParams2.f12595a;
        BannerAdSize bannerAdSize = adTypeParams.needLeaderBoard(resumedActivity) ? BannerAdSize.BANNER_LEADERBOARD : BannerAdSize.BANNER;
        a aVar = new a(callback, bannerAdSize);
        BannerAd bannerAd = new BannerAd(resumedActivity, str, bannerAdSize);
        bannerAd.setAdListener(aVar);
        Ad.DefaultImpls.load$default(bannerAd, null, 1, null);
        this.f12598a = bannerAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerAd bannerAd = this.f12598a;
        if (bannerAd != null) {
            bannerAd.finishAd();
        }
        BannerAd bannerAd2 = this.f12598a;
        if (bannerAd2 != null) {
            bannerAd2.setAdListener(null);
        }
        this.f12598a = null;
    }
}
