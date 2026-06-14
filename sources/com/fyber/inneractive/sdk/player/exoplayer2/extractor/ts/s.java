package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f22589b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22590c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f22592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22599l;

    public s(h hVar) {
        this.f22588a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f22592e = vVar;
        this.f22588a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f22590c = 0;
        this.f22591d = 0;
        this.f22595h = false;
        this.f22588a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int i10;
        if (z10) {
            int i11 = this.f22590c;
            if (i11 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i11 == 3) {
                if (this.f22597j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f22597j + " more bytes");
                }
                this.f22588a.b();
            }
            this.f22590c = 1;
            this.f22591d = 0;
        }
        while (true) {
            int i12 = nVar.f23136c;
            int i13 = nVar.f23135b;
            int i14 = i12 - i13;
            if (i14 <= 0) {
                return;
            }
            int i15 = this.f22590c;
            if (i15 == 0) {
                nVar.e(i14 + i13);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (a(nVar, this.f22589b.f23130a, Math.min(10, this.f22596i)) && a(nVar, (byte[]) null, this.f22596i)) {
                        this.f22589b.b(0);
                        this.f22599l = -9223372036854775807L;
                        if (this.f22593f) {
                            this.f22589b.c(4);
                            long jA = ((long) this.f22589b.a(3)) << 30;
                            this.f22589b.c(1);
                            long jA2 = jA | ((long) (this.f22589b.a(15) << 15));
                            this.f22589b.c(1);
                            long jA3 = jA2 | ((long) this.f22589b.a(15));
                            this.f22589b.c(1);
                            if (!this.f22595h && this.f22594g) {
                                this.f22589b.c(4);
                                long jA4 = ((long) this.f22589b.a(3)) << 30;
                                this.f22589b.c(1);
                                long jA5 = jA4 | ((long) (this.f22589b.a(15) << 15));
                                this.f22589b.c(1);
                                long jA6 = jA5 | ((long) this.f22589b.a(15));
                                this.f22589b.c(1);
                                this.f22592e.b(jA6);
                                this.f22595h = true;
                            }
                            this.f22599l = this.f22592e.b(jA3);
                        }
                        this.f22588a.a(this.f22598k, this.f22599l);
                        this.f22590c = 3;
                        this.f22591d = 0;
                    }
                } else if (i15 == 3) {
                    int i16 = this.f22597j;
                    int i17 = i16 == -1 ? 0 : i14 - i16;
                    if (i17 > 0) {
                        i14 -= i17;
                        nVar.d(i13 + i14);
                    }
                    this.f22588a.a(nVar);
                    int i18 = this.f22597j;
                    if (i18 != -1) {
                        int i19 = i18 - i14;
                        this.f22597j = i19;
                        if (i19 == 0) {
                            this.f22588a.b();
                            this.f22590c = 1;
                            this.f22591d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.f22589b.f23130a, 9)) {
                this.f22589b.b(0);
                int iA = this.f22589b.a(24);
                if (iA != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + iA);
                    this.f22597j = -1;
                    i10 = 0;
                } else {
                    this.f22589b.c(8);
                    int iA2 = this.f22589b.a(16);
                    this.f22589b.c(5);
                    this.f22598k = this.f22589b.b();
                    this.f22589b.c(2);
                    this.f22593f = this.f22589b.b();
                    this.f22594g = this.f22589b.b();
                    this.f22589b.c(6);
                    int iA3 = this.f22589b.a(8);
                    this.f22596i = iA3;
                    if (iA2 == 0) {
                        this.f22597j = -1;
                    } else {
                        this.f22597j = (iA2 - 3) - iA3;
                    }
                    i10 = 2;
                }
                this.f22590c = i10;
                this.f22591d = 0;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i10) {
        int iMin = Math.min(nVar.f23136c - nVar.f23135b, i10 - this.f22591d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.f23135b + iMin);
        } else {
            nVar.a(bArr, this.f22591d, iMin);
        }
        int i11 = this.f22591d + iMin;
        this.f22591d = i11;
        return i11 == i10;
    }
}
