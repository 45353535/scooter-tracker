package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2348Pn implements Runnable {
    public final /* synthetic */ C18706j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC2348Pn(C18706j c18706j, ArrayList arrayList) {
        this.A00 = c18706j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C2357Pw c2357Pw : this.A01) {
            this.A00.A0e(c2357Pw.A04, c2357Pw.A00, c2357Pw.A01, c2357Pw.A02, c2357Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
