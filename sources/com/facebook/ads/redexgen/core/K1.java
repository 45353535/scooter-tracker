package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC2507Vt {
    public final /* synthetic */ AbstractC2625aB A00;

    public K1(AbstractC2625aB abstractC2625aB) {
        this.A00 = abstractC2625aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
