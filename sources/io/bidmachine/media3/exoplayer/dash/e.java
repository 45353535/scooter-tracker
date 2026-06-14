package io.bidmachine.media3.exoplayer.dash;

import ga.c1;
import q9.o0;
import u9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class e implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f80773b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f80775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f80776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y9.f f80777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f80778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f80779h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final za.c f80774c = new za.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f80780i = -9223372036854775807L;

    public e(y9.f fVar, io.bidmachine.media3.common.a aVar, boolean z10) {
        this.f80773b = aVar;
        this.f80777f = fVar;
        this.f80775d = fVar.f108437b;
        c(fVar, z10);
    }

    public String a() {
        return this.f80777f.a();
    }

    public void b(long j10) {
        int iD = o0.d(this.f80775d, j10, true, false);
        this.f80779h = iD;
        if (!this.f80776e || iD != this.f80775d.length) {
            j10 = -9223372036854775807L;
        }
        this.f80780i = j10;
    }

    public void c(y9.f fVar, boolean z10) {
        int i10 = this.f80779h;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f80775d[i10 - 1];
        this.f80776e = z10;
        this.f80777f = fVar;
        long[] jArr = fVar.f108437b;
        this.f80775d = jArr;
        long j11 = this.f80780i;
        if (j11 != -9223372036854775807L) {
            b(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f80779h = o0.d(jArr, j10, false, false);
        }
    }

    @Override // ga.c1
    public int d(d0 d0Var, t9.f fVar, int i10) {
        int i11 = this.f80779h;
        boolean z10 = i11 == this.f80775d.length;
        if (z10 && !this.f80776e) {
            fVar.k(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f80778g) {
            d0Var.f105308b = this.f80773b;
            this.f80778g = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f80779h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f80774c.a(this.f80777f.f108436a[i11]);
            fVar.m(bArrA.length);
            fVar.f104988e.put(bArrA);
        }
        fVar.f104990g = this.f80775d[i11];
        fVar.k(1);
        return -4;
    }

    @Override // ga.c1
    public boolean isReady() {
        return true;
    }

    @Override // ga.c1
    public void maybeThrowError() {
    }

    @Override // ga.c1
    public int skipData(long j10) {
        int iMax = Math.max(this.f80779h, o0.d(this.f80775d, j10, true, false));
        int i10 = iMax - this.f80779h;
        this.f80779h = iMax;
        return i10;
    }
}
