package com.appodeal.ads.adapters.mobilefuse.native_ad;

import android.graphics.drawable.Drawable;
import com.appodeal.ads.ImageData;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseNativeAd;
import com.mobilefuse.sdk.nativeads.NativeImgAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MobileFuseNativeAd.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MobileFuseNativeAd f12534b;

    public b(UnifiedNativeCallback callback, MobileFuseNativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12533a = callback;
        this.f12534b = nativeAd;
    }

    @Override // com.mobilefuse.sdk.MobileFuseNativeAd.Listener
    public final void onAdClicked() {
        this.f12533a.onAdClicked();
    }

    @Override // com.mobilefuse.sdk.LoadableAdListener
    public final void onAdError(AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12533a.printError(error.getErrorMessage(), Integer.valueOf(error.getErrorCode()));
        LoadingError loadingErrorB = com.appodeal.ads.adapters.mobilefuse.d.b(error);
        if (a.f12532a[loadingErrorB.ordinal()] != 1) {
            this.f12533a.onAdLoadFailed(loadingErrorB);
            return;
        }
        UnifiedNativeCallback unifiedNativeCallback = this.f12533a;
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
        unifiedNativeCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(errorMessage, Integer.valueOf(error.getErrorCode())));
    }

    @Override // com.mobilefuse.sdk.LoadableAdListener
    public final void onAdExpired() {
        this.f12533a.onAdExpired();
    }

    @Override // com.mobilefuse.sdk.LoadableAdListener
    public final void onAdLoaded() {
        ImageData remote;
        UnifiedNativeCallback unifiedNativeCallback = this.f12533a;
        MobileFuseNativeAd mobileFuseNativeAd = this.f12534b;
        Intrinsics.checkNotNullParameter(mobileFuseNativeAd, "<this>");
        Drawable iconDrawable = mobileFuseNativeAd.getIconDrawable();
        if (iconDrawable != null) {
            remote = new ImageData.LocalDrawable(iconDrawable);
        } else {
            NativeImgAsset iconImage = mobileFuseNativeAd.getIconImage();
            String url = iconImage != null ? iconImage.getUrl() : null;
            if (url == null) {
                url = "";
            }
            remote = new ImageData.Remote(url);
        }
        ImageData imageData = remote;
        NativeImgAsset mainImage = mobileFuseNativeAd.getMainImage();
        String url2 = mainImage != null ? mainImage.getUrl() : null;
        unifiedNativeCallback.onAdLoaded(new d(new MediaAssets(imageData, new ImageData.Remote(url2 != null ? url2 : ""), null, 4, null), mobileFuseNativeAd, MobileFuseNativeAd.getTitle$default(mobileFuseNativeAd, null, 1, null), MobileFuseNativeAd.getDescriptionText$default(mobileFuseNativeAd, null, 1, null), MobileFuseNativeAd.getCtaButtonText$default(mobileFuseNativeAd, null, 1, null)));
    }

    @Override // com.mobilefuse.sdk.LoadableAdListener
    public final void onAdNotFilled() {
        this.f12533a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mobilefuse.sdk.MobileFuseNativeAd.Listener
    public final void onAdRendered() {
    }
}
