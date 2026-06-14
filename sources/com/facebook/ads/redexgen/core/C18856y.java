package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C18856y extends AbstractC3066hQ {
    public C18856y(C2820dL c2820dL, NT nt) {
        super(c2820dL, nt);
    }

    private C3064hO A00(Runnable runnable) {
        return new C3064hO(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3066hQ
    public final AbstractC2273Mo A0I() {
        C3121iS successfullyLoadedAdapter = (C3121iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3066hQ
    public final void A0P() {
        C3121iS interstitialAdapter = (C3121iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3066hQ
    public final void A0R(MP mp, TE te2, TC tc2, NU nu) {
        C3121iS c3121iS = (C3121iS) mp;
        C3065hP c3065hP = new C3065hP(this, nu, c3121iS);
        A0H().postDelayed(c3065hP, te2.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c3121iS.A0A(this.A0B, A00(c3065hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
