package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F3 extends AbstractC2892eW {
    public final /* synthetic */ C17993q A00;

    public F3(C17993q c17993q) {
        this.A00 = c17993q;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2892eW
    public final void A03() {
        if (!this.A00.A0E.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A0E);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((NI) ((NI) this.A00)).A0C.AB5(this.A00.A0A, new C2605Zp().A03(this.A00.A09).A02(this.A00.A0E).A04(((NI) ((NI) this.A00)).A0A.A0u()).A05());
                N3.A07(((NI) ((NI) this.A00)).A0A.A21(), this.A00.A0D);
                this.A00.A0D.A0F().A3D();
                AbstractC2307Nw.A02(this.A00.A03.A0t(), X0.A00(((NI) ((NI) this.A00)).A0A.A0v()));
            }
        }
    }
}
