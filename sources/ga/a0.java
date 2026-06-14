package ga;

import ga.f0;
import j$.util.Objects;
import n9.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends o1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f72179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e0.c f72180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0.b f72181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f72182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private z f72183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f72184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f72185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f72186t;

    private static final class a extends w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f72187h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f72188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f72189g;

        private a(n9.e0 e0Var, Object obj, Object obj2) {
            super(e0Var);
            this.f72188f = obj;
            this.f72189g = obj2;
        }

        public static a u(n9.r rVar) {
            return new a(new b(rVar), e0.c.f95261q, f72187h);
        }

        public static a v(n9.e0 e0Var, Object obj, Object obj2) {
            return new a(e0Var, obj, obj2);
        }

        @Override // ga.w, n9.e0
        public int b(Object obj) {
            Object obj2;
            n9.e0 e0Var = this.f72467e;
            if (f72187h.equals(obj) && (obj2 = this.f72189g) != null) {
                obj = obj2;
            }
            return e0Var.b(obj);
        }

        @Override // ga.w, n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            this.f72467e.g(i10, bVar, z10);
            if (Objects.equals(bVar.f95255b, this.f72189g) && z10) {
                bVar.f95255b = f72187h;
            }
            return bVar;
        }

        @Override // ga.w, n9.e0
        public Object m(int i10) {
            Object objM = this.f72467e.m(i10);
            return Objects.equals(objM, this.f72189g) ? f72187h : objM;
        }

        @Override // ga.w, n9.e0
        public e0.c o(int i10, e0.c cVar, long j10) {
            this.f72467e.o(i10, cVar, j10);
            if (Objects.equals(cVar.f95271a, this.f72188f)) {
                cVar.f95271a = e0.c.f95261q;
            }
            return cVar;
        }

        public a t(n9.e0 e0Var) {
            return new a(e0Var, this.f72188f, this.f72189g);
        }
    }

    public static final class b extends n9.e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final n9.r f72190e;

        public b(n9.r rVar) {
            this.f72190e = rVar;
        }

        @Override // n9.e0
        public int b(Object obj) {
            return obj == a.f72187h ? 0 : -1;
        }

        @Override // n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            bVar.t(z10 ? 0 : null, z10 ? a.f72187h : null, 0, -9223372036854775807L, 0L, n9.b.f95190g, true);
            return bVar;
        }

        @Override // n9.e0
        public int i() {
            return 1;
        }

        @Override // n9.e0
        public Object m(int i10) {
            return a.f72187h;
        }

        @Override // n9.e0
        public e0.c o(int i10, e0.c cVar, long j10) {
            cVar.g(e0.c.f95261q, this.f72190e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f95281k = true;
            return cVar;
        }

        @Override // n9.e0
        public int p() {
            return 1;
        }
    }

    public a0(f0 f0Var, boolean z10) {
        super(f0Var);
        this.f72179m = z10 && f0Var.isSingleWindow();
        this.f72180n = new e0.c();
        this.f72181o = new e0.b();
        n9.e0 initialTimeline = f0Var.getInitialTimeline();
        if (initialTimeline == null) {
            this.f72182p = a.u(f0Var.getMediaItem());
        } else {
            this.f72182p = a.v(initialTimeline, null, null);
            this.f72186t = true;
        }
    }

    private Object P(Object obj) {
        return (this.f72182p.f72189g == null || !this.f72182p.f72189g.equals(obj)) ? obj : a.f72187h;
    }

    private Object Q(Object obj) {
        return (this.f72182p.f72189g == null || !obj.equals(a.f72187h)) ? obj : this.f72182p.f72189g;
    }

    private boolean S(long j10) {
        z zVar = this.f72183q;
        int iB = this.f72182p.b(zVar.f72553b.f72270a);
        if (iB == -1) {
            return false;
        }
        long j11 = this.f72182p.f(iB, this.f72181o).f95257d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zVar.l(j10);
        return true;
    }

    @Override // ga.o1
    protected f0.b E(f0.b bVar) {
        return bVar.a(P(bVar.f72270a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // ga.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void L(n9.e0 r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.a0.L(n9.e0):void");
    }

    @Override // ga.o1
    public void N() {
        if (this.f72179m) {
            return;
        }
        this.f72184r = true;
        M();
    }

    @Override // ga.f0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public z e(f0.b bVar, ka.b bVar2, long j10) {
        z zVar = new z(bVar, bVar2, j10);
        zVar.n(this.f72395k);
        if (this.f72185s) {
            zVar.e(bVar.a(Q(bVar.f72270a)));
            return zVar;
        }
        this.f72183q = zVar;
        if (!this.f72184r) {
            this.f72184r = true;
            M();
        }
        return zVar;
    }

    public n9.e0 R() {
        return this.f72182p;
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        ((z) c0Var).m();
        if (c0Var == this.f72183q) {
            this.f72183q = null;
        }
    }

    @Override // ga.o1, ga.a, ga.f0
    public void h(n9.r rVar) {
        if (this.f72186t) {
            this.f72182p = this.f72182p.t(new k1(this.f72182p.f72467e, rVar));
        } else {
            this.f72182p = a.u(rVar);
        }
        this.f72395k.h(rVar);
    }

    @Override // ga.h, ga.a
    public void x() {
        this.f72185s = false;
        this.f72184r = false;
        super.x();
    }

    @Override // ga.h, ga.f0
    public void maybeThrowSourceInfoRefreshError() {
    }
}
