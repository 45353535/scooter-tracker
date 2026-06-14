package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22565a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22570f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f22567c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        int i10;
        if (this.f22567c && (i10 = this.f22569e) != 0 && this.f22570f == i10) {
            this.f22566b.a(this.f22568d, 1, i10, 0, null);
            this.f22567c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 4);
        this.f22566b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f22454e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f22567c = true;
            this.f22568d = j10;
            this.f22569e = 0;
            this.f22570f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (this.f22567c) {
            int i10 = nVar.f23136c - nVar.f23135b;
            int i11 = this.f22570f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(nVar.f23134a, nVar.f23135b, this.f22565a.f23134a, this.f22570f, iMin);
                if (this.f22570f + iMin == 10) {
                    this.f22565a.e(0);
                    if (73 == this.f22565a.j() && 68 == this.f22565a.j() && 51 == this.f22565a.j()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f22565a;
                        nVar2.e(nVar2.f23135b + 3);
                        this.f22569e = this.f22565a.i() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f22567c = false;
                        return;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f22569e - this.f22570f);
            this.f22566b.a(iMin2, nVar);
            this.f22570f += iMin2;
        }
    }
}
