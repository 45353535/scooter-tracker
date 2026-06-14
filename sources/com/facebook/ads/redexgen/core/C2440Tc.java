package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2440Tc implements InterfaceC2473Uk {
    public WeakReference<C2363Qc> A00;

    public C2440Tc(C2363Qc c2363Qc) {
        this.A00 = new WeakReference<>(c2363Qc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2473Uk
    public final void AEW(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
