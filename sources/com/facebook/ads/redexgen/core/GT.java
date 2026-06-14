package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GT {
    public static byte[] A03;
    public final GS A00;
    public final Constructor<? extends GX> A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{55, 0, 0, Ascii.GS, 0, 82, Ascii.ESC, Ascii.FS, 1, 6, 19, Ascii.FS, 6, Ascii.ESC, 19, 6, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, Ascii.ETB, 10, 6, Ascii.ETB, Ascii.FS, 1, Ascii.ESC, Ascii.GS, Ascii.FS, 37, Ascii.RS, Ascii.NAK, 8, 0, Ascii.NAK, 19, 4, Ascii.NAK, Ascii.DC4, 80, Ascii.NAK, 2, 2, Ascii.US, 2, 80, 19, 2, Ascii.NAK, 17, 4, Ascii.EM, Ascii.RS, Ascii.ETB, 80, Ascii.NAK, 8, 4, 2, 17, 19, 4, Ascii.US, 2};
    }

    public GT(GS gs) {
        this.A00 = gs;
    }

    private Constructor<? extends GX> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7J();
            } catch (ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (Exception e10) {
                throw new RuntimeException(A00(0, 29, 124), e10);
            }
        }
    }

    public final GX A03(Object... objArr) {
        Constructor<? extends GX> constructorA01 = A01();
        if (constructorA01 == null) {
            return null;
        }
        try {
            return constructorA01.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException(A00(29, 35, 126), e10);
        }
    }
}
