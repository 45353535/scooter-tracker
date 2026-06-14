package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ C18676g A00;

    public QA(C18676g c18676g) {
        this.A00 = c18676g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05 != null) {
            this.A00.A05.A0I();
        }
        this.A00.A0K = false;
    }
}
