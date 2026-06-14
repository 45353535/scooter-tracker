package com.ironsource.adapters.verve.rewardedvideo;

import com.ironsource.adapters.verve.VerveAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ironsource/adapters/verve/rewardedvideo/VerveRewardedVideoAdListener;", "Lnet/pubnative/lite/sdk/rewarded/HyBidRewardedAd$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "(Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "onReward", "", "onRewardedClick", "onRewardedClosed", "onRewardedLoadFailed", "error", "", "onRewardedLoaded", "onRewardedOpened", "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerveRewardedVideoAdListener implements HyBidRewardedAd.Listener {

    @NotNull
    private final RewardedVideoSmashListener mListener;

    public VerveRewardedVideoAdListener(@NotNull RewardedVideoSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
    }

    @Override // net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.Listener
    public void onReward() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.Listener
    public void onRewardedClick() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.Listener
    public void onRewardedClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.Listener
    public void onRewardedLoadFailed(@Nullable Throwable error) {
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorMessage = " + (error != null ? error.getMessage() : null));
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(VerveAdapter.INSTANCE.getLoadError(error));
    }

    @Override // net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.Listener
    public void onRewardedLoaded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAvailabilityChanged(true);
    }

    @Override // net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.Listener
    public void onRewardedOpened() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }
}
