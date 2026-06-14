package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3466oL implements C1S {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final C1R<C3466oL> A0J;
    public static final Object A0K;
    public static final C3488oi A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C3490ok A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C3488oi A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3466oL A00(Bundle bundle) {
        C3490ok c3490ok;
        Bundle bundle2 = bundle.getBundle(A0W);
        C3488oi c3488oi = bundle2 != null ? (C3488oi) C3488oi.A08.A6X(bundle2) : C3488oi.A09;
        long j10 = bundle.getLong(A0Y, -9223372036854775807L);
        long j11 = bundle.getLong(A0Z, -9223372036854775807L);
        long j12 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z10 = bundle.getBoolean(A0T, false);
        boolean z11 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c3490ok = (C3490ok) C3490ok.A06.A6X(bundle3);
        } else {
            c3490ok = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z12 = bundle.getBoolean(A0S, false);
        long j13 = bundle.getLong(A0N, 0L);
        long j14 = bundle.getLong(A0O, -9223372036854775807L);
        int i10 = bundle.getInt(A0Q, 0);
        int i11 = bundle.getInt(A0U, 0);
        long j15 = bundle.getLong(A0X, 0L);
        C3466oL c3466oL = new C3466oL();
        c3466oL.A07(A0M, c3488oi, null, j10, j11, j12, z10, z11, c3490ok, j13, j14, i10, i11, j15);
        c3466oL.A0F = z12;
        return c3466oL;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, Ascii.SO, 75, 4, 1, Ascii.SYN, 75, 4, Ascii.VT, 1, Ascii.ETB, 10, Ascii.FF, 1, Ascii.GS, 75, 8, 0, 1, Ascii.FF, 4, 86, 75, 6, 10, 8, 8, 10, Ascii.VT, 75, 49, Ascii.FF, 8, 0, 9, Ascii.FF, Ascii.VT, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C2I().A03(A02(0, 48, 107)).A00(Uri.EMPTY).A05();
        A0W = AbstractC18094a.A0h(1);
        A0Y = AbstractC18094a.A0h(2);
        A0Z = AbstractC18094a.A0h(3);
        A0P = AbstractC18094a.A0h(4);
        A0T = AbstractC18094a.A0h(5);
        A0R = AbstractC18094a.A0h(6);
        A0V = AbstractC18094a.A0h(7);
        A0S = AbstractC18094a.A0h(8);
        A0N = AbstractC18094a.A0h(9);
        A0O = AbstractC18094a.A0h(10);
        A0Q = AbstractC18094a.A0h(11);
        A0U = AbstractC18094a.A0h(12);
        A0X = AbstractC18094a.A0h(13);
        A0J = new C1R() { // from class: com.facebook.ads.redexgen.X.oM
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C3466oL.A00(bundle);
            }
        };
    }

    public final long A04() {
        return AbstractC18094a.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return AbstractC18094a.A0P(this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.core.C3466oL A07(java.lang.Object r6, com.facebook.ads.redexgen.core.C3488oi r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, com.facebook.ads.redexgen.core.C3490ok r17, long r18, long r20, int r22, int r23, long r24) {
        /*
            r5 = this;
            r3 = r5
            r3.A0C = r6
            if (r7 == 0) goto L1c
            r0 = r7
        L6:
            r3.A09 = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3466oL.A0I
            r0 = 2
            r1 = r1[r0]
            r0 = 1
            char r1 = r1.charAt(r0)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L1f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1c:
            com.facebook.ads.redexgen.X.oi r0 = com.facebook.ads.redexgen.core.C3466oL.A0L
            goto L6
        L1f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3466oL.A0I
            java.lang.String r1 = "sHLAwqiYlmMVa087WjDP7yFYW"
            r0 = 5
            r2[r0] = r1
            if (r7 == 0) goto L82
            com.facebook.ads.redexgen.X.2Q r4 = r7.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3466oL.A0I
            r0 = 2
            r1 = r1[r0]
            r0 = 1
            char r1 = r1.charAt(r0)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L78
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3466oL.A0I
            java.lang.String r1 = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L82
        L41:
            com.facebook.ads.redexgen.X.2Q r0 = r7.A03
            java.lang.Object r0 = r0.A03
        L45:
            r3.A0B = r0
            r3.A0A = r8
            r3.A06 = r9
            r3.A07 = r11
            r3.A04 = r13
            r3.A0G = r15
            r0 = r16
            r3.A0D = r0
            r1 = r17
            if (r1 == 0) goto L76
            r0 = 1
        L5a:
            r3.A0E = r0
            r3.A08 = r1
            r0 = r18
            r3.A02 = r0
            r0 = r20
            r3.A03 = r0
            r0 = r22
            r3.A00 = r0
            r0 = r23
            r3.A01 = r0
            r0 = r24
            r3.A05 = r0
            r0 = 0
            r3.A0F = r0
            return r3
        L76:
            r0 = 0
            goto L5a
        L78:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3466oL.A0I
            java.lang.String r1 = "IGwZtC"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L82
            goto L41
        L82:
            r0 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3466oL.A07(java.lang.Object, com.facebook.ads.redexgen.X.oi, java.lang.Object, long, long, long, boolean, boolean, com.facebook.ads.redexgen.X.ok, long, long, int, int, long):com.facebook.ads.redexgen.X.oL");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C3466oL c3466oL = (C3466oL) obj;
        if (AbstractC18094a.A1E(this.A0C, c3466oL.A0C) && AbstractC18094a.A1E(this.A09, c3466oL.A09) && AbstractC18094a.A1E(this.A0A, c3466oL.A0A) && AbstractC18094a.A1E(this.A08, c3466oL.A08) && this.A06 == c3466oL.A06 && this.A07 == c3466oL.A07 && this.A04 == c3466oL.A04 && this.A0G == c3466oL.A0G && this.A0D == c3466oL.A0D && this.A0F == c3466oL.A0F && this.A02 == c3466oL.A02 && this.A03 == c3466oL.A03 && this.A00 == c3466oL.A00 && this.A01 == c3466oL.A01) {
            long j10 = this.A05;
            long j11 = c3466oL.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j10 == j11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((iHashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
