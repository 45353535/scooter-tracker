package com.appodeal.ads.adapters.dtexchange.banner;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f12189a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        int i10;
        int i11;
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        com.appodeal.ads.adapters.dtexchange.b adUnitParams2 = (com.appodeal.ads.adapters.dtexchange.b) adUnitParams;
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
        FrameLayout frameLayout = new FrameLayout(resumedActivity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(zf.a.d(UnifiedAdUtils.getScreenDensity(resumedActivity) * ((Number) pair.getFirst()).floatValue()), zf.a.d(UnifiedAdUtils.getScreenDensity(resumedActivity) * ((Number) pair.getSecond()).floatValue())));
        a aVar = new a(callback, frameLayout, pair);
        InneractiveAdSpot inneractiveAdSpotA = adUnitParams2.a();
        inneractiveAdSpotA.setRequestListener(aVar);
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        inneractiveAdViewUnitController.setEventsListener(aVar);
        inneractiveAdSpotA.addUnitController(inneractiveAdViewUnitController);
        inneractiveAdSpotA.requestAd(adUnitParams2.b());
        this.f12189a = inneractiveAdSpotA;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InneractiveUnitController selectedUnitController;
        InneractiveAdSpot inneractiveAdSpot = this.f12189a;
        if (inneractiveAdSpot != null && (selectedUnitController = inneractiveAdSpot.getSelectedUnitController()) != null) {
            selectedUnitController.destroy();
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f12189a;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
        this.f12189a = null;
    }
}
