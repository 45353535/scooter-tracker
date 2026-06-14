package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3243kU implements InterfaceC2178Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C2111Gg A02;
    public C2112Gh A03;

    public C3243kU(C2112Gh c2112Gh, C2111Gg c2111Gg) {
        this.A03 = c2112Gh;
        this.A02 = c2111Gg;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2178Iw
    public final InterfaceC2127Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C3283lK(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2178Iw
    public final long AGd(InterfaceC3286lN interfaceC3286lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2178Iw
    public final void AJR(long j10) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC18094a.A0L(jArr, j10, true, true)];
    }
}
