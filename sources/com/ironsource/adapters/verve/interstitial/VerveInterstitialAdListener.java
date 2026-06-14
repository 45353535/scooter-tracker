package com.ironsource.adapters.verve.interstitial;

import com.ironsource.adapters.verve.VerveAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ironsource/adapters/verve/interstitial/VerveInterstitialAdListener;", "Lnet/pubnative/lite/sdk/interstitial/HyBidInterstitialAd$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "(Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "onInterstitialClick", "", "onInterstitialDismissed", "onInterstitialImpression", "onInterstitialLoadFailed", "error", "", "onInterstitialLoaded", "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerveInterstitialAdListener implements HyBidInterstitialAd.Listener {

    @NotNull
    private final InterstitialSmashListener mListener;

    public VerveInterstitialAdListener(@NotNull InterstitialSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
    }

    @Override // net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.Listener
    public void onInterstitialClick() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClicked();
    }

    @Override // net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.Listener
    public void onInterstitialDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClosed();
    }

    @Override // net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.Listener
    public void onInterstitialImpression() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }

    @Override // net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.Listener
    public void onInterstitialLoadFailed(@Nullable Throwable error) {
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorMessage = " + (error != null ? error.getMessage() : null) + " , errorCause = " + (error != null ? error.getCause() : null));
        this.mListener.onInterstitialAdLoadFailed(VerveAdapter.INSTANCE.getLoadError(error));
    }

    @Override // net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.Listener
    public void onInterstitialLoaded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdReady();
    }
}
