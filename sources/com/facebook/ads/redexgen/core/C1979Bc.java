package com.facebook.ads.redexgen.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1979Bc implements InterfaceC3002gK {
    public static final C1979Bc A00 = new C1979Bc();

    public static C1979Bc A00() {
        return A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3002gK
    public final long AC6() {
        return SystemClock.elapsedRealtime();
    }
}
