package com.appodeal.ads.adapters.bidmachine.mrec;

import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.bidmachine.i;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import kotlin.jvm.internal.Intrinsics;
import u8.d;
import u8.e;
import u8.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f12099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f12100b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        i iVar = (i) adUnitParams;
        d.c request = new d.c();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        request.setPriceFloorParams(iVar.f12091a);
        request.setNetworks(iVar.f12093c);
        request.setCustomParams(iVar.f12092b);
        this.f12100b = (d) request.c(e.Size_300x250).build();
        f fVar = new f(contextProvider.getApplicationContext());
        this.f12099a = fVar;
        fVar.setListener(new a((UnifiedMrecCallback) unifiedAdCallback));
        this.f12099a.load(this.f12100b);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        d dVar = this.f12100b;
        if (dVar != null) {
            dVar.destroy();
            this.f12100b = null;
        }
        f fVar = this.f12099a;
        if (fVar != null) {
            fVar.destroy();
            this.f12099a = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        d dVar = this.f12100b;
        if (dVar != null) {
            dVar.notifyMediationLoss(str, Double.valueOf(d10));
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        d dVar = this.f12100b;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }
}
