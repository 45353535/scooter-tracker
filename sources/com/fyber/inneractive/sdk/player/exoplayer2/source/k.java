package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f22853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f22854b;

    public k(p pVar, n nVar) {
        this.f22854b = pVar;
        this.f22853a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f22853a;
        if (nVar.f22869c != null) {
            nVar.f22869c = null;
        }
        int size = this.f22854b.f22886o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22854b.f22886o.valueAt(i10)).b();
        }
    }
}
