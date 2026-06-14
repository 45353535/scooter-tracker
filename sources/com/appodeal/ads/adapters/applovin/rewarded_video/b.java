package com.appodeal.ads.adapters.applovin.rewarded_video;

import android.app.Activity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppLovinIncentivizedInterstitial f11975b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        this.f11974a = new a((UnifiedRewardedCallback) unifiedAdCallback);
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = new AppLovinIncentivizedInterstitial(((com.appodeal.ads.adapters.applovin.b) adUnitParams).f11961a);
        this.f11975b = appLovinIncentivizedInterstitial;
        appLovinIncentivizedInterstitial.preload(this.f11974a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f11975b = null;
        this.f11974a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.f11975b;
        if (appLovinIncentivizedInterstitial == null || !appLovinIncentivizedInterstitial.isAdReadyToDisplay()) {
            unifiedRewardedCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
            return;
        }
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial2 = this.f11975b;
        a aVar = this.f11974a;
        appLovinIncentivizedInterstitial2.show(activity, (AppLovinAdRewardListener) null, aVar, aVar, aVar);
    }
}
