package vb;

import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106171a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f106174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106176f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.j0 f106172b = new q9.j0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106177g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106178h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f106179i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.d0 f106173c = new q9.d0();

    i0(int i10) {
        this.f106171a = i10;
    }

    private int a(oa.s sVar) {
        this.f106173c.T(o0.f98842f);
        this.f106174d = true;
        sVar.resetPeekPosition();
        return 0;
    }

    private int f(oa.s sVar, oa.l0 l0Var, int i10) {
        int iMin = (int) Math.min(this.f106171a, sVar.getLength());
        long j10 = 0;
        if (sVar.getPosition() != j10) {
            l0Var.f96583a = j10;
            return 1;
        }
        this.f106173c.S(iMin);
        sVar.resetPeekPosition();
        sVar.peekFully(this.f106173c.e(), 0, iMin);
        this.f106177g = g(this.f106173c, i10);
        this.f106175e = true;
        return 0;
    }

    private long g(q9.d0 d0Var, int i10) {
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG; iF++) {
            if (d0Var.e()[iF] == 71) {
                long jC = m0.c(d0Var, iF, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(oa.s sVar, oa.l0 l0Var, int i10) {
        long length = sVar.getLength();
        int iMin = (int) Math.min(this.f106171a, length);
        long j10 = length - ((long) iMin);
        if (sVar.getPosition() != j10) {
            l0Var.f96583a = j10;
            return 1;
        }
        this.f106173c.S(iMin);
        sVar.resetPeekPosition();
        sVar.peekFully(this.f106173c.e(), 0, iMin);
        this.f106178h = i(this.f106173c, i10);
        this.f106176f = true;
        return 0;
    }

    private long i(q9.d0 d0Var, int i10) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (m0.b(d0Var.e(), iF, iG, i11)) {
                long jC = m0.c(d0Var, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f106179i;
    }

    public q9.j0 c() {
        return this.f106172b;
    }

    public boolean d() {
        return this.f106174d;
    }

    public int e(oa.s sVar, oa.l0 l0Var, int i10) {
        if (i10 <= 0) {
            return a(sVar);
        }
        if (!this.f106176f) {
            return h(sVar, l0Var, i10);
        }
        if (this.f106178h == -9223372036854775807L) {
            return a(sVar);
        }
        if (!this.f106175e) {
            return f(sVar, l0Var, i10);
        }
        long j10 = this.f106177g;
        if (j10 == -9223372036854775807L) {
            return a(sVar);
        }
        this.f106179i = this.f106172b.c(this.f106178h) - this.f106172b.b(j10);
        return a(sVar);
    }
}
