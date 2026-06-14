package com.appodeal.ads.adapters.level_play.banner;

import android.content.Context;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import eg.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12390a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Job f12391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LevelPlayBannerAdView f12392c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedBannerParams adTypeParams, com.appodeal.ads.adapters.level_play.b adUnitParams, UnifiedBannerCallback callback) {
        LevelPlayAdSize BANNER;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strA = adUnitParams.a();
        if (strA.length() == 0) {
            callback.onAdLoadFailed(LoadingError.IncorrectAdunit);
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (adTypeParams.useSmartBanners(applicationContext)) {
            BANNER = LevelPlayAdSize.createAdaptiveAdSize(applicationContext);
            if (BANNER != null) {
                setRefreshOnRotate(true);
            } else {
                BANNER = LevelPlayAdSize.BANNER;
                Intrinsics.checkNotNull(BANNER);
            }
        } else if (adTypeParams.needLeaderBoard(applicationContext)) {
            BANNER = LevelPlayAdSize.LARGE;
            Intrinsics.checkNotNullExpressionValue(BANNER, "LARGE");
        } else {
            BANNER = LevelPlayAdSize.BANNER;
            Intrinsics.checkNotNullExpressionValue(BANNER, "BANNER");
        }
        LevelPlayBannerAdView.Config.Builder adSize = new LevelPlayBannerAdView.Config.Builder().setAdSize(BANNER);
        Double dB = adUnitParams.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            LogExtKt.logInternal$default("LevelPlayBanner", "Setting bidFloor: " + dDoubleValue, null, 4, null);
            adSize.setBidFloor(dDoubleValue);
        }
        LevelPlayBannerAdView.Config configBuild = adSize.build();
        Intrinsics.checkNotNullExpressionValue(configBuild, "build(...)");
        LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(applicationContext, strA, configBuild);
        this.f12392c = levelPlayBannerAdView;
        if (adUnitParams.c()) {
            levelPlayBannerAdView.resumeAutoRefresh();
        } else {
            levelPlayBannerAdView.pauseAutoRefresh();
        }
        levelPlayBannerAdView.setBannerListener(new a(callback, levelPlayBannerAdView));
        this.f12391b = eg.i.d(this.f12390a, null, null, new b(levelPlayBannerAdView, adUnitParams, BANNER, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12391b;
        if (job != null) {
            a0.f(job, "Banner ad was destroyed", null, 2, null);
        }
        LevelPlayBannerAdView levelPlayBannerAdView = this.f12392c;
        if (levelPlayBannerAdView != null) {
            levelPlayBannerAdView.setBannerListener(null);
        }
        LevelPlayBannerAdView levelPlayBannerAdView2 = this.f12392c;
        if (levelPlayBannerAdView2 != null) {
            levelPlayBannerAdView2.destroy();
        }
        this.f12392c = null;
    }
}
