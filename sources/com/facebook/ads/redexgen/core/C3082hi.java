package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3082hi implements InterfaceC2391Re {
    public final /* synthetic */ AbstractC3095hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C2820dL A03;
    public final /* synthetic */ boolean A04;

    public C3082hi(NH nh2, C2820dL c2820dL, boolean z10, AbstractC3095hy abstractC3095hy, NG ng2) {
        this.A02 = nh2;
        this.A03 = c2820dL;
        this.A04 = z10;
        this.A00 = abstractC3095hy;
        this.A01 = ng2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2391Re
    public final void ACM() {
        if (U7.A1l(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC2732bu.A01(this.A03, this.A00, 1, new C3083hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2391Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
