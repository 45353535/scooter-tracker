package com.appodeal.ads.adapters.bidmachine.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.i;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import io.bidmachine.AdContentType;
import kotlin.jvm.internal.Intrinsics;
import l9.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l9.a f12096b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        i iVar = (i) adUnitParams;
        d.b request = new d.b();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        request.setPriceFloorParams(iVar.f12091a);
        request.setNetworks(iVar.f12093c);
        request.setCustomParams(iVar.f12092b);
        this.f12095a = (d) request.setAdContentType(AdContentType.All).build();
        this.f12096b = (l9.a) ((l9.a) new l9.a(contextProvider.getApplicationContext()).setListener(new a((UnifiedInterstitialCallback) unifiedAdCallback))).load(this.f12095a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        d dVar = this.f12095a;
        if (dVar != null) {
            dVar.destroy();
            this.f12095a = null;
        }
        l9.a aVar = this.f12096b;
        if (aVar != null) {
            aVar.destroy();
            this.f12096b = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        d dVar = this.f12095a;
        if (dVar != null) {
            dVar.notifyMediationLoss(str, Double.valueOf(d10));
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        d dVar = this.f12095a;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        l9.a aVar = this.f12096b;
        if (aVar == null || !aVar.canShow()) {
            unifiedInterstitialCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            this.f12096b.show();
        }
    }
}
