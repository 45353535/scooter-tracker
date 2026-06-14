package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2992gA implements InterfaceC2374Qn {
    public final /* synthetic */ C18676g A00;

    public C2992gA(C18676g c18676g) {
        this.A00 = c18676g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2374Qn
    public final void AGP(AbstractC2367Qg abstractC2367Qg, QJ qj, QJ qj2) {
        this.A00.A1l(abstractC2367Qg, qj, qj2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2374Qn
    public final void AGR(AbstractC2367Qg abstractC2367Qg, QJ qj, QJ qj2) {
        this.A00.A0r.A0Y(abstractC2367Qg);
        this.A00.A1m(abstractC2367Qg, qj, qj2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2374Qn
    public final void AGT(AbstractC2367Qg abstractC2367Qg, QJ qj, QJ qj2) {
        abstractC2367Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC2367Qg, abstractC2367Qg, qj, qj2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC2367Qg, qj, qj2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2374Qn
    public final void AJo(AbstractC2367Qg abstractC2367Qg) {
        this.A00.A06.A1F(abstractC2367Qg.A0H, this.A00.A0r);
    }
}
