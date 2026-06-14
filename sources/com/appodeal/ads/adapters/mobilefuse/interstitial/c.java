package com.appodeal.ads.adapters.mobilefuse.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.mobilefuse.sdk.MobileFuseInterstitialAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MobileFuseInterstitialAd f12527a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) throws Throwable {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        com.appodeal.ads.adapters.mobilefuse.a adUnitParams2 = (com.appodeal.ads.adapters.mobilefuse.a) adUnitParams;
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MobileFuseInterstitialAd mobileFuseInterstitialAd = new MobileFuseInterstitialAd(contextProvider.getApplicationContext(), adUnitParams2.f12514a);
        mobileFuseInterstitialAd.setMuted(adUnitParams2.f12515b);
        mobileFuseInterstitialAd.setListener(new b(this, callback));
        mobileFuseInterstitialAd.loadAd();
        this.f12527a = mobileFuseInterstitialAd;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12527a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MobileFuseInterstitialAd mobileFuseInterstitialAd = this.f12527a;
        if (mobileFuseInterstitialAd == null || !mobileFuseInterstitialAd.isLoaded()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            mobileFuseInterstitialAd.showAd();
        }
    }
}
