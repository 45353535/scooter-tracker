package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Ef implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4606wd.a().a(new C4283dd(0, adInfo.getPlacementName(), false, "", 0, null), Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4606wd.a().b(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4606wd c4606wdA = C4606wd.a();
        Gf gf2 = Gf.f41012a;
        c4606wdA.a(gf2.a(error), gf2.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4606wd.a().c(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public /* synthetic */ void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        k6.a.d(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4606wd.a().a(Gf.f41012a.a(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4606wd.a().d(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(@NotNull LevelPlayReward reward, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4606wd.a().b(new C4283dd(0, adInfo.getPlacementName(), false, reward.getName(), reward.getAmount(), null), Gf.f41012a.a(adInfo));
    }
}
