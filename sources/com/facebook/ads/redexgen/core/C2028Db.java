package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2028Db implements InterfaceC2834dZ {
    public final View A00;
    public final C2820dL A01;

    public C2028Db(C2820dL c2820dL, View view) {
        this.A01 = c2820dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2834dZ
    public final double A9N() {
        C2894eY result = C2893eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
