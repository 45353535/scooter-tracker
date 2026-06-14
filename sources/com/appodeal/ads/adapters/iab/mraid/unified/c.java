package com.appodeal.ads.adapters.iab.mraid.unified;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends UnifiedBanner implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12241a = new b(this);

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.q
    public final s i(UnifiedViewAdParams unifiedViewAdParams, a aVar, UnifiedViewAdCallback unifiedViewAdCallback) {
        return new d((UnifiedBannerCallback) unifiedViewAdCallback, aVar, aVar.f12239k);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        b bVar = this.f12241a;
        bVar.getClass();
        Context applicationContext = contextProvider.getApplicationContext();
        r.a(applicationContext, (UnifiedBannerParams) unifiedAdParams, (a) adUnitParams, (UnifiedBannerCallback) unifiedAdCallback, bVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onClicked() {
        super.onClicked();
        this.f12241a.onClicked();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12241a.onDestroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onFinished() {
        super.onFinished();
        this.f12241a.onFinished();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedBannerParams unifiedBannerParams = (UnifiedBannerParams) unifiedAdParams;
        super.onPrepareToShow(activity, unifiedBannerParams);
        this.f12241a.onPrepareToShow(activity, unifiedBannerParams);
    }
}
