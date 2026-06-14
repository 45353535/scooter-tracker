package ma;

import ma.s;
import n9.n0;
import q9.i0;

/* JADX INFO: loaded from: classes12.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f94730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f94731b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f94740k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s.a f94732c = new s.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0 f94733d = new i0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f94734e = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q9.w f94735f = new q9.w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f94736g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n0 f94739j = n0.f95432e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f94737h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f94738i = -9223372036854775807L;

    interface a {
        void a(n0 n0Var);

        void b(long j10, long j11, boolean z10);

        void dropFrame();
    }

    public u(a aVar, s sVar) {
        this.f94730a = aVar;
        this.f94731b = sVar;
    }

    private void a() {
        this.f94735f.f();
        this.f94730a.dropFrame();
    }

    private static Object c(i0 i0Var) {
        q9.a.a(i0Var.l() > 0);
        while (i0Var.l() > 1) {
            i0Var.i();
        }
        return q9.a.e(i0Var.i());
    }

    private boolean e(long j10) {
        Long l10 = (Long) this.f94734e.j(j10);
        if (l10 == null || l10.longValue() == this.f94740k) {
            return false;
        }
        this.f94740k = l10.longValue();
        return true;
    }

    private boolean f(long j10) {
        n0 n0Var = (n0) this.f94733d.j(j10);
        if (n0Var == null || n0Var.equals(n0.f95432e) || n0Var.equals(this.f94739j)) {
            return false;
        }
        this.f94739j = n0Var;
        return true;
    }

    private void k(boolean z10) {
        long jF = this.f94735f.f();
        if (f(jF)) {
            this.f94730a.a(this.f94739j);
        }
        this.f94730a.b(z10 ? -1L : this.f94732c.g(), jF, this.f94731b.i());
    }

    public void b() {
        this.f94735f.b();
        this.f94736g = -9223372036854775807L;
        this.f94737h = -9223372036854775807L;
        this.f94738i = -9223372036854775807L;
        if (this.f94734e.l() > 0) {
            Long l10 = (Long) c(this.f94734e);
            l10.longValue();
            this.f94734e.a(0L, l10);
        }
        if (this.f94733d.l() > 0) {
            this.f94733d.a(0L, (n0) c(this.f94733d));
        }
    }

    public boolean d() {
        long j10 = this.f94738i;
        return j10 != -9223372036854775807L && this.f94737h == j10;
    }

    public void g(long j10) {
        this.f94735f.a(j10);
        this.f94736g = j10;
        this.f94738i = -9223372036854775807L;
    }

    public void h(long j10) {
        i0 i0Var = this.f94734e;
        long j11 = this.f94736g;
        i0Var.a(j11 == -9223372036854775807L ? 0L : j11 + 1, Long.valueOf(j10));
    }

    public void i(int i10, int i11) {
        i0 i0Var = this.f94733d;
        long j10 = this.f94736g;
        i0Var.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new n0(i10, i11));
    }

    public void j(long j10, long j11) {
        while (!this.f94735f.e()) {
            long jD = this.f94735f.d();
            if (e(jD)) {
                this.f94731b.j();
            }
            int iC = this.f94731b.c(jD, j10, j11, this.f94740k, false, false, this.f94732c);
            if (iC == 0 || iC == 1) {
                this.f94737h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f94737h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f94737h = jD;
            }
        }
    }

    public void l() {
        this.f94738i = this.f94736g;
    }
}
