package com.appodeal.ads.adapters.dtexchange.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.dtexchange.b;
import com.appodeal.ads.adapters.dtexchange.unified.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f12193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InneractiveFullscreenUnitController f12194b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        b adUnitParams2 = (b) adUnitParams;
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c cVar = new c(callback);
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        inneractiveFullscreenUnitController.addContentController(new InneractiveFullscreenVideoContentController());
        inneractiveFullscreenUnitController.setEventsListener(cVar);
        inneractiveFullscreenUnitController.setRewardedListener(cVar);
        this.f12194b = inneractiveFullscreenUnitController;
        InneractiveAdSpot inneractiveAdSpotA = adUnitParams2.a();
        inneractiveAdSpotA.setRequestListener(cVar);
        inneractiveAdSpotA.addUnitController(this.f12194b);
        inneractiveAdSpotA.requestAd(adUnitParams2.b());
        this.f12193a = inneractiveAdSpotA;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.f12194b;
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.destroy();
        }
        InneractiveAdSpot inneractiveAdSpot = this.f12193a;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f12194b = null;
        this.f12193a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        InneractiveAdSpot inneractiveAdSpot;
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.f12194b;
        if (inneractiveFullscreenUnitController == null || (inneractiveAdSpot = this.f12193a) == null || !inneractiveAdSpot.isReady()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            inneractiveFullscreenUnitController.show(activity);
        }
    }
}
