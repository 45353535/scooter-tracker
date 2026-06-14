package com.unity3d.mediation.rewarded;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface LevelPlayRewardedAdListener {
    void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo);
}
