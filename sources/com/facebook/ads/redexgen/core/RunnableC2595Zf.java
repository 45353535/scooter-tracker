package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2595Zf implements Runnable {
    public final /* synthetic */ C2596Zg A00;
    public final /* synthetic */ InterfaceC2597Zh A01;

    public RunnableC2595Zf(C2596Zg c2596Zg, InterfaceC2597Zh interfaceC2597Zh) {
        this.A00 = c2596Zg;
        this.A01 = interfaceC2597Zh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
