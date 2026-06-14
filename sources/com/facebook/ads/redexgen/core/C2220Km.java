package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2220Km {
    public final int A00;
    public final long A01;

    public C2220Km(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C2220Km A00(InterfaceC3286lN interfaceC3286lN, C4J c4j) throws IOException {
        interfaceC3286lN.AG9(c4j.A0l(), 0, 8);
        c4j.A0f(0);
        int iA0C = c4j.A0C();
        long size = c4j.A0O();
        return new C2220Km(iA0C, size);
    }
}
