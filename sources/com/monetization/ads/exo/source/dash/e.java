package com.monetization.ads.exo.source.dash;

import java.io.IOException;
import yads.da2;
import yads.je1;
import yads.ke1;
import yads.me1;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements je1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f58993b;

    public e(DashMediaSource dashMediaSource) {
        this.f58993b = dashMediaSource;
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11, boolean z10) {
        this.f58993b.onLoadCanceled((da2) me1Var, j10, j11);
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11) {
        this.f58993b.onManifestLoadCompleted((da2) me1Var, j10, j11);
    }

    @Override // yads.je1
    public final ke1 a(me1 me1Var, long j10, long j11, IOException iOException, int i10) {
        return this.f58993b.onManifestLoadError((da2) me1Var, j10, j11, iOException, i10);
    }
}
