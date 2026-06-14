package com.appodeal.ads.adapters.applovin_max.mrec;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.ads.MaxAdView;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.adapters.applovin_max.i;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaxAdView f12051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UnifiedMrecCallback f12052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MaxAdView adView, UnifiedMrecCallback callback, String countryCode) {
        super(callback, countryCode);
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f12051e = adView;
        this.f12052f = callback;
        this.f12053g = countryCode;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        ImpressionLevelData impressionLevelDataA = h.a(maxAd, this.f12053g);
        MaxAdWaterfallInfo waterfall = maxAd.getWaterfall();
        if (waterfall != null) {
            this.f12052f.onAdditionalInfoLoaded(h.c(waterfall));
        }
        this.f12052f.onAdRevenueReceived(impressionLevelDataA);
        this.f12052f.onAdLoaded(this.f12051e, impressionLevelDataA);
    }
}
