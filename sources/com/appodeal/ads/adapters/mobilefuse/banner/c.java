package com.appodeal.ads.adapters.mobilefuse.banner;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MobileFuseBannerAd f12522a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) throws Throwable {
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        com.appodeal.ads.adapters.mobilefuse.a adUnitParams2 = (com.appodeal.ads.adapters.mobilefuse.a) adUnitParams;
        UnifiedBannerCallback callback = (UnifiedBannerCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.NoFill);
            return;
        }
        MobileFuseBannerAd.AdSize adSize = adTypeParams.needLeaderBoard(resumedActivity) ? MobileFuseBannerAd.AdSize.BANNER_728x90 : MobileFuseBannerAd.AdSize.BANNER_320x50;
        MobileFuseBannerAd mobileFuseBannerAd = new MobileFuseBannerAd(resumedActivity, adUnitParams2.f12514a, adSize);
        mobileFuseBannerAd.setAutorefreshEnabled(false);
        mobileFuseBannerAd.setListener(new b(callback, mobileFuseBannerAd, adSize));
        mobileFuseBannerAd.setMuted(adUnitParams2.f12515b);
        mobileFuseBannerAd.loadAd();
        this.f12522a = mobileFuseBannerAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        MobileFuseBannerAd mobileFuseBannerAd = this.f12522a;
        if (mobileFuseBannerAd != null) {
            mobileFuseBannerAd.destroy();
        }
        this.f12522a = null;
    }
}
