package com.appodeal.ads.adapters.applovin_max.interstitial;

import android.app.Activity;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.adapters.applovin_max.j;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import eg.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12016a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaxInterstitialAd f12017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Job f12018c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedInterstitialParams adTypeParams, com.appodeal.ads.adapters.applovin_max.b adUnitParams, UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        adUnitParams.getClass();
        String strD = h.d(com.appodeal.ads.adapters.applovin_max.b.a(resumedActivity));
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(adUnitParams.b());
        this.f12017b = maxInterstitialAd;
        Intrinsics.checkNotNull(strD);
        j jVar = new j(callback, strD);
        maxInterstitialAd.setRevenueListener(jVar);
        maxInterstitialAd.setExpirationListener(jVar);
        maxInterstitialAd.setListener(jVar);
        for (Map.Entry entry : adUnitParams.c().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LogExtKt.logInternal$default("ApplovinMaxInterstitial", "setExtraParameter/setLocalExtraParameter: " + str + " : " + str2, null, 4, null);
            maxInterstitialAd.setExtraParameter(str, str2);
            maxInterstitialAd.setLocalExtraParameter(str, str2);
        }
        this.f12018c = eg.i.d(this.f12016a, null, null, new a(maxInterstitialAd, adUnitParams, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12018c;
        if (job != null) {
            a0.f(job, "Interstitial was destroyed", null, 2, null);
        }
        MaxInterstitialAd maxInterstitialAd = this.f12017b;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        this.f12017b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MaxInterstitialAd maxInterstitialAd = this.f12017b;
        if (maxInterstitialAd == null || !maxInterstitialAd.isReady()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
            return;
        }
        MaxInterstitialAd maxInterstitialAd2 = this.f12017b;
        if (maxInterstitialAd2 != null) {
            maxInterstitialAd2.showAd(activity);
        }
    }
}
