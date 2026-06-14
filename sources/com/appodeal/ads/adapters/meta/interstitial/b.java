package com.appodeal.ads.adapters.meta.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.facebook.ads.InterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f12481a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        InterstitialAd interstitialAd = new InterstitialAd(contextProvider.getApplicationContext(), ((com.appodeal.ads.adapters.meta.b) adUnitParams).f12465a);
        this.f12481a = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new a((UnifiedInterstitialCallback) unifiedAdCallback)).build());
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f12481a;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f12481a = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f12481a;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f12481a.isAdInvalidated()) {
            unifiedInterstitialCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            this.f12481a.show();
        }
    }
}
