package com.appodeal.ads.adapters.mobilefuse.banner;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.mobilefuse.d;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MobileFuseBannerAd.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MobileFuseBannerAd f12520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MobileFuseBannerAd.AdSize f12521c;

    public b(UnifiedBannerCallback callback, MobileFuseBannerAd bannerAd, MobileFuseBannerAd.AdSize adSize) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bannerAd, "bannerAd");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f12519a = callback;
        this.f12520b = bannerAd;
        this.f12521c = adSize;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdClicked() {
        this.f12519a.onAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
    public final void onAdCollapsed() {
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdError(AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12519a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        LoadingError loadingErrorB = d.b(error);
        if (a.f12518a[loadingErrorB.ordinal()] != 1) {
            this.f12519a.onAdLoadFailed(loadingErrorB);
            return;
        }
        UnifiedBannerCallback unifiedBannerCallback = this.f12519a;
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedBannerCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
    public final void onAdExpanded() {
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdExpired() {
        this.f12519a.onAdExpired();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdLoaded() {
        ImpressionLevelData impressionLevelDataA = d.a(this.f12520b);
        this.f12519a.onAdRevenueReceived(impressionLevelDataA);
        this.f12519a.onAdLoaded(this.f12520b, this.f12521c.width, impressionLevelDataA);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdNotFilled() {
        this.f12519a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdRendered() {
    }
}
