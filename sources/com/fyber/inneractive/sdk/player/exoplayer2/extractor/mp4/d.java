package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22152i;

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z10) {
        this.f22150g = nVar;
        this.f22149f = nVar2;
        this.f22148e = z10;
        nVar2.e(12);
        this.f22144a = nVar2.m();
        nVar.e(12);
        this.f22152i = nVar.m();
        if (!(nVar.b() == 1)) {
            throw new IllegalStateException("first_chunk must be 1");
        }
        this.f22145b = -1;
    }

    public final boolean a() {
        int i10 = this.f22145b + 1;
        this.f22145b = i10;
        if (i10 == this.f22144a) {
            return false;
        }
        this.f22147d = this.f22148e ? this.f22149f.n() : this.f22149f.k();
        if (this.f22145b == this.f22151h) {
            this.f22146c = this.f22150g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f22150g;
            nVar.e(nVar.f23135b + 4);
            int i11 = this.f22152i - 1;
            this.f22152i = i11;
            this.f22151h = i11 > 0 ? this.f22150g.m() - 1 : -1;
        }
        return true;
    }
}
