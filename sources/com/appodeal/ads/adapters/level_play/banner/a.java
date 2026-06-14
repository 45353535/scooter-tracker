package com.appodeal.ads.adapters.level_play.banner;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements LevelPlayBannerAdViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LevelPlayBannerAdView f12385b;

    public a(UnifiedBannerCallback callback, LevelPlayBannerAdView levelPlayBanner) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(levelPlayBanner, "levelPlayBanner");
        this.f12384a = callback;
        this.f12385b = levelPlayBanner;
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12384a.onAdClicked();
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo) {
        i6.a.b(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdDisplayFailed(LevelPlayAdInfo adInfo, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12384a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        UnifiedBannerCallback unifiedBannerCallback = this.f12384a;
        Intrinsics.checkNotNullParameter(error, "<this>");
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedBannerCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f12384a.onAdRevenueReceived(com.appodeal.ads.adapters.level_play.ext.b.a(adInfo));
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
        this.f12384a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        this.f12384a.onAdLoadFailed(com.appodeal.ads.adapters.level_play.ext.b.b(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public final void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        LevelPlayAdSize adSize = this.f12385b.getAdSize();
        Intrinsics.checkNotNullExpressionValue(adSize, "getAdSize(...)");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.level_play.ext.b.a(adInfo);
        this.f12384a.onAdRevenueReceived(impressionLevelDataA);
        this.f12384a.onAdLoaded(this.f12385b, adSize.getHeight(), impressionLevelDataA);
    }
}
