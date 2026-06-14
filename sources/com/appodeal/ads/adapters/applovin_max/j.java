package com.appodeal.ads.adapters.applovin_max;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class j extends h implements MaxAdListener, MaxAdExpirationListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(UnifiedFullscreenAdCallback callback, String countryCode) {
        super(callback, countryCode);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f12019d = callback;
        this.f12020e = countryCode;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        this.f12019d.onAdClicked();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError error) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12019d.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.f12019d;
        String message = error.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        unifiedFullscreenAdCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(message, Integer.valueOf(error.getCode())));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        this.f12019d.onAdShown();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        this.f12019d.onAdClosed();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String message, MaxError error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        MaxAdWaterfallInfo waterfall = error.getWaterfall();
        if (waterfall != null) {
            this.f12019d.onAdditionalInfoLoaded(com.appodeal.ads.adapters.applovin_max.ext.h.c(waterfall));
        }
        this.f12019d.printError(message, Integer.valueOf(error.getCode()));
        this.f12019d.onAdLoadFailed(com.appodeal.ads.adapters.applovin_max.ext.h.b(error));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.applovin_max.ext.h.a(maxAd, this.f12020e);
        MaxAdWaterfallInfo waterfall = maxAd.getWaterfall();
        if (waterfall != null) {
            this.f12019d.onAdditionalInfoLoaded(com.appodeal.ads.adapters.applovin_max.ext.h.c(waterfall));
        }
        this.f12019d.onAdRevenueReceived(impressionLevelDataA);
        this.f12019d.onAdLoaded(impressionLevelDataA);
    }

    @Override // com.applovin.mediation.MaxAdExpirationListener
    public final void onExpiredAdReloaded(MaxAd expiredAd, MaxAd newLoadedAd) {
        Intrinsics.checkNotNullParameter(expiredAd, "expiredAd");
        Intrinsics.checkNotNullParameter(newLoadedAd, "newLoadedAd");
        this.f12019d.onAdExpired();
    }
}
