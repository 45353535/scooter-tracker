package com.appodeal.ads.adapters.bigo_ads.native_ad;

import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNative {
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedNativeParams adTypeParams = (UnifiedNativeParams) unifiedAdParams;
        com.appodeal.ads.adapters.bigo_ads.b adUnitParams2 = (com.appodeal.ads.adapters.bigo_ads.b) adUnitParams;
        UnifiedNativeCallback callback = (UnifiedNativeCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NativeAdRequest nativeAdRequestBuild = new NativeAdRequest.Builder().withSlotId(adUnitParams2.f12156a).build();
        NativeAdLoader nativeAdLoaderBuild = new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new a(callback)).build();
        Intrinsics.checkNotNullExpressionValue(nativeAdLoaderBuild, "build(...)");
        nativeAdLoaderBuild.loadAd(nativeAdRequestBuild);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }
}
