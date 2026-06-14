package com.appodeal.ads.adapters.yandex.mrec;

import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements BannerAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f12629b;

    public a(UnifiedMrecCallback callback, BannerAdView bannerView) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f12628a = callback;
        this.f12629b = bannerView;
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onAdClicked() {
        this.f12628a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12628a.printError(error.getDescription(), Integer.valueOf(error.getCode()));
        this.f12628a.onAdLoadFailed(com.appodeal.ads.adapters.yandex.b.b(error));
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onAdLoaded() {
        this.f12628a.onAdLoaded(this.f12629b);
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onImpression(ImpressionData impressionData) {
        this.f12628a.onAdRevenueReceived(com.appodeal.ads.adapters.yandex.b.a(impressionData));
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onLeftApplication() {
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onReturnedToApplication() {
    }
}
