package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3076ha implements InterfaceC2391Re {
    public final /* synthetic */ NH A00;

    public C3076ha(NH nh2) {
        this.A00 = nh2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2391Re
    public final void ACM() {
        this.A00.A04.ACG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2391Re
    public final void ACN() {
        this.A00.A04.ACF(AdError.CACHE_ERROR);
    }
}
