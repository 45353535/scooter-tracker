package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2814dF implements Runnable {
    public final /* synthetic */ C2058Ef A00;

    public RunnableC2814dF(C2058Ef c2058Ef) {
        this.A00 = c2058Ef;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() != 0) {
                this.A00.A05.scrollBy(this.A00.A01, 0);
                this.A00.A04.postDelayed(this, 16L);
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
