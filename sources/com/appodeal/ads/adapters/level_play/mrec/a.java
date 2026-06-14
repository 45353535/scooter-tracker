package com.appodeal.ads.adapters.level_play.mrec;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements LevelPlayBannerAdViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LevelPlayBannerAdView f12450b;

    public a(UnifiedMrecCallback callback, LevelPlayBannerAdView levelPlayMrec) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(levelPlayMrec, "levelPlayMrec");
        this.f12449a = callback;
        this.f12450b = levelPlayMrec;
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12449a.onAdClicked();
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo) {
        i6.a.b(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdDisplayFailed(LevelPlayAdInfo adInfo, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12449a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        UnifiedMrecCallback unifiedMrecCallback = this.f12449a;
        Intrinsics.checkNotNullParameter(error, "<this>");
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedMrecCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12449a.onAdRevenueReceived(com.appodeal.ads.adapters.level_play.ext.b.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdExpanded(LevelPlayAdInfo levelPlayAdInfo) {
        i6.a.e(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdLeftApplication(LevelPlayAdInfo levelPlayAdInfo) {
        i6.a.f(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12449a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        this.f12449a.onAdLoadFailed(com.appodeal.ads.adapters.level_play.ext.b.b(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.level_play.ext.b.a(adInfo);
        this.f12449a.onAdRevenueReceived(impressionLevelDataA);
        this.f12449a.onAdLoaded(this.f12450b, impressionLevelDataA);
    }
}
