package com.appodeal.ads.adapters.bidmachine.banner;

import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.bidmachine.i;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import kotlin.jvm.internal.Intrinsics;
import u8.d;
import u8.e;
import u8.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f12079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f12080b;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        i iVar = (i) adUnitParams;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        e eVar = ((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext) ? e.Size_728x90 : e.Size_320x50;
        d.c request = new d.c();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        request.setPriceFloorParams(iVar.f12091a);
        request.setNetworks(iVar.f12093c);
        request.setCustomParams(iVar.f12092b);
        this.f12080b = (d) request.c(eVar).build();
        f fVar = new f(applicationContext);
        this.f12079a = fVar;
        fVar.setListener(new a(unifiedBannerCallback, eVar));
        this.f12079a.load(this.f12080b);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        d dVar = this.f12080b;
        if (dVar != null) {
            dVar.destroy();
            this.f12080b = null;
        }
        f fVar = this.f12079a;
        if (fVar != null) {
            fVar.destroy();
            this.f12079a = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        d dVar = this.f12080b;
        if (dVar != null) {
            dVar.notifyMediationLoss(str, Double.valueOf(d10));
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        d dVar = this.f12080b;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }
}
