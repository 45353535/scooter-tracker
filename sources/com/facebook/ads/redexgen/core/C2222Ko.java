package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2222Ko extends AbstractRunnableC2507Vt {
    public final WeakReference<C2893eX> A00;

    public C2222Ko(C2893eX c2893eX) {
        this.A00 = new WeakReference<>(c2893eX);
    }

    public C2222Ko(WeakReference<C2893eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        C2893eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
