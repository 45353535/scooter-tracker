package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2211Kd extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C2602Zm A00;

    public C2211Kd(C2602Zm c2602Zm) {
        this.A00 = c2602Zm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
