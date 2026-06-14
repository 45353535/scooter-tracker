package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2609Zt {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, Ascii.SYN, 13, Ascii.DLE, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC2609Zt(int i10) {
        this.A00 = i10;
    }

    public static EnumC2609Zt A00(int i10) {
        for (EnumC2609Zt enumC2609Zt : values()) {
            if (enumC2609Zt.A00 == i10) {
                return enumC2609Zt;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
