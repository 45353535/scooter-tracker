package com.appodeal.ads.adapters.mytarget.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InterstitialAd.InterstitialAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12546a;

    public b(UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12546a = unifiedInterstitialCallback;
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onClick(InterstitialAd interstitialAd) {
        this.f12546a.onAdClicked();
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onDismiss(InterstitialAd interstitialAd) {
        this.f12546a.onAdClosed();
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onDisplay(InterstitialAd interstitialAd) {
        this.f12546a.onAdShown();
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onFailedToShow(InterstitialAd interstitialAd) {
        this.f12546a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback("MyTargetInterstitial", null));
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onLoad(InterstitialAd interstitialAd) {
        this.f12546a.onAdLoaded();
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onNoAd(IAdLoadingError iAdLoadingError, InterstitialAd interstitialAd) {
        this.f12546a.printError(iAdLoadingError.getMessage(), Integer.valueOf(iAdLoadingError.getCode()));
        this.f12546a.onAdLoadFailed(null);
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public final void onVideoCompleted(InterstitialAd interstitialAd) {
        this.f12546a.onAdFinished();
    }
}
