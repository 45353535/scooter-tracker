package com.appodeal.ads.adapters.admobmediation.interstitial;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f11930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdContainer f11931d;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer unifiedAdContainer) {
        this.f11930c = unifiedInterstitialCallback;
        this.f11931d = unifiedAdContainer;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11930c.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11930c.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        Intrinsics.checkNotNullParameter(interstitialAd2, "interstitialAd");
        ResponseInfo responseInfo = interstitialAd2.getResponseInfo();
        Intrinsics.checkNotNullExpressionValue(responseInfo, "getResponseInfo(...)");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.admobmediation.a.a(responseInfo);
        if (impressionLevelDataA != null) {
            interstitialAd2.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11930c, interstitialAd2.getResponseInfo()));
            this.f11931d.setAd(interstitialAd2);
            this.f11930c.onAdLoaded(impressionLevelDataA);
        } else {
            UnifiedInterstitialCallback unifiedInterstitialCallback = this.f11930c;
            LoadingError error = LoadingError.NoFill;
            Intrinsics.checkNotNullParameter(unifiedInterstitialCallback, "<this>");
            Intrinsics.checkNotNullParameter(error, "error");
            unifiedInterstitialCallback.printError("Admob Mediation - custom event price limit reached", Integer.valueOf(error.getCode()));
            unifiedInterstitialCallback.onAdLoadFailed(error);
        }
    }
}
