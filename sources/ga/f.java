package ga;

import ga.f0;
import java.io.IOException;
import java.util.ArrayList;
import n9.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends o1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f72245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f72246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f72247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f72248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f72249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f72250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f72251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e0.c f72252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f72253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d f72254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f72255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f72256x;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f72257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f72258b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f72261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f72262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f72263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f72264h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f72260d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f72259c = Long.MIN_VALUE;

        public b(f0 f0Var) {
            this.f72257a = (f0) q9.a.e(f0Var);
        }

        public f h() {
            this.f72264h = true;
            return new f(this);
        }

        public b i(boolean z10) {
            q9.a.g(!this.f72264h);
            this.f72261e = z10;
            return this;
        }

        public b j(boolean z10) {
            q9.a.g(!this.f72264h);
            this.f72260d = z10;
            return this;
        }

        public b k(long j10) {
            q9.a.g(!this.f72264h);
            this.f72259c = j10;
            return this;
        }

        public b l(boolean z10) {
            q9.a.g(!this.f72264h);
            this.f72262f = z10;
            return this;
        }

        public b m(long j10) {
            q9.a.a(j10 >= 0);
            q9.a.g(!this.f72264h);
            this.f72258b = j10;
            return this;
        }
    }

    private static final class c extends w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f72265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f72266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f72267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f72268i;

        public c(n9.e0 e0Var, long j10, long j11, boolean z10) throws d {
            super(e0Var);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new d(2, j10, j11);
            }
            boolean z11 = false;
            if (e0Var.i() != 1) {
                throw new d(0);
            }
            e0.c cVarN = e0Var.n(0, new e0.c());
            long jMax = Math.max(0L, j10);
            if (!z10 && !cVarN.f95281k && jMax != 0 && !cVarN.f95278h) {
                throw new d(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? cVarN.f95283m : Math.max(0L, j11);
            long j12 = cVarN.f95283m;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f72265f = jMax;
            this.f72266g = jMax2;
            this.f72267h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f95279i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z11 = true;
            }
            this.f72268i = z11;
        }

        @Override // ga.w, n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            this.f72467e.g(0, bVar, z10);
            long jN = bVar.n() - this.f72265f;
            long j10 = this.f72267h;
            return bVar.s(bVar.f95254a, bVar.f95255b, 0, j10 != -9223372036854775807L ? j10 - jN : -9223372036854775807L, jN);
        }

        @Override // ga.w, n9.e0
        public e0.c o(int i10, e0.c cVar, long j10) {
            this.f72467e.o(0, cVar, 0L);
            long j11 = cVar.f95286p;
            long j12 = this.f72265f;
            cVar.f95286p = j11 + j12;
            cVar.f95283m = this.f72267h;
            cVar.f95279i = this.f72268i;
            long j13 = cVar.f95282l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f95282l = jMax;
                long j14 = this.f72266g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f95282l = jMax - this.f72265f;
            }
            long jQ1 = q9.o0.q1(this.f72265f);
            long j15 = cVar.f95275e;
            if (j15 != -9223372036854775807L) {
                cVar.f95275e = j15 + jQ1;
            }
            long j16 = cVar.f95276f;
            if (j16 != -9223372036854775807L) {
                cVar.f95276f = j16 + jQ1;
            }
            return cVar;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72269b;

        public d(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            q9.a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public d(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f72269b = i10;
        }
    }

    private void O(n9.e0 e0Var) {
        long j10;
        e0Var.n(0, this.f72252t);
        long jE = this.f72252t.e();
        if (this.f72253u == null || this.f72251s.isEmpty() || this.f72248p) {
            j10 = this.f72245m;
            long j11 = this.f72246n;
            if (this.f72249q) {
                long jC = this.f72252t.c();
                j10 += jC;
                j11 += jC;
            }
            this.f72255w = jE + j10;
            this.f72256x = this.f72246n != Long.MIN_VALUE ? jE + j11 : Long.MIN_VALUE;
            int size = this.f72251s.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((e) this.f72251s.get(i10)).m(this.f72255w, this.f72256x);
            }
            j = j11;
        } else {
            j10 = this.f72255w - jE;
            if (this.f72246n != Long.MIN_VALUE) {
                j = this.f72256x - jE;
            }
        }
        try {
            c cVar = new c(e0Var, j10, j, this.f72250r);
            this.f72253u = cVar;
            w(cVar);
        } catch (d e10) {
            this.f72254v = e10;
            for (int i11 = 0; i11 < this.f72251s.size(); i11++) {
                ((e) this.f72251s.get(i11)).k(this.f72254v);
            }
        }
    }

    @Override // ga.o1
    protected void L(n9.e0 e0Var) {
        if (this.f72254v != null) {
            return;
        }
        O(e0Var);
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        q9.a.g(this.f72251s.remove(c0Var));
        this.f72395k.c(((e) c0Var).f72232b);
        if (!this.f72251s.isEmpty() || this.f72248p) {
            return;
        }
        O(((c) q9.a.e(this.f72253u)).f72467e);
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        e eVar = new e(this.f72395k.e(bVar, bVar2, j10), this.f72247o, this.f72255w, this.f72256x);
        this.f72251s.add(eVar);
        return eVar;
    }

    @Override // ga.h, ga.f0
    public void maybeThrowSourceInfoRefreshError() throws d {
        d dVar = this.f72254v;
        if (dVar != null) {
            throw dVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // ga.h, ga.a
    protected void x() {
        super.x();
        this.f72254v = null;
        this.f72253u = null;
    }

    private f(b bVar) {
        super(bVar.f72257a);
        this.f72245m = bVar.f72258b;
        this.f72246n = bVar.f72259c;
        this.f72247o = bVar.f72260d;
        this.f72248p = bVar.f72261e;
        this.f72249q = bVar.f72262f;
        this.f72250r = bVar.f72263g;
        this.f72251s = new ArrayList();
        this.f72252t = new e0.c();
    }
}
