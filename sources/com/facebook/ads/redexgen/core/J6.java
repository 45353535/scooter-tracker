package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C2174Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C2174Is c2174Is, boolean z10) {
        this.A00 = c2174Is;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        AbstractC2550Xm abstractC2550XmA0C = this.A00.A0c.A0C();
        if (abstractC2550XmA0C == null) {
            return;
        }
        abstractC2550XmA0C.setPageDetailsVisible((this.A01 || abstractC2550XmA0C.A0B()) ? false : true);
        abstractC2550XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
