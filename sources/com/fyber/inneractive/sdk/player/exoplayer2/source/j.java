package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f22852a;

    public j(p pVar) {
        this.f22852a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f22852a;
        if (pVar.G) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f22887p;
        lVar.getClass();
        lVar.f22696f.obtainMessage(9, pVar).sendToTarget();
    }
}
