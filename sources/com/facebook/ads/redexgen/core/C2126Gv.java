package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2126Gv {
    public static byte[] A02;
    public static String[] A03 = {"", "4aEfCmC", "2kTu4wHTiMw5FCYmIpZKoA3S7RkYvI9O", "", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "MqF3b2p", "5cCqnzmPstBPsSiWHPZbbxeHAyWMz3nO", "kSg1dz9TqTWY2puBAJqsQN0JUmM78NMM"};
    public final C2128Gx A00;
    public final C2128Gx A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.ESC, Ascii.ETB, 123, 7};
    }

    static {
        A01();
    }

    public C2126Gv(C2128Gx c2128Gx) {
        this(c2128Gx, c2128Gx);
    }

    public C2126Gv(C2128Gx c2128Gx, C2128Gx c2128Gx2) {
        this.A00 = (C2128Gx) C3M.A01(c2128Gx);
        this.A01 = (C2128Gx) C3M.A01(c2128Gx2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2126Gv c2126Gv = (C2126Gv) obj;
        if (A03[7].charAt(24) != 'U') {
            throw new RuntimeException();
        }
        A03[4] = "g";
        return this.A00.equals(c2126Gv.A00) && this.A01.equals(c2126Gv.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String strA00;
        StringBuilder sbAppend = new StringBuilder().append(A00(2, 1, 114)).append(this.A00);
        if (!this.A00.equals(this.A01)) {
            strA00 = A00(0, 2, 101) + this.A01;
        } else {
            if (A03[0].length() != 0) {
                throw new RuntimeException();
            }
            A03[0] = "";
            strA00 = A00(0, 0, 76);
        }
        return sbAppend.append(strA00).append(A00(3, 1, 8)).toString();
    }
}
