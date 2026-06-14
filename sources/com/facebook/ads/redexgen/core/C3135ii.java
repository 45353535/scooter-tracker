package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3135ii extends AbstractRunnableC2507Vt {
    public final /* synthetic */ MW A00;

    public C3135ii(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
