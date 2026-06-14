package com.appodeal.ads.adapters.notsy.interstitial;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdManagerInterstitialAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UnifiedAdContainer f12554d;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer unifiedAdContainer) {
        this.f12553c = unifiedInterstitialCallback;
        this.f12554d = unifiedAdContainer;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        if (loadAdError != null) {
            this.f12553c.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
        }
        this.f12553c.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        AdManagerInterstitialAd adManagerInterstitialAd2 = adManagerInterstitialAd;
        super.onAdLoaded(adManagerInterstitialAd2);
        this.f12554d.setAd(adManagerInterstitialAd2);
        adManagerInterstitialAd2.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f12553c, adManagerInterstitialAd2.getResponseInfo()));
        this.f12553c.onAdLoaded();
    }
}
