package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2570Yg extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C2794cu A00;

    public C2570Yg(C2794cu c2794cu) {
        this.A00 = c2794cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
