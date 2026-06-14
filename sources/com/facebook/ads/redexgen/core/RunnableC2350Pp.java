package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2350Pp implements Runnable {
    public final /* synthetic */ C18706j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC2350Pp(C18706j c18706j, ArrayList arrayList) {
        this.A00 = c18706j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (AbstractC2367Qg holder : this.A01) {
            this.A00.A0d(holder);
        }
        this.A01.clear();
        this.A00.A01.remove(this.A01);
    }
}
