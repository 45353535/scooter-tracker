package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22159c;

    public g(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f22159c = nVar;
        nVar.e(12);
        this.f22157a = nVar.m();
        this.f22158b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f22158b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f22157a;
        return i10 == 0 ? this.f22159c.m() : i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return this.f22157a != 0;
    }
}
