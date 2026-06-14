package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E9 {
    public static byte[] A03;
    public final int A00;
    public final C3463oH A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, Ascii.NAK, Ascii.SYN, Ascii.EM, Ascii.RS, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, 3, 43, 46, 50, 55, -34, 50, 48, Ascii.US, 33, 41, 49, -34, Ascii.US, 48, 35, -34, 44, 45, 50, -34, Ascii.US, 42, 42, 45, 53, 35, 34};
    }

    public E9(C3463oH c3463oH, int... iArr) {
        this(c3463oH, iArr, 0);
    }

    public E9(C3463oH c3463oH, int[] iArr, int i10) {
        if (iArr.length == 0) {
            AnonymousClass44.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c3463oH;
        this.A02 = iArr;
        this.A00 = i10;
    }
}
