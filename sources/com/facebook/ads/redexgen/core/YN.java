package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YN implements InterfaceC2897eb {
    public static byte[] A01;
    public final C2794cu A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, Ascii.DEL, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, Ascii.FF, 10, Ascii.FS, Ascii.VT, 84, Ascii.CAN, Ascii.RS, Ascii.FS, Ascii.ETB, 13};
    }

    public YN(C2794cu c2794cu) {
        this.A00 = c2794cu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2897eb
    public final Map<String, String> A6Y(boolean z10) {
        HashMap map = new HashMap();
        if (!AbstractC2404Rr.A00().A04()) {
            map.put(A00(0, 23, 64), TY.A00().A01(this.A00, true).A04());
        }
        map.put(A00(23, 10, 51), AbstractC2439Tb.A06(new T6(this.A00), this.A00, z10));
        return map;
    }
}
