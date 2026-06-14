package com.appodeal.ads.adapters.yandex.banner;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements BannerAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f12607b;

    public a(UnifiedBannerCallback callback, BannerAdView bannerView) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f12606a = callback;
        this.f12607b = bannerView;
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onAdClicked() {
        this.f12606a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12606a.printError(error.getDescription(), Integer.valueOf(error.getCode()));
        this.f12606a.onAdLoadFailed(com.appodeal.ads.adapters.yandex.b.b(error));
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onAdLoaded() {
        BannerAdSize adSize = this.f12607b.getAdSize();
        if (adSize != null) {
            this.f12606a.onAdLoaded(this.f12607b, adSize.getHeight());
        } else {
            this.f12606a.onAdLoadFailed(LoadingError.IncorrectAdunit);
        }
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onImpression(ImpressionData impressionData) {
        this.f12606a.onAdRevenueReceived(com.appodeal.ads.adapters.yandex.b.a(impressionData));
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onLeftApplication() {
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public final void onReturnedToApplication() {
    }
}
