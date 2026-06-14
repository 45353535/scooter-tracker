package com.appodeal.ads.adapters.dtexchange.mrec;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f12197a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        com.appodeal.ads.adapters.dtexchange.b adUnitParams2 = (com.appodeal.ads.adapters.dtexchange.b) adUnitParams;
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
        FrameLayout frameLayout = new FrameLayout(resumedActivity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(zf.a.d(UnifiedAdUtils.getScreenDensity(resumedActivity) * 300), zf.a.d(UnifiedAdUtils.getScreenDensity(resumedActivity) * 250)));
        a aVar = new a(callback, frameLayout);
        InneractiveAdSpot inneractiveAdSpotA = adUnitParams2.a();
        inneractiveAdSpotA.setRequestListener(aVar);
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        inneractiveAdViewUnitController.setEventsListener(aVar);
        inneractiveAdSpotA.addUnitController(inneractiveAdViewUnitController);
        inneractiveAdSpotA.requestAd(adUnitParams2.b());
        this.f12197a = inneractiveAdSpotA;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InneractiveUnitController selectedUnitController;
        InneractiveAdSpot inneractiveAdSpot = this.f12197a;
        if (inneractiveAdSpot != null && (selectedUnitController = inneractiveAdSpot.getSelectedUnitController()) != null) {
            selectedUnitController.destroy();
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f12197a;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
        this.f12197a = null;
    }
}
