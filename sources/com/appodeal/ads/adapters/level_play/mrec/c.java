package com.appodeal.ads.adapters.level_play.mrec;

import android.content.Context;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import eg.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12455a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Job f12456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LevelPlayBannerAdView f12457c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedMrecParams adTypeParams, com.appodeal.ads.adapters.level_play.b adUnitParams, UnifiedMrecCallback callback) {
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
        LevelPlayAdSize MEDIUM_RECTANGLE = LevelPlayAdSize.MEDIUM_RECTANGLE;
        Intrinsics.checkNotNullExpressionValue(MEDIUM_RECTANGLE, "MEDIUM_RECTANGLE");
        LevelPlayBannerAdView.Config.Builder adSize = new LevelPlayBannerAdView.Config.Builder().setAdSize(MEDIUM_RECTANGLE);
        Double dB = adUnitParams.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            LogExtKt.logInternal$default("LevelPlayMrec", "Setting bidFloor: " + dDoubleValue, null, 4, null);
            adSize.setBidFloor(dDoubleValue);
        }
        LevelPlayBannerAdView.Config configBuild = adSize.build();
        Intrinsics.checkNotNullExpressionValue(configBuild, "build(...)");
        LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(applicationContext, strA, configBuild);
        this.f12457c = levelPlayBannerAdView;
        if (adUnitParams.c()) {
            levelPlayBannerAdView.resumeAutoRefresh();
        } else {
            levelPlayBannerAdView.pauseAutoRefresh();
        }
        levelPlayBannerAdView.setBannerListener(new a(callback, levelPlayBannerAdView));
        this.f12456b = eg.i.d(this.f12455a, null, null, new b(levelPlayBannerAdView, adUnitParams, MEDIUM_RECTANGLE, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12456b;
        if (job != null) {
            a0.f(job, "MREC ad was destroyed", null, 2, null);
        }
        LevelPlayBannerAdView levelPlayBannerAdView = this.f12457c;
        if (levelPlayBannerAdView != null) {
            levelPlayBannerAdView.setBannerListener(null);
        }
        LevelPlayBannerAdView levelPlayBannerAdView2 = this.f12457c;
        if (levelPlayBannerAdView2 != null) {
            levelPlayBannerAdView2.destroy();
        }
        this.f12457c = null;
    }
}
