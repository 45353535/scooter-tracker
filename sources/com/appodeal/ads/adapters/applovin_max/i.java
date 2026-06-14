package com.appodeal.ads.adapters.applovin_max;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i extends h implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UnifiedViewAdCallback f12012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(UnifiedViewAdCallback callback, String countryCode) {
        super(callback, countryCode);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f12012d = callback;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        this.f12012d.onAdClicked();
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdCollapsed(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError error) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12012d.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        UnifiedViewAdCallback unifiedViewAdCallback = this.f12012d;
        String message = error.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        unifiedViewAdCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(message, Integer.valueOf(error.getCode())));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdExpanded(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String message, MaxError error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        MaxAdWaterfallInfo waterfall = error.getWaterfall();
        if (waterfall != null) {
            this.f12012d.onAdditionalInfoLoaded(com.appodeal.ads.adapters.applovin_max.ext.h.c(waterfall));
        }
        this.f12012d.printError(message, Integer.valueOf(error.getCode()));
        this.f12012d.onAdLoadFailed(com.appodeal.ads.adapters.applovin_max.ext.h.b(error));
    }
}
