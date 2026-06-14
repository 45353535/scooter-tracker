package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0K extends C17140h {
    public C18535s A00;
    public List<C2787cn> A01;

    public C0K(C2820dL c2820dL) {
        super(c2820dL);
        this.A00 = new C18535s(this, 1, null, null, null);
    }

    public final void A20(C2893eX c2893eX) {
        if (this.A00 != null) {
            this.A00.A0c(c2893eX);
        }
    }

    public C18535s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
