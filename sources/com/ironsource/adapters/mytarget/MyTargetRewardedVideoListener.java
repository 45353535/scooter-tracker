package com.ironsource.adapters.mytarget;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.models.IAdLoadingError;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class MyTargetRewardedVideoListener implements RewardedAd.RewardedAdListener {
    private final WeakReference<MyTargetAdapter> mAdapter;
    private final RewardedVideoSmashListener mListener;
    private final String mSlotId;

    public MyTargetRewardedVideoListener(MyTargetAdapter myTargetAdapter, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.mAdapter = new WeakReference<>(myTargetAdapter);
        this.mListener = rewardedVideoSmashListener;
        this.mSlotId = str;
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onClick(@NonNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onDismiss(@NonNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onDisplay(@NonNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        if (this.mAdapter.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onFailedToShow(@NonNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(this.mSlotId, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onLoad(@NonNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        if (this.mAdapter.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (this.mListener == null) {
                IronLog.INTERNAL.verbose("listener is null");
                return;
            }
            this.mAdapter.get().mRewardedVideoSlotIdToAd.put(this.mSlotId, rewardedAd);
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mSlotId, Boolean.TRUE);
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull RewardedAd rewardedAd) {
        String str = "error message = " + iAdLoadingError.getMessage() + ", error code = " + iAdLoadingError.getCode();
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId + " ," + str);
        if (this.mAdapter.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (this.mListener == null) {
                IronLog.INTERNAL.verbose("listener is null");
                return;
            }
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mSlotId, Boolean.FALSE);
            this.mListener.onRewardedVideoAvailabilityChanged(false);
            this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "MyTarget", str));
        }
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public void onReward(@NonNull Reward reward, @NonNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }
}
