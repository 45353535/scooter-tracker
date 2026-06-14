package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
final class zzc extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AbstractAdViewAdapter f24101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MediationInterstitialListener f24102d;

    public zzc(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f24101c = abstractAdViewAdapter;
        this.f24102d = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f24102d.onAdFailedToLoad(this.f24101c, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f24101c;
        InterstitialAd interstitialAd2 = interstitialAd;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        MediationInterstitialListener mediationInterstitialListener = this.f24102d;
        interstitialAd2.setFullScreenContentCallback(new zzd(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.onAdLoaded(abstractAdViewAdapter);
    }
}
