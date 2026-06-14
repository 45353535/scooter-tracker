package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2541Xd {
    public static C2541Xd A02;
    public final C2321Om A00;
    public final C2543Xf A01;

    public C2541Xd(C2820dL c2820dL, Executor executor, TE te2) {
        this.A01 = new C2543Xf(c2820dL);
        this.A00 = new C2321Om(executor, te2, c2820dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2820dL c2820dL, Executor executor, TE te2) {
        if (!U7.A1X(c2820dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C2541Xd(c2820dL, executor, te2);
            A02.A00();
        } else {
            A02.A02(te2);
        }
    }

    private void A02(TE te2) {
        this.A00.A07(te2);
    }
}
