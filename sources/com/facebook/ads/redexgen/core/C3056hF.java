package com.facebook.ads.redexgen.core;

import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3056hF extends AbstractRunnableC2494Vg {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC3054hD A01;

    public C3056hF(AbstractC3054hD abstractC3054hD, Message message) {
        this.A01 = abstractC3054hD;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2494Vg
    public final void A01() {
        this.A01.A05.A9b(this.A00);
    }
}
