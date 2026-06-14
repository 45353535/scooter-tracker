package com.ironsource.adapters.admob.interstitial;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class AdMobInterstitialAdShowListener extends FullScreenContentCallback {
    private String mAdUnitId;
    private InterstitialSmashListener mListener;

    AdMobInterstitialAdShowListener(String str, InterstitialSmashListener interstitialSmashListener) {
        this.mListener = interstitialSmashListener;
        this.mAdUnitId = str;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NotNull AdError adError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        int code = adError.getCode();
        String str = adError.getMessage() + "( " + code + " )";
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (adError.getCause() != null) {
            str = str + " Caused by - " + adError.getCause();
        }
        ironLog.error("adapterError = " + str);
        this.mListener.onInterstitialAdShowFailed(new IronSourceError(code, "onInterstitialAdShowFailed " + this.mAdUnitId + " " + str));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdOpened();
            this.mListener.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
    }
}
