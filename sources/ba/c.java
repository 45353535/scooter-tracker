package ba;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import ba.c;
import ba.f;
import ba.g;
import ba.i;
import ba.k;
import com.google.common.collect.Iterables;
import ga.b0;
import ga.n0;
import ga.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ka.m;
import ka.o;
import ka.r;
import n9.x;
import q9.o0;
import s9.k;
import s9.t;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements k, o.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k.a f5970q = new k.a() { // from class: ba.b
        @Override // ba.k.a
        public final k a(aa.d dVar, m mVar, j jVar, ka.f fVar) {
            return new c(dVar, mVar, jVar, fVar);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aa.d f5971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f5972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f5973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f5974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList f5975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f5976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n0.a f5977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f5978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f5979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k.e f5980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f5981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Uri f5982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f5983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f5985p;

    private class b implements k.b {
        private b() {
        }

        @Override // ba.k.b
        public boolean d(Uri uri, m.c cVar, boolean z10) {
            C0129c c0129c;
            if (c.this.f5983n == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((g) o0.i(c.this.f5981l)).f6066e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0129c c0129c2 = (C0129c) c.this.f5974e.get(((g.b) list.get(i11)).f6079a);
                    if (c0129c2 != null && jElapsedRealtime < c0129c2.f5994i) {
                        i10++;
                    }
                }
                m.b bVarA = c.this.f5973d.a(new m.a(1, 0, c.this.f5981l.f6066e.size(), i10), cVar);
                if (bVarA != null && bVarA.f93107a == 2 && (c0129c = (C0129c) c.this.f5974e.get(uri)) != null) {
                    c0129c.l(bVarA.f93108b);
                }
            }
            return false;
        }

        @Override // ba.k.b
        public void onPlaylistChanged() {
            c.this.f5975f.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ba.c$c, reason: collision with other inner class name */
    final class C0129c implements o.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f5987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o f5988c = new o("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s9.g f5989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f f5990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f5991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f5992g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5993h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f5994i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f5995j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private IOException f5996k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f5997l;

        public C0129c(Uri uri) {
            this.f5987b = uri;
            this.f5989d = c.this.f5971b.createDataSource(4);
        }

        public static /* synthetic */ void a(C0129c c0129c, Uri uri) {
            c0129c.f5995j = false;
            c0129c.r(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l(long j10) {
            this.f5994i = SystemClock.elapsedRealtime() + j10;
            return this.f5987b.equals(c.this.f5982m) && !c.this.F();
        }

        private Uri m() {
            f fVar = this.f5990e;
            if (fVar != null) {
                f.h hVar = fVar.f6021v;
                if (hVar.f6059a != -9223372036854775807L || hVar.f6063e) {
                    Uri.Builder builderBuildUpon = this.f5987b.buildUpon();
                    f fVar2 = this.f5990e;
                    if (fVar2.f6021v.f6063e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f6010k + ((long) fVar2.f6017r.size())));
                        f fVar3 = this.f5990e;
                        if (fVar3.f6013n != -9223372036854775807L) {
                            List list = fVar3.f6018s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.d) Iterables.getLast(list)).f6042n) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.h hVar2 = this.f5990e.f6021v;
                    if (hVar2.f6059a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f6060b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f5987b;
        }

        private void r(Uri uri) {
            r.a aVarA = c.this.f5972c.a(c.this.f5981l, this.f5990e);
            s9.k kVarA = new k.b().i(uri).b(1).a();
            c.l(c.this);
            r rVar = new r(this.f5989d, kVarA, 4, aVarA);
            this.f5988c.m(rVar, this, c.this.f5973d.getMinimumLoadableRetryCount(rVar.f93135c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(final Uri uri) {
            this.f5994i = 0L;
            if (this.f5995j || this.f5988c.i() || this.f5988c.h()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f5993h) {
                r(uri);
            } else {
                this.f5995j = true;
                c.this.f5979j.postDelayed(new Runnable() { // from class: ba.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0129c.a(this.f5999b, uri);
                    }
                }, this.f5993h - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(f fVar, y yVar) {
            boolean z10;
            f fVar2 = this.f5990e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f5991f = jElapsedRealtime;
            f fVarZ = c.this.z(fVar2, fVar);
            this.f5990e = fVarZ;
            IOException dVar = null;
            if (fVarZ != fVar2) {
                this.f5996k = null;
                this.f5992g = jElapsedRealtime;
                c.this.M(this.f5987b, fVarZ);
            } else if (!fVarZ.f6014o) {
                if (fVar.f6010k + ((long) fVar.f6017r.size()) < this.f5990e.f6010k) {
                    dVar = new k.c(this.f5987b);
                    z10 = true;
                } else {
                    z10 = false;
                    if (jElapsedRealtime - this.f5992g > o0.q1(r13.f6012m) * c.this.f5976g) {
                        dVar = new k.d(this.f5987b);
                    }
                }
                if (dVar != null) {
                    this.f5996k = dVar;
                    c.this.H(this.f5987b, new m.c(yVar, new b0(4), dVar, 1), z10);
                }
            }
            f fVar3 = this.f5990e;
            this.f5993h = (jElapsedRealtime + o0.q1(!fVar3.f6021v.f6063e ? fVar3 != fVar2 ? fVar3.f6012m : fVar3.f6012m / 2 : 0L)) - yVar.f72550f;
            if (this.f5990e.f6014o) {
                return;
            }
            if (this.f5987b.equals(c.this.f5982m) || this.f5997l) {
                s(m());
            }
        }

        public void A(boolean z10) {
            this.f5997l = z10;
        }

        public f n() {
            return this.f5990e;
        }

        public boolean o() {
            return this.f5997l;
        }

        public boolean p() {
            int i10;
            if (this.f5990e == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, o0.q1(this.f5990e.f6020u));
            f fVar = this.f5990e;
            return fVar.f6014o || (i10 = fVar.f6003d) == 2 || i10 == 1 || this.f5991f + jMax > jElapsedRealtime;
        }

        public void q(boolean z10) {
            s(z10 ? m() : this.f5987b);
        }

        public void t() throws IOException {
            this.f5988c.maybeThrowError();
            IOException iOException = this.f5996k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void h(r rVar, long j10, long j11, boolean z10) {
            y yVar = new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
            c.this.f5973d.onLoadTaskConcluded(rVar.f93133a);
            c.this.f5977h.l(yVar, 4);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void f(r rVar, long j10, long j11) {
            h hVar = (h) rVar.c();
            y yVar = new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
            if (hVar instanceof f) {
                y((f) hVar, yVar);
                c.this.f5977h.o(yVar, 4);
            } else {
                this.f5996k = x.c("Loaded playlist has unexpected type.", null);
                c.this.f5977h.s(yVar, 4, this.f5996k, true);
            }
            c.this.f5973d.onLoadTaskConcluded(rVar.f93133a);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public o.c g(r rVar, long j10, long j11, IOException iOException, int i10) {
            o.c cVarG;
            y yVar = new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
            boolean z10 = iOException instanceof i.a;
            if ((rVar.d().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof t ? ((t) iOException).f99887e : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f5993h = SystemClock.elapsedRealtime();
                    q(false);
                    ((n0.a) o0.i(c.this.f5977h)).s(yVar, rVar.f93135c, iOException, true);
                    return o.f93115f;
                }
            }
            m.c cVar = new m.c(yVar, new b0(rVar.f93135c), iOException, i10);
            if (c.this.H(this.f5987b, cVar, false)) {
                long jB = c.this.f5973d.b(cVar);
                cVarG = jB != -9223372036854775807L ? o.g(false, jB) : o.f93116g;
            } else {
                cVarG = o.f93115f;
            }
            boolean zC = cVarG.c();
            c.this.f5977h.s(yVar, rVar.f93135c, iOException, !zC);
            if (!zC) {
                c.this.f5973d.onLoadTaskConcluded(rVar.f93133a);
            }
            return cVarG;
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void i(r rVar, long j10, long j11, int i10) {
            c.this.f5977h.u(i10 == 0 ? new y(rVar.f93133a, rVar.f93134b, j10) : new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a()), rVar.f93135c, i10);
        }

        public void z() {
            this.f5988c.k();
        }
    }

    public c(aa.d dVar, m mVar, j jVar, ka.f fVar) {
        this(dVar, mVar, jVar, fVar, 3.5d);
    }

    private int A(f fVar, f fVar2) {
        f.C0130f c0130fY;
        if (fVar2.f6008i) {
            return fVar2.f6009j;
        }
        f fVar3 = this.f5983n;
        return (fVar == null || (c0130fY = y(fVar, fVar2)) == null) ? fVar3 != null ? fVar3.f6009j : 0 : (fVar.f6009j + c0130fY.f6051e) - ((f.C0130f) fVar2.f6017r.get(0)).f6051e;
    }

    private long B(f fVar, f fVar2) {
        if (fVar2.f6015p) {
            return fVar2.f6007h;
        }
        f fVar3 = this.f5983n;
        long j10 = fVar3 != null ? fVar3.f6007h : 0L;
        if (fVar != null) {
            int size = fVar.f6017r.size();
            f.C0130f c0130fY = y(fVar, fVar2);
            if (c0130fY != null) {
                return fVar.f6007h + c0130fY.f6052f;
            }
            if (size == fVar2.f6010k - fVar.f6010k) {
                return fVar.d();
            }
        }
        return j10;
    }

    private Uri C(Uri uri) {
        f.e eVar;
        f fVar = this.f5983n;
        if (fVar == null || !fVar.f6021v.f6063e || (eVar = (f.e) fVar.f6019t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f6044b));
        int i10 = eVar.f6045c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    private boolean D(Uri uri) {
        List list = this.f5981l.f6066e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((g.b) list.get(i10)).f6079a)) {
                return true;
            }
        }
        return false;
    }

    private void E(Uri uri) {
        C0129c c0129c = (C0129c) this.f5974e.get(uri);
        f fVarN = c0129c.n();
        if (c0129c.o()) {
            return;
        }
        c0129c.A(true);
        if (fVarN == null || fVarN.f6014o) {
            return;
        }
        c0129c.q(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        List list = this.f5981l.f6066e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0129c c0129c = (C0129c) q9.a.e((C0129c) this.f5974e.get(((g.b) list.get(i10)).f6079a));
            if (jElapsedRealtime > c0129c.f5994i) {
                Uri uri = c0129c.f5987b;
                this.f5982m = uri;
                c0129c.s(C(uri));
                return true;
            }
        }
        return false;
    }

    private void G(Uri uri) {
        if (uri.equals(this.f5982m) || !D(uri)) {
            return;
        }
        f fVar = this.f5983n;
        if (fVar == null || !fVar.f6014o) {
            this.f5982m = uri;
            C0129c c0129c = (C0129c) this.f5974e.get(uri);
            f fVar2 = c0129c.f5990e;
            if (fVar2 == null || !fVar2.f6014o) {
                c0129c.s(C(uri));
            } else {
                this.f5983n = fVar2;
                this.f5980k.d(fVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(Uri uri, m.c cVar, boolean z10) {
        Iterator it = this.f5975f.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((k.b) it.next()).d(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(Uri uri, f fVar) {
        if (uri.equals(this.f5982m)) {
            if (this.f5983n == null) {
                this.f5984o = !fVar.f6014o;
                this.f5985p = fVar.f6007h;
            }
            this.f5983n = fVar;
            this.f5980k.d(fVar);
        }
        Iterator it = this.f5975f.iterator();
        while (it.hasNext()) {
            ((k.b) it.next()).onPlaylistChanged();
        }
    }

    static /* synthetic */ ka.f l(c cVar) {
        cVar.getClass();
        return null;
    }

    private void x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f5974e.put(uri, new C0129c(uri));
        }
    }

    private static f.C0130f y(f fVar, f fVar2) {
        int i10 = (int) (fVar2.f6010k - fVar.f6010k);
        List list = fVar.f6017r;
        if (i10 < list.size()) {
            return (f.C0130f) list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f z(f fVar, f fVar2) {
        return !fVar2.e(fVar) ? fVar2.f6014o ? fVar.c() : fVar : fVar2.b(B(fVar, fVar2), A(fVar, fVar2));
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void h(r rVar, long j10, long j11, boolean z10) {
        y yVar = new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        this.f5973d.onLoadTaskConcluded(rVar.f93133a);
        this.f5977h.l(yVar, 4);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void f(r rVar, long j10, long j11) {
        h hVar = (h) rVar.c();
        boolean z10 = hVar instanceof f;
        g gVarD = z10 ? g.d(hVar.f6085a) : (g) hVar;
        this.f5981l = gVarD;
        this.f5982m = ((g.b) gVarD.f6066e.get(0)).f6079a;
        this.f5975f.add(new b());
        x(gVarD.f6065d);
        y yVar = new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        C0129c c0129c = (C0129c) this.f5974e.get(this.f5982m);
        if (z10) {
            c0129c.y((f) hVar, yVar);
        } else {
            c0129c.q(false);
        }
        this.f5973d.onLoadTaskConcluded(rVar.f93133a);
        this.f5977h.o(yVar, 4);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public o.c g(r rVar, long j10, long j11, IOException iOException, int i10) {
        y yVar = new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        long jB = this.f5973d.b(new m.c(yVar, new b0(rVar.f93135c), iOException, i10));
        boolean z10 = jB == -9223372036854775807L;
        this.f5977h.s(yVar, rVar.f93135c, iOException, z10);
        if (z10) {
            this.f5973d.onLoadTaskConcluded(rVar.f93133a);
        }
        return z10 ? o.f93116g : o.g(false, jB);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void i(r rVar, long j10, long j11, int i10) {
        this.f5977h.u(i10 == 0 ? new y(rVar.f93133a, rVar.f93134b, j10) : new y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a()), rVar.f93135c, i10);
    }

    @Override // ba.k
    public void a(k.b bVar) {
        this.f5975f.remove(bVar);
    }

    @Override // ba.k
    public void b(Uri uri, n0.a aVar, k.e eVar) {
        this.f5979j = o0.A();
        this.f5977h = aVar;
        this.f5980k = eVar;
        r rVar = new r(this.f5971b.createDataSource(4), new k.b().i(uri).b(1).a(), 4, this.f5972c.createPlaylistParser());
        q9.a.g(this.f5978i == null);
        o oVar = new o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f5978i = oVar;
        oVar.m(rVar, this, this.f5973d.getMinimumLoadableRetryCount(rVar.f93135c));
    }

    @Override // ba.k
    public void c(k.b bVar) {
        q9.a.e(bVar);
        this.f5975f.add(bVar);
    }

    @Override // ba.k
    public void deactivatePlaylistForPlayback(Uri uri) {
        C0129c c0129c = (C0129c) this.f5974e.get(uri);
        if (c0129c != null) {
            c0129c.A(false);
        }
    }

    @Override // ba.k
    public boolean excludeMediaPlaylist(Uri uri, long j10) {
        if (((C0129c) this.f5974e.get(uri)) != null) {
            return !r2.l(j10);
        }
        return false;
    }

    @Override // ba.k
    public long getInitialStartTimeUs() {
        return this.f5985p;
    }

    @Override // ba.k
    public g getMultivariantPlaylist() {
        return this.f5981l;
    }

    @Override // ba.k
    public f getPlaylistSnapshot(Uri uri, boolean z10) {
        f fVarN = ((C0129c) this.f5974e.get(uri)).n();
        if (fVarN != null && z10) {
            G(uri);
            E(uri);
        }
        return fVarN;
    }

    @Override // ba.k
    public boolean isLive() {
        return this.f5984o;
    }

    @Override // ba.k
    public boolean isSnapshotValid(Uri uri) {
        return ((C0129c) this.f5974e.get(uri)).p();
    }

    @Override // ba.k
    public void maybeThrowPlaylistRefreshError(Uri uri) throws IOException {
        ((C0129c) this.f5974e.get(uri)).t();
    }

    @Override // ba.k
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        o oVar = this.f5978i;
        if (oVar != null) {
            oVar.maybeThrowError();
        }
        Uri uri = this.f5982m;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // ba.k
    public void refreshPlaylist(Uri uri) {
        ((C0129c) this.f5974e.get(uri)).q(true);
    }

    @Override // ba.k
    public void stop() {
        this.f5982m = null;
        this.f5983n = null;
        this.f5981l = null;
        this.f5985p = -9223372036854775807L;
        this.f5978i.k();
        this.f5978i = null;
        Iterator it = this.f5974e.values().iterator();
        while (it.hasNext()) {
            ((C0129c) it.next()).z();
        }
        this.f5979j.removeCallbacksAndMessages(null);
        this.f5979j = null;
        this.f5974e.clear();
    }

    public c(aa.d dVar, m mVar, j jVar, ka.f fVar, double d10) {
        this.f5971b = dVar;
        this.f5972c = jVar;
        this.f5973d = mVar;
        this.f5976g = d10;
        this.f5975f = new CopyOnWriteArrayList();
        this.f5974e = new HashMap();
        this.f5985p = -9223372036854775807L;
    }
}
