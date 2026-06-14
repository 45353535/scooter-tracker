package vb;

import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f106057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106058e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.j0 f106054a = new q9.j0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f106059f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106060g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106061h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106055b = new q9.d0();

    a0() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(oa.s sVar) {
        this.f106055b.T(o0.f98842f);
        this.f106056c = true;
        sVar.resetPeekPosition();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(oa.s sVar, oa.l0 l0Var) {
        int iMin = (int) Math.min(20000L, sVar.getLength());
        long j10 = 0;
        if (sVar.getPosition() != j10) {
            l0Var.f96583a = j10;
            return 1;
        }
        this.f106055b.S(iMin);
        sVar.resetPeekPosition();
        sVar.peekFully(this.f106055b.e(), 0, iMin);
        this.f106059f = i(this.f106055b);
        this.f106057d = true;
        return 0;
    }

    private long i(q9.d0 d0Var) {
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG - 3; iF++) {
            if (f(d0Var.e(), iF) == 442) {
                d0Var.W(iF + 4);
                long jL = l(d0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(oa.s sVar, oa.l0 l0Var) {
        long length = sVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (sVar.getPosition() != j10) {
            l0Var.f96583a = j10;
            return 1;
        }
        this.f106055b.S(iMin);
        sVar.resetPeekPosition();
        sVar.peekFully(this.f106055b.e(), 0, iMin);
        this.f106060g = k(this.f106055b);
        this.f106058e = true;
        return 0;
    }

    private long k(q9.d0 d0Var) {
        int iF = d0Var.f();
        for (int iG = d0Var.g() - 4; iG >= iF; iG--) {
            if (f(d0Var.e(), iG) == 442) {
                d0Var.W(iG + 4);
                long jL = l(d0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(q9.d0 d0Var) {
        int iF = d0Var.f();
        if (d0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d0Var.l(bArr, 0, 9);
        d0Var.W(iF);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f106061h;
    }

    public q9.j0 d() {
        return this.f106054a;
    }

    public boolean e() {
        return this.f106056c;
    }

    public int g(oa.s sVar, oa.l0 l0Var) {
        if (!this.f106058e) {
            return j(sVar, l0Var);
        }
        if (this.f106060g == -9223372036854775807L) {
            return b(sVar);
        }
        if (!this.f106057d) {
            return h(sVar, l0Var);
        }
        long j10 = this.f106059f;
        if (j10 == -9223372036854775807L) {
            return b(sVar);
        }
        this.f106061h = this.f106054a.c(this.f106060g) - this.f106054a.b(j10);
        return b(sVar);
    }
}
