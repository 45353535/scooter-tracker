package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2989g7 implements QI {
    public final /* synthetic */ C18676g A00;

    public C2989g7(C18676g c18676g) {
        this.A00 = c18676g;
    }

    @Override // com.facebook.ads.redexgen.core.QI
    public final void ACK(AbstractC2367Qg abstractC2367Qg) {
        abstractC2367Qg.A0d(true);
        if (abstractC2367Qg.A06 != null && abstractC2367Qg.A07 == null) {
            abstractC2367Qg.A06 = null;
        }
        abstractC2367Qg.A07 = null;
        if (!abstractC2367Qg.A0G() && !this.A00.A1x(abstractC2367Qg.A0H) && abstractC2367Qg.A0i()) {
            this.A00.removeDetachedView(abstractC2367Qg.A0H, false);
        }
    }
}
