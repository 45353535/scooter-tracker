package com.appodeal.ads.adapters.level_play.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements LevelPlayInterstitialAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12405a;

    public a(UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12405a = callback;
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12405a.onAdClicked();
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdClosed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12405a.onAdClosed();
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12405a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        UnifiedInterstitialCallback unifiedInterstitialCallback = this.f12405a;
        Intrinsics.checkNotNullParameter(error, "<this>");
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedInterstitialCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12405a.onAdRevenueReceived(com.appodeal.ads.adapters.level_play.ext.b.a(adInfo));
        this.f12405a.onAdShown();
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12405a.onAdRevenueReceived(com.appodeal.ads.adapters.level_play.ext.b.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12405a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        this.f12405a.onAdLoadFailed(com.appodeal.ads.adapters.level_play.ext.b.b(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public final void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.level_play.ext.b.a(adInfo);
        this.f12405a.onAdRevenueReceived(impressionLevelDataA);
        this.f12405a.onAdLoaded(impressionLevelDataA);
    }
}
