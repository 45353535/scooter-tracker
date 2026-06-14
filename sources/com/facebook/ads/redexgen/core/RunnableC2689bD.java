package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2689bD implements Runnable {
    public final /* synthetic */ JR A00;

    public RunnableC2689bD(JR jr) {
        this.A00 = jr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 != null && this.A00.A03.getVisibility() == 0) {
                this.A00.A0S(8);
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
