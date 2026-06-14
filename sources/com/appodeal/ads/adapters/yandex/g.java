package com.appodeal.ads.adapters.yandex;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements NativeAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.yandex.native_ad.c f12614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdLoader f12615b;

    public g(com.appodeal.ads.adapters.yandex.native_ad.c cVar, NativeAdLoader nativeAdLoader) {
        this.f12614a = cVar;
        this.f12615b = nativeAdLoader;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
    public final void onAdFailedToLoad(AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12614a.onAdFailedToLoad(error);
        this.f12615b.setNativeAdLoadListener(null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
    public final void onAdLoaded(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12614a.onAdLoaded(nativeAd);
        this.f12615b.setNativeAdLoadListener(null);
    }
}
