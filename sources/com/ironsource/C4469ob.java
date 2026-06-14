package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4469ob {

    /* JADX INFO: renamed from: com.ironsource.ob$a */
    public static final class a implements InterfaceC4229ab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayRewardedAdListener f44569a;

        a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f44569a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.f44569a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.f44569a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f44569a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f44569a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f44569a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.f44569a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f44569a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdRewarded(@NotNull LevelPlayReward reward, @NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.f44569a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4229ab b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
