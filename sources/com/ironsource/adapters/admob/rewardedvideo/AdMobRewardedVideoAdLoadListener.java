package com.ironsource.adapters.admob.rewardedvideo;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.adapters.admob.AdMobAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class AdMobRewardedVideoAdLoadListener extends RewardedAdLoadCallback {
    private String mAdUnitId;
    private RewardedVideoSmashListener mListener;
    private WeakReference<AdMobRewardedVideoAdapter> mRewardedVideoAdapter;

    AdMobRewardedVideoAdLoadListener(AdMobRewardedVideoAdapter adMobRewardedVideoAdapter, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mRewardedVideoAdapter = new WeakReference<>(adMobRewardedVideoAdapter);
        this.mAdUnitId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        int code = loadAdError.getCode();
        String str = loadAdError.getMessage() + "( " + code + " )";
        ironLog.error("adapterError = " + str);
        if (AdMobAdapter.isNoFillError(code)) {
            code = 1058;
            str = "No Fill";
        }
        if (loadAdError.getCause() != null) {
            str = str + "Caused by " + loadAdError.getCause();
        }
        ironLog.error("adapterError = " + str);
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(new IronSourceError(code, str));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(@NotNull RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobRewardedVideoAdapter> weakReference = this.mRewardedVideoAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            this.mRewardedVideoAdapter.get().onRewardedVideoAdLoaded(this.mAdUnitId, rewardedAd);
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }
}
