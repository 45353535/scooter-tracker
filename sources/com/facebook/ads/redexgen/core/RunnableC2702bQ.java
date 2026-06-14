package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2702bQ implements Runnable {
    public final /* synthetic */ C2174Is A00;

    public RunnableC2702bQ(C2174Is c2174Is) {
        this.A00 = c2174Is;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            this.A00.A0c.A0E().AFE(true);
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
