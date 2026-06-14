package com.appodeal.ads.adapters.mobilefuse.rewarded;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.mobilefuse.d;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseRewardedAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MobileFuseRewardedAd.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f12538b;

    public b(c cVar, UnifiedRewardedCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12538b = cVar;
        this.f12537a = callback;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdClicked() {
        this.f12537a.onAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
    public final void onAdClosed() {
        this.f12537a.onAdClosed();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdError(AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12537a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        LoadingError loadingErrorB = d.b(error);
        if (a.f12536a[loadingErrorB.ordinal()] != 1) {
            this.f12537a.onAdLoadFailed(loadingErrorB);
            return;
        }
        UnifiedRewardedCallback unifiedRewardedCallback = this.f12537a;
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedRewardedCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdExpired() {
        this.f12537a.onAdExpired();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdLoaded() {
        ImpressionLevelData impressionLevelDataA = d.a(this.f12538b.f12539a);
        this.f12537a.onAdRevenueReceived(impressionLevelDataA);
        this.f12537a.onAdLoaded(impressionLevelDataA);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdNotFilled() {
        this.f12537a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdRendered() {
        this.f12537a.onAdShown();
    }

    @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
    public final void onUserEarnedReward() {
        this.f12537a.onAdFinished();
    }
}
