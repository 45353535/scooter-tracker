package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NS {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.facebook.ads.redexgen.core.C2820dL r12, com.facebook.ads.redexgen.core.SF r13, com.facebook.ads.redexgen.core.AnonymousClass73 r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.NS.A02(com.facebook.ads.redexgen.X.dL, com.facebook.ads.redexgen.X.SF, com.facebook.ads.redexgen.X.73):void");
    }

    public static void A03(C2820dL c2820dL, SF sf2, AnonymousClass73 anonymousClass73) {
        int i10 = 0;
        for (C2274Mp c2274Mp : anonymousClass73.A27()) {
            SD sd2 = new SD(c2274Mp.A0H().A08(), NN.A00(c2274Mp.A0H()), NN.A01(c2274Mp.A0H()), anonymousClass73.A17(), A00(5, 12, 118));
            if (i10 == 0) {
                sf2.A0c(sd2);
            } else {
                sf2.A0d(sd2);
            }
            Iterator<String> it = c2274Mp.A0K().A02().iterator();
            while (it.hasNext()) {
                sf2.A0d(new SD(it.next(), -1, -1, anonymousClass73.A17(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(c2274Mp.A0H().A09())) {
                new SB(c2274Mp.A0H().A09(), anonymousClass73.A17(), A00(5, 12, 118), c2274Mp.A0H().A06()).A04 = false;
            }
            i10++;
        }
    }
}
