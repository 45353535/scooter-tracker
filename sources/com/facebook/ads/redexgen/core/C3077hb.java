package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3077hb implements NP {
    public final /* synthetic */ NH A00;

    public C3077hb(NH nh2) {
        this.A00 = nh2;
    }

    @Override // com.facebook.ads.redexgen.core.NP
    public final void AEZ(AdError adError) {
        this.A00.A04.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.NP
    public final void AEa() {
        this.A00.A04.ACG();
    }
}
