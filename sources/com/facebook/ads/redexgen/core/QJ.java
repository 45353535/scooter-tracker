package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final QJ A00(AbstractC2367Qg abstractC2367Qg, int i10) {
        View view = abstractC2367Qg.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final QJ A01(AbstractC2367Qg abstractC2367Qg) {
        return A00(abstractC2367Qg, 0);
    }
}
