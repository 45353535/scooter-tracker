package ta;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import lb.t;
import n9.v;
import oa.a0;
import oa.b0;
import oa.l0;
import oa.m0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import oa.w;
import oa.x;
import oa.y;
import oa.z;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f105018o = new x() { // from class: ta.c
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return d.d();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f105019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f105020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f105021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y.a f105022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private oa.t f105023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f105024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f105025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f105026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b0 f105027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f105028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f105029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f105030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f105032n;

    public d() {
        this(0);
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new d()};
    }

    private long e(d0 d0Var, boolean z10) {
        boolean zD;
        q9.a.e(this.f105027i);
        int iF = d0Var.f();
        while (iF <= d0Var.g() - 16) {
            d0Var.W(iF);
            if (y.d(d0Var, this.f105027i, this.f105029k, this.f105022d)) {
                d0Var.W(iF);
                return this.f105022d.f96675a;
            }
            iF++;
        }
        if (!z10) {
            d0Var.W(iF);
            return -1L;
        }
        while (iF <= d0Var.g() - this.f105028j) {
            d0Var.W(iF);
            try {
                zD = y.d(d0Var, this.f105027i, this.f105029k, this.f105022d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (d0Var.f() <= d0Var.g() ? zD : false) {
                d0Var.W(iF);
                return this.f105022d.f96675a;
            }
            iF++;
        }
        d0Var.W(d0Var.g());
        return -1L;
    }

    private void f(s sVar) {
        this.f105029k = z.b(sVar);
        ((oa.t) o0.i(this.f105023e)).e(g(sVar.getPosition(), sVar.getLength()));
        this.f105025g = 5;
    }

    private m0 g(long j10, long j11) {
        q9.a.e(this.f105027i);
        b0 b0Var = this.f105027i;
        if (b0Var.f96474k != null) {
            return new a0(b0Var, j10);
        }
        if (j11 == -1 || b0Var.f96473j <= 0) {
            return new m0.b(b0Var.f());
        }
        b bVar = new b(b0Var, this.f105029k, j10, j11);
        this.f105030l = bVar;
        return bVar.b();
    }

    private void h(s sVar) {
        byte[] bArr = this.f105019a;
        sVar.peekFully(bArr, 0, bArr.length);
        sVar.resetPeekPosition();
        this.f105025g = 2;
    }

    private void i() {
        ((s0) o0.i(this.f105024f)).e((this.f105032n * 1000000) / ((long) ((b0) o0.i(this.f105027i)).f96468e), 1, this.f105031m, 0, null);
    }

    private int j(s sVar, l0 l0Var) {
        boolean z10;
        q9.a.e(this.f105024f);
        q9.a.e(this.f105027i);
        b bVar = this.f105030l;
        if (bVar != null && bVar.d()) {
            return this.f105030l.c(sVar, l0Var);
        }
        if (this.f105032n == -1) {
            this.f105032n = y.i(sVar, this.f105027i);
            return 0;
        }
        int iG = this.f105020b.g();
        if (iG < 32768) {
            int i10 = sVar.read(this.f105020b.e(), iG, 32768 - iG);
            z10 = i10 == -1;
            if (!z10) {
                this.f105020b.V(iG + i10);
            } else if (this.f105020b.a() == 0) {
                i();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f105020b.f();
        int i11 = this.f105031m;
        int i12 = this.f105028j;
        if (i11 < i12) {
            d0 d0Var = this.f105020b;
            d0Var.X(Math.min(i12 - i11, d0Var.a()));
        }
        long jE = e(this.f105020b, z10);
        int iF2 = this.f105020b.f() - iF;
        this.f105020b.W(iF);
        this.f105024f.c(this.f105020b, iF2);
        this.f105031m += iF2;
        if (jE != -1) {
            i();
            this.f105031m = 0;
            this.f105032n = jE;
        }
        int length = this.f105020b.e().length - this.f105020b.g();
        if (this.f105020b.a() < 16 && length < 16) {
            int iA = this.f105020b.a();
            System.arraycopy(this.f105020b.e(), this.f105020b.f(), this.f105020b.e(), 0, iA);
            this.f105020b.W(0);
            this.f105020b.V(iA);
        }
        return 0;
    }

    private void k(s sVar) {
        this.f105026h = z.d(sVar, !this.f105021c);
        this.f105025g = 1;
    }

    private void l(s sVar) {
        z.a aVar = new z.a(this.f105027i);
        boolean zE = false;
        while (!zE) {
            zE = z.e(sVar, aVar);
            this.f105027i = (b0) o0.i(aVar.f96676a);
        }
        q9.a.e(this.f105027i);
        this.f105028j = Math.max(this.f105027i.f96466c, 6);
        ((s0) o0.i(this.f105024f)).f(this.f105027i.g(this.f105019a, this.f105026h).b().U("audio/flac").N());
        ((s0) o0.i(this.f105024f)).d(this.f105027i.f());
        this.f105025g = 4;
    }

    private void m(s sVar) throws n9.x {
        z.i(sVar);
        this.f105025g = 3;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws n9.x {
        int i10 = this.f105025g;
        if (i10 == 0) {
            k(sVar);
            return 0;
        }
        if (i10 == 1) {
            h(sVar);
            return 0;
        }
        if (i10 == 2) {
            m(sVar);
            return 0;
        }
        if (i10 == 3) {
            l(sVar);
            return 0;
        }
        if (i10 == 4) {
            f(sVar);
            return 0;
        }
        if (i10 == 5) {
            return j(sVar, l0Var);
        }
        throw new IllegalStateException();
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f105023e = tVar;
        this.f105024f = tVar.track(0, 1);
        tVar.endTracks();
    }

    @Override // oa.r
    public boolean c(s sVar) throws Throwable {
        z.c(sVar, false);
        return z.a(sVar);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f105025g = 0;
        } else {
            b bVar = this.f105030l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f105032n = j11 != 0 ? -1L : 0L;
        this.f105031m = 0;
        this.f105020b.S(0);
    }

    public d(int i10) {
        this.f105019a = new byte[42];
        this.f105020b = new d0(new byte[32768], 0);
        this.f105021c = (i10 & 1) != 0;
        this.f105022d = new y.a();
        this.f105025g = 0;
    }

    @Override // oa.r
    public void release() {
    }
}
