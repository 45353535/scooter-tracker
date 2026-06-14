package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JZ extends AbstractRunnableC2507Vt {
    public final /* synthetic */ JU A00;

    public JZ(JU ju) {
        this.A00 = ju;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        if (!this.A00.A0e) {
            XP.A0D(1000, this.A00.A0O);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
