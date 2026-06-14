package com.appodeal.ads.adapters.mobilefuse.mrec;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MobileFuseBannerAd f12531a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) throws Throwable {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        com.appodeal.ads.adapters.mobilefuse.a adUnitParams2 = (com.appodeal.ads.adapters.mobilefuse.a) adUnitParams;
        UnifiedMrecCallback callback = (UnifiedMrecCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.NoFill);
            return;
        }
        MobileFuseBannerAd mobileFuseBannerAd = new MobileFuseBannerAd(resumedActivity, adUnitParams2.f12514a, MobileFuseBannerAd.AdSize.BANNER_300x250);
        mobileFuseBannerAd.setAutorefreshEnabled(false);
        mobileFuseBannerAd.setMuted(adUnitParams2.f12515b);
        mobileFuseBannerAd.setListener(new b(callback, mobileFuseBannerAd));
        mobileFuseBannerAd.loadAd();
        this.f12531a = mobileFuseBannerAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        MobileFuseBannerAd mobileFuseBannerAd = this.f12531a;
        if (mobileFuseBannerAd != null) {
            mobileFuseBannerAd.destroy();
        }
        this.f12531a = null;
    }
}
