package com.appodeal.ads.adapters.yandex.native_ad;

import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements NativeAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeCallback f12636a;

    public c(UnifiedNativeCallback unifiedNativeCallback) {
        this.f12636a = unifiedNativeCallback;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12636a.printError(error.getDescription(), Integer.valueOf(error.getCode()));
        this.f12636a.onAdLoadFailed(com.appodeal.ads.adapters.yandex.b.b(error));
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
    public final void onAdLoaded(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        UnifiedNativeCallback callback = this.f12636a;
        Intrinsics.checkNotNullParameter(nativeAd, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String title = nativeAd.getAdAssets().getTitle();
        String str = title == null ? "" : title;
        String body = nativeAd.getAdAssets().getBody();
        String callToAction = nativeAd.getAdAssets().getCallToAction();
        callback.onAdLoaded(new b(nativeAd, callback, str, body, callToAction == null ? "" : callToAction, nativeAd.getAdAssets().getRating()));
    }
}
