package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TY {
    public static TY A00 = new TY();

    public static TY A00() {
        return A00;
    }

    public final C2515Wb A01(SQ sq, boolean z10) {
        return new C2515Wb(sq, z10, new S5());
    }

    public final Map<String, String> A02(SQ sq) {
        try {
            return A01(sq, false).A06();
        } catch (Throwable th2) {
            sq.A08().A4A(th2);
            return TQ.A01(sq);
        }
    }
}
