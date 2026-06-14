package com.appodeal.ads.adapters.mobilefuse.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.mobilefuse.d;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseInterstitialAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MobileFuseInterstitialAd.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f12526b;

    public b(c cVar, UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12526b = cVar;
        this.f12525a = callback;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdClicked() {
        this.f12525a.onAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseInterstitialAd.Listener
    public final void onAdClosed() {
        this.f12525a.onAdClosed();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdError(AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12525a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        LoadingError loadingErrorB = d.b(error);
        if (a.f12524a[loadingErrorB.ordinal()] != 1) {
            this.f12525a.onAdLoadFailed(loadingErrorB);
            return;
        }
        UnifiedInterstitialCallback unifiedInterstitialCallback = this.f12525a;
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedInterstitialCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdExpired() {
        this.f12525a.onAdExpired();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdLoaded() {
        ImpressionLevelData impressionLevelDataA = d.a(this.f12526b.f12527a);
        this.f12525a.onAdRevenueReceived(impressionLevelDataA);
        this.f12525a.onAdLoaded(impressionLevelDataA);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdNotFilled() {
        this.f12525a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public final void onAdRendered() {
        this.f12525a.onAdShown();
    }
}
