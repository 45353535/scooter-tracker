package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C18013s extends DV {
    public final /* synthetic */ C18003r A00;

    public C18013s(C18003r c18003r) {
        this.A00 = c18003r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2443Tf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2776cc(this));
    }
}
