package com.appodeal.ads.adapters.mytarget.rewarded_video;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements RewardedAd.RewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12552a;

    public b(UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f12552a = unifiedRewardedCallback;
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onClick(RewardedAd rewardedAd) {
        this.f12552a.onAdClicked();
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onDismiss(RewardedAd rewardedAd) {
        this.f12552a.onAdClosed();
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onDisplay(RewardedAd rewardedAd) {
        this.f12552a.onAdShown();
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onFailedToShow(RewardedAd rewardedAd) {
        this.f12552a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback("MyTargetRewarded", null));
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onLoad(RewardedAd rewardedAd) {
        this.f12552a.onAdLoaded();
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onNoAd(IAdLoadingError iAdLoadingError, RewardedAd rewardedAd) {
        this.f12552a.printError(iAdLoadingError.getMessage(), Integer.valueOf(iAdLoadingError.getCode()));
        this.f12552a.onAdLoadFailed(null);
    }

    @Override // com.my.target.ads.RewardedAd.RewardedAdListener
    public final void onReward(Reward reward, RewardedAd rewardedAd) {
        this.f12552a.onAdFinished();
    }
}
