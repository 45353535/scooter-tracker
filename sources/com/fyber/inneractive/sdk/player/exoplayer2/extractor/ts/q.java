package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f22572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22576f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22582l;

    public q(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.f22571a = nVar;
        nVar.f23134a[0] = -1;
        this.f22572b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
        this.f22573c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f22576f = 0;
        this.f22577g = 0;
        this.f22579i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22574d = e0Var.f22454e;
        e0Var.b();
        this.f22575e = jVar.a(e0Var.f22453d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f22582l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f23136c;
            int i11 = nVar.f23135b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f22576f;
            if (i13 == 0) {
                byte[] bArr = nVar.f23134a;
                while (true) {
                    if (i11 < i10) {
                        byte b10 = bArr[i11];
                        boolean z10 = (b10 & 255) == 255;
                        boolean z11 = this.f22579i && (b10 & 224) == 224;
                        this.f22579i = z10;
                        if (z11) {
                            nVar.e(i11 + 1);
                            this.f22579i = false;
                            this.f22571a.f23134a[1] = bArr[i11];
                            this.f22577g = 2;
                            this.f22576f = 1;
                            break;
                        }
                        i11++;
                    } else {
                        nVar.e(i10);
                        break;
                    }
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f22577g);
                nVar.a(this.f22571a.f23134a, this.f22577g, iMin);
                int i14 = this.f22577g + iMin;
                this.f22577g = i14;
                if (i14 >= 4) {
                    this.f22571a.e(0);
                    if (!com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f22571a.b(), this.f22572b)) {
                        this.f22577g = 0;
                        this.f22576f = 1;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f22572b;
                        this.f22581k = nVar2.f22305c;
                        if (!this.f22578h) {
                            long j10 = ((long) nVar2.f22309g) * 1000000;
                            int i15 = nVar2.f22306d;
                            this.f22580j = j10 / ((long) i15);
                            this.f22575e.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f22574d, nVar2.f22304b, -1, 4096, nVar2.f22307e, i15, null, null, this.f22573c));
                            this.f22578h = true;
                        }
                        this.f22571a.e(0);
                        this.f22575e.a(4, this.f22571a);
                        this.f22576f = 2;
                    }
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(i12, this.f22581k - this.f22577g);
                this.f22575e.a(iMin2, nVar);
                int i16 = this.f22577g + iMin2;
                this.f22577g = i16;
                int i17 = this.f22581k;
                if (i16 >= i17) {
                    this.f22575e.a(this.f22582l, 1, i17, 0, null);
                    this.f22582l += this.f22580j;
                    this.f22577g = 0;
                    this.f22576f = 0;
                }
            }
        }
    }
}
