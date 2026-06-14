package com.appodeal.ads.adapters.admobnative.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appodeal.ads.adapters.admob.R;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NativeAd f11942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NativeAdView f11943b;

    public static final void j(c cVar, Context context, UnifiedBannerParams unifiedBannerParams, UnifiedBannerCallback unifiedBannerCallback, NativeAd loadedNativeAd) {
        Intrinsics.checkNotNullParameter(loadedNativeAd, "loadedNativeAd");
        try {
            cVar.f11942a = loadedNativeAd;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.apd_admob_banner, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
            NativeAdView nativeAdView = (NativeAdView) viewInflate;
            cVar.f11943b = nativeAdView;
            d.a(nativeAdView, loadedNativeAd);
            int i10 = unifiedBannerParams.needLeaderBoard(context) ? 90 : 50;
            loadedNativeAd.setOnPaidEventListener(new UnifiedAdRevenueListener(unifiedBannerCallback, loadedNativeAd.getResponseInfo()));
            unifiedBannerCallback.onAdLoaded(nativeAdView, i10);
        } catch (Exception e10) {
            Log.log(e10);
            unifiedBannerCallback.onAdLoadFailed(LoadingError.InternalError);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        NativeAd nativeAd = this.f11942a;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f11942a = null;
        NativeAdView nativeAdView = this.f11943b;
        if (nativeAdView != null) {
            nativeAdView.destroy();
        }
        NativeAdView nativeAdView2 = this.f11943b;
        if (nativeAdView2 != null) {
            nativeAdView2.removeAllViews();
        }
        this.f11943b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, final UnifiedBannerParams adTypeParams, UnifiedAdmobAdUnitParams adUnitParams, final UnifiedBannerCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Context applicationContext = contextProvider.getApplicationContext();
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(false).setRequestMultipleImages(false);
        Intrinsics.checkNotNullExpressionValue(requestMultipleImages, "setRequestMultipleImages(...)");
        AdLoader adLoaderBuild = new AdLoader.Builder(applicationContext, adUnitParams.getKey()).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.appodeal.ads.adapters.admobnative.banner.b
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                c.j(this.f11938b, applicationContext, adTypeParams, callback, nativeAd);
            }
        }).withAdListener(new a(callback)).withNativeAdOptions(requestMultipleImages.build()).build();
        Intrinsics.checkNotNullExpressionValue(adLoaderBuild, "build(...)");
        adLoaderBuild.loadAd(adUnitParams.getRequest());
    }
}
