package com.appodeal.ads.adapters.applovin_max.mrec;

import android.app.Activity;
import android.widget.FrameLayout;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import eg.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12057a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaxAdView f12058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Job f12059c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedMrecParams adTypeParams, com.appodeal.ads.adapters.applovin_max.b adUnitParams, UnifiedMrecCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.NoFill);
            return;
        }
        adUnitParams.getClass();
        String strD = h.d(com.appodeal.ads.adapters.applovin_max.b.a(resumedActivity));
        MaxAdView maxAdView = new MaxAdView(adUnitParams.b(), MaxAdFormat.MREC);
        this.f12058b = maxAdView;
        maxAdView.setLayoutParams(new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(resumedActivity, 300), AppLovinSdkUtils.dpToPx(resumedActivity, 250)));
        Intrinsics.checkNotNull(strD);
        a aVar = new a(maxAdView, callback, strD);
        maxAdView.setRevenueListener(aVar);
        maxAdView.setListener(aVar);
        maxAdView.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        for (Map.Entry entry : adUnitParams.c().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LogExtKt.logInternal$default("ApplovinMaxMrec", "setExtraParameter/setLocalExtraParameter: " + str + " : " + str2, null, 4, null);
            maxAdView.setExtraParameter(str, str2);
            maxAdView.setLocalExtraParameter(str, str2);
        }
        maxAdView.stopAutoRefresh();
        this.f12059c = eg.i.d(this.f12057a, null, null, new b(maxAdView, adUnitParams, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f12059c;
        if (job != null) {
            a0.f(job, "Mrec ad destroyed", null, 2, null);
        }
        MaxAdView maxAdView = this.f12058b;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        this.f12058b = null;
    }
}
