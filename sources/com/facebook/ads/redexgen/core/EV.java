package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EV implements InterfaceC2918ew {
    public final /* synthetic */ C2817dI A00;

    public EV(C2817dI c2817dI) {
        this.A00 = c2817dI;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2918ew
    public final void AGQ() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2918ew
    public final void AGS(C2920ey c2920ey) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c2920ey != null && c2920ey.A00()) {
            this.A00.A02.A4b(this.A00.A03.A8x());
        } else {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }
}
