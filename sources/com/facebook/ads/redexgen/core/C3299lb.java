package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3299lb implements InterfaceExecutorC2078Ez {
    public final /* synthetic */ C3X A00;
    public final /* synthetic */ Executor A01;

    public C3299lb(Executor executor, C3X c3x) {
        this.A01 = executor;
        this.A00 = c3x;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceExecutorC2078Ez
    public final void AGr() {
        this.A00.A31(this.A01);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
