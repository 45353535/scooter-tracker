package com.appodeal.ads.adapters.yandex.rewarded_video;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.yandex.e;
import com.appodeal.ads.adapters.yandex.k;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedRewarded implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12641a = (e) k.f12626a.getValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RewardedAd f12642b;

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void e(Context context, NativeAdRequestConfiguration nativeAdRequestConfiguration, com.appodeal.ads.adapters.yandex.native_ad.c adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f12641a.e(context, nativeAdRequestConfiguration, adLoadListener);
    }

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void f(Context context, AdRequestConfiguration adRequestConfiguration, com.appodeal.ads.adapters.yandex.interstitial.b adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f12641a.f(context, adRequestConfiguration, adLoadListener);
    }

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void h(Context context, AdRequestConfiguration adRequestConfiguration, b adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f12641a.h(context, adRequestConfiguration, adLoadListener);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams adTypeParams = (UnifiedRewardedParams) unifiedAdParams;
        com.appodeal.ads.adapters.yandex.c adUnitParams2 = (com.appodeal.ads.adapters.yandex.c) adUnitParams;
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        Intrinsics.checkNotNullParameter(adUnitParams2, "<this>");
        AdRequestConfiguration.Builder builder = new AdRequestConfiguration.Builder(adUnitParams2.f12609a);
        Location location = adUnitParams2.f12610b;
        if (location != null) {
            builder.setLocation(location);
        }
        Map<String, String> map = adUnitParams2.f12611c;
        if (map != null) {
            builder.setParameters(map);
        }
        h(applicationContext, builder.build(), new b(this, callback));
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        RewardedAd rewardedAd = this.f12642b;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(null);
        }
        this.f12642b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        RewardedAd rewardedAd = this.f12642b;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(new a(callback));
            rewardedAd.show(activity);
        }
    }
}
