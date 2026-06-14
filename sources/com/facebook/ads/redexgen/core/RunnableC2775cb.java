package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2775cb implements Runnable {
    public final /* synthetic */ C18003r A00;

    public RunnableC2775cb(C18003r c18003r) {
        this.A00 = c18003r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
