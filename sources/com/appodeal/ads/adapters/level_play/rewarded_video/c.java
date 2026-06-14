package com.appodeal.ads.adapters.level_play.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import eg.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12462a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Job f12463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LevelPlayRewardedAd f12464c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedRewardedParams adTypeParams, com.appodeal.ads.adapters.level_play.b adUnitParams, UnifiedRewardedCallback callback) {
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
        LevelPlayRewardedAd.Config.Builder builder = new LevelPlayRewardedAd.Config.Builder();
        Double dB = adUnitParams.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            LogExtKt.logInternal$default("LevelPlayRewarded", "Setting bidFloor: " + dDoubleValue, null, 4, null);
            builder.setBidFloor(dDoubleValue);
        }
        LevelPlayRewardedAd.Config configBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(configBuild, "build(...)");
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA, configBuild);
        this.f12464c = levelPlayRewardedAd;
        levelPlayRewardedAd.setListener(new a(callback));
        this.f12463b = eg.i.d(this.f12462a, null, null, new b(levelPlayRewardedAd, adUnitParams, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12463b;
        if (job != null) {
            a0.f(job, "Rewarded ad was destroyed", null, 2, null);
        }
        LevelPlayRewardedAd levelPlayRewardedAd = this.f12464c;
        if (levelPlayRewardedAd != null) {
            levelPlayRewardedAd.setListener(null);
        }
        this.f12464c = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LevelPlayRewardedAd levelPlayRewardedAd = this.f12464c;
        if (levelPlayRewardedAd != null) {
            if (!levelPlayRewardedAd.isAdReady()) {
                levelPlayRewardedAd = null;
            }
            if (levelPlayRewardedAd != null) {
                levelPlayRewardedAd.showAd(activity);
                return;
            }
        }
        callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
    }
}
