package com.appodeal.ads.adapters.applovin_max.banner;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.adapters.applovin_max.i;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaxAdView f11979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UnifiedBannerCallback f11980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MaxAdView adView, UnifiedBannerCallback callback, String countryCode) {
        super(callback, countryCode);
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f11979e = adView;
        this.f11980f = callback;
        this.f11981g = countryCode;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        AppLovinSdkUtils.Size size = maxAd.getSize();
        Intrinsics.checkNotNullExpressionValue(size, "getSize(...)");
        ImpressionLevelData impressionLevelDataA = h.a(maxAd, this.f11981g);
        MaxAdWaterfallInfo waterfall = maxAd.getWaterfall();
        if (waterfall != null) {
            this.f11980f.onAdditionalInfoLoaded(h.c(waterfall));
        }
        this.f11980f.onAdRevenueReceived(impressionLevelDataA);
        this.f11980f.onAdLoaded(this.f11979e, size.getHeight(), impressionLevelDataA);
    }
}
