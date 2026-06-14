package com.appodeal.ads.adapters.inmobi.banner;

import android.app.Activity;
import android.view.ViewGroup;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.inmobi.ads.InMobiBanner;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InMobiBanner f12353a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        int i10;
        int i11;
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        com.appodeal.ads.adapters.inmobi.b adUnitParams2 = (com.appodeal.ads.adapters.inmobi.b) adUnitParams;
        UnifiedBannerCallback callback = (UnifiedBannerCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        if (adTypeParams.needLeaderBoard(resumedActivity)) {
            i10 = 728;
            i11 = 90;
        } else {
            i10 = 320;
            i11 = 50;
        }
        Pair pair = TuplesKt.to(i10, Integer.valueOf(i11));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        float screenDensity = UnifiedAdUtils.getScreenDensity(resumedActivity);
        InMobiBanner inMobiBanner = new InMobiBanner(resumedActivity, adUnitParams2.f12349a);
        inMobiBanner.setLayoutParams(new ViewGroup.LayoutParams(zf.a.d(iIntValue * screenDensity), zf.a.d(iIntValue2 * screenDensity)));
        inMobiBanner.setBannerSize(iIntValue, iIntValue2);
        inMobiBanner.setExtras(adUnitParams2.f12350b);
        inMobiBanner.setEnableAutoRefresh(false);
        inMobiBanner.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        inMobiBanner.setListener(new a(callback, TuplesKt.to(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2))));
        inMobiBanner.load();
        this.f12353a = inMobiBanner;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InMobiBanner inMobiBanner = this.f12353a;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
        }
        this.f12353a = null;
    }
}
