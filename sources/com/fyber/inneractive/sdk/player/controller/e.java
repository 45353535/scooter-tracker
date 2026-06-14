package com.fyber.inneractive.sdk.player.controller;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f21495a;

    public e(f fVar) {
        this.f21495a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f21495a.f21500s;
        if (gVar != null) {
            gVar.a(gVar.a(), -9223372036854775807L);
            this.f21495a.f21500s.f22646d.f22696f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f21495a.f21500s;
            gVar2.f22646d.d();
            gVar2.f22645c.removeCallbacksAndMessages(null);
            this.f21495a.f21500s = null;
        }
    }
}
