package com.ironsource.adapters.mobilefuse.interstitial;

import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseInterstitialAd;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/interstitial/MobileFuseInterstitialAdListener;", "Lcom/mobilefuse/sdk/MobileFuseInterstitialAd$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "(Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", Df.f40645f, "", Df.f40646g, TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lcom/mobilefuse/sdk/AdError;", "onAdExpired", "onAdLoaded", "onAdNotFilled", "onAdRendered", "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MobileFuseInterstitialAdListener implements MobileFuseInterstitialAd.Listener {

    @NotNull
    private final InterstitialSmashListener mListener;

    public MobileFuseInterstitialAdListener(@NotNull InterstitialSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseInterstitialAd.Listener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdError(@Nullable AdError error) {
        int errorCode = error != null ? error.getErrorCode() : 0;
        String errorMessage = error != null ? error.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load/show, errorCode = " + errorCode + ", errorMessage = " + errorMessage);
        IronSourceError ironSourceError = new IronSourceError(errorCode, errorMessage);
        if (error == AdError.AD_ALREADY_LOADED || error == AdError.AD_LOAD_ERROR) {
            this.mListener.onInterstitialAdLoadFailed(ironSourceError);
        } else {
            this.mListener.onInterstitialAdShowFailed(ironSourceError);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdExpired() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdLoaded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdNotFilled() {
        this.mListener.onInterstitialAdLoadFailed(new IronSourceError(1158, "No Fill"));
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdRendered() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdVisible();
    }
}
