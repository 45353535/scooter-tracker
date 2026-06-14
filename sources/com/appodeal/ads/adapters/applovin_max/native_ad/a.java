package com.appodeal.ads.adapters.applovin_max.native_ad;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UnifiedNativeCallback f12060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MaxNativeAdLoader f12062i;

    public a(UnifiedNativeCallback callback, String countryCode, MaxNativeAdLoader nativeAdLoader) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        this.f12060g = callback;
        this.f12061h = countryCode;
        this.f12062i = nativeAdLoader;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        this.f12060g.onAdRevenueReceived(h.a(maxAd, this.f12061h));
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        super.onNativeAdClicked(maxAd);
        this.f12060g.onAdClicked();
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdExpired(MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        super.onNativeAdExpired(maxAd);
        this.f12060g.onAdExpired();
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String message, MaxError error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onNativeAdLoadFailed(message, error);
        MaxAdWaterfallInfo waterfall = error.getWaterfall();
        if (waterfall != null) {
            this.f12060g.onAdditionalInfoLoaded(h.c(waterfall));
        }
        this.f12060g.printError(message, Integer.valueOf(error.getCode()));
        this.f12060g.onAdLoadFailed(h.b(error));
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        super.onNativeAdLoaded(maxNativeAdView, maxAd);
        MaxNativeAd nativeAd = maxAd.getNativeAd();
        UnifiedNativeAd dVar = null;
        if (nativeAd != null) {
            MaxNativeAdLoader nativeAdLoader = this.f12062i;
            Intrinsics.checkNotNullParameter(nativeAd, "<this>");
            Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
            Intrinsics.checkNotNullParameter(maxAd, "maxAd");
            LogExtKt.logInternal$default("MaxUnifiedNativeAd", e.a(nativeAd), null, 4, null);
            dVar = Intrinsics.areEqual(maxAd.getNetworkName(), "Yandex") ? new d(nativeAd, maxAd, nativeAdLoader) : new c(nativeAd, maxAd, nativeAdLoader);
        }
        if (dVar == null) {
            this.f12060g.onAdLoadFailed(LoadingError.InvalidAssets);
            return;
        }
        ImpressionLevelData impressionLevelDataA = h.a(maxAd, this.f12061h);
        MaxAdWaterfallInfo waterfall = maxAd.getWaterfall();
        if (waterfall != null) {
            this.f12060g.onAdditionalInfoLoaded(h.c(waterfall));
        }
        this.f12060g.onAdRevenueReceived(impressionLevelDataA);
        this.f12060g.onAdLoaded(dVar, impressionLevelDataA);
    }
}
