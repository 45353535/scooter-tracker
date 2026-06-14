package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2376Qp implements Runnable {
    public final /* synthetic */ C2377Qq A00;

    public RunnableC2376Qp(C2377Qq c2377Qq) {
        this.A00 = c2377Qq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
