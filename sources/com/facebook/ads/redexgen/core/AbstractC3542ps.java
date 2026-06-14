package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3542ps {
    public InterfaceC3543pt A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A02() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A03(InterfaceC3543pt interfaceC3543pt) {
        this.A00 = interfaceC3543pt;
    }
}
