package com.appodeal.ads.adapters.meta.mrec;

import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdView f12484a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        AdView adView = new AdView(contextProvider.getApplicationContext(), ((com.appodeal.ads.adapters.meta.b) adUnitParams).f12465a, AdSize.RECTANGLE_HEIGHT_250);
        this.f12484a = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new a(this, (UnifiedMrecCallback) unifiedAdCallback)).build());
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        AdView adView = this.f12484a;
        if (adView != null) {
            adView.destroy();
            this.f12484a = null;
        }
    }
}
