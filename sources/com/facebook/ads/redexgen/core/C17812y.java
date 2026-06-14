package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C17812y extends DG {
    public final /* synthetic */ D4 A00;

    public C17812y(D4 d42) {
        this.A00 = d42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2443Tf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DH dh2) {
        if (this.A00.A01 == null || dh2.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C2849dp(this));
    }
}
