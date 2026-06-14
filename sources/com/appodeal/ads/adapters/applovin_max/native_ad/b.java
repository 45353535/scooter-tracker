package com.appodeal.ads.adapters.applovin_max.native_ad;

import android.app.Activity;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNative {
    public static void j(ContextProvider contextProvider, UnifiedNativeParams adTypeParams, com.appodeal.ads.adapters.applovin_max.b adUnitParams, UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity != null) {
            adUnitParams.getClass();
            String strD = h.d(com.appodeal.ads.adapters.applovin_max.b.a(resumedActivity));
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(adUnitParams.b());
            Intrinsics.checkNotNull(strD);
            a aVar = new a(callback, strD, maxNativeAdLoader);
            maxNativeAdLoader.setRevenueListener(aVar);
            maxNativeAdLoader.setNativeAdListener(aVar);
            for (Map.Entry entry : adUnitParams.c().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                LogExtKt.logInternal$default("ApplovinMaxNative", "setExtraParameter/setLocalExtraParameter: " + str + " : " + str2, null, 4, null);
                maxNativeAdLoader.setExtraParameter(str, str2);
                maxNativeAdLoader.setLocalExtraParameter(str, str2);
            }
            maxNativeAdLoader.loadAd();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final /* bridge */ /* synthetic */ void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        j(contextProvider, (UnifiedNativeParams) unifiedAdParams, (com.appodeal.ads.adapters.applovin_max.b) adUnitParams, (UnifiedNativeCallback) unifiedAdCallback);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }
}
