package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3203jq implements KJ {
    public static byte[] A0G;
    public static String[] A0H = {"cAtU07tvAHmpQwteCa8pEQH5gF5iUcfh", "Hjeg7grS71Jm6r5NKbmR8o7Al25NvLrB", "8TbkpeEOwiN436cBQhp4NSePMq1Z0ZNp", "wFA3Sleqv", "yws6lvEdJf3TdH9okNAymdfPd8aH69ii", "xvx7jE251jeLUpmQ5JTTtAODp7RTPAZj", "flKrm8KbmQNj7vJDUwRTOfFPMCPuTaKn", "2PQM5lIFNms8BVmrvHkuPmbcHqu7a2gR"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public H1 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C4J A0B;
    public final KK A0C;
    public final KS A0D;
    public final C2215Kh A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<C3497or, Long> A00(KK kk, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(kk.A02, kk.A00);
        int i10 = bArrCopyOf[4] & 255;
        int i11 = bArrCopyOf[5] & 255;
        int i12 = (i10 << 4) | (i11 >> 4);
        int i13 = ((i11 & 15) << 8) | (bArrCopyOf[6] & 255);
        float f10 = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                float f11 = i13 * 4;
                float f12 = i12 * 3;
                if (A0H[2].charAt(3) == 'k') {
                    A0H[1] = "IKG5315UEoYuWi8w79ZvxkF28jax6fmF";
                    f10 = f11 / f12;
                    break;
                }
                throw new RuntimeException();
            case 3:
                f10 = (i13 * 16) / (i12 * 9);
                break;
            case 4:
                f10 = (i13 * 121) / (i12 * 100);
                break;
        }
        C3497or c3497orA14 = new C2D().A0y(str).A11(A01(0, 11, 62)).A0r(i12).A0f(i13).A0Y(f10).A12(Collections.singletonList(bArrCopyOf)).A14();
        long j10 = 0;
        int i14 = (bArrCopyOf[7] & Ascii.SI) - 1;
        if (i14 >= 0 && i14 < A0I.length) {
            double d10 = A0I[i14];
            int i15 = kk.A01;
            int i16 = (bArrCopyOf[i15 + 9] & 96) >> 5;
            int i17 = bArrCopyOf[i15 + 9] & Ascii.US;
            if (i16 != i17) {
                double d11 = i16;
                if (A0H[2].charAt(3) == 'k') {
                    String[] strArr = A0H;
                    strArr[5] = "rAMAKKtXIRKmVhmwxuLKv06bcSnWRDth";
                    strArr[7] = "TlBzrdA8FTcPVEmXq7DzDEHR3QnpW5Am";
                    d10 *= (d11 + 1.0d) / ((double) (i17 + 1));
                }
                throw new RuntimeException();
            }
            j10 = (long) (1000000.0d / d10);
        }
        return Pair.create(c3497orA14, Long.valueOf(j10));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {50, 45, 32, 33, 43, 107, 41, 52, 33, 35, 118};
        if (A0H[4].charAt(19) != 'y') {
            throw new RuntimeException();
        }
        A0H[2] = "5b4kHrs0qMccPUXJRINIqLrMs4aEtqXr";
        A0G = bArr;
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C3203jq() {
        this(null);
    }

    public C3203jq(C2215Kh c2215Kh) {
        this.A0E = c2215Kh;
        this.A0F = new boolean[4];
        this.A0C = new KK(128);
        if (c2215Kh != null) {
            this.A0D = new KS(178, 128);
            this.A0B = new C4J();
        } else {
            this.A0D = null;
            this.A0B = null;
        }
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.core.KJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A52(com.facebook.ads.redexgen.core.C4J r24) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3203jq.A52(com.facebook.ads.redexgen.X.4J):void");
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C2212Ke c2212Ke) {
        c2212Ke.A05();
        this.A06 = c2212Ke.A04();
        this.A05 = gy.AJh(c2212Ke.A03(), 2);
        if (this.A0E != null) {
            this.A0E.A03(gy, c2212Ke);
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        AbstractC2121Gq.A0H(this.A0F);
        this.A0C.A00();
        if (this.A0D != null) {
            KS ks = this.A0D;
            if (A0H[1].length() != 32) {
                throw new RuntimeException();
            }
            A0H[0] = "joVCJevLOtmtIagsqVBvfxemqq2mA7LA";
            ks.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }
}
