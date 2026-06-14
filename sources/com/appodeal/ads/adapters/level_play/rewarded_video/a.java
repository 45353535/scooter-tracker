package com.appodeal.ads.adapters.level_play.rewarded_video;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements LevelPlayRewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12458a;

    public a(UnifiedRewardedCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12458a = callback;
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12458a.onAdClicked();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdClosed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12458a.onAdClosed();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12458a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        UnifiedRewardedCallback unifiedRewardedCallback = this.f12458a;
        Intrinsics.checkNotNullParameter(error, "<this>");
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedRewardedCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12458a.onAdRevenueReceived(com.appodeal.ads.adapters.level_play.ext.b.a(adInfo));
        this.f12458a.onAdShown();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12458a.onAdRevenueReceived(com.appodeal.ads.adapters.level_play.ext.b.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12458a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        this.f12458a.onAdLoadFailed(com.appodeal.ads.adapters.level_play.ext.b.b(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.level_play.ext.b.a(adInfo);
        this.f12458a.onAdRevenueReceived(impressionLevelDataA);
        this.f12458a.onAdLoaded(impressionLevelDataA);
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public final void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12458a.onAdFinished();
    }
}
