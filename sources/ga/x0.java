package ga;

import android.net.Uri;
import android.os.Looper;
import com.google.common.base.Supplier;
import ga.f0;
import ga.n0;
import ga.r0;
import ga.w0;
import ga.x0;
import lb.t;
import n9.e0;
import n9.r;
import s9.g;
import v9.c2;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends ga.a implements w0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g.a f72521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r0.a f72522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z9.w f72523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ka.m f72524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f72525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f72526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f72527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Supplier f72528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f72529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f72530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f72531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f72532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private s9.y f72533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private n9.r f72534u;

    class a extends w {
        a(n9.e0 e0Var) {
            super(e0Var);
        }

        @Override // ga.w, n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f95259f = true;
            return bVar;
        }

        @Override // ga.w, n9.e0
        public e0.c o(int i10, e0.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f95281k = true;
            return cVar;
        }
    }

    public static final class b implements f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.a f72536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r0.a f72537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z9.z f72538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ka.m f72539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f72540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Supplier f72541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f72542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private io.bidmachine.media3.common.a f72543h;

        public b(g.a aVar, final oa.x xVar) {
            this(aVar, new r0.a() { // from class: ga.y0
                @Override // ga.r0.a
                public final r0 a(c2 c2Var) {
                    return x0.b.f(xVar, c2Var);
                }
            });
        }

        public static /* synthetic */ r0 f(oa.x xVar, c2 c2Var) {
            return new d(xVar);
        }

        @Override // ga.f0.a
        public /* synthetic */ f0.a a(t.a aVar) {
            return e0.c(this, aVar);
        }

        @Override // ga.f0.a
        public /* synthetic */ f0.a b(int i10) {
            return e0.b(this, i10);
        }

        @Override // ga.f0.a
        public /* synthetic */ f0.a experimentalParseSubtitlesDuringExtraction(boolean z10) {
            return e0.a(this, z10);
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public x0 e(n9.r rVar) {
            q9.a.e(rVar.f95455b);
            return new x0(rVar, this.f72536a, this.f72537b, this.f72538c.a(rVar), this.f72539d, this.f72540e, this.f72542g, this.f72543h, this.f72541f, null);
        }

        b h(int i10, io.bidmachine.media3.common.a aVar) {
            this.f72542g = i10;
            this.f72543h = (io.bidmachine.media3.common.a) q9.a.e(aVar);
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b d(z9.z zVar) {
            this.f72538c = (z9.z) q9.a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(ka.m mVar) {
            this.f72539d = (ka.m) q9.a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(g.a aVar, r0.a aVar2) {
            this(aVar, aVar2, new z9.l(), new ka.k(), 1048576);
        }

        public b(g.a aVar, r0.a aVar2, z9.z zVar, ka.m mVar, int i10) {
            this.f72536a = aVar;
            this.f72537b = aVar2;
            this.f72538c = zVar;
            this.f72539d = mVar;
            this.f72540e = i10;
        }
    }

    /* synthetic */ x0(n9.r rVar, g.a aVar, r0.a aVar2, z9.w wVar, ka.m mVar, int i10, int i11, io.bidmachine.media3.common.a aVar3, Supplier supplier, a aVar4) {
        this(rVar, aVar, aVar2, wVar, mVar, i10, i11, aVar3, supplier);
    }

    private r.h y() {
        return (r.h) q9.a.e(getMediaItem().f95455b);
    }

    private void z() {
        n9.e0 f1Var = new f1(this.f72530q, this.f72531r, false, this.f72532s, null, getMediaItem());
        if (this.f72529p) {
            f1Var = new a(f1Var);
        }
        w(f1Var);
    }

    @Override // ga.w0.c
    public void b(long j10, oa.m0 m0Var, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f72530q;
        }
        boolean zIsSeekable = m0Var.isSeekable();
        if (!this.f72529p && this.f72530q == j10 && this.f72531r == zIsSeekable && this.f72532s == z10) {
            return;
        }
        this.f72530q = j10;
        this.f72531r = zIsSeekable;
        this.f72532s = z10;
        this.f72529p = false;
        z();
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        ((w0) c0Var).T();
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        s9.g gVarCreateDataSource = this.f72521h.createDataSource();
        s9.y yVar = this.f72533t;
        if (yVar != null) {
            gVarCreateDataSource.a(yVar);
        }
        r.h hVarY = y();
        Uri uri = hVarY.f95547a;
        r0 r0VarA = this.f72522i.a(t());
        z9.w wVar = this.f72523j;
        u.a aVarO = o(bVar);
        ka.m mVar = this.f72524k;
        n0.a aVarQ = q(bVar);
        String str = hVarY.f95551e;
        int i10 = this.f72525l;
        int i11 = this.f72526m;
        io.bidmachine.media3.common.a aVar = this.f72527n;
        long jP0 = q9.o0.P0(hVarY.f95555i);
        Supplier supplier = this.f72528o;
        return new w0(uri, gVarCreateDataSource, r0VarA, wVar, aVarO, mVar, aVarQ, this, bVar2, str, i10, i11, aVar, jP0, supplier != null ? (la.b) supplier.get() : null);
    }

    @Override // ga.f0
    public synchronized n9.r getMediaItem() {
        return this.f72534u;
    }

    @Override // ga.a, ga.f0
    public synchronized void h(n9.r rVar) {
        this.f72534u = rVar;
    }

    @Override // ga.a
    protected void v(s9.y yVar) {
        this.f72533t = yVar;
        this.f72523j.c((Looper) q9.a.e(Looper.myLooper()), t());
        this.f72523j.prepare();
        z();
    }

    @Override // ga.a
    protected void x() {
        this.f72523j.release();
    }

    private x0(n9.r rVar, g.a aVar, r0.a aVar2, z9.w wVar, ka.m mVar, int i10, int i11, io.bidmachine.media3.common.a aVar3, Supplier supplier) {
        this.f72534u = rVar;
        this.f72521h = aVar;
        this.f72522i = aVar2;
        this.f72523j = wVar;
        this.f72524k = mVar;
        this.f72525l = i10;
        this.f72527n = aVar3;
        this.f72526m = i11;
        this.f72529p = true;
        this.f72530q = -9223372036854775807L;
        this.f72528o = supplier;
    }

    @Override // ga.f0
    public void maybeThrowSourceInfoRefreshError() {
    }
}
