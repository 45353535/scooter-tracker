package com.appodeal.ads.adapters.yandex.interstitial;

import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InterstitialAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f12623b;

    public b(c cVar, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12622a = cVar;
        this.f12623b = unifiedInterstitialCallback;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12623b.printError(error.getDescription(), Integer.valueOf(error.getCode()));
        this.f12623b.onAdLoadFailed(com.appodeal.ads.adapters.yandex.b.b(error));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        this.f12622a.f12625b = interstitialAd;
        this.f12623b.onAdLoaded();
    }
}
