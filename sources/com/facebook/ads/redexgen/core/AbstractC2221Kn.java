package com.facebook.ads.redexgen.core;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2221Kn {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2219Kl A02(InterfaceC3286lN interfaceC3286lN) throws IOException {
        byte[] bArr;
        C4J c4j = new C4J(16);
        C2220Km c2220KmA03 = A03(1718449184, interfaceC3286lN, c4j);
        C3M.A08(c2220KmA03.A01 >= 16);
        interfaceC3286lN.AG9(c4j.A0l(), 0, 16);
        c4j.A0f(0);
        int iA0G = c4j.A0G();
        int iA0G2 = c4j.A0G();
        int iA0F = c4j.A0F();
        int iA0F2 = c4j.A0F();
        int iA0G3 = c4j.A0G();
        int iA0G4 = c4j.A0G();
        int i10 = ((int) c2220KmA03.A01) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC3286lN.AG9(bArr, 0, i10);
        } else {
            bArr = AbstractC18094a.A07;
        }
        interfaceC3286lN.AJJ((int) (interfaceC3286lN.A8a() - interfaceC3286lN.A8f()));
        return new C2219Kl(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, Ascii.DLE, 13, Ascii.SYN, 19, 88, 17, Ascii.VT, 88, Ascii.FF, Ascii.ETB, Ascii.ETB, 88, Ascii.DC4, Ascii.EM, 10, Ascii.US, Ascii.GS, 88, 80, 6, 74, Utf8.REPLACEMENT_BYTE, 58, 83, 81, 88, Ascii.FF, Ascii.ETB, 88, Ascii.VT, 19, 17, 8, 67, 88, 17, Ascii.FS, 66, 88, 45, 3, 10, Ascii.VT, Ascii.SYN, 13, 10, 3, 68, 17, 10, Ascii.SI, 10, Ascii.VT, 19, 10, 68, 51, 37, 50, 68, 7, Ascii.FF, 17, 10, Ascii.SI, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, Ascii.FS, 90, 83, 78, 81, Ascii.FS, 72, 69, 76, 89, 6, Ascii.FS, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C4J c4j = new C4J(8);
        C2220Km chunkHeader = C2220Km.A00(interfaceC3286lN, c4j);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC3286lN.AI1();
            return -1L;
        }
        interfaceC3286lN.A3z(8);
        c4j.A0f(0);
        interfaceC3286lN.AG9(c4j.A0l(), 0, 8);
        long sampleDataSize = c4j.A0N();
        interfaceC3286lN.AJJ(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC3286lN interfaceC3286lN) throws IOException {
        interfaceC3286lN.AI1();
        C2220Km c2220KmA03 = A03(1684108385, interfaceC3286lN, new C4J(8));
        interfaceC3286lN.AJJ(8);
        return Pair.create(Long.valueOf(interfaceC3286lN.A8f()), Long.valueOf(c2220KmA03.A01));
    }

    public static C2220Km A03(int i10, InterfaceC3286lN interfaceC3286lN, C4J c4j) throws IOException {
        C2220Km c2220KmA00 = C2220Km.A00(interfaceC3286lN, c4j);
        while (c2220KmA00.A00 != i10) {
            AnonymousClass44.A07(A04(91, 15, 125), A04(40, 28, 39) + c2220KmA00.A00);
            long j10 = c2220KmA00.A01 + 8;
            if (j10 <= SieveCacheKt.NodeLinkMask) {
                interfaceC3286lN.AJJ((int) j10);
                c2220KmA00 = C2220Km.A00(interfaceC3286lN, c4j);
            } else {
                throw C17652i.A00(A04(0, 40, 59) + c2220KmA00.A00);
            }
        }
        return c2220KmA00;
    }

    public static boolean A06(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C4J c4j = new C4J(8);
        C2220Km c2220KmA00 = C2220Km.A00(interfaceC3286lN, c4j);
        if (c2220KmA00.A00 != 1380533830) {
            int i10 = c2220KmA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i10 != 1380333108) {
                return false;
            }
        }
        interfaceC3286lN.AG9(c4j.A0l(), 0, 4);
        c4j.A0f(0);
        int iA0C = c4j.A0C();
        if (iA0C != 1463899717) {
            AnonymousClass44.A05(A04(91, 15, 125), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}
