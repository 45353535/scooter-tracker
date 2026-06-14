package com.appodeal.ads.adapters.level_play.interstitial;

import android.app.Activity;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import eg.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12409a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Job f12410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LevelPlayInterstitialAd f12411c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedInterstitialParams adTypeParams, com.appodeal.ads.adapters.level_play.b adUnitParams, UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strA = adUnitParams.a();
        if (strA.length() <= 0) {
            strA = null;
        }
        if (strA == null) {
            callback.onAdLoadFailed(LoadingError.IncorrectAdunit);
            return;
        }
        LevelPlayInterstitialAd.Config.Builder builder = new LevelPlayInterstitialAd.Config.Builder();
        Double dB = adUnitParams.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            LogExtKt.logInternal$default("LevelPlayInterstitial", "Setting bidFloor: " + dDoubleValue, null, 4, null);
            builder.setBidFloor(dDoubleValue);
        }
        LevelPlayInterstitialAd.Config configBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(configBuild, "build(...)");
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA, configBuild);
        this.f12411c = levelPlayInterstitialAd;
        levelPlayInterstitialAd.setListener(new a(callback));
        this.f12410b = eg.i.d(this.f12409a, null, null, new b(levelPlayInterstitialAd, adUnitParams, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12410b;
        if (job != null) {
            a0.f(job, "Interstitial ad was destroyed", null, 2, null);
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f12411c;
        if (levelPlayInterstitialAd != null) {
            levelPlayInterstitialAd.setListener(null);
        }
        this.f12411c = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f12411c;
        if (levelPlayInterstitialAd != null) {
            if (!levelPlayInterstitialAd.isAdReady()) {
                levelPlayInterstitialAd = null;
            }
            if (levelPlayInterstitialAd != null) {
                levelPlayInterstitialAd.showAd(activity);
                return;
            }
        }
        callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
    }
}
