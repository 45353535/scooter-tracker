package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2990g8 implements InterfaceC2343Pi {
    public static byte[] A01;
    public final /* synthetic */ C18676g A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C2990g8(C18676g c18676g) {
        this.A00 = c18676g;
    }

    private final void A02(C2344Pj c2344Pj) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2343Pi
    public final void AD2(C2344Pj c2344Pj) {
        A02(c2344Pj);
        throw null;
    }
}
