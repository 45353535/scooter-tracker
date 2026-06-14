package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3291lT implements InterfaceC2127Gw {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{65, 57, 53, 113, 96, 103, 116, 97, 124, 122, 123, 102, SignedBytes.MAX_POWER_OF_TWO, 102, 40, 111, 99, 44, 37, 37, 48, 38, 55, 48, 126, 53, 57, 106, 112, 99, 124, 106, 36, 105, 101, 49, 44, 40, 32, Ascii.DLE, 54, 120, 47, 4, Ascii.EM, 2, 7, 37, 2, 8, 9, Ascii.DC4, 68, 0, 9, 2, Ascii.VT, Ascii.CAN, 4, 81};
    }

    public C3291lT(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j10) {
        return AbstractC18094a.A0L(this.A04, j10, true, true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final long A7l() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final C2126Gv A8t(long j10) {
        int iA00 = A00(j10);
        C2128Gx c2128Gx = new C2128Gx(this.A04[iA00], this.A03[iA00]);
        if (c2128Gx.A01 < j10) {
            int chunkIndex = this.A00;
            if (iA00 != chunkIndex - 1) {
                int chunkIndex2 = iA00 + 1;
                long j11 = this.A04[chunkIndex2];
                int chunkIndex3 = iA00 + 1;
                C2128Gx seekPoint = new C2128Gx(j11, this.A03[chunkIndex3]);
                return new C2126Gv(c2128Gx, seekPoint);
            }
        }
        return new C2126Gv(c2128Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final boolean AAa() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 116) + this.A00 + A01(25, 8, 1) + Arrays.toString(this.A01) + A01(15, 10, 91) + Arrays.toString(this.A03) + A01(33, 9, 93) + Arrays.toString(this.A04) + A01(1, 14, 13) + Arrays.toString(this.A02) + A01(0, 1, 112);
    }
}
