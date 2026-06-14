package com.appodeal.ads.adapters.applovin_max.banner;

import android.app.Activity;
import android.widget.FrameLayout;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.adapters.applovin_max.ext.h;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import eg.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f11986a = i.a(o0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaxAdView f11987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Job f11988c;

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void load(ContextProvider contextProvider, UnifiedBannerParams adTypeParams, com.appodeal.ads.adapters.applovin_max.b adUnitParams, UnifiedBannerCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.NoFill);
            return;
        }
        String strB = adUnitParams.b();
        String strD = h.d(com.appodeal.ads.adapters.applovin_max.b.a(resumedActivity));
        MaxAdFormat maxAdFormat = adTypeParams.needLeaderBoard(resumedActivity) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
        boolean zUseSmartBanners = adTypeParams.useSmartBanners(resumedActivity);
        int maxWidth = zUseSmartBanners ? adTypeParams.getMaxWidth(resumedActivity) : maxAdFormat.getSize().getWidth();
        int height = (zUseSmartBanners ? maxAdFormat.getAdaptiveSize(maxWidth, resumedActivity) : maxAdFormat.getSize()).getHeight();
        MaxAdViewConfiguration.Builder adaptiveType = MaxAdViewConfiguration.builder().setAdaptiveType(zUseSmartBanners ? MaxAdViewConfiguration.AdaptiveType.ANCHORED : MaxAdViewConfiguration.AdaptiveType.NONE);
        if (zUseSmartBanners) {
            adaptiveType.setAdaptiveWidth(maxWidth);
        }
        MaxAdView maxAdView = new MaxAdView(strB, maxAdFormat, adaptiveType.build());
        this.f11987b = maxAdView;
        maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, AppLovinSdkUtils.dpToPx(resumedActivity, height)));
        Intrinsics.checkNotNull(strD);
        a aVar = new a(maxAdView, callback, strD);
        maxAdView.setRevenueListener(aVar);
        maxAdView.setListener(aVar);
        maxAdView.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        for (Map.Entry entry : adUnitParams.c().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LogExtKt.logInternal$default("ApplovinMaxBanner", "setExtraParameter/setLocalExtraParameter: " + str + " : " + str2, null, 4, null);
            maxAdView.setExtraParameter(str, str2);
            maxAdView.setLocalExtraParameter(str, str2);
        }
        maxAdView.stopAutoRefresh();
        this.f11988c = eg.i.d(this.f11986a, null, null, new b(maxAdView, adUnitParams, maxAdFormat, null), 3, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Job job = this.f11988c;
        if (job != null) {
            a0.f(job, "Banner ad was destroyed", null, 2, null);
        }
        MaxAdView maxAdView = this.f11987b;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        this.f11987b = null;
    }
}
