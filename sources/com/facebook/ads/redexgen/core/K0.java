package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC2604Zo {
    public final WeakReference<C18425h> A00;

    public K0(C18425h c18425h) {
        this.A00 = new WeakReference<>(c18425h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2604Zo
    public final void ADT(C2603Zn c2603Zn) {
        C18425h c18425h = this.A00.get();
        if (c18425h != null) {
            c18425h.A04 = c2603Zn.A00() != null;
            c18425h.A02();
        }
    }
}
