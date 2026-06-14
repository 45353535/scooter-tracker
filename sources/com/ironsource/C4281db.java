package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4281db {

    /* JADX INFO: renamed from: com.ironsource.db$a */
    public static final class a implements InterfaceC4229ab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInterstitialAdListener f42918a;

        a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f42918a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f42918a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f42918a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f42918a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f42918a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f42918a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f42918a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f42918a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.InterfaceC4229ab
        public /* synthetic */ void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
            ek.a(this, levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4229ab b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
