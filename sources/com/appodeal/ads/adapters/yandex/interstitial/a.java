package com.appodeal.ads.adapters.yandex.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements InterstitialAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12621a;

    public a(UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12621a = callback;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public final void onAdClicked() {
        this.f12621a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public final void onAdDismissed() {
        this.f12621a.onAdClosed();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public final void onAdFailedToShow(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12621a.printError(adError.getDescription(), null);
        this.f12621a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(adError.getDescription(), null, 2, null));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public final void onAdImpression(ImpressionData impressionData) {
        this.f12621a.onAdRevenueReceived(com.appodeal.ads.adapters.yandex.b.a(impressionData));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public final void onAdShown() {
        this.f12621a.onAdShown();
    }
}
