package com.appodeal.ads.adapters.bidmachine.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.i;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import kotlin.jvm.internal.Intrinsics;
import md.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public md.a f12110b;

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
        this.f12109a = (d) request.build();
        this.f12110b = (md.a) ((md.a) new md.a(contextProvider.getApplicationContext()).setListener(new a((UnifiedRewardedCallback) unifiedAdCallback))).load(this.f12109a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        d dVar = this.f12109a;
        if (dVar != null) {
            dVar.destroy();
            this.f12109a = null;
        }
        md.a aVar = this.f12110b;
        if (aVar != null) {
            aVar.destroy();
            this.f12110b = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        d dVar = this.f12109a;
        if (dVar != null) {
            dVar.notifyMediationLoss(str, Double.valueOf(d10));
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        d dVar = this.f12109a;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        md.a aVar = this.f12110b;
        if (aVar == null || !aVar.canShow()) {
            unifiedRewardedCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            this.f12110b.show();
        }
    }
}
