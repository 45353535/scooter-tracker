package com.appodeal.ads.adapters.mobilefuse.rewarded;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.mobilefuse.sdk.MobileFuseRewardedAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MobileFuseRewardedAd f12539a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) throws Throwable {
        UnifiedRewardedParams adTypeParams = (UnifiedRewardedParams) unifiedAdParams;
        com.appodeal.ads.adapters.mobilefuse.a adUnitParams2 = (com.appodeal.ads.adapters.mobilefuse.a) adUnitParams;
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MobileFuseRewardedAd mobileFuseRewardedAd = new MobileFuseRewardedAd(contextProvider.getApplicationContext(), adUnitParams2.f12514a);
        mobileFuseRewardedAd.setMuted(adUnitParams2.f12515b);
        mobileFuseRewardedAd.setListener(new b(this, callback));
        mobileFuseRewardedAd.loadAd();
        this.f12539a = mobileFuseRewardedAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12539a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MobileFuseRewardedAd mobileFuseRewardedAd = this.f12539a;
        if (mobileFuseRewardedAd == null || !mobileFuseRewardedAd.isLoaded()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            mobileFuseRewardedAd.showAd();
        }
    }
}
