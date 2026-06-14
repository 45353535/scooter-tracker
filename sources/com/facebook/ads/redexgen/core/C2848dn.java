package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2848dn extends AbstractRunnableC2507Vt {
    public static byte[] A02;
    public final /* synthetic */ C2847dm A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.SO, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C2848dn(C2847dm c2847dm, AtomicBoolean atomicBoolean) {
        this.A00 = c2847dm;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(UZ.A0H);
                SI.A02(this.A00.A02.A04, this.A00.A01, SI.A00, A00(11, 14, 1), this.A00.A02.A00);
                this.A00.A02.A0U();
                this.A00.A00.ACq();
                return;
            }
            this.A00.A02.A0I(UZ.A0G);
            SI.A02(this.A00.A02.A04, this.A00.A01, SI.A04, A00(0, 11, 125), this.A00.A02.A00);
            this.A00.A02.A0V();
            this.A00.A00.ACh();
        }
    }
}
