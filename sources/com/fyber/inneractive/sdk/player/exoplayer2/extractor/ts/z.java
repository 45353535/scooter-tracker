package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f22625a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f22626b;

    public z(b0 b0Var) {
        this.f22626b = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (nVar.j() != 0) {
            return;
        }
        nVar.e(nVar.f23135b + 7);
        int i10 = (nVar.f23136c - nVar.f23135b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f22625a;
            nVar.a(mVar.f23130a, 0, 4);
            mVar.b(0);
            int iA = this.f22625a.a(16);
            this.f22625a.c(3);
            if (iA == 0) {
                this.f22625a.c(13);
            } else {
                int iA2 = this.f22625a.a(13);
                b0 b0Var = this.f22626b;
                b0Var.f22414f.put(iA2, new w(new a0(b0Var, iA2)));
                this.f22626b.f22417i++;
            }
        }
        b0 b0Var2 = this.f22626b;
        if (b0Var2.f22409a != 2) {
            b0Var2.f22414f.remove(0);
        }
    }
}
