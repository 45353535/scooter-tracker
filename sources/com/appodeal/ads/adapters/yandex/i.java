package com.appodeal.ads.adapters.yandex;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAdLoader f12618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RewardedAdLoader f12619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeAdLoader f12620c;

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void e(Context context, NativeAdRequestConfiguration nativeAdRequestConfiguration, com.appodeal.ads.adapters.yandex.native_ad.c adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        NativeAdLoader nativeAdLoader = this.f12620c;
        if (nativeAdLoader == null) {
            nativeAdLoader = new NativeAdLoader(context);
            this.f12620c = nativeAdLoader;
        }
        nativeAdLoader.setNativeAdLoadListener(new g(adLoadListener, nativeAdLoader));
        nativeAdLoader.loadAd(nativeAdRequestConfiguration);
    }

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void f(Context context, AdRequestConfiguration adRequestConfiguration, com.appodeal.ads.adapters.yandex.interstitial.b adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        InterstitialAdLoader interstitialAdLoader = this.f12618a;
        if (interstitialAdLoader == null) {
            interstitialAdLoader = new InterstitialAdLoader(context);
            this.f12618a = interstitialAdLoader;
        }
        interstitialAdLoader.setAdLoadListener(new f(adLoadListener, interstitialAdLoader));
        interstitialAdLoader.loadAd(adRequestConfiguration);
    }

    @Override // com.appodeal.ads.adapters.yandex.e
    public final void h(Context context, AdRequestConfiguration adRequestConfiguration, com.appodeal.ads.adapters.yandex.rewarded_video.b adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        RewardedAdLoader rewardedAdLoader = this.f12619b;
        if (rewardedAdLoader == null) {
            rewardedAdLoader = new RewardedAdLoader(context);
            this.f12619b = rewardedAdLoader;
        }
        rewardedAdLoader.setAdLoadListener(new h(adLoadListener, rewardedAdLoader));
        rewardedAdLoader.loadAd(adRequestConfiguration);
    }
}
