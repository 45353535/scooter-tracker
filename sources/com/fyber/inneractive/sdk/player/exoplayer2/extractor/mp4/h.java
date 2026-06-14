package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22164e;

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f22160a = nVar;
        nVar.e(12);
        this.f22162c = nVar.m() & 255;
        this.f22161b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f22161b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f22162c;
        if (i10 == 8) {
            return this.f22160a.j();
        }
        if (i10 == 16) {
            return this.f22160a.o();
        }
        int i11 = this.f22163d;
        this.f22163d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f22164e & 15;
        }
        int iJ = this.f22160a.j();
        this.f22164e = iJ;
        return (iJ & 240) >> 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }
}
