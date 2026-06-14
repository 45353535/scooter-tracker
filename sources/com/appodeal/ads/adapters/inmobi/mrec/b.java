package com.appodeal.ads.adapters.inmobi.mrec;

import android.app.Activity;
import android.view.ViewGroup;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.inmobi.ads.InMobiBanner;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InMobiBanner f12360a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        com.appodeal.ads.adapters.inmobi.b adUnitParams2 = (com.appodeal.ads.adapters.inmobi.b) adUnitParams;
        UnifiedMrecCallback callback = (UnifiedMrecCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        Pair pair = TuplesKt.to(300, 250);
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(zf.a.d(UnifiedAdUtils.getScreenDensity(resumedActivity) * iIntValue), zf.a.d(UnifiedAdUtils.getScreenDensity(resumedActivity) * iIntValue2));
        InMobiBanner inMobiBanner = new InMobiBanner(resumedActivity, adUnitParams2.f12349a);
        inMobiBanner.setLayoutParams(layoutParams);
        inMobiBanner.setExtras(adUnitParams2.f12350b);
        inMobiBanner.setBannerSize(iIntValue, iIntValue2);
        inMobiBanner.setEnableAutoRefresh(false);
        inMobiBanner.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        inMobiBanner.setListener(new a(callback));
        inMobiBanner.load();
        this.f12360a = inMobiBanner;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InMobiBanner inMobiBanner = this.f12360a;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
        }
        this.f12360a = null;
    }
}
