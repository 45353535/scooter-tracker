package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HJ extends AbstractRunnableC2507Vt {
    public static byte[] A02;
    public static String[] A03 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C18224n A00;
    public final /* synthetic */ C3Q A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{51, 4, Ascii.ETB, Ascii.ETB, Ascii.DC4, 3, Ascii.CAN, Ascii.US, Ascii.SYN, 81, Ascii.CAN, Ascii.US, Ascii.NAK, Ascii.DC4, Ascii.ETB, Ascii.CAN, Ascii.US, Ascii.CAN, 5, Ascii.DC4, Ascii.GS, 8};
    }

    static {
        A01();
    }

    public HJ(C18224n c18224n, C3Q c3q) {
        this.A00 = c18224n;
        this.A01 = c3q;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        if (this.A00.A0P.getState() == EnumC2890eU.A02) {
            int currentPositionInMillis = this.A00.A0P.getCurrentPositionInMillis();
            if (A03[2].length() != 8) {
                throw new RuntimeException();
            }
            A03[7] = "iv52OwD8pgB4ao6bV3eWAeQD9PjHFRbz";
            if (currentPositionInMillis == A00()) {
                this.A00.A0M.AFg(A00(0, 22, 57));
            }
        }
    }
}
