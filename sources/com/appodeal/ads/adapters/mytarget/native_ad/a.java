package com.appodeal.ads.adapters.mytarget.native_ad;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.banners.NativePromoBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements NativeAd.NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12549a;

    public a(UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12549a = callback;
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onClick(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12549a.onAdClicked();
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativePromoBanner, "nativePromoBanner");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        UnifiedNativeCallback unifiedNativeCallback = this.f12549a;
        Intrinsics.checkNotNullParameter(nativeAd, "<this>");
        NativePromoBanner banner = nativeAd.getBanner();
        String title = banner != null ? banner.getTitle() : null;
        String str = title == null ? "" : title;
        NativePromoBanner banner2 = nativeAd.getBanner();
        String description = banner2 != null ? banner2.getDescription() : null;
        String str2 = description == null ? "" : description;
        NativePromoBanner banner3 = nativeAd.getBanner();
        String ctaText = banner3 != null ? banner3.getCtaText() : null;
        String str3 = ctaText == null ? "" : ctaText;
        NativePromoBanner banner4 = nativeAd.getBanner();
        unifiedNativeCallback.onAdLoaded(new c(nativeAd, str, str2, str3, banner4 != null ? Float.valueOf(banner4.getRating()) : null));
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onNoAd(IAdLoadingError error, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12549a.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f12549a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onShow(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onVideoComplete(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onVideoPause(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdListener
    public final void onVideoPlay(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
    }
}
