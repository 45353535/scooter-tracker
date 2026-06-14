package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum WY {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{99, 100, 99, 126, 99, 107, 102, 99, 112, 111, 110, Ascii.DC2, Ascii.NAK, Ascii.DC2, Ascii.SI, Ascii.DC2, Ascii.SUB, Ascii.ETB, Ascii.DC2, 1, Ascii.DC2, Ascii.NAK, Ascii.FS, Ascii.CAN, Ascii.EM, 2, 9, Ascii.US, Ascii.CAN, Ascii.US, 2, Ascii.US, Ascii.ETB, Ascii.SUB, Ascii.US, Ascii.FF, 19, Ascii.DC2};
    }

    static {
        A01();
    }
}
