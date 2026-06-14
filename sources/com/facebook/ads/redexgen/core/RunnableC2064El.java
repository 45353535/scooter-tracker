package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC2064El implements Runnable {
    public final InterfaceC2063Ek A00;

    public RunnableC2064El(InterfaceC2063Ek interfaceC2063Ek) {
        this.A00 = interfaceC2063Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
