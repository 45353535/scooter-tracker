package com.appodeal.ads.adapters.unityads.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.unityads.c;
import com.appodeal.ads.adapters.unityads.d;
import com.appodeal.ads.adapters.unityads.e;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12573a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        String str = ((e) adUnitParams).f12565a;
        if (str.isEmpty()) {
            str = "defaultVideoAndPictureZone";
        }
        this.f12573a = str;
        UnityAds.load(str, new d(unifiedInterstitialCallback));
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnityAds.show(activity, this.f12573a, new UnityAdsShowOptions(), new c((UnifiedInterstitialCallback) unifiedFullscreenAdCallback));
    }
}
