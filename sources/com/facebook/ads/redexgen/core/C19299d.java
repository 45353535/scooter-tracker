package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C19299d implements InterfaceC3432nl {
    public static byte[] A00;
    public static final InterfaceC18314w A01;
    public static final C19299d A02;

    public static /* synthetic */ C19299d A00() {
        return new C19299d();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.ETB, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, Ascii.DC4, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3432nl
    public final /* synthetic */ Map A8l() {
        return AbstractC18304v.A00(this);
    }

    static {
        A02();
        A02 = new C19299d();
        A01 = new InterfaceC18314w() { // from class: com.facebook.ads.redexgen.X.nb
            @Override // com.facebook.ads.redexgen.core.InterfaceC18314w
            public final InterfaceC3432nl A5A() {
                return C19299d.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3432nl
    public final void A3v(C5H c5h) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3432nl
    public final Uri A9H() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3432nl
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3432nl
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
