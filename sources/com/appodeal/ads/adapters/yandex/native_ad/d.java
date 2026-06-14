package com.appodeal.ads.adapters.yandex.native_ad;

import android.content.Context;
import android.location.Location;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.yandex.e;
import com.appodeal.ads.adapters.yandex.k;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends UnifiedNative implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12637a = (e) k.f12626a.getValue();

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void e(Context context, NativeAdRequestConfiguration nativeAdRequestConfiguration, c adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f12637a.e(context, nativeAdRequestConfiguration, adLoadListener);
    }

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void f(Context context, AdRequestConfiguration adRequestConfiguration, com.appodeal.ads.adapters.yandex.interstitial.b adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f12637a.f(context, adRequestConfiguration, adLoadListener);
    }

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void h(Context context, AdRequestConfiguration adRequestConfiguration, com.appodeal.ads.adapters.yandex.rewarded_video.b adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f12637a.h(context, adRequestConfiguration, adLoadListener);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedNativeParams adTypeParams = (UnifiedNativeParams) unifiedAdParams;
        com.appodeal.ads.adapters.yandex.c adUnitParams2 = (com.appodeal.ads.adapters.yandex.c) adUnitParams;
        UnifiedNativeCallback callback = (UnifiedNativeCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        Intrinsics.checkNotNullParameter(adUnitParams2, "<this>");
        NativeAdRequestConfiguration.Builder builder = new NativeAdRequestConfiguration.Builder(adUnitParams2.f12609a);
        builder.setShouldLoadImagesAutomatically(true);
        Location location = adUnitParams2.f12610b;
        if (location != null) {
            builder.setLocation(location);
        }
        Map<String, String> map = adUnitParams2.f12611c;
        if (map != null) {
            builder.setParameters(map);
        }
        e(applicationContext, builder.build(), new c(callback));
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }
}
