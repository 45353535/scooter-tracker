package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8M extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C3497or A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, Ascii.SUB, 9, Ascii.SO, Ascii.DC4, -7, Ascii.ETB, 6, 8, Ascii.DLE, -59, Ascii.FS, Ascii.ETB, Ascii.SO, Ascii.EM, 10, -59, Ascii.VT, 6, Ascii.SO, 17, 10, 9, -33, -59};
    }

    public C8M(int i10, C3497or c3497or, boolean z10) {
        super(A00(0, 25, 91) + i10);
        this.A02 = z10;
        this.A00 = i10;
        this.A01 = c3497or;
    }
}
