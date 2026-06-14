package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3061hL implements InterfaceC2264Me {
    public C2363Qc A00;

    public final void A00(C2363Qc c2363Qc) {
        this.A00 = c2363Qc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2264Me
    public final void AEG(C3116iN c3116iN) {
        if (this.A00 != null && this.A00.A16() != null) {
            this.A00.A16().ACD();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2264Me
    public final void AEI(C3116iN c3116iN) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2264Me
    public final void AEK(C3116iN c3116iN, V1 v12) {
    }
}
