package com.appodeal.ads.adapters.iab.vast.unified;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import f2.e;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends UnifiedFullscreenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAd f12346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f2.e f12347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f12348c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar) {
        this.f12346a = (UnifiedFullscreenAd) gVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.appodeal.ads.adapters.iab.vast.unified.g, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    public final void j(Context context, UnifiedFullscreenAdParams unifiedFullscreenAdParams, e eVar, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.f12348c = this.f12346a.g(unifiedFullscreenAdParams, eVar, unifiedFullscreenAdCallback);
        e.a aVarA = f2.e.V().d(b2.a.FullLoad).g(eVar.f12341c).e(eVar.f12344f).c(eVar.f12345g).a("segment_id", unifiedFullscreenAdParams.obtainSegmentId()).a(Reporting.Key.PLACEMENT_ID, unifiedFullscreenAdParams.obtainPlacementId());
        if (unifiedFullscreenAdParams instanceof UnifiedRewardedParams) {
            aVarA.f(((UnifiedRewardedParams) unifiedFullscreenAdParams).getMaxDuration());
        }
        f2.e eVarB = aVarA.b();
        this.f12347b = eVarB;
        eVarB.T(context, eVar.f12340b, this.f12348c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.appodeal.ads.adapters.iab.vast.unified.g, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedFullscreenAdParams unifiedFullscreenAdParams = (UnifiedFullscreenAdParams) unifiedAdParams;
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = (UnifiedFullscreenAdCallback) unifiedAdCallback;
        e eVar = (e) adUnitParams;
        Context applicationContext = contextProvider.getApplicationContext();
        if (com.appodeal.ads.adapters.iab.utils.a.b(eVar.f12340b)) {
            j(applicationContext, unifiedFullscreenAdParams, eVar, unifiedFullscreenAdCallback);
        } else {
            this.f12346a.d(applicationContext, unifiedFullscreenAdParams, eVar, unifiedFullscreenAdCallback, eVar.f12341c);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        if (this.f12347b != null) {
            this.f12347b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.appodeal.ads.adapters.iab.vast.unified.g, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        f2.e eVar = this.f12347b;
        if (eVar == null || !eVar.u()) {
            unifiedFullscreenAdCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            this.f12347b.w(activity, this.f12346a.a(), this.f12348c);
        }
    }
}
