package com.appodeal.ads.adapters.admob.interstitial;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdContainer f11909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f11910b;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer unifiedAdContainer) {
        this.f11909a = unifiedAdContainer;
        this.f11910b = unifiedInterstitialCallback;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f11910b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
        this.f11910b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        super.onAdLoaded(interstitialAd2);
        this.f11909a.setAd(interstitialAd2);
        interstitialAd2.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11910b, interstitialAd2.getResponseInfo()));
        this.f11910b.onAdLoaded();
    }
}
