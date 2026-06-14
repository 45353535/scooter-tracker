package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2959fc extends AbstractRunnableC2494Vg {
    public final /* synthetic */ C2958fb A00;

    public C2959fc(C2958fb c2958fb) {
        this.A00 = c2958fb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2494Vg
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
