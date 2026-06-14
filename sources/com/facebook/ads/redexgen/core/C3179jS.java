package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3179jS implements InterfaceC2127Gw {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C2219Kl A04;

    public C3179jS(C2219Kl c2219Kl, int i10, long j10, long j11) {
        this.A04 = c2219Kl;
        this.A00 = i10;
        this.A03 = j10;
        this.A01 = (j11 - j10) / ((long) c2219Kl.A02);
        this.A02 = A00(this.A01);
    }

    private long A00(long j10) {
        return AbstractC18094a.A0U(j10 * ((long) this.A00), 1000000L, this.A04.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final long A7l() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final C2126Gv A8t(long j10) {
        long jA0T = AbstractC18094a.A0T((((long) this.A04.A04) * j10) / (((long) this.A00) * 1000000), 0L, this.A01 - 1);
        long j11 = this.A03 + (((long) this.A04.A02) * jA0T);
        long jA00 = A00(jA0T);
        C2128Gx c2128Gx = new C2128Gx(jA00, j11);
        if (jA00 >= j10 || jA0T == this.A01 - 1) {
            return new C2126Gv(c2128Gx);
        }
        long j12 = 1 + jA0T;
        return new C2126Gv(c2128Gx, new C2128Gx(A00(j12), this.A03 + (((long) this.A04.A02) * j12)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final boolean AAa() {
        return true;
    }
}
