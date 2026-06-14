package com.appodeal.ads.adapters.bigo_ads.interstitial;

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
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f12164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12165b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        com.appodeal.ads.adapters.bigo_ads.b adUnitParams2 = (com.appodeal.ads.adapters.bigo_ads.b) adUnitParams;
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12165b = new a(this, callback);
        InterstitialAdRequest interstitialAdRequestBuild = new InterstitialAdRequest.Builder().withSlotId(adUnitParams2.f12156a).build();
        InterstitialAdLoader interstitialAdLoaderBuild = new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) this.f12165b).build();
        Intrinsics.checkNotNullExpressionValue(interstitialAdLoaderBuild, "build(...)");
        interstitialAdLoaderBuild.loadAd(interstitialAdRequestBuild);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f12164a;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.f12164a = null;
        this.f12165b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterstitialAd interstitialAd = this.f12164a;
        if (interstitialAd == null || interstitialAd.isExpired()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            interstitialAd.setAdInteractionListener(this.f12165b);
            interstitialAd.show();
        }
    }
}
