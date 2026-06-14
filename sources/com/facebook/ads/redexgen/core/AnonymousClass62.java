package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass62 extends DV {
    public final /* synthetic */ C2259Lz A00;

    public AnonymousClass62(C2259Lz c2259Lz) {
        this.A00 = c2259Lz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2443Tf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw) {
        new Handler(Looper.getMainLooper()).post(new Y4(this));
    }
}
