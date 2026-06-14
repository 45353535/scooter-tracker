package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3080hg implements S7 {
    public final /* synthetic */ AbstractC3095hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C2820dL A03;
    public final /* synthetic */ boolean A04;

    public C3080hg(NH nh2, C2820dL c2820dL, boolean z10, AbstractC3095hy abstractC3095hy, NG ng2) {
        this.A02 = nh2;
        this.A03 = c2820dL;
        this.A04 = z10;
        this.A00 = abstractC3095hy;
        this.A01 = ng2;
    }

    private void A00(boolean z10) {
        if (z10) {
            if (U7.A1l(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC2732bu.A01(this.A03, this.A00, 1, new C3081hh(this)));
                return;
            } else {
                this.A01.ACG();
                return;
            }
        }
        this.A01.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00(true);
    }
}
