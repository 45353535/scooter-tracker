package com.appodeal.ads.adapters.yandex;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements InterstitialAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.yandex.interstitial.b f12612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdLoader f12613b;

    public f(com.appodeal.ads.adapters.yandex.interstitial.b bVar, InterstitialAdLoader interstitialAdLoader) {
        this.f12612a = bVar;
        this.f12613b = interstitialAdLoader;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12612a.onAdFailedToLoad(error);
        this.f12613b.setAdLoadListener(null);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        this.f12612a.onAdLoaded(interstitialAd);
        this.f12613b.setAdLoadListener(null);
    }
}
