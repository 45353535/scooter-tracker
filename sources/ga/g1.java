package ga;

import ga.c0;
import ga.n0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import ka.m;
import ka.o;
import s9.g;

/* JADX INFO: loaded from: classes12.dex */
final class g1 implements c0, o.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s9.k f72297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f72298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s9.y f72299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ka.m f72300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0.a f72301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m1 f72302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f72303h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f72304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ka.o f72305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final io.bidmachine.media3.common.a f72306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f72307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f72308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    byte[] f72309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f72310o;

    private final class b implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f72311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f72312c;

        private b() {
        }

        private void a() {
            if (this.f72312c) {
                return;
            }
            g1.this.f72301f.j(n9.w.k(g1.this.f72306k.f80561o), g1.this.f72306k, 0, null, 0L);
            this.f72312c = true;
        }

        public void b() {
            if (this.f72311b == 2) {
                this.f72311b = 1;
            }
        }

        @Override // ga.c1
        public int d(u9.d0 d0Var, t9.f fVar, int i10) {
            a();
            g1 g1Var = g1.this;
            boolean z10 = g1Var.f72308m;
            if (z10 && g1Var.f72309n == null) {
                this.f72311b = 2;
            }
            int i11 = this.f72311b;
            if (i11 == 2) {
                fVar.a(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                d0Var.f105308b = g1Var.f72306k;
                this.f72311b = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            q9.a.e(g1Var.f72309n);
            fVar.a(1);
            fVar.f104990g = 0L;
            if ((i10 & 4) == 0) {
                fVar.m(g1.this.f72310o);
                ByteBuffer byteBuffer = fVar.f104988e;
                g1 g1Var2 = g1.this;
                byteBuffer.put(g1Var2.f72309n, 0, g1Var2.f72310o);
            }
            if ((i10 & 1) == 0) {
                this.f72311b = 2;
            }
            return -4;
        }

        @Override // ga.c1
        public boolean isReady() {
            return g1.this.f72308m;
        }

        @Override // ga.c1
        public void maybeThrowError() throws IOException {
            g1 g1Var = g1.this;
            if (g1Var.f72307l) {
                return;
            }
            g1Var.f72305j.maybeThrowError();
        }

        @Override // ga.c1
        public int skipData(long j10) {
            a();
            if (j10 <= 0 || this.f72311b == 2) {
                return 0;
            }
            this.f72311b = 2;
            return 1;
        }
    }

    public g1(s9.k kVar, g.a aVar, s9.y yVar, io.bidmachine.media3.common.a aVar2, long j10, ka.m mVar, n0.a aVar3, boolean z10, la.b bVar) {
        this.f72297b = kVar;
        this.f72298c = aVar;
        this.f72299d = yVar;
        this.f72306k = aVar2;
        this.f72304i = j10;
        this.f72300e = mVar;
        this.f72301f = aVar3;
        this.f72307l = z10;
        this.f72302g = new m1(new n9.f0(aVar2));
        this.f72305j = bVar != null ? new ka.o(bVar) : new ka.o("SingleSampleMediaPeriod");
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        if (this.f72308m || this.f72305j.i() || this.f72305j.h()) {
            return false;
        }
        s9.g gVarCreateDataSource = this.f72298c.createDataSource();
        s9.y yVar = this.f72299d;
        if (yVar != null) {
            gVarCreateDataSource.a(yVar);
        }
        this.f72305j.m(new c(this.f72297b, gVarCreateDataSource), this, this.f72300e.getMinimumLoadableRetryCount(1));
        return true;
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        aVar.f(this);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void h(c cVar, long j10, long j11, boolean z10) {
        s9.x xVar = cVar.f72316c;
        y yVar = new y(cVar.f72314a, cVar.f72315b, xVar.d(), xVar.e(), j10, j11, xVar.c());
        this.f72300e.onLoadTaskConcluded(cVar.f72314a);
        this.f72301f.m(yVar, 1, -1, null, 0, null, 0L, this.f72304i);
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        return this.f72308m ? Long.MIN_VALUE : 0L;
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return (this.f72308m || this.f72305j.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return this.f72302g;
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.f72305j.i();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            if (c1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                this.f72303h.remove(c1Var);
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && rVarArr[i10] != null) {
                b bVar = new b();
                this.f72303h.add(bVar);
                c1VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void f(c cVar, long j10, long j11) {
        this.f72310o = (int) cVar.f72316c.c();
        this.f72309n = (byte[]) q9.a.e(cVar.f72317d);
        this.f72308m = true;
        s9.x xVar = cVar.f72316c;
        y yVar = new y(cVar.f72314a, cVar.f72315b, xVar.d(), xVar.e(), j10, j11, this.f72310o);
        this.f72300e.onLoadTaskConcluded(cVar.f72314a);
        this.f72301f.p(yVar, 1, -1, this.f72306k, 0, null, 0L, this.f72304i);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o.c g(c cVar, long j10, long j11, IOException iOException, int i10) {
        o.c cVarG;
        s9.x xVar = cVar.f72316c;
        y yVar = new y(cVar.f72314a, cVar.f72315b, xVar.d(), xVar.e(), j10, j11, xVar.c());
        long jB = this.f72300e.b(new m.c(yVar, new b0(1, -1, this.f72306k, 0, null, 0L, q9.o0.q1(this.f72304i)), iOException, i10));
        boolean z10 = jB == -9223372036854775807L || i10 >= this.f72300e.getMinimumLoadableRetryCount(1);
        if (this.f72307l && z10) {
            q9.u.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f72308m = true;
            cVarG = ka.o.f93115f;
        } else {
            cVarG = jB != -9223372036854775807L ? ka.o.g(false, jB) : ka.o.f93116g;
        }
        o.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f72301f.r(yVar, 1, -1, this.f72306k, 0, null, 0L, this.f72304i, iOException, !zC);
        if (!zC) {
            this.f72300e.onLoadTaskConcluded(cVar.f72314a);
        }
        return cVar2;
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, long j10, long j11, int i10) {
        s9.x xVar = cVar.f72316c;
        this.f72301f.v(i10 == 0 ? new y(cVar.f72314a, cVar.f72315b, j10) : new y(cVar.f72314a, cVar.f72315b, xVar.d(), xVar.e(), j10, j11, xVar.c()), 1, -1, this.f72306k, 0, null, 0L, this.f72304i, i10);
    }

    public void n() {
        this.f72305j.k();
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f72303h.size(); i10++) {
            ((b) this.f72303h.get(i10)).b();
        }
        return j10;
    }

    static final class c implements o.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f72314a = y.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s9.k f72315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s9.x f72316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f72317d;

        public c(s9.k kVar, s9.g gVar) {
            this.f72315b = kVar;
            this.f72316c = new s9.x(gVar);
        }

        @Override // ka.o.e
        public void load() {
            this.f72316c.f();
            try {
                this.f72316c.b(this.f72315b);
                int i10 = 0;
                while (i10 != -1) {
                    int iC = (int) this.f72316c.c();
                    byte[] bArr = this.f72317d;
                    if (bArr == null) {
                        this.f72317d = new byte[1024];
                    } else if (iC == bArr.length) {
                        this.f72317d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    s9.x xVar = this.f72316c;
                    byte[] bArr2 = this.f72317d;
                    i10 = xVar.read(bArr2, iC, bArr2.length - iC);
                }
                s9.j.a(this.f72316c);
            } catch (Throwable th2) {
                s9.j.a(this.f72316c);
                throw th2;
            }
        }

        @Override // ka.o.e
        public void cancelLoad() {
        }
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() {
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        return j10;
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
    }
}
