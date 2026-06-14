package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2876eG implements Runnable {
    public final /* synthetic */ C2879eJ A00;

    public RunnableC2876eG(C2879eJ c2879eJ) {
        this.A00 = c2879eJ;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
