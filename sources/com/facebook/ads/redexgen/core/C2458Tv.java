package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2458Tv implements InterfaceC2604Zo {
    public final /* synthetic */ TD A00;

    public C2458Tv(TD td2) {
        this.A00 = td2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2604Zo
    public final void ADT(C2603Zn c2603Zn) {
        this.A00.A0D.set(c2603Zn.A00() != null);
        if (this.A00.A0E.get() && this.A00.A02 != null) {
            this.A00.A02.AEW(c2603Zn.A00() != null);
        }
    }
}
