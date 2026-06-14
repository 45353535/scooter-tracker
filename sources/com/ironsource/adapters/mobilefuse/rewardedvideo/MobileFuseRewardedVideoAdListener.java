package com.ironsource.adapters.mobilefuse.rewardedvideo;

import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseRewardedAd;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/rewardedvideo/MobileFuseRewardedVideoAdListener;", "Lcom/mobilefuse/sdk/MobileFuseRewardedAd$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "(Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", Df.f40645f, "", Df.f40646g, TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lcom/mobilefuse/sdk/AdError;", "onAdExpired", "onAdLoaded", "onAdNotFilled", "onAdRendered", "onUserEarnedReward", "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MobileFuseRewardedVideoAdListener implements MobileFuseRewardedAd.Listener {

    @NotNull
    private final RewardedVideoSmashListener mListener;

    public MobileFuseRewardedVideoAdListener(@NotNull RewardedVideoSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdClosed();
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
        if (error != AdError.AD_ALREADY_LOADED && error != AdError.AD_LOAD_ERROR) {
            this.mListener.onRewardedVideoAdShowFailed(ironSourceError);
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(false);
            this.mListener.onRewardedVideoLoadFailed(ironSourceError);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdExpired() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_RV_EXPIRED_ADS, "ads are expired"));
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdLoaded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAvailabilityChanged(true);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdNotFilled() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(new IronSourceError(1058, "No Fill"));
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdRendered() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }

    @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
    public void onUserEarnedReward() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdRewarded();
    }
}
