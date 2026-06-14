package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3281lI implements InterfaceC2127Gw {
    public final long A00;
    public final C2126Gv A01;

    public C3281lI(long j10) {
        this(j10, 0L);
    }

    public C3281lI(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C2126Gv(j11 == 0 ? C2128Gx.A04 : new C2128Gx(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final C2126Gv A8t(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final boolean AAa() {
        return false;
    }
}
