package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2099Fu extends AbstractRunnableC2507Vt {
    public final /* synthetic */ C4H A00;

    public C2099Fu(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        if (this.A00.A00 != null) {
            this.A00.A00.A1E();
        }
        this.A00.A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A08.A07();
        this.A00.A06.set(true);
    }
}
