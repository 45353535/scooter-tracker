package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3180jT implements GX {
    public static byte[] A07;
    public static String[] A08 = {"DwCwNe", "sWjhkz5Jk0aFlWxF8RAhYepliqmDVBH5", "fJB4aZ6fjAPSNUZta8hrgw0qJ7r8hoM5", "QGFmFhkJVom57VKObFa8uqUV9", "rnOb7nHa90E2wPIfOCxC", "at6D0iA1D4bxl", "SWjjSn0lfORi", "B3tBBFyQt38AAQleoY5s"};
    public static final InterfaceC2106Gb A09;
    public GY A04;
    public H1 A05;
    public InterfaceC2217Kj A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{87, 91, 2, 39, 50, 39, 102, 35, 62, 37, 35, 35, 34, 53, 102, 47, 40, 54, 51, 50, 102, 42, 35, 40, 33, 50, 46, 124, 102, 39, Ascii.FS, 1, 7, 2, 2, Ascii.GS, 0, 6, Ascii.ETB, Ascii.SYN, 82, 37, 51, 36, 82, Ascii.DC4, Ascii.GS, 0, Ascii.US, 19, 6, 82, 6, Ascii.VT, 2, Ascii.ETB, 72, 82, Ascii.DEL, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 69, 88, 10, 95, 68, 88, 79, 73, 69, 77, 68, 67, 80, 79, 78, 10, 93, 75, 92, 10, 76, 67, 70, 79, 10, 94, 83, 90, 79, 4, 103, 81, 70, 117, 72, 68, 66, 81, 83, 68, 95, 66, 17, 5, Ascii.DC4, Ascii.EM, Ascii.US, 95, Ascii.ETB, 71, 65, 65, 93, 17, Ascii.FS, 17, 7, Ascii.DEL, 107, 122, 119, 113, 49, 121, 41, 47, 47, 51, 115, 114, Ascii.DEL, 105, 55, 35, 50, Utf8.REPLACEMENT_BYTE, 57, 121, 36, 55, 33};
    }

    static {
        A03();
        A09 = new InterfaceC2106Gb() { // from class: com.facebook.ads.redexgen.X.jW
            @Override // com.facebook.ads.redexgen.core.InterfaceC2106Gb
            public final GX[] A5F() {
                return C3180jT.A08();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2106Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC2105Ga.A01(this, uri, map);
            }
        };
    }

    private int A00(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C3M.A08(this.A02 != -1);
        return ((InterfaceC2217Kj) C3M.A01(this.A06)).AI9(interfaceC3286lN, this.A02 - interfaceC3286lN.A8f()) ? -1 : 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        C3M.A02(this.A05);
    }

    private void A04(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C3M.A08(interfaceC3286lN.A8f() == 0);
        int i10 = this.A00;
        if (A08[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "oJOrgM3DzNUfWcxP3ghI";
        strArr[4] = "cZhhMb4kvP2y4vGeSU9A";
        if (i10 != -1) {
            interfaceC3286lN.AJJ(this.A00);
            this.A01 = 4;
        } else {
            if (AbstractC2221Kn.A06(interfaceC3286lN)) {
                interfaceC3286lN.AJJ((int) (interfaceC3286lN.A8a() - interfaceC3286lN.A8f()));
                this.A01 = 1;
                return;
            }
            throw C17652i.A01(A01(58, 42, 8), null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C2219Kl wavFormat = AbstractC2221Kn.A02(interfaceC3286lN);
        if (wavFormat.A03 == 17) {
            this.A06 = new C3182jV(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new C3181jU(this.A04, this.A05, wavFormat, A01(112, 15, 82), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new C3181jU(this.A04, this.A05, wavFormat, A01(127, 15, 60), -1);
        } else {
            int iA00 = H9.A00(wavFormat.A03, wavFormat.A01);
            if (iA00 != 0) {
                this.A06 = new C3181jU(this.A04, this.A05, wavFormat, A01(142, 9, 116), iA00);
            } else {
                throw C17652i.A00(A01(29, 29, 80) + wavFormat.A03);
            }
        }
        this.A01 = 3;
    }

    private void A06(InterfaceC3286lN interfaceC3286lN) throws IOException {
        this.A03 = AbstractC2221Kn.A00(interfaceC3286lN);
        this.A01 = 2;
    }

    private void A07(InterfaceC3286lN interfaceC3286lN) throws IOException {
        Pair<Long, Long> pairA01 = AbstractC2221Kn.A01(interfaceC3286lN);
        this.A00 = ((Long) pairA01.first).intValue();
        long jLongValue = ((Long) pairA01.second).longValue();
        if (this.A03 != -1) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "zD8CpsX01ISLh3RSws8RgUnhS";
            strArr2[6] = "h3zG6U6JIHw0";
            if (jLongValue == 4294967295L) {
                jLongValue = this.A03;
            }
        }
        this.A02 = ((long) this.A00) + jLongValue;
        long jA8G = interfaceC3286lN.A8G();
        if (jA8G != -1 && this.A02 > jA8G) {
            AnonymousClass44.A07(A01(100, 12, 18), A01(2, 27, 100) + this.A02 + A01(0, 2, 89) + jA8G);
            this.A02 = jA8G;
        }
        ((InterfaceC2217Kj) C3M.A01(this.A06)).AA0(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ GX[] A08() {
        return new GX[]{new C3180jT()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A04 = gy;
        this.A05 = gy.AJh(0, 1);
        gy.A6G();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC3286lN interfaceC3286lN, C2124Gt c2124Gt) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(interfaceC3286lN);
                return 0;
            case 1:
                A06(interfaceC3286lN);
                if (A08[5].length() != 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[3] = "VLLh2GyvdfrrOjqYmUQdrqO3c";
                strArr[6] = "Miu4m4vLnYY2";
                return 0;
            case 2:
                A05(interfaceC3286lN);
                return 0;
            case 3:
                A07(interfaceC3286lN);
                return 0;
            case 4:
                return A00(interfaceC3286lN);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A01 = j10 == 0 ? 0 : 4;
        if (this.A06 != null) {
            this.A06.AI0(j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC3286lN interfaceC3286lN) throws IOException {
        return AbstractC2221Kn.A06(interfaceC3286lN);
    }
}
