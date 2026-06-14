package com.monetization.ads.exo.source.dash;

import java.io.IOException;
import yads.da2;
import yads.je1;
import yads.ke1;
import yads.me1;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements je1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f58995b;

    public g(DashMediaSource dashMediaSource) {
        this.f58995b = dashMediaSource;
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11, boolean z10) {
        this.f58995b.onLoadCanceled((da2) me1Var, j10, j11);
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11) {
        this.f58995b.onUtcTimestampLoadCompleted((da2) me1Var, j10, j11);
    }

    @Override // yads.je1
    public final ke1 a(me1 me1Var, long j10, long j11, IOException iOException, int i10) {
        return this.f58995b.onUtcTimestampLoadError((da2) me1Var, j10, j11, iOException);
    }
}
