package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2165Ij {
    public static byte[] A03;
    public static String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final C3169jH A05;
    public static final C3169jH A06;
    public int A01;
    public final List<C2162Ig> A02 = new ArrayList();
    public int A00 = 0;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{45, 10, Ascii.DC2, 5, 8, 13, 0, 68, 55, 33, 34, 68, 10, 5, 9, 1, 56, 7, 4, Ascii.FS, 38, 4, Ascii.US, 2, 4, 5, 52, 47, 10, Ascii.US, 10, 93, 123, 126, 107, 124, 81, 93, 98, 97, 121, 67, 97, 122, 103, 97, 96, 81, 76, 73, 67, 94, 120, 125, 104, Ascii.DEL, 82, 94, 97, 98, 122, SignedBytes.MAX_POWER_OF_TWO, 98, 121, 100, 98, 99, 82, 73, 108, 121, 108, 50, Ascii.DC4, 17, 4, 19, 62, 50, 13, Ascii.SO, Ascii.SYN, 44, Ascii.SO, Ascii.NAK, 8, Ascii.SO, Ascii.SI, 62, 37, 4, 7, 13, 8, 2, 10, 4, 19, 8, Ascii.SI, 6, 62, 46, Ascii.SI, 65, 103, 98, 119, 96, 77, 65, 126, 125, 101, 95, 125, 102, 123, 125, 124, 77, 87, 118, 123, 102, 77, 86, 115, 102, 115};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(InterfaceC3286lN interfaceC3286lN, List<Metadata.Entry> list) throws IOException {
        long jA8f = interfaceC3286lN.A8f();
        int iA8G = (int) ((interfaceC3286lN.A8G() - interfaceC3286lN.A8f()) - ((long) this.A01));
        C4J c4j = new C4J(iA8G);
        interfaceC3286lN.readFully(c4j.A0l(), 0, iA8G);
        for (int i10 = 0; i10 < this.A02.size(); i10++) {
            C2162Ig c2162Ig = this.A02.get(i10);
            c4j.A0f((int) (c2162Ig.A02 - jA8f));
            c4j.A0g(4);
            int iA0E = c4j.A0E();
            String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int iA00 = A00(c4j.A0W(iA0E));
            int i11 = c2162Ig.A01 - (iA0E + 8);
            switch (iA00) {
                case 2192:
                    list.add(A01(c4j, i11));
                    break;
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = C3169jH.A02(':');
        A05 = C3169jH.A02('*');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.String r3) throws com.facebook.ads.redexgen.core.C17652i {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1711564334: goto L62;
                case -1332107749: goto L50;
                case -1251387154: goto L3e;
                case -830665521: goto L2c;
                case 1760745220: goto L1a;
                default: goto L7;
            }
        L7:
            r0 = -1
        L8:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L7d;
                case 2: goto L7a;
                case 3: goto L77;
                case 4: goto L74;
                default: goto Lb;
            }
        Lb:
            r2 = 0
            r1 = 16
            r0 = 94
            java.lang.String r1 = A02(r2, r1, r0)
            r0 = 0
            com.facebook.ads.redexgen.X.2i r0 = com.facebook.ads.redexgen.core.C17652i.A01(r1, r0)
            throw r0
        L1a:
            r2 = 31
            r1 = 20
            r0 = 52
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L8
        L2c:
            r2 = 72
            r1 = 32
            r0 = 91
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 4
            goto L8
        L3e:
            r2 = 51
            r1 = 21
            r0 = 55
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L50:
            r2 = 104(0x68, float:1.46E-43)
            r1 = 26
            r0 = 40
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 3
            goto L8
        L62:
            r2 = 16
            r1 = 15
            r0 = 81
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L8
        L74:
            r0 = 2820(0xb04, float:3.952E-42)
            return r0
        L77:
            r0 = 2819(0xb03, float:3.95E-42)
            return r0
        L7a:
            r0 = 2817(0xb01, float:3.947E-42)
            return r0
        L7d:
            r0 = 2816(0xb00, float:3.946E-42)
            return r0
        L80:
            r0 = 2192(0x890, float:3.072E-42)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2165Ij.A00(java.lang.String):int");
    }

    public static SlowMotionData A01(C4J c4j, int i10) throws C17652i {
        List<SlowMotionData.Segment> segments = new ArrayList<>();
        String dataString = c4j.A0W(i10);
        List<String> listA06 = A05.A06(dataString);
        for (int i11 = 0; i11 < listA06.size(); i11++) {
            List<String> listA062 = A06.A06(listA06.get(i11));
            if (listA062.size() == 3) {
                try {
                    long j10 = Long.parseLong(listA062.get(0));
                    long startTimeMs = Long.parseLong(listA062.get(1));
                    segments.add(new SlowMotionData.Segment(j10, startTimeMs, 1 << (Integer.parseInt(listA062.get(2)) - 1)));
                } catch (NumberFormatException e10) {
                    throw C17652i.A01(null, e10);
                }
            } else {
                throw C17652i.A01(null, null);
            }
        }
        return new SlowMotionData(segments);
    }

    private void A04(InterfaceC3286lN interfaceC3286lN, C2124Gt c2124Gt) throws IOException {
        C4J c4j = new C4J(8);
        interfaceC3286lN.readFully(c4j.A0l(), 0, 8);
        this.A01 = c4j.A0E() + 8;
        if (c4j.A0C() != 1397048916) {
            c2124Gt.A00 = 0L;
        } else {
            c2124Gt.A00 = interfaceC3286lN.A8f() - ((long) (this.A01 - 12));
            this.A00 = 2;
        }
    }

    private void A05(InterfaceC3286lN interfaceC3286lN, C2124Gt c2124Gt) throws IOException {
        long jA8G = interfaceC3286lN.A8G();
        int i10 = (this.A01 - 12) - 8;
        C4J c4j = new C4J(i10);
        interfaceC3286lN.readFully(c4j.A0l(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            c4j.A0g(2);
            int i12 = c4j.A0a();
            switch (i12) {
                case 2192:
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    long streamLength = this.A01;
                    long j10 = jA8G - streamLength;
                    long streamLength2 = c4j.A0E();
                    int size = c4j.A0E();
                    this.A02.add(new C2162Ig(i12, j10 - streamLength2, size));
                    break;
                default:
                    c4j.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            c2124Gt.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        c2124Gt.A00 = streamLength3;
    }

    public final int A07(InterfaceC3286lN interfaceC3286lN, C2124Gt c2124Gt, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long j10 = 0;
        switch (this.A00) {
            case 0:
                long jA8G = interfaceC3286lN.A8G();
                if (jA8G != -1 && jA8G >= 8) {
                    j10 = jA8G - 8;
                }
                c2124Gt.A00 = j10;
                this.A00 = 1;
                return 1;
            case 1:
                A04(interfaceC3286lN, c2124Gt);
                return 1;
            case 2:
                A05(interfaceC3286lN, c2124Gt);
                return 1;
            case 3:
                A06(interfaceC3286lN, slowMotionMetadataEntries);
                c2124Gt.A00 = 0L;
                return 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
