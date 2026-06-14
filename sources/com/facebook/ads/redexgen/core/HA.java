package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HA extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C4Z A00;

    public HA(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        XP.A0D(1000, this.A00.A0H);
        this.A00.postDelayed(this, 2000L);
    }
}
