package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2010Cj {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C3339mG A01;
    public C3339mG A02;
    public C3339mG A03;
    public final int A04;
    public final C4J A05 = new C4J(32);
    public final EO A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3339mG A04(C3339mG c3339mG, C3419nY c3419nY, C2012Cl c2012Cl, C4J c4j) {
        int iA0M;
        long j10 = c2012Cl.A01;
        c4j.A0d(1);
        C3339mG c3339mGA03 = A03(c3339mG, j10, c4j.A0l(), 1);
        long j11 = j10 + 1;
        byte b10 = c4j.A0l()[0];
        boolean z10 = (b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i10 = b10 & Ascii.DEL;
        C5N c5n = c3419nY.A05;
        if (c5n.A04 == null) {
            c5n.A04 = new byte[16];
        } else {
            Arrays.fill(c5n.A04, (byte) 0);
        }
        C3339mG c3339mGA032 = A03(c3339mGA03, j11, c5n.A04, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            c4j.A0d(2);
            c3339mGA032 = A03(c3339mGA032, j12, c4j.A0l(), 2);
            j12 += 2;
            iA0M = c4j.A0M();
        } else {
            iA0M = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c5n.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c5n.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z10) {
            int i11 = iA0M * 6;
            c4j.A0d(i11);
            c3339mGA032 = A03(c3339mGA032, j12, c4j.A0l(), i11);
            j12 += (long) i11;
            c4j.A0f(0);
            for (int i12 = 0; i12 < iA0M; i12++) {
                iArr[i12] = c4j.A0M();
                iArr2[i12] = c4j.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c2012Cl.A00 - ((int) (j12 - c2012Cl.A01));
        }
        C2130Gz c2130Gz = (C2130Gz) AbstractC18094a.A0f(c2012Cl.A02);
        c5n.A02(iA0M, iArr, iArr2, c2130Gz.A03, c5n.A04, c2130Gz.A01, c2130Gz.A02, c2130Gz.A00);
        int i13 = (int) (j12 - c2012Cl.A01);
        c2012Cl.A01 += (long) i13;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            c2012Cl.A00 -= i13;
            return c3339mGA032;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        c2012Cl.A00 -= i13;
        return c3339mGA032;
    }

    public C2010Cj(EO eo) {
        this.A06 = eo;
        this.A04 = eo.A8A();
        this.A01 = new C3339mG(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i10) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A41(), new C3339mG(this.A03.A00, this.A04));
        }
        return Math.min(i10, (int) (this.A03.A00 - this.A00));
    }

    public static C3339mG A01(C3339mG c3339mG, long j10) {
        while (j10 >= c3339mG.A00) {
            c3339mG = c3339mG.A02;
        }
        return c3339mG;
    }

    public static C3339mG A02(C3339mG c3339mG, long j10, ByteBuffer byteBuffer, int i10) {
        C3339mG c3339mGA01 = A01(c3339mG, j10);
        while (i10 > 0) {
            int remaining = (int) (c3339mGA01.A00 - j10);
            int iMin = Math.min(i10, remaining);
            byte[] bArr = c3339mGA01.A03.A01;
            int remaining2 = c3339mGA01.A00(j10);
            byteBuffer.put(bArr, remaining2, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == c3339mGA01.A00) {
                c3339mGA01 = c3339mGA01.A02;
            }
        }
        return c3339mGA01;
    }

    public static C3339mG A03(C3339mG c3339mG, long j10, byte[] bArr, int i10) {
        C3339mG c3339mGA01 = A01(c3339mG, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (c3339mGA01.A00 - j10));
            byte[] bArr2 = c3339mGA01.A03.A01;
            int toCopy = c3339mGA01.A00(j10);
            int remaining = i10 - i11;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == c3339mGA01.A00) {
                c3339mGA01 = c3339mGA01.A02;
            }
        }
        return c3339mGA01;
    }

    public static C3339mG A05(C3339mG c3339mG, C3419nY c3419nY, C2012Cl c2012Cl, C4J c4j) {
        if (c3419nY.A0E()) {
            c3339mG = A04(c3339mG, c3419nY, c2012Cl, c4j);
        }
        if (c3419nY.A03()) {
            c4j.A0d(4);
            C3339mG c3339mGA03 = A03(c3339mG, c2012Cl.A01, c4j.A0l(), 4);
            int iA0L = c4j.A0L();
            c2012Cl.A01 += 4;
            c2012Cl.A00 -= 4;
            c3419nY.A0C(iA0L);
            C3339mG c3339mGA02 = A02(c3339mGA03, c2012Cl.A01, c3419nY.A02, iA0L);
            c2012Cl.A01 += (long) iA0L;
            c2012Cl.A00 -= iA0L;
            c3419nY.A0D(c2012Cl.A00);
            return A02(c3339mGA02, c2012Cl.A01, c3419nY.A03, c2012Cl.A00);
        }
        c3419nY.A0C(c2012Cl.A00);
        return A02(c3339mG, c2012Cl.A01, c3419nY.A02, c2012Cl.A00);
    }

    private void A06(int i10) {
        this.A00 += (long) i10;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C3339mG c3339mG) {
        if (c3339mG.A03 == null) {
            return;
        }
        this.A06.AGu(c3339mG);
        c3339mG.A01();
    }

    public final int A08(AnonymousClass20 anonymousClass20, int i10, boolean z10) throws IOException {
        int i11 = anonymousClass20.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i10));
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A06(i11);
        return i11;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.AJi();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j10) {
        if (j10 == -1) {
            return;
        }
        while (j10 >= this.A01.A00) {
            this.A06.AGt(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j11 = this.A02.A01;
        long j12 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j11 < j12) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C4J c4j, int i10) {
        while (i10 > 0) {
            int iA00 = A00(i10);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c4j.A0k(bArr, bytesAppended, iA00);
            i10 -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(C3419nY c3419nY, C2012Cl c2012Cl) {
        A05(this.A02, c3419nY, c2012Cl, this.A05);
    }

    public final void A0F(C3419nY c3419nY, C2012Cl c2012Cl) {
        this.A02 = A05(this.A02, c3419nY, c2012Cl, this.A05);
    }
}
