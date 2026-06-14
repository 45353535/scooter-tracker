package ga;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import ga.f0;
import ga.n0;
import io.bidmachine.media3.common.a;
import n9.r;
import s9.g;
import s9.k;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 extends ga.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s9.k f72332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g.a f72333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f72334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f72335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ka.m f72336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f72337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n9.e0 f72338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n9.r f72339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Supplier f72340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private s9.y f72341q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.a f72342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ka.m f72343b = new ka.k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f72344c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f72345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f72346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Supplier f72347f;

        public b(g.a aVar) {
            this.f72342a = (g.a) q9.a.e(aVar);
        }

        public h1 a(r.k kVar, long j10) {
            return new h1(this.f72346e, kVar, this.f72342a, j10, this.f72343b, this.f72344c, this.f72345d, this.f72347f);
        }

        public b b(ka.m mVar) {
            if (mVar == null) {
                mVar = new ka.k();
            }
            this.f72343b = mVar;
            return this;
        }
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        ((g1) c0Var).n();
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        s9.k kVar = this.f72332h;
        g.a aVar = this.f72333i;
        s9.y yVar = this.f72341q;
        io.bidmachine.media3.common.a aVar2 = this.f72334j;
        long j11 = this.f72335k;
        ka.m mVar = this.f72336l;
        n0.a aVarQ = q(bVar);
        boolean z10 = this.f72337m;
        Supplier supplier = this.f72340p;
        return new g1(kVar, aVar, yVar, aVar2, j11, mVar, aVarQ, z10, supplier != null ? (la.b) supplier.get() : null);
    }

    @Override // ga.f0
    public n9.r getMediaItem() {
        return this.f72339o;
    }

    @Override // ga.a
    protected void v(s9.y yVar) {
        this.f72341q = yVar;
        w(this.f72338n);
    }

    private h1(String str, r.k kVar, g.a aVar, long j10, ka.m mVar, boolean z10, Object obj, Supplier supplier) {
        this.f72333i = aVar;
        this.f72335k = j10;
        this.f72336l = mVar;
        this.f72337m = z10;
        n9.r rVarA = new r.c().f(Uri.EMPTY).c(kVar.f95573a.toString()).d(ImmutableList.of(kVar)).e(obj).a();
        this.f72339o = rVarA;
        a.b bVarH0 = new a.b().u0((String) MoreObjects.firstNonNull(kVar.f95574b, "text/x-unknown")).j0(kVar.f95575c).w0(kVar.f95576d).s0(kVar.f95577e).h0(kVar.f95578f);
        String str2 = kVar.f95579g;
        this.f72334j = bVarH0.f0(str2 != null ? str2 : str).N();
        this.f72332h = new k.b().i(kVar.f95573a).b(1).a();
        this.f72338n = new f1(j10, true, false, false, null, rVarA);
        this.f72340p = supplier;
    }

    @Override // ga.f0
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // ga.a
    protected void x() {
    }
}
