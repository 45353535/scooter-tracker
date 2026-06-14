package ga;

import android.net.Uri;
import android.os.Handler;
import ga.b1;
import ga.c0;
import ga.n0;
import ga.x;
import io.bidmachine.media3.common.a;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ka.m;
import ka.o;
import oa.m0;
import s9.k;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
final class w0 implements c0, oa.t, o.b, o.f, b1.d {
    private static final Map S = B();
    private static final io.bidmachine.media3.common.a T = new a.b().f0("icy").u0("application/x-icy").N();
    private boolean A;
    private boolean B;
    private f C;
    private oa.m0 D;
    private long E;
    private boolean F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private boolean L;
    private long M;
    private long N;
    private boolean O;
    private int P;
    private boolean Q;
    private boolean R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f72468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s9.g f72469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z9.w f72470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ka.m f72471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0.a f72472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u.a f72473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f72474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ka.b f72475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f72476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f72477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f72478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f72479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f72480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ka.o f72481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r0 f72482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final q9.k f72483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f72484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f72485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f72486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c0.a f72487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private bb.b f72488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b1[] f72489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e[] f72490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f72491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f72492z;

    class a extends oa.d0 {
        a(oa.m0 m0Var) {
            super(m0Var);
        }

        @Override // oa.d0, oa.m0
        public long getDurationUs() {
            return w0.this.E;
        }
    }

    final class b implements o.e, x.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f72495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s9.x f72496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final r0 f72497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final oa.t f72498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final q9.k f72499f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f72501h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f72503j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private oa.s0 f72505l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f72506m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final oa.l0 f72500g = new oa.l0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f72502i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f72494a = y.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private s9.k f72504k = g(0);

        public b(Uri uri, s9.g gVar, r0 r0Var, oa.t tVar, q9.k kVar) {
            this.f72495b = uri;
            this.f72496c = new s9.x(gVar);
            this.f72497d = r0Var;
            this.f72498e = tVar;
            this.f72499f = kVar;
        }

        private s9.k g(long j10) {
            return new k.b().i(this.f72495b).h(j10).f(w0.this.f72476j).b(6).e(w0.S).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(long j10, long j11) {
            this.f72500g.f96583a = j10;
            this.f72503j = j11;
            this.f72502i = true;
            this.f72506m = false;
        }

        @Override // ga.x.a
        public void a(q9.d0 d0Var) {
            long jMax = !this.f72506m ? this.f72503j : Math.max(w0.this.D(true), this.f72503j);
            int iA = d0Var.a();
            oa.s0 s0Var = (oa.s0) q9.a.e(this.f72505l);
            s0Var.c(d0Var, iA);
            s0Var.e(jMax, 1, iA, 0, null);
            this.f72506m = true;
        }

        @Override // ka.o.e
        public void cancelLoad() {
            this.f72501h = true;
        }

        @Override // ka.o.e
        public void load() {
            int iA = 0;
            while (iA == 0 && !this.f72501h) {
                try {
                    long j10 = this.f72500g.f96583a;
                    s9.k kVarG = g(j10);
                    this.f72504k = kVarG;
                    long jB = this.f72496c.b(kVarG);
                    if (this.f72501h) {
                        if (iA != 1 && this.f72497d.getCurrentInputPosition() != -1) {
                            this.f72500g.f96583a = this.f72497d.getCurrentInputPosition();
                        }
                        s9.j.a(this.f72496c);
                        return;
                    }
                    if (jB != -1) {
                        jB += j10;
                        w0.this.M();
                    }
                    long j11 = jB;
                    w0.this.f72488v = bb.b.b(this.f72496c.getResponseHeaders());
                    n9.h xVar = this.f72496c;
                    if (w0.this.f72488v != null && w0.this.f72488v.f6146f != -1) {
                        xVar = new x(this.f72496c, w0.this.f72488v.f6146f, this);
                        oa.s0 s0VarE = w0.this.E();
                        this.f72505l = s0VarE;
                        s0VarE.f(w0.T);
                    }
                    this.f72497d.b(xVar, this.f72495b, this.f72496c.getResponseHeaders(), j10, j11, this.f72498e);
                    if (w0.this.f72488v != null) {
                        this.f72497d.disableSeekingOnMp3Streams();
                    }
                    if (this.f72502i) {
                        this.f72497d.seek(j10, this.f72503j);
                        this.f72502i = false;
                    }
                    while (iA == 0 && !this.f72501h) {
                        try {
                            this.f72499f.a();
                            iA = this.f72497d.a(this.f72500g);
                            long currentInputPosition = this.f72497d.getCurrentInputPosition();
                            if (currentInputPosition > w0.this.f72477k + j10) {
                                this.f72499f.c();
                                w0.this.f72486t.post(w0.this.f72485s);
                                j10 = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (this.f72497d.getCurrentInputPosition() != -1) {
                        this.f72500g.f96583a = this.f72497d.getCurrentInputPosition();
                    }
                    s9.j.a(this.f72496c);
                } catch (Throwable th2) {
                    if (iA != 1 && this.f72497d.getCurrentInputPosition() != -1) {
                        this.f72500g.f96583a = this.f72497d.getCurrentInputPosition();
                    }
                    s9.j.a(this.f72496c);
                    throw th2;
                }
            }
        }
    }

    interface c {
        void b(long j10, oa.m0 m0Var, boolean z10);
    }

    private final class d implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72508b;

        public d(int i10) {
            this.f72508b = i10;
        }

        @Override // ga.c1
        public int d(u9.d0 d0Var, t9.f fVar, int i10) {
            return w0.this.S(this.f72508b, d0Var, fVar, i10);
        }

        @Override // ga.c1
        public boolean isReady() {
            return w0.this.G(this.f72508b);
        }

        @Override // ga.c1
        public void maybeThrowError() throws IOException {
            w0.this.L(this.f72508b);
        }

        @Override // ga.c1
        public int skipData(long j10) {
            return w0.this.W(this.f72508b, j10);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72511b;

        public e(int i10, boolean z10) {
            this.f72510a = i10;
            this.f72511b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f72510a == eVar.f72510a && this.f72511b == eVar.f72511b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f72510a * 31) + (this.f72511b ? 1 : 0);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1 f72512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f72513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f72514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f72515d;

        public f(m1 m1Var, boolean[] zArr) {
            this.f72512a = m1Var;
            this.f72513b = zArr;
            int i10 = m1Var.f72380a;
            this.f72514c = new boolean[i10];
            this.f72515d = new boolean[i10];
        }
    }

    public w0(Uri uri, s9.g gVar, r0 r0Var, z9.w wVar, u.a aVar, ka.m mVar, n0.a aVar2, c cVar, ka.b bVar, String str, int i10, int i11, io.bidmachine.media3.common.a aVar3, long j10, la.b bVar2) {
        this.f72468b = uri;
        this.f72469c = gVar;
        this.f72470d = wVar;
        this.f72473g = aVar;
        this.f72471e = mVar;
        this.f72472f = aVar2;
        this.f72474h = cVar;
        this.f72475i = bVar;
        this.f72476j = str;
        this.f72477k = i10;
        this.f72478l = i11;
        this.f72479m = aVar3;
        this.f72481o = bVar2 != null ? new ka.o(bVar2) : new ka.o("ProgressiveMediaPeriod");
        this.f72482p = r0Var;
        this.f72480n = j10;
        this.f72483q = new q9.k();
        this.f72484r = new Runnable() { // from class: ga.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72450b.H();
            }
        };
        this.f72485s = new Runnable() { // from class: ga.t0
            @Override // java.lang.Runnable
            public final void run() {
                w0.m(this.f72452b);
            }
        };
        this.f72486t = q9.o0.A();
        this.f72490x = new e[0];
        this.f72489w = new b1[0];
        this.N = -9223372036854775807L;
        this.G = 1;
    }

    private boolean A(b bVar, int i10) {
        oa.m0 m0Var;
        if (this.L || !((m0Var = this.D) == null || m0Var.getDurationUs() == -9223372036854775807L)) {
            this.P = i10;
            return true;
        }
        if (this.f72492z && !Y()) {
            this.O = true;
            return false;
        }
        this.I = this.f72492z;
        this.M = 0L;
        this.P = 0;
        for (b1 b1Var : this.f72489w) {
            b1Var.X();
        }
        bVar.h(0L, 0L);
        return true;
    }

    private static Map B() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return DesugarCollections.unmodifiableMap(map);
    }

    private int C() {
        int iJ = 0;
        for (b1 b1Var : this.f72489w) {
            iJ += b1Var.J();
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long D(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f72489w.length; i10++) {
            if (z10 || ((f) q9.a.e(this.C)).f72514c[i10]) {
                jMax = Math.max(jMax, this.f72489w[i10].C());
            }
        }
        return jMax;
    }

    private boolean F() {
        return this.N != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (this.R || this.f72492z || !this.f72491y || this.D == null) {
            return;
        }
        for (b1 b1Var : this.f72489w) {
            if (b1Var.I() == null) {
                return;
            }
        }
        this.f72483q.c();
        int length = this.f72489w.length;
        n9.f0[] f0VarArr = new n9.f0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            io.bidmachine.media3.common.a aVarN = (io.bidmachine.media3.common.a) q9.a.e(this.f72489w[i10].I());
            String str = aVarN.f80561o;
            boolean zO = n9.w.o(str);
            boolean z10 = zO || n9.w.t(str);
            zArr[i10] = z10;
            this.A = z10 | this.A;
            this.B = this.f72480n != -9223372036854775807L && length == 1 && n9.w.q(str);
            bb.b bVar = this.f72488v;
            if (bVar != null) {
                if (zO || this.f72490x[i10].f72511b) {
                    n9.v vVar = aVarN.f80558l;
                    aVarN = aVarN.b().n0(vVar == null ? new n9.v(bVar) : vVar.a(bVar)).N();
                }
                if (zO && aVarN.f80554h == -1 && aVarN.f80555i == -1 && bVar.f6141a != -1) {
                    aVarN = aVarN.b().Q(bVar.f6141a).N();
                }
            }
            io.bidmachine.media3.common.a aVarC = aVarN.c(this.f72470d.d(aVarN));
            f0VarArr[i10] = new n9.f0(Integer.toString(i10), aVarC);
            this.J = aVarC.f80567u | this.J;
        }
        this.C = new f(new m1(f0VarArr), zArr);
        if (this.B && this.E == -9223372036854775807L) {
            this.E = this.f72480n;
            this.D = new a(this.D);
        }
        this.f72474h.b(this.E, this.D, this.F);
        this.f72492z = true;
        ((c0.a) q9.a.e(this.f72487u)).f(this);
    }

    private void I(int i10) {
        z();
        f fVar = this.C;
        boolean[] zArr = fVar.f72515d;
        if (zArr[i10]) {
            return;
        }
        io.bidmachine.media3.common.a aVarA = fVar.f72512a.b(i10).a(0);
        this.f72472f.j(n9.w.k(aVarA.f80561o), aVarA, 0, null, this.M);
        zArr[i10] = true;
    }

    private void J(int i10) {
        z();
        if (this.O) {
            if (!this.A || this.C.f72513b[i10]) {
                if (this.f72489w[i10].N(false)) {
                    return;
                }
                this.N = 0L;
                this.O = false;
                this.I = true;
                this.M = 0L;
                this.P = 0;
                for (b1 b1Var : this.f72489w) {
                    b1Var.X();
                }
                ((c0.a) q9.a.e(this.f72487u)).d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        this.f72486t.post(new Runnable() { // from class: ga.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72466b.L = true;
            }
        });
    }

    private oa.s0 R(e eVar) {
        int length = this.f72489w.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f72490x[i10])) {
                return this.f72489w[i10];
            }
        }
        if (this.f72491y) {
            q9.u.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f72510a + ") after finishing tracks.");
            return new oa.n();
        }
        b1 b1VarL = b1.l(this.f72475i, this.f72470d, this.f72473g);
        b1VarL.f0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f72490x, i11);
        eVarArr[length] = eVar;
        this.f72490x = (e[]) q9.o0.j(eVarArr);
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.f72489w, i11);
        b1VarArr[length] = b1VarL;
        this.f72489w = (b1[]) q9.o0.j(b1VarArr);
        return b1VarL;
    }

    private boolean U(boolean[] zArr, long j10, boolean z10) {
        int length = this.f72489w.length;
        for (int i10 = 0; i10 < length; i10++) {
            b1 b1Var = this.f72489w[i10];
            if (b1Var.F() != 0 || !z10) {
                if (!(this.B ? b1Var.a0(b1Var.A()) : b1Var.b0(j10, false)) && (zArr[i10] || !this.A)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(oa.m0 m0Var) {
        this.D = this.f72488v == null ? m0Var : new m0.b(-9223372036854775807L);
        this.E = m0Var.getDurationUs();
        boolean z10 = !this.L && m0Var.getDurationUs() == -9223372036854775807L;
        this.F = z10;
        this.G = z10 ? 7 : 1;
        if (this.f72492z) {
            this.f72474h.b(this.E, m0Var, z10);
        } else {
            H();
        }
    }

    private void X() {
        b bVar = new b(this.f72468b, this.f72469c, this.f72482p, this, this.f72483q);
        if (this.f72492z) {
            q9.a.g(F());
            long j10 = this.E;
            if (j10 != -9223372036854775807L && this.N > j10) {
                this.Q = true;
                this.N = -9223372036854775807L;
                return;
            }
            bVar.h(((oa.m0) q9.a.e(this.D)).getSeekPoints(this.N).f96607a.f96614b, this.N);
            for (b1 b1Var : this.f72489w) {
                b1Var.d0(this.N);
            }
            this.N = -9223372036854775807L;
        }
        this.P = C();
        this.f72481o.m(bVar, this, this.f72471e.getMinimumLoadableRetryCount(this.G));
    }

    private boolean Y() {
        return this.I || F();
    }

    public static /* synthetic */ void m(w0 w0Var) {
        if (w0Var.R) {
            return;
        }
        ((c0.a) q9.a.e(w0Var.f72487u)).d(w0Var);
    }

    private void z() {
        q9.a.g(this.f72492z);
        q9.a.e(this.C);
        q9.a.e(this.D);
    }

    oa.s0 E() {
        return R(new e(0, true));
    }

    boolean G(int i10) {
        return !Y() && this.f72489w[i10].N(this.Q);
    }

    void K() throws IOException {
        this.f72481o.j(this.f72471e.getMinimumLoadableRetryCount(this.G));
    }

    void L(int i10) throws IOException {
        this.f72489w[i10].P();
        K();
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void h(b bVar, long j10, long j11, boolean z10) {
        s9.x xVar = bVar.f72496c;
        y yVar = new y(bVar.f72494a, bVar.f72504k, xVar.d(), xVar.e(), j10, j11, xVar.c());
        this.f72471e.onLoadTaskConcluded(bVar.f72494a);
        this.f72472f.m(yVar, 1, -1, null, 0, null, bVar.f72503j, this.E);
        if (z10) {
            return;
        }
        for (b1 b1Var : this.f72489w) {
            b1Var.X();
        }
        if (this.K > 0) {
            ((c0.a) q9.a.e(this.f72487u)).d(this);
        }
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void f(b bVar, long j10, long j11) {
        if (this.E == -9223372036854775807L && this.D != null) {
            long jD = D(true);
            long j12 = jD == Long.MIN_VALUE ? 0L : jD + 10000;
            this.E = j12;
            this.f72474h.b(j12, this.D, this.F);
        }
        s9.x xVar = bVar.f72496c;
        y yVar = new y(bVar.f72494a, bVar.f72504k, xVar.d(), xVar.e(), j10, j11, xVar.c());
        this.f72471e.onLoadTaskConcluded(bVar.f72494a);
        this.f72472f.p(yVar, 1, -1, null, 0, null, bVar.f72503j, this.E);
        this.Q = true;
        ((c0.a) q9.a.e(this.f72487u)).d(this);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public o.c g(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        o.c cVarG;
        s9.x xVar = bVar.f72496c;
        y yVar = new y(bVar.f72494a, bVar.f72504k, xVar.d(), xVar.e(), j10, j11, xVar.c());
        long jB = this.f72471e.b(new m.c(yVar, new b0(1, -1, null, 0, null, q9.o0.q1(bVar.f72503j), q9.o0.q1(this.E)), iOException, i10));
        if (jB == -9223372036854775807L) {
            cVarG = ka.o.f93116g;
            bVar2 = bVar;
        } else {
            int iC = C();
            bVar2 = bVar;
            cVarG = A(bVar2, iC) ? ka.o.g(iC > this.P, jB) : ka.o.f93115f;
        }
        boolean zC = cVarG.c();
        this.f72472f.r(yVar, 1, -1, null, 0, null, bVar2.f72503j, this.E, iOException, !zC);
        if (!zC) {
            this.f72471e.onLoadTaskConcluded(bVar2.f72494a);
        }
        return cVarG;
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, long j10, long j11, int i10) {
        s9.x xVar = bVar.f72496c;
        this.f72472f.v(i10 == 0 ? new y(bVar.f72494a, bVar.f72504k, j10) : new y(bVar.f72494a, bVar.f72504k, xVar.d(), xVar.e(), j10, j11, xVar.c()), 1, -1, null, 0, null, bVar.f72503j, this.E, i10);
    }

    int S(int i10, u9.d0 d0Var, t9.f fVar, int i11) {
        if (Y()) {
            return -3;
        }
        I(i10);
        int iU = this.f72489w[i10].U(d0Var, fVar, i11, this.Q);
        if (iU == -3) {
            J(i10);
        }
        return iU;
    }

    public void T() {
        if (this.f72492z) {
            for (b1 b1Var : this.f72489w) {
                b1Var.T();
            }
        }
        this.f72481o.l(this);
        this.f72486t.removeCallbacksAndMessages(null);
        this.f72487u = null;
        this.R = true;
    }

    int W(int i10, long j10) throws Throwable {
        if (Y()) {
            return 0;
        }
        I(i10);
        b1 b1Var = this.f72489w[i10];
        int iH = b1Var.H(j10, this.Q);
        b1Var.g0(iH);
        if (iH == 0) {
            J(i10);
        }
        return iH;
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        if (this.Q || this.f72481o.h() || this.O) {
            return false;
        }
        if ((this.f72492z || this.f72479m != null) && this.K == 0) {
            return false;
        }
        boolean zE = this.f72483q.e();
        if (this.f72481o.i()) {
            return zE;
        }
        X();
        return true;
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        z();
        if (!this.D.isSeekable()) {
            return 0L;
        }
        m0.a seekPoints = this.D.getSeekPoints(j10);
        return m0Var.a(j10, seekPoints.f96607a.f96613a, seekPoints.f96608b.f96613a);
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f72487u = aVar;
        if (this.f72479m == null) {
            this.f72483q.e();
            X();
        } else {
            track(this.f72478l, 3).f(this.f72479m);
            V(new oa.h0(new long[]{0}, new long[]{0}, -9223372036854775807L));
            endTracks();
            this.N = j10;
        }
    }

    @Override // ga.b1.d
    public void d(io.bidmachine.media3.common.a aVar) {
        this.f72486t.post(this.f72484r);
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        if (this.B) {
            return;
        }
        z();
        if (F()) {
            return;
        }
        boolean[] zArr = this.C.f72514c;
        int length = this.f72489w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f72489w[i10].r(j10, z10, zArr[i10]);
        }
    }

    @Override // oa.t
    public void e(final oa.m0 m0Var) {
        this.f72486t.post(new Runnable() { // from class: ga.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72461b.V(m0Var);
            }
        });
    }

    @Override // oa.t
    public void endTracks() {
        this.f72491y = true;
        this.f72486t.post(this.f72484r);
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        long jD;
        z();
        if (this.Q || this.K == 0) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.N;
        }
        if (this.A) {
            int length = this.f72489w.length;
            jD = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.C;
                if (fVar.f72513b[i10] && fVar.f72514c[i10] && !this.f72489w[i10].M()) {
                    jD = Math.min(jD, this.f72489w[i10].C());
                }
            }
        } else {
            jD = Long.MAX_VALUE;
        }
        if (jD == Long.MAX_VALUE) {
            jD = D(false);
        }
        return jD == Long.MIN_VALUE ? this.M : jD;
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        z();
        return this.C.f72512a;
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.f72481o.i() && this.f72483q.d();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        ja.r rVar;
        z();
        f fVar = this.C;
        m1 m1Var = fVar.f72512a;
        boolean[] zArr3 = fVar.f72514c;
        int i10 = this.K;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) c1Var).f72508b;
                q9.a.g(zArr3[i13]);
                this.K--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.H ? j10 == 0 || this.B : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                q9.a.g(rVar.length() == 1);
                q9.a.g(rVar.getIndexInTrackGroup(0) == 0);
                int iD = m1Var.d(rVar.getTrackGroup());
                q9.a.g(!zArr3[iD]);
                this.K++;
                zArr3[iD] = true;
                this.J = rVar.getSelectedFormat().f80567u | this.J;
                c1VarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.f72489w[iD];
                    z10 = (b1Var.F() == 0 || b1Var.b0(j10, true)) ? false : true;
                }
            }
        }
        if (this.K == 0) {
            this.O = false;
            this.I = false;
            this.J = false;
            if (this.f72481o.i()) {
                b1[] b1VarArr = this.f72489w;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].s();
                    i11++;
                }
                this.f72481o.e();
            } else {
                this.Q = false;
                b1[] b1VarArr2 = this.f72489w;
                int length2 = b1VarArr2.length;
                while (i11 < length2) {
                    b1VarArr2[i11].X();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.H = true;
        return j10;
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() throws IOException {
        K();
        if (this.Q && !this.f72492z) {
            throw n9.x.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // ka.o.f
    public void onLoaderReleased() {
        for (b1 b1Var : this.f72489w) {
            b1Var.V();
        }
        this.f72482p.release();
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        if (this.J) {
            this.J = false;
            return this.M;
        }
        if (!this.I) {
            return -9223372036854775807L;
        }
        if (!this.Q && C() <= this.P) {
            return -9223372036854775807L;
        }
        this.I = false;
        return this.M;
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        z();
        boolean[] zArr = this.C.f72513b;
        if (!this.D.isSeekable()) {
            j10 = 0;
        }
        int i10 = 0;
        this.I = false;
        boolean z10 = this.M == j10;
        this.M = j10;
        if (F()) {
            this.N = j10;
            return j10;
        }
        if (this.G == 7 || ((!this.Q && !this.f72481o.i()) || !U(zArr, j10, z10))) {
            this.O = false;
            this.N = j10;
            this.Q = false;
            this.J = false;
            if (this.f72481o.i()) {
                b1[] b1VarArr = this.f72489w;
                int length = b1VarArr.length;
                while (i10 < length) {
                    b1VarArr[i10].s();
                    i10++;
                }
                this.f72481o.e();
                return j10;
            }
            this.f72481o.f();
            b1[] b1VarArr2 = this.f72489w;
            int length2 = b1VarArr2.length;
            while (i10 < length2) {
                b1VarArr2[i10].X();
                i10++;
            }
        }
        return j10;
    }

    @Override // oa.t
    public oa.s0 track(int i10, int i11) {
        return R(new e(i10, false));
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
    }
}
