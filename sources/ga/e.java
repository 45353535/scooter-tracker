package ga;

import ga.c0;
import ga.f;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f72232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0.a f72233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a[] f72234d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f72235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f72236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f72237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f.d f72238h;

    private final class a implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c1 f72239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f72240c;

        public a(c1 c1Var) {
            this.f72239b = c1Var;
        }

        public void a() {
            this.f72240c = false;
        }

        @Override // ga.c1
        public int d(u9.d0 d0Var, t9.f fVar, int i10) {
            if (e.this.h()) {
                return -3;
            }
            if (this.f72240c) {
                fVar.k(4);
                return -4;
            }
            long bufferedPositionUs = e.this.getBufferedPositionUs();
            int iD = this.f72239b.d(d0Var, fVar, i10);
            if (iD == -5) {
                io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(d0Var.f105308b);
                int i11 = aVar.H;
                if (i11 != 0 || aVar.I != 0) {
                    e eVar = e.this;
                    if (eVar.f72236f != 0) {
                        i11 = 0;
                    }
                    d0Var.f105308b = aVar.b().Z(i11).a0(eVar.f72237g == Long.MIN_VALUE ? aVar.I : 0).N();
                }
                return -5;
            }
            long j10 = e.this.f72237g;
            if (j10 == Long.MIN_VALUE || ((iD != -4 || fVar.f104990g < j10) && !(iD == -3 && bufferedPositionUs == Long.MIN_VALUE && !fVar.f104989f))) {
                return iD;
            }
            fVar.c();
            fVar.k(4);
            this.f72240c = true;
            return -4;
        }

        @Override // ga.c1
        public boolean isReady() {
            return !e.this.h() && this.f72239b.isReady();
        }

        @Override // ga.c1
        public void maybeThrowError() {
            this.f72239b.maybeThrowError();
        }

        @Override // ga.c1
        public int skipData(long j10) {
            if (e.this.h()) {
                return -3;
            }
            return this.f72239b.skipData(j10);
        }
    }

    public e(c0 c0Var, boolean z10, long j10, long j11) {
        this.f72232b = c0Var;
        this.f72235e = z10 ? j10 : -9223372036854775807L;
        this.f72236f = j10;
        this.f72237g = j11;
    }

    private u9.m0 e(long j10, u9.m0 m0Var) {
        long jQ = q9.o0.q(m0Var.f105321a, 0L, j10 - this.f72236f);
        long j11 = m0Var.f105322b;
        long j12 = this.f72237g;
        long jQ2 = q9.o0.q(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jQ == m0Var.f105321a && jQ2 == m0Var.f105322b) ? m0Var : new u9.m0(jQ, jQ2);
    }

    private static long g(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    private static boolean l(long j10, long j11, ja.r[] rVarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (ja.r rVar : rVarArr) {
                if (rVar != null) {
                    io.bidmachine.media3.common.a selectedFormat = rVar.getSelectedFormat();
                    if (!n9.w.a(selectedFormat.f80561o, selectedFormat.f80557k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        return this.f72232b.a(l1Var);
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        long j11 = this.f72236f;
        if (j10 == j11) {
            return j11;
        }
        return this.f72232b.b(j10, e(j10, m0Var));
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f72233c = aVar;
        this.f72232b.c(this, j10);
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        this.f72232b.discardBuffer(j10, z10);
    }

    @Override // ga.c0.a
    public void f(c0 c0Var) {
        if (this.f72238h != null) {
            return;
        }
        ((c0.a) q9.a.e(this.f72233c)).f(this);
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f72232b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f72237g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f72232b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f72237g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return this.f72232b.getTrackGroups();
    }

    boolean h() {
        return this.f72235e != -9223372036854775807L;
    }

    @Override // ga.d1.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(c0 c0Var) {
        ((c0.a) q9.a.e(this.f72233c)).d(this);
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.f72232b.isLoading();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        this.f72234d = new a[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            a[] aVarArr = this.f72234d;
            a aVar = (a) c1VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                c1Var = aVar.f72239b;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        long j11 = this.f72232b.j(rVarArr, zArr, c1VarArr2, zArr2, j10);
        long jG = g(j11, j10, this.f72237g);
        this.f72235e = (h() && l(j11, j10, rVarArr)) ? jG : -9223372036854775807L;
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                this.f72234d[i11] = null;
            } else {
                a[] aVarArr2 = this.f72234d;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f72239b != c1Var2) {
                    aVarArr2[i11] = new a(c1Var2);
                }
            }
            c1VarArr[i11] = this.f72234d[i11];
        }
        return jG;
    }

    public void k(f.d dVar) {
        this.f72238h = dVar;
    }

    public void m(long j10, long j11) {
        this.f72236f = j10;
        this.f72237g = j11;
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() throws f.d {
        f.d dVar = this.f72238h;
        if (dVar != null) {
            throw dVar;
        }
        this.f72232b.maybeThrowPrepareError();
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        if (h()) {
            long j10 = this.f72235e;
            this.f72235e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f72232b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return g(discontinuity2, this.f72236f, this.f72237g);
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
        this.f72232b.reevaluateBuffer(j10);
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        this.f72235e = -9223372036854775807L;
        for (a aVar : this.f72234d) {
            if (aVar != null) {
                aVar.a();
            }
        }
        return g(this.f72232b.seekToUs(j10), this.f72236f, this.f72237g);
    }
}
