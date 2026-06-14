package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2960fd extends AbstractRunnableC2494Vg {
    public final /* synthetic */ C2957fa A00;
    public final /* synthetic */ V1 A01;

    public C2960fd(C2957fa c2957fa, V1 v12) {
        this.A00 = c2957fa;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2494Vg
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(WT.A00(this.A01));
        }
    }
}
