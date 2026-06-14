package com.appodeal.ads.adapters.mytarget.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.my.target.ads.InterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f12545a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        com.appodeal.ads.adapters.mytarget.a aVar = (com.appodeal.ads.adapters.mytarget.a) adUnitParams;
        InterstitialAd interstitialAd = new InterstitialAd(aVar.f12540a, contextProvider.getApplicationContext());
        this.f12545a = interstitialAd;
        aVar.a(interstitialAd.getCustomParams());
        this.f12545a.setListener(new b((UnifiedInterstitialCallback) unifiedAdCallback));
        this.f12545a.load();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f12545a;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f12545a = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f12545a;
        if (interstitialAd != null) {
            interstitialAd.show();
        } else {
            unifiedInterstitialCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        }
    }
}
