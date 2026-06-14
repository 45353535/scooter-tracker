package com.appodeal.ads.adapters.ironsource.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.ironsource.IronSourceNetwork;
import com.appodeal.ads.adapters.ironsource.e;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12372b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12373c = false;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        e eVar = (e) adUnitParams;
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        this.f12371a = eVar.f12367a;
        IronSourceNetwork.registerInterstitialInstances(eVar.f12368b);
        if (!IronSourceNetwork.canLoadInstance(this.f12371a)) {
            if (IronSourceNetwork.isInstanceInProgress()) {
                unifiedInterstitialCallback.onAdLoadFailed(LoadingError.Canceled);
                return;
            } else {
                unifiedInterstitialCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
                return;
            }
        }
        IronSourceNetwork.subscribeInterstitialListener(this.f12371a, new b(this, unifiedInterstitialCallback));
        if (IronSource.isISDemandOnlyInterstitialReady(this.f12371a)) {
            unifiedInterstitialCallback.onAdLoaded();
            return;
        }
        IronSourceNetwork.setInProgressInstance(true);
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity != null) {
            IronSource.loadISDemandOnlyInterstitial(resumedActivity, this.f12371a);
        } else {
            unifiedInterstitialCallback.onAdLoadFailed(LoadingError.InternalError);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onError(LoadingError loadingError) {
        super.onError(loadingError);
        this.f12373c = true;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onLoaded() {
        super.onLoaded();
        this.f12372b = true;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        if (IronSource.isISDemandOnlyInterstitialReady(this.f12371a)) {
            IronSource.showISDemandOnlyInterstitial(this.f12371a);
        } else {
            unifiedInterstitialCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        }
    }
}
