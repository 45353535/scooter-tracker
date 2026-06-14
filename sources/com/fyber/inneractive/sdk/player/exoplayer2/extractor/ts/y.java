package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f22622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22624c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f22622a = vVar;
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 4);
        this.f22623b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f22454e, "application/x-scte35", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j10;
        long j11;
        long j12 = -9223372036854775807L;
        if (!this.f22624c) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.f22622a;
            long j13 = 0;
            if ((vVar.f23158a == Long.MAX_VALUE ? 0L : vVar.f23160c == -9223372036854775807L ? -9223372036854775807L : vVar.f23159b) == -9223372036854775807L) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f22623b;
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.f22622a;
            if (vVar2.f23158a == Long.MAX_VALUE) {
                j11 = j13;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f22624c = true;
            } else if (vVar2.f23160c == -9223372036854775807L) {
                j11 = -9223372036854775807L;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f22624c = true;
            } else {
                j13 = vVar2.f23159b;
                j11 = j13;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f22624c = true;
            }
        }
        int i10 = nVar.f23136c - nVar.f23135b;
        this.f22623b.a(i10, nVar);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f22623b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = this.f22622a;
        if (vVar3.f23160c != -9223372036854775807L) {
            j12 = vVar3.f23160c;
        } else {
            long j14 = vVar3.f23158a;
            if (j14 != Long.MAX_VALUE) {
                j10 = j14;
            }
            rVar2.a(j10, 1, i10, 0, null);
        }
        j10 = j12;
        rVar2.a(j10, 1, i10, 0, null);
    }
}
