package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.Fd;
import com.ironsource.Gd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAd implements Gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fd f67842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private RewardedAdListener f67843b;

    public RewardedAd(@NotNull Fd rewardedAdInternal) {
        Intrinsics.checkNotNullParameter(rewardedAdInternal, "rewardedAdInternal");
        this.f67842a = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    @NotNull
    public final RewardedAdInfo getAdInfo() {
        return this.f67842a.b();
    }

    @Nullable
    public final RewardedAdListener getListener() {
        return this.f67843b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f67842a.d();
    }

    @Override // com.ironsource.Gd
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f67843b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Gd
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f67843b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Gd
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f67843b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Gd
    public void onRewardedAdFailedToShow(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + error + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f67843b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.Gd
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f67843b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Gd
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f67843b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.f67843b = rewardedAdListener;
    }

    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info();
        this.f67842a.a(activity);
    }
}
