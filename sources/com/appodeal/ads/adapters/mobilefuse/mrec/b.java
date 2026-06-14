package com.appodeal.ads.adapters.mobilefuse.mrec;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.mobilefuse.d;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MobileFuseBannerAd.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MobileFuseBannerAd f12530b;

    public b(UnifiedMrecCallback callback, MobileFuseBannerAd mrecAd) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(mrecAd, "mrecAd");
        this.f12529a = callback;
        this.f12530b = mrecAd;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdClicked() {
        this.f12529a.onAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
    public final void onAdCollapsed() {
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdError(AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12529a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        LoadingError loadingErrorB = d.b(error);
        if (a.f12528a[loadingErrorB.ordinal()] != 1) {
            this.f12529a.onAdLoadFailed(loadingErrorB);
            return;
        }
        UnifiedMrecCallback unifiedMrecCallback = this.f12529a;
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedMrecCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
    public final void onAdExpanded() {
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdExpired() {
        this.f12529a.onAdExpired();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdLoaded() {
        ImpressionLevelData impressionLevelDataA = d.a(this.f12530b);
        this.f12529a.onAdRevenueReceived(impressionLevelDataA);
        this.f12529a.onAdLoaded(this.f12530b, impressionLevelDataA);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdNotFilled() {
        this.f12529a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdRendered() {
    }
}
