package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2974fr extends AbstractRunnableC2494Vg {
    public final /* synthetic */ C2973fq A00;

    public C2974fr(C2973fq c2973fq) {
        this.A00 = c2973fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2494Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
