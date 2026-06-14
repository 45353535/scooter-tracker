package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2694bI extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C2794cu A00;

    public C2694bI(C2794cu c2794cu) {
        this.A00 = c2794cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        for (C2428Sq c2428Sq : C2427Sp.A02()) {
            C2427Sp.A0A(this.A00, c2428Sq.A02(), c2428Sq.A00(), c2428Sq.A01(), false);
        }
        C2427Sp.A02().clear();
    }
}
