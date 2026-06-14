package jb;

import oa.l0;
import oa.m0;
import oa.s;
import oa.s0;
import oa.t;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f85743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f85744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f85745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f85746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f85747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f85748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f85749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f85750i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f85752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f85753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f85754m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f85742a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f85751j = new b();

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.bidmachine.media3.common.a f85755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f85756b;

        b() {
        }
    }

    private void a() {
        q9.a.i(this.f85743b);
        o0.i(this.f85744c);
    }

    private boolean h(s sVar) {
        while (this.f85742a.d(sVar)) {
            this.f85752k = sVar.getPosition() - this.f85747f;
            if (!i(this.f85742a.c(), this.f85747f, this.f85751j)) {
                return true;
            }
            this.f85747f = sVar.getPosition();
        }
        this.f85749h = 3;
        return false;
    }

    private int j(s sVar) {
        if (!h(sVar)) {
            return -1;
        }
        io.bidmachine.media3.common.a aVar = this.f85751j.f85755a;
        this.f85750i = aVar.F;
        if (!this.f85754m) {
            this.f85743b.f(aVar);
            this.f85754m = true;
        }
        g gVar = this.f85751j.f85756b;
        if (gVar != null) {
            this.f85745d = gVar;
        } else if (sVar.getLength() == -1) {
            this.f85745d = new c();
        } else {
            f fVarB = this.f85742a.b();
            this.f85745d = new jb.a(this, this.f85747f, sVar.getLength(), fVarB.f85735h + fVarB.f85736i, fVarB.f85730c, (fVarB.f85729b & 4) != 0);
        }
        this.f85749h = 2;
        this.f85742a.f();
        return 0;
    }

    private int k(s sVar, l0 l0Var) {
        long jA = this.f85745d.a(sVar);
        if (jA >= 0) {
            l0Var.f96583a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f85753l) {
            m0 m0Var = (m0) q9.a.i(this.f85745d.createSeekMap());
            this.f85744c.e(m0Var);
            this.f85743b.d(m0Var.getDurationUs());
            this.f85753l = true;
        }
        if (this.f85752k <= 0 && !this.f85742a.d(sVar)) {
            this.f85749h = 3;
            return -1;
        }
        this.f85752k = 0L;
        d0 d0VarC = this.f85742a.c();
        long jF = f(d0VarC);
        if (jF >= 0) {
            long j10 = this.f85748g;
            if (j10 + jF >= this.f85746e) {
                long jB = b(j10);
                this.f85743b.c(d0VarC, d0VarC.g());
                this.f85743b.e(jB, 1, d0VarC.g(), 0, null);
                this.f85746e = -1L;
            }
        }
        this.f85748g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f85750i);
    }

    protected long c(long j10) {
        return (((long) this.f85750i) * j10) / 1000000;
    }

    void d(t tVar, s0 s0Var) {
        this.f85744c = tVar;
        this.f85743b = s0Var;
        l(true);
    }

    protected void e(long j10) {
        this.f85748g = j10;
    }

    protected abstract long f(d0 d0Var);

    final int g(s sVar, l0 l0Var) {
        a();
        int i10 = this.f85749h;
        if (i10 == 0) {
            return j(sVar);
        }
        if (i10 == 1) {
            sVar.skipFully((int) this.f85747f);
            this.f85749h = 2;
            return 0;
        }
        if (i10 == 2) {
            o0.i(this.f85745d);
            return k(sVar, l0Var);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean i(d0 d0Var, long j10, b bVar);

    protected void l(boolean z10) {
        if (z10) {
            this.f85751j = new b();
            this.f85747f = 0L;
            this.f85749h = 0;
        } else {
            this.f85749h = 1;
        }
        this.f85746e = -1L;
        this.f85748g = 0L;
    }

    final void m(long j10, long j11) {
        this.f85742a.e();
        if (j10 == 0) {
            l(!this.f85753l);
        } else if (this.f85749h != 0) {
            this.f85746e = c(j11);
            ((g) o0.i(this.f85745d)).startSeek(this.f85746e);
            this.f85749h = 2;
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // jb.g
        public long a(s sVar) {
            return -1L;
        }

        @Override // jb.g
        public m0 createSeekMap() {
            return new m0.b(-9223372036854775807L);
        }

        @Override // jb.g
        public void startSeek(long j10) {
        }
    }
}
