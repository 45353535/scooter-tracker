package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f22851a;

    public i(p pVar) {
        this.f22851a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f22851a;
        if (pVar.G || pVar.f22890s || pVar.f22888q == null || !pVar.f22889r) {
            return;
        }
        int size = pVar.f22886o.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f22886o.valueAt(i10)).e() == null) {
                return;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = pVar.f22882k;
        synchronized (eVar) {
            eVar.f23107a = false;
        }
        y[] yVarArr = new y[size];
        pVar.f22897z = new boolean[size];
        pVar.f22896y = new boolean[size];
        pVar.f22895x = pVar.f22888q.c();
        for (int i11 = 0; i11 < size; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f22886o.valueAt(i11)).e();
            yVarArr[i11] = new y(oVarE);
            String str = oVarE.f22793f;
            boolean z10 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) || "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str));
            pVar.f22897z[i11] = z10;
            pVar.A = z10 | pVar.A;
        }
        pVar.f22894w = new z(yVarArr);
        pVar.f22890s = true;
        t tVar = pVar.f22877f;
        long j10 = pVar.f22895x;
        tVar.a(new x(j10, j10, 0L, 0L, pVar.f22888q.a(), false), null);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f22887p).f22696f.obtainMessage(8, pVar).sendToTarget();
    }
}
