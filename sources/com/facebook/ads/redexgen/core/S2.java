package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S2 extends Thread {
    public final long A00;

    public S2(long j10) {
        this.A00 = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    Thread.sleep(this.A00);
                } catch (InterruptedException unused) {
                }
                S0.A01();
            } catch (Throwable th2) {
                AbstractC2499Vl.A00(th2, this);
                return;
            }
        }
    }
}
