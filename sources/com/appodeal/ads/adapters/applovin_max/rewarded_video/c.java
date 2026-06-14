package com.appodeal.ads.adapters.applovin_max.rewarded_video;

import android.app.Activity;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import eg.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12074a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaxRewardedAd f12075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Job f12076c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedRewardedParams adTypeParams, com.appodeal.ads.adapters.applovin_max.b adUnitParams, UnifiedRewardedCallback callback) {
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
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(adUnitParams.b());
        this.f12075b = maxRewardedAd;
        Intrinsics.checkNotNull(strD);
        a aVar = new a(callback, strD);
        maxRewardedAd.setRevenueListener(aVar);
        maxRewardedAd.setExpirationListener(aVar);
        maxRewardedAd.setListener(aVar);
        for (Map.Entry entry : adUnitParams.c().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LogExtKt.logInternal$default("ApplovinMaxRewarded", "setExtraParameter/setLocalExtraParameter: " + str + " : " + str2, null, 4, null);
            maxRewardedAd.setExtraParameter(str, str2);
            maxRewardedAd.setLocalExtraParameter(str, str2);
        }
        this.f12076c = eg.i.d(this.f12074a, null, null, new b(maxRewardedAd, adUnitParams, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12076c;
        if (job != null) {
            a0.f(job, "Rewarded ad was destroyed", null, 2, null);
        }
        MaxRewardedAd maxRewardedAd = this.f12075b;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        this.f12075b = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MaxRewardedAd maxRewardedAd = this.f12075b;
        if (maxRewardedAd == null || !maxRewardedAd.isReady()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
            return;
        }
        MaxRewardedAd maxRewardedAd2 = this.f12075b;
        if (maxRewardedAd2 != null) {
            maxRewardedAd2.showAd(activity);
        }
    }
}
