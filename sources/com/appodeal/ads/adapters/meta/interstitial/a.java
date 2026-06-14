package com.appodeal.ads.adapters.meta.interstitial;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements InterstitialAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12480a;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12480a = unifiedInterstitialCallback;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f12480a.onAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f12480a.onAdLoaded();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        if (ad2 != null) {
            ad2.destroy();
        }
        if (adError != null) {
            this.f12480a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
        }
        this.f12480a.onAdLoadFailed(MetaNetwork.mapError(adError));
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        if (ad2 != null) {
            ad2.destroy();
        }
        this.f12480a.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        this.f12480a.onAdShown();
    }
}
