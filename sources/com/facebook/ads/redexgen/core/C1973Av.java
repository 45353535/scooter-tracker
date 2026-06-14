package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1973Av extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, Ascii.ESC, Ascii.RS, Ascii.ETB, Ascii.SYN, 82, 6, Ascii.GS, 82, 3, 7, Ascii.ETB, 0, Ascii.VT, 82, 7, Ascii.FS, Ascii.SYN, Ascii.ETB, 0, Ascii.RS, Ascii.VT, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, Ascii.US, Ascii.ETB, Ascii.SYN, Ascii.ESC, 19, 82, 17, Ascii.GS, Ascii.SYN, Ascii.ETB, 17, 1};
    }

    public C1973Av(Throwable th2) {
        super(A00(0, 39, 35), th2);
    }
}
