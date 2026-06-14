package com.ironsource.adapters.bigo.rewardedvideo;

import com.ironsource.Df;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ironsource/adapters/bigo/rewardedvideo/BigoRewardedVideoAdListener;", "Lsg/bigo/ads/api/RewardAdInteractionListener;", "Lsg/bigo/ads/api/AdLoadListener;", "Lsg/bigo/ads/api/RewardVideoAd;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/bigo/rewardedvideo/BigoRewardedVideoAdapter;", "mListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "(Ljava/lang/ref/WeakReference;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", Df.f40645f, "", Df.f40646g, TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lsg/bigo/ads/api/AdError;", "onAdImpression", "onAdLoaded", "ad", Df.f40642c, Df.f40648i, "onError", "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoRewardedVideoAdListener implements RewardAdInteractionListener, AdLoadListener<RewardVideoAd> {

    @NotNull
    private final WeakReference<BigoRewardedVideoAdapter> mAdapter;

    @NotNull
    private final RewardedVideoSmashListener mListener;

    public BigoRewardedVideoAdListener(@NotNull WeakReference<BigoRewardedVideoAdapter> mAdapter, @NotNull RewardedVideoSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mAdapter = mAdapter;
        this.mListener = mListener;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdClosed();
        BigoRewardedVideoAdapter bigoRewardedVideoAdapter = this.mAdapter.get();
        if (bigoRewardedVideoAdapter != null) {
            bigoRewardedVideoAdapter.destroyRewardedVideoAd$bigoadapter_release();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(@NotNull AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.getCode() + ", errorMessage = " + error.getMessage());
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, error.getMessage()));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdStarted();
    }

    @Override // sg.bigo.ads.api.RewardAdInteractionListener
    public void onAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onError(@NotNull AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose("onError code: " + error.getCode() + ", " + error.getMessage());
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(BigoAdapter.INSTANCE.getLoadError(error));
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onAdLoaded(@NotNull RewardVideoAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.INTERNAL.verbose();
        BigoRewardedVideoAdapter bigoRewardedVideoAdapter = this.mAdapter.get();
        if (bigoRewardedVideoAdapter != null) {
            bigoRewardedVideoAdapter.setRewardedVideoAd$bigoadapter_release(ad2);
        }
        BigoRewardedVideoAdapter bigoRewardedVideoAdapter2 = this.mAdapter.get();
        if (bigoRewardedVideoAdapter2 != null) {
            bigoRewardedVideoAdapter2.setRewardedVideoAdAvailability$bigoadapter_release(true);
        }
        this.mListener.onRewardedVideoAvailabilityChanged(true);
    }
}
