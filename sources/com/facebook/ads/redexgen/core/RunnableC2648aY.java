package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2648aY implements Runnable {
    public final /* synthetic */ C2205Jx A00;

    public RunnableC2648aY(C2205Jx c2205Jx) {
        this.A00 = c2205Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC2654ae) this.A00).A06.A0E() != null) {
                ((AbstractC2654ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
