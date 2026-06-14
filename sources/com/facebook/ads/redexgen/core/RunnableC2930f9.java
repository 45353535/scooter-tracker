package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2930f9 implements Runnable {
    public final /* synthetic */ C1998Bw A00;

    public RunnableC2930f9(C1998Bw c1998Bw) {
        this.A00 = c1998Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            C1998Bw.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
