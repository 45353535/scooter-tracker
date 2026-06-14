package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements s, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public boolean A;
    public long C;
    public int E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f22873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f22875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f22876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f22877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f22878g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f22881j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f22887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.q f22888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f22894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f22895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean[] f22896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean[] f22897z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22879h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 f22880i = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f22882k = new com.fyber.inneractive.sdk.player.exoplayer2.util.e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f22883l = new i(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f22884m = new j(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f22885n = new Handler();
    public long D = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f22886o = new SparseArray();
    public long B = -1;

    public p(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, int i10, Handler handler, b0 b0Var, t tVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f22872a = uri;
        this.f22873b = hVar;
        this.f22874c = i10;
        this.f22875d = handler;
        this.f22876e = b0Var;
        this.f22877f = tVar;
        this.f22878g = bVar;
        this.f22881j = new n(iVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f22865i;
        }
        if (z10 || this.f22893v <= 0) {
            return;
        }
        int size = this.f22886o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i10)).a(this.f22896y[i10]);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f22887p;
        lVar.getClass();
        lVar.f22696f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean z10 = false;
        if (this.F || (this.f22890s && this.f22893v == 0)) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f22882k;
        synchronized (eVar) {
            if (!eVar.f23107a) {
                eVar.f23107a = true;
                eVar.notifyAll();
                z10 = true;
            }
        }
        if (this.f22880i.a()) {
            return z10;
        }
        i();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        long jMax;
        if (this.F) {
            return Long.MIN_VALUE;
        }
        long j10 = this.D;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        int i10 = 0;
        if (this.A) {
            int size = this.f22886o.size();
            jMax = Long.MAX_VALUE;
            while (i10 < size) {
                if (this.f22897z[i10]) {
                    jMax = Math.min(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i10)).d());
                }
                i10++;
            }
        } else {
            int size2 = this.f22886o.size();
            jMax = Long.MIN_VALUE;
            while (i10 < size2) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i10)).d());
                i10++;
            }
        }
        return jMax == Long.MIN_VALUE ? this.C : jMax;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        this.f22880i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f22885n.post(this.f22883l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        if (this.f22893v == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        if (!this.f22892u) {
            return -9223372036854775807L;
        }
        this.f22892u = false;
        return this.C;
    }

    public final int h() {
        int size = this.f22886o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i11)).f21795c;
            i10 += eVar.f21759j + eVar.f21758i;
        }
        return i10;
    }

    public final void i() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = new m(this, this.f22872a, this.f22873b, this.f22881j, this.f22882k);
        if (this.f22890s) {
            long j10 = this.D;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.f22895x;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.F = true;
                this.D = -9223372036854775807L;
                return;
            }
            long jA = this.f22888q.a(j10);
            long j12 = this.D;
            mVar.f22861e.f22310a = jA;
            mVar.f22864h = j12;
            mVar.f22863g = true;
            this.D = -9223372036854775807L;
        }
        this.E = h();
        int i10 = this.f22874c;
        if (i10 == -1) {
            i10 = (this.f22890s && this.B == -1 && ((qVar = this.f22888q) == null || qVar.c() == -9223372036854775807L)) ? 6 : 3;
        }
        int i11 = i10;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.f22880i;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, looperMyLooper, mVar, this, i11, SystemClock.elapsedRealtime());
        if (b0Var.f22944b != null) {
            throw new IllegalStateException();
        }
        b0Var.f22944b = yVar;
        yVar.f23095e = null;
        b0Var.f22943a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f22865i;
        }
        this.F = true;
        if (this.f22895x == -9223372036854775807L) {
            int size = this.f22886o.size();
            long jMax = Long.MIN_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i10)).d());
            }
            long j12 = jMax == Long.MIN_VALUE ? 0L : 10000 + jMax;
            this.f22895x = j12;
            this.f22877f.a(new x(j12, j12, 0L, 0L, this.f22888q.a(), false), null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f22887p;
        lVar.getClass();
        lVar.f22696f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f22889r = true;
        this.f22885n.post(this.f22883l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, IOException iOException) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f22865i;
        }
        Handler handler = this.f22875d;
        if (handler != null && this.f22876e != null) {
            handler.post(new l(this, iOException));
        }
        if ((iOException instanceof a0) || (iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v)) {
            return 3;
        }
        if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.u) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException))) {
            return 3;
        }
        int i10 = h() > this.E ? 1 : 0;
        if (this.B == -1 && ((qVar = this.f22888q) == null || qVar.c() == -9223372036854775807L)) {
            this.C = 0L;
            this.f22892u = this.f22890s;
            int size = this.f22886o.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i11)).a(!this.f22890s || this.f22896y[i11]);
            }
            mVar.f22861e.f22310a = 0L;
            mVar.f22864h = 0L;
            mVar.f22863g = true;
        }
        this.E = h();
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        this.f22887p = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f22882k;
        synchronized (eVar) {
            if (!eVar.f23107a) {
                eVar.f23107a = true;
                eVar.notifyAll();
            }
        }
        i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f22894w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar;
        if (this.f22890s) {
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                v vVar = vVarArr[i10];
                if (vVar != null && (bVarArr[i10] == null || !zArr[i10])) {
                    int i11 = ((o) vVar).f22870a;
                    boolean[] zArr3 = this.f22896y;
                    if (zArr3[i11]) {
                        this.f22893v--;
                        zArr3[i11] = false;
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i11)).b();
                        vVarArr[i10] = null;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            boolean z10 = false;
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                if (vVarArr[i12] == null && (bVar = bVarArr[i12]) != null) {
                    int[] iArr = bVar.f22927c;
                    if (iArr.length == 1) {
                        if (iArr[0] == 0) {
                            z zVar = this.f22894w;
                            y yVar = bVar.f22925a;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= zVar.f22917a) {
                                    i13 = -1;
                                    break;
                                }
                                if (zVar.f22918b[i13] == yVar) {
                                    break;
                                }
                                i13++;
                            }
                            boolean[] zArr4 = this.f22896y;
                            if (!zArr4[i13]) {
                                this.f22893v++;
                                zArr4[i13] = true;
                                vVarArr[i12] = new o(this, i13);
                                zArr2[i12] = true;
                                z10 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (!this.f22891t) {
                int size = this.f22886o.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (!this.f22896y[i14]) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i14)).b();
                    }
                }
            }
            if (this.f22893v == 0) {
                this.f22892u = false;
                if (this.f22880i.a()) {
                    this.f22880i.f22944b.a(false);
                }
            } else if (!this.f22891t ? j10 != 0 : z10) {
                j10 = a(j10);
                for (int i15 = 0; i15 < vVarArr.length; i15++) {
                    if (vVarArr[i15] != null) {
                        zArr2[i15] = true;
                    }
                }
            }
            this.f22891t = true;
            return j10;
        }
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        if (!this.f22888q.a()) {
            j10 = 0;
        }
        this.C = j10;
        int size = this.f22886o.size();
        boolean zA = !(this.D != -9223372036854775807L);
        for (int i10 = 0; zA && i10 < size; i10++) {
            if (this.f22896y[i10]) {
                zA = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i10)).a(false, j10);
            }
        }
        if (!zA) {
            this.D = j10;
            this.F = false;
            if (this.f22880i.a()) {
                this.f22880i.f22944b.a(false);
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.valueAt(i11)).a(this.f22896y[i11]);
                }
            }
        }
        this.f22892u = false;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f22886o.get(i10);
        if (gVar != null) {
            return gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f22878g);
        gVar2.f21806n = this;
        this.f22886o.put(i10, gVar2);
        return gVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar) {
        this.f22888q = qVar;
        this.f22885n.post(this.f22883l);
    }
}
