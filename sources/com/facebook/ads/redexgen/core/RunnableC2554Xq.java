package com.facebook.ads.redexgen.core;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2554Xq implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C6H A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, UnsignedBytes.MAX_POWER_OF_TWO, -125, -106, -121, -121, -122, -109, -122, -123, UnsignedBytes.MAX_POWER_OF_TWO, -124, -115, -118, -124, -116, UnsignedBytes.MAX_POWER_OF_TWO, -126, -121, -107, -122, -109, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -115, -126, -102};
    }

    public RunnableC2554Xq(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 20));
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
