package com.appodeal.ads.adapters.applovin.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppLovinSdk f11970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppLovinAd f11971c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        com.appodeal.ads.adapters.applovin.b bVar = (com.appodeal.ads.adapters.applovin.b) adUnitParams;
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Activity resumedActivity = contextProvider.getResumedActivity();
        AppLovinSdk appLovinSdk = resumedActivity == null ? null : AppLovinSdk.getInstance(resumedActivity);
        this.f11970b = appLovinSdk;
        if (appLovinSdk == null) {
            unifiedInterstitialCallback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        this.f11969a = new a(unifiedInterstitialCallback, this);
        AppLovinAdService adService = appLovinSdk.getAdService();
        if (TextUtils.isEmpty(bVar.f11961a)) {
            adService.loadNextAd(AppLovinAdSize.INTERSTITIAL, this.f11969a);
        } else {
            adService.loadNextAdForZoneId(bVar.f11961a, this.f11969a);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f11971c = null;
        this.f11970b = null;
        this.f11969a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        if (this.f11971c == null) {
            unifiedInterstitialCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f11970b, activity);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(this.f11969a);
        appLovinInterstitialAdDialogCreate.setAdClickListener(this.f11969a);
        appLovinInterstitialAdDialogCreate.showAndRender(this.f11971c);
    }
}
