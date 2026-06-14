package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements com.fyber.inneractive.sdk.factories.g {
    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return IAConfigManager.O.G != null && (inneractiveAdSpot.getAdContent() instanceof a);
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final com.fyber.inneractive.sdk.interfaces.f b(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f21035a;
        boolean z10 = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
        if (inneractiveAdSpot.getAdContent().c() && z10) {
            return inneractiveAdSpot.getAdContent().b().f23736p == UnitDisplayType.INTERSTITIAL ? new com.fyber.inneractive.sdk.dv.interstitial.h() : new com.fyber.inneractive.sdk.dv.rewarded.h();
        }
        return null;
    }
}
