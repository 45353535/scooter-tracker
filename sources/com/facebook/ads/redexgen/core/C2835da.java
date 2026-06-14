package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2835da extends ContentObserver {
    public final C2029Dc A00;

    public C2835da(Handler handler, C2029Dc c2029Dc) {
        super(handler);
        this.A00 = c2029Dc;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0f();
    }
}
