package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2334Oz extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C2517Wd A00;

    public C2334Oz(C2517Wd c2517Wd) {
        this.A00 = c2517Wd;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
