package com.appodeal.ads.adapters.vungle.mrec;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.vungle.ads.Ad;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdSize;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerAd f12603a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        com.appodeal.ads.adapters.vungle.a adUnitParams2 = (com.appodeal.ads.adapters.vungle.a) adUnitParams;
        UnifiedMrecCallback callback = (UnifiedMrecCallback) unifiedAdCallback;
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
        BannerAdSize bannerAdSize = BannerAdSize.VUNGLE_MREC;
        a aVar = new a(callback);
        BannerAd bannerAd = new BannerAd(resumedActivity, str, bannerAdSize);
        bannerAd.setAdListener(aVar);
        Ad.DefaultImpls.load$default(bannerAd, null, 1, null);
        this.f12603a = bannerAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerAd bannerAd = this.f12603a;
        if (bannerAd != null) {
            bannerAd.finishAd();
        }
        BannerAd bannerAd2 = this.f12603a;
        if (bannerAd2 != null) {
            bannerAd2.setAdListener(null);
        }
        this.f12603a = null;
    }
}
