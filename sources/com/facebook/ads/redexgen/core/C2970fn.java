package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2970fn extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C2969fm A00;
    public final /* synthetic */ C5G A01;

    public C2970fn(C2969fm c2969fm, C5G c5g) {
        this.A00 = c2969fm;
        this.A01 = c5g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1B());
        this.A00.A02.A1f(true, true);
    }
}
