package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2955fY extends AbstractRunnableC2507Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C2363Qc A02;

    public C2955fY(RS rs, C2363Qc c2363Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c2363Qc;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
