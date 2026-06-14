package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3282lJ implements InterfaceC2127Gw {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C3282lJ(long[] jArr, long[] jArr2, long j10) {
        C3M.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (this.A01 && jArr2[0] > 0) {
            int length2 = length + 1;
            this.A02 = new long[length2];
            int length3 = length + 1;
            this.A03 = new long[length3];
            System.arraycopy(jArr, 0, this.A02, 1, length);
            System.arraycopy(jArr2, 0, this.A03, 1, length);
        } else {
            this.A02 = jArr;
            this.A03 = jArr2;
        }
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final C2126Gv A8t(long j10) {
        if (!this.A01) {
            return new C2126Gv(C2128Gx.A04);
        }
        int iA0L = AbstractC18094a.A0L(this.A03, j10, true, true);
        C2128Gx c2128Gx = new C2128Gx(this.A03[iA0L], this.A02[iA0L]);
        if (c2128Gx.A01 != j10) {
            int targetIndex = this.A03.length;
            if (iA0L != targetIndex - 1) {
                int targetIndex2 = iA0L + 1;
                long j11 = this.A03[targetIndex2];
                int targetIndex3 = iA0L + 1;
                C2128Gx rightSeekPoint = new C2128Gx(j11, this.A02[targetIndex3]);
                return new C2126Gv(c2128Gx, rightSeekPoint);
            }
        }
        return new C2126Gv(c2128Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final boolean AAa() {
        return this.A01;
    }
}
