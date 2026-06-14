package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface InterstitialAdLoaderListener {
    void onInterstitialAdLoadFailed(@NotNull IronSourceError ironSourceError);

    void onInterstitialAdLoaded(@NotNull InterstitialAd interstitialAd);
}
