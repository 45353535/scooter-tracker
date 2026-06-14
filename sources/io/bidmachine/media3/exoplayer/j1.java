package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import ga.c0;
import ga.f0;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.e2;
import io.bidmachine.media3.exoplayer.g;
import io.bidmachine.media3.exoplayer.g2;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.j2;
import io.bidmachine.media3.exoplayer.k;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.l1;
import io.bidmachine.media3.exoplayer.m1;
import j$.util.Objects;
import ja.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.e0;
import n9.r;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
final class j1 implements Handler.Callback, c0.a, w.a, e2.d, k.a, g2.a, g.a {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final long f81105f0 = q9.o0.q1(10000);
    private final q9.q A;
    private final boolean B;
    private final io.bidmachine.media3.exoplayer.g C;
    private u9.m0 D;
    private f2 E;
    private e F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;
    private h S;
    private long T;
    private long U;
    private int V;
    private boolean W;
    private s X;
    private long Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ExoPlayer.c f81106a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2[] f81107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j2[] f81109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f81111d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f81112d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ja.w f81113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ja.x f81115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k1 f81116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ka.e f81117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q9.q f81118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u9.h0 f81119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Looper f81120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e0.c f81121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e0.b f81122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f81123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f81124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k f81125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f81126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q9.h f81127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f81128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p1 f81129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e2 f81130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final u9.e0 f81131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f81132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final v9.c2 f81133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f81134y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final v9.a f81135z;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f81110c0 = -9223372036854775807L;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f81114e0 = 1.0f;
    private long Z = -9223372036854775807L;
    private long K = -9223372036854775807L;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private n9.e0 f81108b0 = n9.e0.f95245a;

    class a implements i2.a {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.i2.a
        public void onSleep() {
            j1.this.P = true;
        }

        @Override // io.bidmachine.media3.exoplayer.i2.a
        public void onWakeup() {
            if (j1.this.f81134y || j1.this.Q) {
                j1.this.f81118i.sendEmptyMessage(2);
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f81137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ga.e1 f81138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f81139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f81140d;

        /* synthetic */ b(List list, ga.e1 e1Var, int i10, long j10, a aVar) {
            this(list, e1Var, i10, j10);
        }

        private b(List list, ga.e1 e1Var, int i10, long j10) {
            this.f81137a = list;
            this.f81138b = e1Var;
            this.f81139c = i10;
            this.f81140d = j10;
        }
    }

    private static class c {
    }

    private static final class d implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g2 f81141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f81142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f81143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f81144e;

        public d(g2 g2Var) {
            this.f81141b = g2Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f81144e;
            if ((obj == null) != (dVar.f81144e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f81142c - dVar.f81142c;
            return i10 != 0 ? i10 : q9.o0.n(this.f81143d, dVar.f81143d);
        }

        public void c(int i10, long j10, Object obj) {
            this.f81142c = i10;
            this.f81143d = j10;
            this.f81144e = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f81145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f2 f81146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f81147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f81148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f81149e;

        public e(f2 f2Var) {
            this.f81146b = f2Var;
        }

        public void b(int i10) {
            this.f81145a |= i10 > 0;
            this.f81147c += i10;
        }

        public void c(f2 f2Var) {
            this.f81145a |= this.f81146b != f2Var;
            this.f81146b = f2Var;
        }

        public void d(int i10) {
            if (this.f81148d && this.f81149e != 5) {
                q9.a.a(i10 == 5);
                return;
            }
            this.f81145a = true;
            this.f81148d = true;
            this.f81149e = i10;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0.b f81150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f81151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f81152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f81153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f81154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f81155f;

        public g(f0.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f81150a = bVar;
            this.f81151b = j10;
            this.f81152c = j11;
            this.f81153d = z10;
            this.f81154e = z11;
            this.f81155f = z12;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n9.e0 f81156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f81158c;

        public h(n9.e0 e0Var, int i10, long j10) {
            this.f81156a = e0Var;
            this.f81157b = i10;
            this.f81158c = j10;
        }
    }

    public j1(Context context, i2[] i2VarArr, i2[] i2VarArr2, ja.w wVar, ja.x xVar, k1 k1Var, ka.e eVar, int i10, boolean z10, v9.a aVar, u9.m0 m0Var, u9.e0 e0Var, long j10, boolean z11, boolean z12, Looper looper, q9.h hVar, f fVar, v9.c2 c2Var, u9.h0 h0Var, ExoPlayer.c cVar) {
        this.f81128s = fVar;
        this.f81113e = wVar;
        this.f81115f = xVar;
        this.f81116g = k1Var;
        this.f81117h = eVar;
        this.M = i10;
        this.N = z10;
        this.D = m0Var;
        this.f81131v = e0Var;
        this.f81132w = j10;
        this.Y = j10;
        this.H = z11;
        this.f81134y = z12;
        this.f81127r = hVar;
        this.f81133x = c2Var;
        this.f81106a0 = cVar;
        this.f81135z = aVar;
        this.f81123n = k1Var.i(c2Var);
        this.f81124o = k1Var.f(c2Var);
        f2 f2VarK = f2.k(xVar);
        this.E = f2VarK;
        this.F = new e(f2VarK);
        this.f81109c = new j2[i2VarArr.length];
        this.f81111d = new boolean[i2VarArr.length];
        j2.a aVarD = wVar.d();
        this.f81107b = new k2[i2VarArr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < i2VarArr.length; i11++) {
            i2VarArr[i11].g(i11, c2Var, hVar);
            this.f81109c[i11] = i2VarArr[i11].getCapabilities();
            if (aVarD != null) {
                this.f81109c[i11].e(aVarD);
            }
            i2 i2Var = i2VarArr2[i11];
            if (i2Var != null) {
                i2Var.g(i2VarArr.length + i11, c2Var, hVar);
                z13 = true;
            }
            this.f81107b[i11] = new k2(i2VarArr[i11], i2VarArr2[i11], i11);
        }
        this.B = z13;
        this.f81125p = new k(this, hVar);
        this.f81126q = new ArrayList();
        this.f81121l = new e0.c();
        this.f81122m = new e0.b();
        wVar.e(this, eVar);
        this.W = true;
        q9.q qVarCreateHandler = hVar.createHandler(looper, null);
        this.A = qVarCreateHandler;
        this.f81129t = new p1(aVar, qVarCreateHandler, new m1.a() { // from class: io.bidmachine.media3.exoplayer.h1
            @Override // io.bidmachine.media3.exoplayer.m1.a
            public final m1 a(n1 n1Var, long j11) {
                return this.f80894a.r(n1Var, j11);
            }
        }, cVar);
        this.f81130u = new e2(this, aVar, qVarCreateHandler, c2Var);
        u9.h0 h0Var2 = h0Var == null ? new u9.h0() : h0Var;
        this.f81119j = h0Var2;
        Looper looperA = h0Var2.a();
        this.f81120k = looperA;
        this.f81118i = hVar.createHandler(looperA, this);
        this.C = new io.bidmachine.media3.exoplayer.g(context, looperA, this);
    }

    private void A0() throws s {
        float f10 = this.f81125p.getPlaybackParameters().f95679a;
        m1 m1VarY = this.f81129t.y();
        ja.x xVar = null;
        boolean z10 = true;
        for (m1 m1VarU = this.f81129t.u(); m1VarU != null && m1VarU.f81209f; m1VarU = m1VarU.k()) {
            f2 f2Var = this.E;
            ja.x xVarZ = m1VarU.z(f10, f2Var.f80828a, f2Var.f80839l);
            if (m1VarU == this.f81129t.u()) {
                xVar = xVarZ;
            }
            if (!xVarZ.a(m1VarU.p())) {
                if (z10) {
                    m1 m1VarU2 = this.f81129t.u();
                    boolean z11 = (this.f81129t.N(m1VarU2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f81107b.length];
                    long jB = m1VarU2.b((ja.x) q9.a.e(xVar), this.E.f80846s, z11, zArr);
                    f2 f2Var2 = this.E;
                    boolean z12 = (f2Var2.f80832e == 4 || jB == f2Var2.f80846s) ? false : true;
                    f2 f2Var3 = this.E;
                    this.E = T(f2Var3.f80829b, jB, f2Var3.f80830c, f2Var3.f80831d, z12, 5);
                    if (z12) {
                        E0(jB);
                    }
                    t();
                    boolean[] zArr2 = new boolean[this.f81107b.length];
                    int i10 = 0;
                    while (true) {
                        k2[] k2VarArr = this.f81107b;
                        if (i10 >= k2VarArr.length) {
                            break;
                        }
                        int iH = k2VarArr[i10].h();
                        zArr2[i10] = this.f81107b[i10].x();
                        this.f81107b[i10].B(m1VarU2.f81206c[i10], this.f81125p, this.T, zArr[i10]);
                        if (iH - this.f81107b[i10].h() > 0) {
                            f0(i10, false);
                        }
                        this.R -= iH - this.f81107b[i10].h();
                        i10++;
                    }
                    z(zArr2, this.T);
                    m1VarU2.f81212i = true;
                } else {
                    this.f81129t.N(m1VarU);
                    if (m1VarU.f81209f) {
                        long jMax = Math.max(m1VarU.f81211h.f81228b, m1VarU.C(this.T));
                        if (this.B && p() && this.f81129t.x() == m1VarU) {
                            t();
                        }
                        m1VarU.a(xVarZ, jMax, false);
                    }
                }
                N(true);
                if (this.E.f80832e != 4) {
                    Z();
                    K1();
                    this.f81118i.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (m1VarU == m1VarY) {
                z10 = false;
            }
        }
    }

    private void A1(boolean z10, boolean z11) {
        C0(z10 || !this.O, false, true, false);
        this.F.b(z11 ? 1 : 0);
        this.f81116g.e(this.f81133x);
        this.C.n(this.E.f80839l, 1);
        o1(1);
    }

    private ImmutableList B(ja.r[] rVarArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z10 = false;
        for (ja.r rVar : rVarArr) {
            if (rVar != null) {
                n9.v vVar = rVar.getFormat(0).f80558l;
                if (vVar == null) {
                    builder.add(new n9.v(new v.a[0]));
                } else {
                    builder.add(vVar);
                    z10 = true;
                }
            }
        }
        return z10 ? builder.build() : ImmutableList.of();
    }

    private void B0() throws s {
        A0();
        N0(true);
    }

    private void B1() {
        this.f81125p.g();
        for (k2 k2Var : this.f81107b) {
            k2Var.W();
        }
    }

    private long C() {
        f2 f2Var = this.E;
        return D(f2Var.f80828a, f2Var.f80829b.f72270a, f2Var.f80846s);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[PHI: r2 r6 r8
  0x0091: PHI (r2v2 ga.f0$b) = (r2v1 ga.f0$b), (r2v12 ga.f0$b) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[PHI: r0
  0x00d8: PHI (r0v11 n9.e0) = (r0v10 n9.e0), (r0v10 n9.e0), (r0v21 n9.e0), (r0v21 n9.e0) binds: [B:31:0x009e, B:33:0x00a2, B:35:0x00b3, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void C0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.C0(boolean, boolean, boolean, boolean):void");
    }

    private void C1() {
        m1 m1VarN = this.f81129t.n();
        boolean z10 = this.L || (m1VarN != null && m1VarN.f81204a.isLoading());
        f2 f2Var = this.E;
        if (z10 != f2Var.f80834g) {
            this.E = f2Var.b(z10);
        }
    }

    private long D(n9.e0 e0Var, Object obj, long j10) {
        e0Var.n(e0Var.h(obj, this.f81122m).f95256c, this.f81121l);
        e0.c cVar = this.f81121l;
        if (cVar.f95276f != -9223372036854775807L && cVar.f()) {
            e0.c cVar2 = this.f81121l;
            if (cVar2.f95279i) {
                return q9.o0.P0(cVar2.a() - this.f81121l.f95276f) - (j10 + this.f81122m.n());
            }
        }
        return -9223372036854775807L;
    }

    private void D0() {
        m1 m1VarU = this.f81129t.u();
        this.I = m1VarU != null && m1VarU.f81211h.f81235i && this.H;
    }

    private void D1(f0.b bVar, ga.m1 m1Var, ja.x xVar) {
        m1 m1Var2 = (m1) q9.a.e(this.f81129t.n());
        this.f81116g.h(new k1.a(this.f81133x, this.E.f80828a, bVar, m1Var2 == this.f81129t.u() ? m1Var2.C(this.T) : m1Var2.C(this.T) - m1Var2.f81211h.f81228b, I(m1Var2.j()), this.f81125p.getPlaybackParameters().f95679a, this.E.f80839l, this.J, x1(this.E.f80828a, m1Var2.f81211h.f81227a) ? this.f81131v.getTargetLiveOffsetUs() : -9223372036854775807L, this.K), m1Var, xVar.f85697c);
    }

    private long E(m1 m1Var) {
        if (m1Var == null) {
            return 0L;
        }
        long jM = m1Var.m();
        if (!m1Var.f81209f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            k2[] k2VarArr = this.f81107b;
            if (i10 >= k2VarArr.length) {
                return jM;
            }
            if (k2VarArr[i10].w(m1Var)) {
                long jK = this.f81107b[i10].k(m1Var);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    private void E0(long j10) {
        m1 m1VarU = this.f81129t.u();
        long jD = m1VarU == null ? j10 + 1000000000000L : m1VarU.D(j10);
        this.T = jD;
        this.f81125p.d(jD);
        for (k2 k2Var : this.f81107b) {
            k2Var.M(m1VarU, this.T);
        }
        q0();
    }

    private void E1(int i10, int i11, List list) throws Throwable {
        this.F.b(1);
        P(this.f81130u.D(i10, i11, list), false);
    }

    private Pair F(n9.e0 e0Var) {
        if (e0Var.q()) {
            return Pair.create(f2.l(), 0L);
        }
        Pair pairJ = e0Var.j(this.f81121l, this.f81122m, e0Var.a(this.N), -9223372036854775807L);
        f0.b bVarQ = this.f81129t.Q(e0Var, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarQ.b()) {
            e0Var.h(bVarQ.f72270a, this.f81122m);
            jLongValue = bVarQ.f72272c == this.f81122m.k(bVarQ.f72271b) ? this.f81122m.g() : 0L;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    private static void F0(n9.e0 e0Var, d dVar, e0.c cVar, e0.b bVar) {
        int i10 = e0Var.n(e0Var.h(dVar.f81144e, bVar).f95256c, cVar).f95285o;
        Object obj = e0Var.g(i10, bVar, true).f95255b;
        long j10 = bVar.f95257d;
        dVar.c(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void F1() throws s {
        if (this.E.f80828a.q() || !this.f81130u.t()) {
            return;
        }
        boolean zH0 = h0();
        l0();
        m0();
        n0();
        j0();
        k0(zH0);
    }

    private static boolean G0(d dVar, n9.e0 e0Var, n9.e0 e0Var2, int i10, boolean z10, e0.c cVar, e0.b bVar) {
        Object obj = dVar.f81144e;
        if (obj == null) {
            Pair pairJ0 = J0(e0Var, new h(dVar.f81141b.g(), dVar.f81141b.c(), dVar.f81141b.e() == Long.MIN_VALUE ? -9223372036854775807L : q9.o0.P0(dVar.f81141b.e())), false, i10, z10, cVar, bVar);
            if (pairJ0 == null) {
                return false;
            }
            dVar.c(e0Var.b(pairJ0.first), ((Long) pairJ0.second).longValue(), pairJ0.first);
            if (dVar.f81141b.e() == Long.MIN_VALUE) {
                F0(e0Var, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = e0Var.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f81141b.e() == Long.MIN_VALUE) {
            F0(e0Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f81142c = iB;
        e0Var2.h(dVar.f81144e, bVar);
        if (bVar.f95259f && e0Var2.n(bVar.f95256c, cVar).f95284n == e0Var2.b(dVar.f81144e)) {
            Pair pairJ = e0Var.j(cVar, bVar, e0Var.h(dVar.f81144e, bVar).f95256c, dVar.f81143d + bVar.n());
            dVar.c(e0Var.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    private static int G1(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    private long H() {
        return I(this.E.f80844q);
    }

    private void H0(n9.e0 e0Var, n9.e0 e0Var2) {
        if (e0Var.q() && e0Var2.q()) {
            return;
        }
        int size = this.f81126q.size() - 1;
        while (size >= 0) {
            n9.e0 e0Var3 = e0Var;
            n9.e0 e0Var4 = e0Var2;
            if (!G0((d) this.f81126q.get(size), e0Var3, e0Var4, this.M, this.N, this.f81121l, this.f81122m)) {
                ((d) this.f81126q.get(size)).f81141b.j(false);
                this.f81126q.remove(size);
            }
            size--;
            e0Var = e0Var3;
            e0Var2 = e0Var4;
        }
        Collections.sort(this.f81126q);
    }

    private void H1() {
        f2 f2Var = this.E;
        I1(f2Var.f80839l, f2Var.f80841n, f2Var.f80840m);
    }

    private long I(long j10) {
        m1 m1VarN = this.f81129t.n();
        if (m1VarN == null) {
            return 0L;
        }
        return Math.max(0L, j10 - m1VarN.C(this.T));
    }

    private static g I0(n9.e0 e0Var, f2 f2Var, h hVar, p1 p1Var, int i10, boolean z10, e0.c cVar, e0.b bVar) {
        int i11;
        long j10;
        long jG;
        int iA;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        n9.e0 e0Var2;
        e0.b bVar2;
        long j11;
        int i12;
        long jLongValue2;
        int iA3;
        boolean z15;
        boolean z16;
        boolean z17;
        if (e0Var.q()) {
            return new g(f2.l(), 0L, -9223372036854775807L, false, true, false);
        }
        f0.b bVar3 = f2Var.f80829b;
        Object obj = bVar3.f72270a;
        boolean zY = Y(f2Var, bVar);
        long j12 = (f2Var.f80829b.b() || zY) ? f2Var.f80830c : f2Var.f80846s;
        if (hVar != null) {
            i11 = -1;
            j10 = -9223372036854775807L;
            Pair pairJ0 = J0(e0Var, hVar, true, i10, z10, cVar, bVar);
            if (pairJ0 == null) {
                iA3 = e0Var.a(z10);
                jLongValue2 = j12;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f81158c == -9223372036854775807L) {
                    iA3 = e0Var.h(pairJ0.first, bVar).f95256c;
                    jLongValue2 = j12;
                    z15 = false;
                } else {
                    obj = pairJ0.first;
                    jLongValue2 = ((Long) pairJ0.second).longValue();
                    iA3 = -1;
                    z15 = true;
                }
                z16 = f2Var.f80832e == 4;
                z17 = false;
            }
            iA = iA3;
            jG = jLongValue2;
            z13 = z15;
            z11 = z16;
            z12 = z17;
        } else {
            i11 = -1;
            j10 = -9223372036854775807L;
            if (f2Var.f80828a.q()) {
                iA = e0Var.a(z10);
            } else if (e0Var.b(obj) == -1) {
                int iK0 = K0(cVar, bVar, i10, z10, obj, f2Var.f80828a, e0Var);
                if (iK0 == -1) {
                    iA2 = e0Var.a(z10);
                    z14 = true;
                } else {
                    iA2 = iK0;
                    z14 = false;
                }
                iA = iA2;
                obj = obj;
                jG = j12;
                z12 = z14;
                z11 = false;
                z13 = false;
            } else if (j12 == -9223372036854775807L) {
                iA = e0Var.h(obj, bVar).f95256c;
                obj = obj;
            } else if (zY) {
                f2Var.f80828a.h(bVar3.f72270a, bVar);
                if (f2Var.f80828a.n(bVar.f95256c, cVar).f95284n == f2Var.f80828a.b(bVar3.f72270a)) {
                    Pair pairJ = e0Var.j(cVar, bVar, e0Var.h(obj, bVar).f95256c, bVar.n() + j12);
                    obj = pairJ.first;
                    jLongValue = ((Long) pairJ.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = j12;
                }
                jG = jLongValue;
                iA = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                obj = obj;
                jG = j12;
                iA = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            jG = j12;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (iA != i11) {
            bVar2 = bVar;
            Pair pairJ2 = e0Var.j(cVar, bVar2, iA, -9223372036854775807L);
            e0Var2 = e0Var;
            obj = pairJ2.first;
            jG = ((Long) pairJ2.second).longValue();
            j11 = j10;
        } else {
            e0Var2 = e0Var;
            bVar2 = bVar;
            j11 = jG;
        }
        f0.b bVarQ = p1Var.Q(e0Var2, obj, jG);
        int i13 = bVarQ.f72274e;
        boolean z18 = bVar3.f72270a.equals(obj) && !bVar3.b() && !bVarQ.b() && (i13 == i11 || ((i12 = bVar3.f72274e) != i11 && i13 >= i12));
        long j13 = j11;
        f0.b bVar4 = bVarQ;
        boolean zV = V(zY, bVar3, j12, bVar4, e0Var2.h(obj, bVar2), j13);
        if (z18 || zV) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jG = f2Var.f80846s;
            } else {
                e0Var2.h(bVar4.f72270a, bVar2);
                jG = bVar4.f72272c == bVar2.k(bVar4.f72271b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, jG, j13, z11, z12, z13);
    }

    private void I1(boolean z10, int i10, int i11) {
        J1(z10, this.C.n(z10, this.E.f80832e), i10, i11);
    }

    private void J(int i10) {
        f2 f2Var = this.E;
        J1(f2Var.f80839l, i10, f2Var.f80841n, f2Var.f80840m);
    }

    private static Pair J0(n9.e0 e0Var, h hVar, boolean z10, int i10, boolean z11, e0.c cVar, e0.b bVar) {
        Pair pairJ;
        n9.e0 e0Var2;
        int iK0;
        n9.e0 e0Var3 = hVar.f81156a;
        if (e0Var.q()) {
            return null;
        }
        boolean zQ = e0Var3.q();
        n9.e0 e0Var4 = e0Var3;
        if (zQ) {
            e0Var4 = e0Var;
        }
        try {
            pairJ = e0Var4.j(cVar, bVar, hVar.f81157b, hVar.f81158c);
            e0Var2 = e0Var4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (e0Var.equals(e0Var2)) {
            return pairJ;
        }
        if (e0Var.b(pairJ.first) != -1) {
            return (e0Var2.h(pairJ.first, bVar).f95259f && e0Var2.n(bVar.f95256c, cVar).f95284n == e0Var2.b(pairJ.first)) ? e0Var.j(cVar, bVar, e0Var.h(pairJ.first, bVar).f95256c, hVar.f81158c) : pairJ;
        }
        if (z10 && (iK0 = K0(cVar, bVar, i10, z11, pairJ.first, e0Var2, e0Var)) != -1) {
            return e0Var.j(cVar, bVar, iK0, -9223372036854775807L);
        }
        return null;
    }

    private void J1(boolean z10, int i10, int i11, int i12) {
        boolean z11 = z10 && i10 != -1;
        int iG1 = G1(i10, i12);
        int iM1 = M1(i10, i11);
        f2 f2Var = this.E;
        if (f2Var.f80839l == z11 && f2Var.f80841n == iM1 && f2Var.f80840m == iG1) {
            return;
        }
        this.E = f2Var.e(z11, iG1, iM1);
        N1(false, false);
        r0(z11);
        if (!v1()) {
            B1();
            K1();
            this.f81129t.K(this.T);
            return;
        }
        int i13 = this.E.f80832e;
        if (i13 == 3) {
            this.f81125p.f();
            y1();
            this.f81118i.sendEmptyMessage(2);
        } else if (i13 == 2) {
            this.f81118i.sendEmptyMessage(2);
        }
    }

    private void K() {
        s1(this.f81114e0);
    }

    static int K0(e0.c cVar, e0.b bVar, int i10, boolean z10, Object obj, n9.e0 e0Var, n9.e0 e0Var2) {
        e0.b bVar2;
        Object obj2 = e0Var.n(e0Var.h(obj, bVar).f95256c, cVar).f95271a;
        int i11 = 0;
        for (int i12 = 0; i12 < e0Var2.p(); i12++) {
            if (e0Var2.n(i12, cVar).f95271a.equals(obj2)) {
                return i12;
            }
        }
        int iB = e0Var.b(obj);
        int i13 = e0Var.i();
        int iD = iB;
        int iB2 = -1;
        while (i11 < i13 && iB2 == -1) {
            e0.c cVar2 = cVar;
            bVar2 = bVar;
            int i14 = i10;
            boolean z11 = z10;
            n9.e0 e0Var3 = e0Var;
            iD = e0Var3.d(iD, bVar2, cVar2, i14, z11);
            if (iD == -1) {
                break;
            }
            iB2 = e0Var2.b(e0Var3.m(iD));
            i11++;
            e0Var = e0Var3;
            bVar = bVar2;
            cVar = cVar2;
            i10 = i14;
            z10 = z11;
        }
        bVar2 = bVar;
        if (iB2 == -1) {
            return -1;
        }
        return e0Var2.f(iB2, bVar2).f95256c;
    }

    private void K1() {
        m1 m1VarU = this.f81129t.u();
        if (m1VarU == null) {
            return;
        }
        long discontinuity = m1VarU.f81209f ? m1VarU.f81204a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            if (!m1VarU.s()) {
                this.f81129t.N(m1VarU);
                N(false);
                Z();
            }
            E0(discontinuity);
            if (discontinuity != this.E.f80846s) {
                f2 f2Var = this.E;
                long j10 = discontinuity;
                this.E = T(f2Var.f80829b, j10, f2Var.f80830c, j10, true, 5);
            }
        } else {
            long jH = this.f81125p.h(m1VarU != this.f81129t.y());
            this.T = jH;
            long jC = m1VarU.C(jH);
            g0(this.E.f80846s, jC);
            if (this.f81125p.hasSkippedSilenceSinceLastCall()) {
                boolean z10 = !this.F.f81148d;
                f2 f2Var2 = this.E;
                this.E = T(f2Var2.f80829b, jC, f2Var2.f80830c, jC, z10, 6);
            } else {
                this.E.o(jC);
            }
        }
        this.E.f80844q = this.f81129t.n().j();
        this.E.f80845r = H();
        f2 f2Var3 = this.E;
        if (f2Var3.f80839l && f2Var3.f80832e == 3 && x1(f2Var3.f80828a, f2Var3.f80829b) && this.E.f80842o.f95679a == 1.0f) {
            float adjustedPlaybackSpeed = this.f81131v.getAdjustedPlaybackSpeed(C(), this.E.f80845r);
            if (this.f81125p.getPlaybackParameters().f95679a != adjustedPlaybackSpeed) {
                Y0(this.E.f80842o.b(adjustedPlaybackSpeed));
                R(this.E.f80842o, this.f81125p.getPlaybackParameters().f95679a, false, false);
            }
        }
    }

    private void L(ga.c0 c0Var) {
        if (this.f81129t.F(c0Var)) {
            this.f81129t.K(this.T);
            Z();
        } else if (this.f81129t.G(c0Var)) {
            a0();
        }
    }

    private void L0(long j10) {
        long jMin = (this.E.f80832e != 3 || (!this.f81134y && v1())) ? f81105f0 : 1000L;
        if (this.f81134y && v1()) {
            for (k2 k2Var : this.f81107b) {
                jMin = Math.min(jMin, q9.o0.q1(k2Var.j(this.T, this.U)));
            }
            if ((this.f81129t.u() != null ? this.f81129t.u().k() : null) != null && this.T + (q9.o0.P0(jMin) * this.E.f80842o.f95679a) >= r2.n()) {
                jMin = Math.min(jMin, f81105f0);
            }
        }
        this.f81118i.sendEmptyMessageAtTime(2, j10 + jMin);
    }

    private void L1(n9.e0 e0Var, f0.b bVar, n9.e0 e0Var2, f0.b bVar2, long j10, boolean z10) {
        if (!x1(e0Var, bVar)) {
            n9.z zVar = bVar.b() ? n9.z.f95676d : this.E.f80842o;
            if (this.f81125p.getPlaybackParameters().equals(zVar)) {
                return;
            }
            Y0(zVar);
            R(this.E.f80842o, zVar.f95679a, false, false);
            return;
        }
        e0Var.n(e0Var.h(bVar.f72270a, this.f81122m).f95256c, this.f81121l);
        this.f81131v.a((r.g) q9.o0.i(this.f81121l.f95280j));
        if (j10 != -9223372036854775807L) {
            this.f81131v.setTargetLiveOffsetOverrideUs(D(e0Var, bVar.f72270a, j10));
            return;
        }
        if (!Objects.equals(!e0Var2.q() ? e0Var2.n(e0Var2.h(bVar2.f72270a, this.f81122m).f95256c, this.f81121l).f95271a : null, this.f81121l.f95271a) || z10) {
            this.f81131v.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private void M(IOException iOException, int i10) {
        s sVarC = s.c(iOException, i10);
        m1 m1VarU = this.f81129t.u();
        if (m1VarU != null) {
            sVarC = sVarC.a(m1VarU.f81211h.f81227a);
        }
        q9.u.d("ExoPlayerImplInternal", "Playback error", sVarC);
        A1(false, false);
        this.E = this.E.f(sVarC);
    }

    private static int M1(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    private void N(boolean z10) {
        m1 m1VarN = this.f81129t.n();
        f0.b bVar = m1VarN == null ? this.E.f80829b : m1VarN.f81211h.f81227a;
        boolean zEquals = this.E.f80838k.equals(bVar);
        if (!zEquals) {
            this.E = this.E.c(bVar);
        }
        f2 f2Var = this.E;
        f2Var.f80844q = m1VarN == null ? f2Var.f80846s : m1VarN.j();
        this.E.f80845r = H();
        if ((!zEquals || z10) && m1VarN != null && m1VarN.f81209f) {
            D1(m1VarN.f81211h.f81227a, m1VarN.o(), m1VarN.p());
        }
    }

    private void N0(boolean z10) throws s {
        f0.b bVar = this.f81129t.u().f81211h.f81227a;
        long jQ0 = Q0(bVar, this.E.f80846s, true, false);
        if (jQ0 != this.E.f80846s) {
            f2 f2Var = this.E;
            this.E = T(bVar, jQ0, f2Var.f80830c, f2Var.f80831d, z10, 5);
        }
    }

    private void N1(boolean z10, boolean z11) {
        this.J = z10;
        this.K = (!z10 || z11) ? -9223372036854775807L : this.f81127r.elapsedRealtime();
    }

    private void O(m1 m1Var) throws s {
        if (!m1Var.f81209f) {
            float f10 = this.f81125p.getPlaybackParameters().f95679a;
            f2 f2Var = this.E;
            m1Var.q(f10, f2Var.f80828a, f2Var.f80839l);
        }
        D1(m1Var.f81211h.f81227a, m1Var.o(), m1Var.p());
        if (m1Var == this.f81129t.u()) {
            E0(m1Var.f81211h.f81228b);
            y();
            m1Var.f81212i = true;
            f2 f2Var2 = this.E;
            f0.b bVar = f2Var2.f80829b;
            long j10 = m1Var.f81211h.f81228b;
            this.E = T(bVar, j10, f2Var2.f80830c, j10, false, 5);
        }
        Z();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:35|(7:(12:94|37|(1:45)(1:43)|46|47|89|48|(1:55)|56|57|58|59)(1:65)|92|77|78|79|58|59)|98|66|(1:68)(1:69)|70|71|(1:73)|74|96|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O0(io.bidmachine.media3.exoplayer.j1.h r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.O0(io.bidmachine.media3.exoplayer.j1$h):void");
    }

    private boolean O1() throws s {
        m1 m1VarY = this.f81129t.y();
        ja.x xVarP = m1VarY.p();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            k2[] k2VarArr = this.f81107b;
            if (i10 >= k2VarArr.length) {
                break;
            }
            int iH = k2VarArr[i10].h();
            int iJ = this.f81107b[i10].J(m1VarY, xVarP, this.f81125p);
            if ((iJ & 2) != 0 && this.Q) {
                b1(false);
            }
            this.R -= iH - this.f81107b[i10].h();
            z10 &= (iJ & 1) != 0;
            i10++;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.f81107b.length; i11++) {
                if (xVarP.c(i11) && !this.f81107b[i11].w(m1VarY)) {
                    x(m1VarY, i11, false, m1VarY.n());
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [long] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [io.bidmachine.media3.exoplayer.j1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void P(n9.e0 r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.P(n9.e0, boolean):void");
    }

    private long P0(f0.b bVar, long j10, boolean z10) {
        return Q0(bVar, j10, this.f81129t.u() != this.f81129t.y(), z10);
    }

    private void P1(float f10) {
        for (m1 m1VarU = this.f81129t.u(); m1VarU != null; m1VarU = m1VarU.k()) {
            for (ja.r rVar : m1VarU.p().f85697c) {
                if (rVar != null) {
                    rVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    private void Q(ga.c0 c0Var) throws s {
        if (this.f81129t.F(c0Var)) {
            O((m1) q9.a.e(this.f81129t.n()));
            return;
        }
        m1 m1VarV = this.f81129t.v(c0Var);
        if (m1VarV != null) {
            q9.a.g(!m1VarV.f81209f);
            float f10 = this.f81125p.getPlaybackParameters().f95679a;
            f2 f2Var = this.E;
            m1VarV.q(f10, f2Var.f80828a, f2Var.f80839l);
            if (this.f81129t.G(c0Var)) {
                a0();
            }
        }
    }

    private long Q0(f0.b bVar, long j10, boolean z10, boolean z11) throws s {
        B1();
        N1(false, true);
        if (z11 || this.E.f80832e == 3) {
            o1(2);
        }
        m1 m1VarU = this.f81129t.u();
        m1 m1VarK = m1VarU;
        while (m1VarK != null && !bVar.equals(m1VarK.f81211h.f81227a)) {
            m1VarK = m1VarK.k();
        }
        if (z10 || m1VarU != m1VarK || (m1VarK != null && m1VarK.D(j10) < 0)) {
            v();
            if (m1VarK != null) {
                while (this.f81129t.u() != m1VarK) {
                    this.f81129t.b();
                }
                this.f81129t.N(m1VarK);
                m1VarK.B(1000000000000L);
                y();
                m1VarK.f81212i = true;
            }
        }
        t();
        if (m1VarK != null) {
            this.f81129t.N(m1VarK);
            if (!m1VarK.f81209f) {
                m1VarK.f81211h = m1VarK.f81211h.b(j10);
            } else if (m1VarK.f81210g) {
                j10 = m1VarK.f81204a.seekToUs(j10);
                m1VarK.f81204a.discardBuffer(j10 - this.f81123n, this.f81124o);
            }
            E0(j10);
            Z();
        } else {
            this.f81129t.g();
            E0(j10);
        }
        N(false);
        this.f81118i.sendEmptyMessage(2);
        return j10;
    }

    private synchronized void Q1(Supplier supplier, long j10) {
        long jElapsedRealtime = this.f81127r.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) supplier.get()).booleanValue() && j10 > 0) {
            try {
                this.f81127r.onThreadBlocked();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - this.f81127r.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void R(n9.z zVar, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.F.b(1);
            }
            this.E = this.E.g(zVar);
        }
        P1(zVar.f95679a);
        for (k2 k2Var : this.f81107b) {
            k2Var.Q(f10, zVar.f95679a);
        }
    }

    private void R0(g2 g2Var) {
        if (g2Var.e() == -9223372036854775807L) {
            S0(g2Var);
            return;
        }
        if (this.E.f80828a.q()) {
            this.f81126q.add(new d(g2Var));
            return;
        }
        d dVar = new d(g2Var);
        n9.e0 e0Var = this.E.f80828a;
        if (!G0(dVar, e0Var, e0Var, this.M, this.N, this.f81121l, this.f81122m)) {
            g2Var.j(false);
        } else {
            this.f81126q.add(dVar);
            Collections.sort(this.f81126q);
        }
    }

    private void S(n9.z zVar, boolean z10) {
        R(zVar, zVar.f95679a, true, z10);
    }

    private void S0(g2 g2Var) {
        if (g2Var.b() != this.f81120k) {
            this.f81118i.obtainMessage(15, g2Var).sendToTarget();
            return;
        }
        s(g2Var);
        int i10 = this.E.f80832e;
        if (i10 == 3 || i10 == 2) {
            this.f81118i.sendEmptyMessage(2);
        }
    }

    private f2 T(f0.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        ga.m1 m1Var;
        ja.x xVar;
        this.W = (!this.W && j10 == this.E.f80846s && bVar.equals(this.E.f80829b)) ? false : true;
        D0();
        f2 f2Var = this.E;
        ga.m1 m1Var2 = f2Var.f80835h;
        ja.x xVar2 = f2Var.f80836i;
        List listOf = f2Var.f80837j;
        if (this.f81130u.t()) {
            m1 m1VarU = this.f81129t.u();
            ga.m1 m1VarO = m1VarU == null ? ga.m1.f72378d : m1VarU.o();
            ja.x xVarP = m1VarU == null ? this.f81115f : m1VarU.p();
            ImmutableList immutableListB = B(xVarP.f85697c);
            if (m1VarU != null) {
                n1 n1Var = m1VarU.f81211h;
                if (n1Var.f81229c != j11) {
                    m1VarU.f81211h = n1Var.a(j11);
                }
            }
            i0();
            m1Var = m1VarO;
            xVar = xVarP;
            list = immutableListB;
        } else {
            if (!bVar.equals(this.E.f80829b)) {
                m1Var2 = ga.m1.f72378d;
                xVar2 = this.f81115f;
                listOf = ImmutableList.of();
            }
            list = listOf;
            m1Var = m1Var2;
            xVar = xVar2;
        }
        if (z10) {
            this.F.d(i10);
        }
        return this.E.d(bVar, j10, j11, j12, H(), m1Var, xVar, list);
    }

    private void T0(final g2 g2Var) {
        Looper looperB = g2Var.b();
        if (looperB.getThread().isAlive()) {
            this.f81127r.createHandler(looperB, null).post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.f1
                @Override // java.lang.Runnable
                public final void run() {
                    j1.h(this.f80825b, g2Var);
                }
            });
        } else {
            q9.u.h("TAG", "Trying to send message on a dead thread.");
            g2Var.j(false);
        }
    }

    private boolean U() {
        m1 m1VarY = this.f81129t.y();
        if (!m1VarY.f81209f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            k2[] k2VarArr = this.f81107b;
            if (i10 >= k2VarArr.length) {
                return true;
            }
            if (!k2VarArr[i10].o(m1VarY)) {
                return false;
            }
            i10++;
        }
    }

    private void U0(long j10) {
        for (k2 k2Var : this.f81107b) {
            k2Var.N(j10);
        }
    }

    private static boolean V(boolean z10, f0.b bVar, long j10, f0.b bVar2, e0.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f72270a.equals(bVar2.f72270a)) {
            if (bVar.b() && bVar3.r(bVar.f72271b)) {
                return (bVar3.h(bVar.f72271b, bVar.f72272c) == 4 || bVar3.h(bVar.f72271b, bVar.f72272c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.r(bVar2.f72271b)) {
                return true;
            }
        }
        return false;
    }

    private boolean W(m1 m1Var) {
        return (m1Var == null || m1Var.r() || m1Var.l() == Long.MIN_VALUE) ? false : true;
    }

    private void W0(n9.c cVar, boolean z10) {
        this.f81113e.l(cVar);
        io.bidmachine.media3.exoplayer.g gVar = this.C;
        if (!z10) {
            cVar = null;
        }
        gVar.k(cVar);
        H1();
    }

    private boolean X() {
        m1 m1VarU = this.f81129t.u();
        long j10 = m1VarU.f81211h.f81231e;
        if (m1VarU.f81209f) {
            return j10 == -9223372036854775807L || this.E.f80846s < j10 || !v1();
        }
        return false;
    }

    private void X0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.O != z10) {
            this.O = z10;
            if (!z10) {
                for (k2 k2Var : this.f81107b) {
                    k2Var.L();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private static boolean Y(f2 f2Var, e0.b bVar) {
        f0.b bVar2 = f2Var.f80829b;
        n9.e0 e0Var = f2Var.f80828a;
        return e0Var.q() || e0Var.h(bVar2.f72270a, bVar).f95259f;
    }

    private void Y0(n9.z zVar) {
        this.f81118i.removeMessages(16);
        this.f81125p.b(zVar);
    }

    private void Z() {
        boolean zU1 = u1();
        this.L = zU1;
        if (zU1) {
            m1 m1Var = (m1) q9.a.e(this.f81129t.n());
            m1Var.e(new l1.b().f(m1Var.C(this.T)).g(this.f81125p.getPlaybackParameters().f95679a).e(this.K).d());
        }
        C1();
    }

    private void Z0(b bVar) throws Throwable {
        this.F.b(1);
        if (bVar.f81139c != -1) {
            this.S = new h(new h2(bVar.f81137a, bVar.f81138b), bVar.f81139c, bVar.f81140d);
        }
        P(this.f81130u.B(bVar.f81137a, bVar.f81138b), false);
    }

    private void a0() {
        this.f81129t.I();
        m1 m1VarW = this.f81129t.w();
        if (m1VarW != null) {
            if ((!m1VarW.f81208e || m1VarW.f81209f) && !m1VarW.f81204a.isLoading()) {
                if (this.f81116g.a(this.E.f80828a, m1VarW.f81211h.f81227a, m1VarW.f81209f ? m1VarW.f81204a.getBufferedPositionUs() : 0L)) {
                    if (m1VarW.f81208e) {
                        m1VarW.e(new l1.b().f(m1VarW.C(this.T)).g(this.f81125p.getPlaybackParameters().f95679a).e(this.K).d());
                    } else {
                        m1VarW.v(this, m1VarW.f81211h.f81228b);
                    }
                }
            }
        }
    }

    private void b0() {
        for (k2 k2Var : this.f81107b) {
            k2Var.D();
        }
    }

    private void b1(boolean z10) {
        if (z10 == this.Q) {
            return;
        }
        this.Q = z10;
        if (z10 || !this.E.f80843p) {
            return;
        }
        this.f81118i.sendEmptyMessage(2);
    }

    private void c0() {
        this.F.c(this.E);
        if (this.F.f81145a) {
            this.f81128s.a(this.F);
            this.F = new e(this.E);
        }
    }

    private void c1(boolean z10) throws s {
        this.H = z10;
        D0();
        if (!this.I || this.f81129t.y() == this.f81129t.u()) {
            return;
        }
        N0(true);
        N(false);
    }

    private void d0() throws s {
        m1 m1VarX = this.f81129t.x();
        if (m1VarX == null) {
            return;
        }
        ja.x xVarP = m1VarX.p();
        for (int i10 = 0; i10 < this.f81107b.length; i10++) {
            if (xVarP.c(i10) && this.f81107b[i10].s() && !this.f81107b[i10].u()) {
                this.f81107b[i10].V();
                x(m1VarX, i10, false, m1VarX.n());
            }
        }
        if (p()) {
            this.f81110c0 = m1VarX.f81204a.readDiscontinuity();
            if (m1VarX.s()) {
                return;
            }
            this.f81129t.N(m1VarX);
            N(false);
            Z();
        }
    }

    private void e0(int i10) {
        k2 k2Var = this.f81107b[i10];
        try {
            k2Var.G((m1) q9.a.e(this.f81129t.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = k2Var.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            ja.x xVarP = this.f81129t.u().p();
            q9.u.d("ExoPlayerImplInternal", "Disabling track due to error: " + io.bidmachine.media3.common.a.h(xVarP.f85697c[i10].getSelectedFormat()), e10);
            ja.x xVar = new ja.x((u9.k0[]) xVarP.f85696b.clone(), (ja.r[]) xVarP.f85697c.clone(), xVarP.f85698d, xVarP.f85699e);
            xVar.f85696b[i10] = null;
            xVar.f85697c[i10] = null;
            u(i10);
            this.f81129t.u().a(xVar, this.E.f80846s, false);
        }
    }

    private void e1(boolean z10, int i10, boolean z11, int i11) {
        this.F.b(z11 ? 1 : 0);
        I1(z10, i10, i11);
    }

    private void f0(final int i10, final boolean z10) {
        boolean[] zArr = this.f81111d;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.A.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.g1
                @Override // java.lang.Runnable
                public final void run() {
                    j1 j1Var = this.f80858b;
                    int i11 = i10;
                    j1Var.f81135z.H(i11, j1Var.f81107b[i11].m(), z10);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.g0(long, long):void");
    }

    private void g1(n9.z zVar) {
        Y0(zVar);
        S(this.f81125p.getPlaybackParameters(), true);
    }

    public static /* synthetic */ void h(j1 j1Var, g2 g2Var) {
        j1Var.getClass();
        try {
            j1Var.s(g2Var);
        } catch (s e10) {
            q9.u.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private boolean h0() {
        n1 n1VarT;
        this.f81129t.K(this.T);
        boolean z10 = false;
        if (this.f81129t.T() && (n1VarT = this.f81129t.t(this.T, this.E)) != null) {
            m1 m1VarH = this.f81129t.h(n1VarT);
            if (!m1VarH.f81208e) {
                m1VarH.v(this, n1VarT.f81228b);
            } else if (m1VarH.f81209f) {
                this.f81118i.obtainMessage(8, m1VarH.f81204a).sendToTarget();
            }
            if (this.f81129t.u() == m1VarH) {
                E0(n1VarT.f81228b);
            }
            N(false);
            z10 = true;
        }
        if (!this.L) {
            Z();
            return z10;
        }
        this.L = W(this.f81129t.n());
        C1();
        return z10;
    }

    private void h1(ExoPlayer.c cVar) {
        this.f81106a0 = cVar;
        this.f81129t.V(this.E.f80828a, cVar);
    }

    private void i0() {
        m1 m1VarU;
        boolean z10;
        if (this.f81129t.u() == this.f81129t.y() && (m1VarU = this.f81129t.u()) != null) {
            ja.x xVarP = m1VarU.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f81107b.length) {
                    z10 = true;
                    break;
                }
                if (xVarP.c(i10)) {
                    if (this.f81107b[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (xVarP.f85696b[i10].f105314a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            b1(z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0() {
        /*
            r15 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r15.t1()
            if (r2 == 0) goto L81
            if (r1 == 0) goto Ld
            r15.c0()
        Ld:
            r15.f81112d0 = r0
            io.bidmachine.media3.exoplayer.p1 r1 = r15.f81129t
            io.bidmachine.media3.exoplayer.m1 r1 = r1.b()
            java.lang.Object r1 = q9.a.e(r1)
            io.bidmachine.media3.exoplayer.m1 r1 = (io.bidmachine.media3.exoplayer.m1) r1
            io.bidmachine.media3.exoplayer.f2 r2 = r15.E
            ga.f0$b r2 = r2.f80829b
            java.lang.Object r2 = r2.f72270a
            io.bidmachine.media3.exoplayer.n1 r3 = r1.f81211h
            ga.f0$b r3 = r3.f81227a
            java.lang.Object r3 = r3.f72270a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            io.bidmachine.media3.exoplayer.f2 r2 = r15.E
            ga.f0$b r2 = r2.f80829b
            int r4 = r2.f72271b
            r5 = -1
            if (r4 != r5) goto L47
            io.bidmachine.media3.exoplayer.n1 r4 = r1.f81211h
            ga.f0$b r4 = r4.f81227a
            int r6 = r4.f72271b
            if (r6 != r5) goto L47
            int r2 = r2.f72274e
            int r4 = r4.f72274e
            if (r2 == r4) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r0
        L48:
            io.bidmachine.media3.exoplayer.n1 r4 = r1.f81211h
            ga.f0$b r6 = r4.f81227a
            long r7 = r4.f81228b
            long r9 = r4.f81229c
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            io.bidmachine.media3.exoplayer.f2 r2 = r5.T(r6, r7, r9, r11, r13, r14)
            r5.E = r2
            r15.D0()
            r15.K1()
            boolean r2 = r15.p()
            if (r2 == 0) goto L72
            io.bidmachine.media3.exoplayer.p1 r2 = r5.f81129t
            io.bidmachine.media3.exoplayer.m1 r2 = r2.x()
            if (r1 != r2) goto L72
            r15.b0()
        L72:
            io.bidmachine.media3.exoplayer.f2 r1 = r5.E
            int r1 = r1.f80832e
            r2 = 3
            if (r1 != r2) goto L7c
            r15.y1()
        L7c:
            r15.o()
            r1 = r3
            goto L2
        L81:
            r5 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.j0():void");
    }

    private void j1(int i10) throws s {
        this.M = i10;
        int iX = this.f81129t.X(this.E.f80828a, i10);
        if ((iX & 1) != 0) {
            N0(true);
        } else if ((iX & 2) != 0) {
            t();
        }
        N(false);
    }

    private void k0(boolean z10) {
        if (this.f81106a0.f80626a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.E.f80828a.equals(this.f81108b0)) {
            n9.e0 e0Var = this.E.f80828a;
            this.f81108b0 = e0Var;
            this.f81129t.B(e0Var);
        }
        a0();
    }

    private void k1(u9.m0 m0Var) {
        this.D = m0Var;
    }

    private void l0() throws s {
        m1 m1VarX;
        if (this.I || !this.B || this.f81112d0 || p() || (m1VarX = this.f81129t.x()) == null || m1VarX != this.f81129t.y() || m1VarX.k() == null || !m1VarX.k().f81209f) {
            return;
        }
        this.f81129t.c();
        d0();
    }

    private void m0() {
        m1 m1VarY = this.f81129t.y();
        if (m1VarY == null) {
            return;
        }
        int i10 = 0;
        if (m1VarY.k() == null || this.I) {
            if (m1VarY.f81211h.f81236j || this.I) {
                k2[] k2VarArr = this.f81107b;
                int length = k2VarArr.length;
                while (i10 < length) {
                    k2 k2Var = k2VarArr[i10];
                    if (k2Var.w(m1VarY) && k2Var.r(m1VarY)) {
                        long j10 = m1VarY.f81211h.f81231e;
                        k2Var.O(m1VarY, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : m1VarY.m() + m1VarY.f81211h.f81231e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (U()) {
            if (p() && this.f81129t.x() == this.f81129t.y()) {
                return;
            }
            if (m1VarY.k().f81209f || this.T >= m1VarY.k().n()) {
                ja.x xVarP = m1VarY.p();
                m1 m1VarD = this.f81129t.d();
                ja.x xVarP2 = m1VarD.p();
                n9.e0 e0Var = this.E.f80828a;
                L1(e0Var, m1VarD.f81211h.f81227a, e0Var, m1VarY.f81211h.f81227a, -9223372036854775807L, false);
                if (m1VarD.f81209f && ((this.B && this.f81110c0 != -9223372036854775807L) || m1VarD.f81204a.readDiscontinuity() != -9223372036854775807L)) {
                    this.f81110c0 = -9223372036854775807L;
                    boolean z10 = this.B && !this.f81112d0;
                    if (z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= this.f81107b.length) {
                                break;
                            }
                            if (xVarP2.c(i11) && !n9.w.a(xVarP2.f85697c[i11].getSelectedFormat().f80561o, xVarP2.f85697c[i11].getSelectedFormat().f80557k) && !this.f81107b[i11].u()) {
                                z10 = false;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (!z10) {
                        U0(m1VarD.n());
                        if (m1VarD.s()) {
                            return;
                        }
                        this.f81129t.N(m1VarD);
                        N(false);
                        Z();
                        return;
                    }
                }
                k2[] k2VarArr2 = this.f81107b;
                int length2 = k2VarArr2.length;
                while (i10 < length2) {
                    k2VarArr2[i10].F(xVarP, xVarP2, m1VarD.n());
                    i10++;
                }
            }
        }
    }

    private void m1(boolean z10) throws s {
        this.N = z10;
        int iY = this.f81129t.Y(this.E.f80828a, z10);
        if ((iY & 1) != 0) {
            N0(true);
        } else if ((iY & 2) != 0) {
            t();
        }
        N(false);
    }

    private void n(b bVar, int i10) throws Throwable {
        this.F.b(1);
        e2 e2Var = this.f81130u;
        if (i10 == -1) {
            i10 = e2Var.r();
        }
        P(e2Var.f(i10, bVar.f81137a, bVar.f81138b), false);
    }

    private void n0() {
        m1 m1VarY = this.f81129t.y();
        if (m1VarY == null || this.f81129t.u() == m1VarY || m1VarY.f81212i || !O1()) {
            return;
        }
        this.f81129t.y().f81212i = true;
    }

    private void n1(ga.e1 e1Var) throws Throwable {
        this.F.b(1);
        P(this.f81130u.C(e1Var), false);
    }

    private void o() {
        ja.x xVarP = this.f81129t.u().p();
        for (int i10 = 0; i10 < this.f81107b.length; i10++) {
            if (xVarP.c(i10)) {
                this.f81107b[i10].f();
            }
        }
    }

    private void o0() throws Throwable {
        P(this.f81130u.i(), true);
    }

    private void o1(int i10) {
        f2 f2Var = this.E;
        if (f2Var.f80832e != i10) {
            if (i10 != 2) {
                this.Z = -9223372036854775807L;
            }
            this.E = f2Var.h(i10);
        }
    }

    private boolean p() {
        if (!this.B) {
            return false;
        }
        for (k2 k2Var : this.f81107b) {
            if (k2Var.u()) {
                return true;
            }
        }
        return false;
    }

    private void p0(c cVar) {
        this.F.b(1);
        throw null;
    }

    private void q() throws s {
        B0();
    }

    private void q0() {
        for (m1 m1VarU = this.f81129t.u(); m1VarU != null; m1VarU = m1VarU.k()) {
            for (ja.r rVar : m1VarU.p().f85697c) {
                if (rVar != null) {
                    rVar.onDiscontinuity();
                }
            }
        }
    }

    private void q1(Object obj, AtomicBoolean atomicBoolean) {
        for (k2 k2Var : this.f81107b) {
            k2Var.S(obj);
        }
        int i10 = this.E.f80832e;
        if (i10 == 3 || i10 == 2) {
            this.f81118i.sendEmptyMessage(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m1 r(n1 n1Var, long j10) {
        return new m1(this.f81109c, j10, this.f81113e, this.f81116g.getAllocator(), this.f81130u, n1Var, this.f81115f, this.f81106a0.f80626a);
    }

    private void r0(boolean z10) {
        for (m1 m1VarU = this.f81129t.u(); m1VarU != null; m1VarU = m1VarU.k()) {
            for (ja.r rVar : m1VarU.p().f85697c) {
                if (rVar != null) {
                    rVar.onPlayWhenReadyChanged(z10);
                }
            }
        }
    }

    private void s(g2 g2Var) {
        if (g2Var.i()) {
            return;
        }
        try {
            g2Var.f().handleMessage(g2Var.h(), g2Var.d());
        } finally {
            g2Var.j(true);
        }
    }

    private void s0() {
        for (m1 m1VarU = this.f81129t.u(); m1VarU != null; m1VarU = m1VarU.k()) {
            for (ja.r rVar : m1VarU.p().f85697c) {
                if (rVar != null) {
                    rVar.onRebuffer();
                }
            }
        }
    }

    private void s1(float f10) {
        this.f81114e0 = f10;
        float f11 = f10 * this.C.f();
        for (k2 k2Var : this.f81107b) {
            k2Var.T(f11);
        }
    }

    private void t() {
        if (this.B && p()) {
            for (k2 k2Var : this.f81107b) {
                int iH = k2Var.h();
                k2Var.c(this.f81125p);
                this.R -= iH - k2Var.h();
            }
            this.f81110c0 = -9223372036854775807L;
        }
    }

    private boolean t1() {
        m1 m1VarU;
        m1 m1VarK;
        return v1() && !this.I && (m1VarU = this.f81129t.u()) != null && (m1VarK = m1VarU.k()) != null && this.T >= m1VarK.n() && m1VarK.f81212i;
    }

    private void u(int i10) {
        int iH = this.f81107b[i10].h();
        this.f81107b[i10].b(this.f81125p);
        f0(i10, false);
        this.R -= iH;
    }

    private boolean u1() {
        if (!W(this.f81129t.n())) {
            return false;
        }
        m1 m1VarN = this.f81129t.n();
        long jI = I(m1VarN.l());
        k1.a aVar = new k1.a(this.f81133x, this.E.f80828a, m1VarN.f81211h.f81227a, m1VarN == this.f81129t.u() ? m1VarN.C(this.T) : m1VarN.C(this.T) - m1VarN.f81211h.f81228b, jI, this.f81125p.getPlaybackParameters().f95679a, this.E.f80839l, this.J, x1(this.E.f80828a, m1VarN.f81211h.f81227a) ? this.f81131v.getTargetLiveOffsetUs() : -9223372036854775807L, this.K);
        boolean zD = this.f81116g.d(aVar);
        m1 m1VarU = this.f81129t.u();
        if (zD || !m1VarU.f81209f || jI >= 500000) {
            return zD;
        }
        if (this.f81123n <= 0 && !this.f81124o) {
            return zD;
        }
        m1VarU.f81204a.discardBuffer(this.E.f80846s, false);
        return this.f81116g.d(aVar);
    }

    private void v() {
        for (int i10 = 0; i10 < this.f81107b.length; i10++) {
            u(i10);
        }
        this.f81110c0 = -9223372036854775807L;
    }

    private void v0() {
        this.F.b(1);
        C0(false, false, false, true);
        this.f81116g.g(this.f81133x);
        o1(this.E.f80828a.q() ? 4 : 2);
        H1();
        this.f81130u.v(this.f81117h.getTransferListener());
        this.f81118i.sendEmptyMessage(2);
    }

    private boolean v1() {
        f2 f2Var = this.E;
        return f2Var.f80839l && f2Var.f80841n == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w() throws io.bidmachine.media3.exoplayer.s {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.w():void");
    }

    private boolean w1(boolean z10) {
        if (this.R == 0) {
            return X();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.E.f80834g) {
            return true;
        }
        m1 m1VarU = this.f81129t.u();
        long targetLiveOffsetUs = x1(this.E.f80828a, m1VarU.f81211h.f81227a) ? this.f81131v.getTargetLiveOffsetUs() : -9223372036854775807L;
        m1 m1VarN = this.f81129t.n();
        boolean z12 = m1VarN.s() && m1VarN.f81211h.f81236j;
        if (m1VarN.f81211h.f81227a.b() && !m1VarN.f81209f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f81116g.c(new k1.a(this.f81133x, this.E.f80828a, m1VarU.f81211h.f81227a, m1VarU.C(this.T), I(m1VarN.j()), this.f81125p.getPlaybackParameters().f95679a, this.E.f80839l, this.J, targetLiveOffsetUs, this.K));
    }

    private void x(m1 m1Var, int i10, boolean z10, long j10) throws s {
        k2 k2Var = this.f81107b[i10];
        if (k2Var.x()) {
            return;
        }
        boolean z11 = m1Var == this.f81129t.u();
        ja.x xVarP = m1Var.p();
        u9.k0 k0Var = xVarP.f85696b[i10];
        ja.r rVar = xVarP.f85697c[i10];
        boolean z12 = v1() && this.E.f80832e == 3;
        boolean z13 = !z10 && z12;
        this.R++;
        k2Var.e(k0Var, rVar, m1Var.f81206c[i10], this.T, z13, z11, j10, m1Var.m(), m1Var.f81211h.f81227a, this.f81125p);
        k2Var.n(11, new a(), m1Var);
        if (z12 && z11) {
            k2Var.U();
        }
    }

    private void x0() {
        try {
            C0(true, false, true, false);
            y0();
            this.f81116g.b(this.f81133x);
            this.C.h();
            this.f81113e.j();
            o1(1);
            this.f81119j.b();
            synchronized (this) {
                this.G = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f81119j.b();
            synchronized (this) {
                this.G = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private boolean x1(n9.e0 e0Var, f0.b bVar) {
        if (!bVar.b() && !e0Var.q()) {
            e0Var.n(e0Var.h(bVar.f72270a, this.f81122m).f95256c, this.f81121l);
            if (this.f81121l.f()) {
                e0.c cVar = this.f81121l;
                if (cVar.f95279i && cVar.f95276f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void y() throws s {
        z(new boolean[this.f81107b.length], this.f81129t.y().n());
    }

    private void y0() {
        for (int i10 = 0; i10 < this.f81107b.length; i10++) {
            this.f81109c[i10].clearListener();
            this.f81107b[i10].H();
        }
    }

    private void y1() {
        m1 m1VarU = this.f81129t.u();
        if (m1VarU == null) {
            return;
        }
        ja.x xVarP = m1VarU.p();
        for (int i10 = 0; i10 < this.f81107b.length; i10++) {
            if (xVarP.c(i10)) {
                this.f81107b[i10].U();
            }
        }
    }

    private void z(boolean[] zArr, long j10) throws s {
        long j11;
        m1 m1VarY = this.f81129t.y();
        ja.x xVarP = m1VarY.p();
        for (int i10 = 0; i10 < this.f81107b.length; i10++) {
            if (!xVarP.c(i10)) {
                this.f81107b[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.f81107b.length) {
            if (!xVarP.c(i11) || this.f81107b[i11].w(m1VarY)) {
                j11 = j10;
            } else {
                j11 = j10;
                x(m1VarY, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private void z0(int i10, int i11, ga.e1 e1Var) throws Throwable {
        this.F.b(1);
        P(this.f81130u.z(i10, i11, e1Var), false);
    }

    public void A(long j10) {
        this.Y = j10;
    }

    public Looper G() {
        return this.f81120k;
    }

    public void M0(n9.e0 e0Var, int i10, long j10) {
        this.f81118i.obtainMessage(3, new h(e0Var, i10, j10)).sendToTarget();
    }

    public void V0(n9.c cVar, boolean z10) {
        this.f81118i.obtainMessage(31, z10 ? 1 : 0, 0, cVar).sendToTarget();
    }

    @Override // ja.w.a
    public void a(i2 i2Var) {
        this.f81118i.sendEmptyMessage(26);
    }

    public void a1(List list, int i10, long j10, ga.e1 e1Var) {
        this.f81118i.obtainMessage(17, new b(list, e1Var, i10, j10, null)).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.g2.a
    public synchronized void b(g2 g2Var) {
        if (!this.G && this.f81120k.getThread().isAlive()) {
            this.f81118i.obtainMessage(14, g2Var).sendToTarget();
            return;
        }
        q9.u.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        g2Var.j(false);
    }

    public void d1(boolean z10, int i10, int i11) {
        this.f81118i.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4)).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.g.a
    public void executePlayerCommand(int i10) {
        this.f81118i.obtainMessage(33, i10, 0).sendToTarget();
    }

    @Override // ga.c0.a
    public void f(ga.c0 c0Var) {
        this.f81118i.obtainMessage(8, c0Var).sendToTarget();
    }

    public void f1(n9.z zVar) {
        this.f81118i.obtainMessage(4, zVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.j1.handleMessage(android.os.Message):boolean");
    }

    public void i1(int i10) {
        this.f81118i.obtainMessage(11, i10, 0).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.k.a
    public void j(n9.z zVar) {
        this.f81118i.obtainMessage(16, zVar).sendToTarget();
    }

    public void l1(boolean z10) {
        this.f81118i.obtainMessage(12, z10 ? 1 : 0, 0).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.e2.d
    public void onPlaylistUpdateRequested() {
        this.f81118i.removeMessages(2);
        this.f81118i.sendEmptyMessage(22);
    }

    @Override // ja.w.a
    public void onTrackSelectionsInvalidated() {
        this.f81118i.sendEmptyMessage(10);
    }

    public synchronized boolean p1(Object obj, long j10) {
        if (!this.G && this.f81120k.getThread().isAlive()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f81118i.obtainMessage(30, new Pair(obj, atomicBoolean)).sendToTarget();
            if (j10 == -9223372036854775807L) {
                return true;
            }
            Q1(new androidx.media3.exoplayer.b2(atomicBoolean), j10);
            return atomicBoolean.get();
        }
        return true;
    }

    public void r1(float f10) {
        this.f81118i.obtainMessage(32, Float.valueOf(f10)).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.g.a
    public void setVolumeMultiplier(float f10) {
        this.f81118i.sendEmptyMessage(34);
    }

    @Override // ga.d1.a
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void d(ga.c0 c0Var) {
        this.f81118i.obtainMessage(9, c0Var).sendToTarget();
    }

    public void u0() {
        this.f81118i.obtainMessage(29).sendToTarget();
    }

    public synchronized boolean w0() {
        if (!this.G && this.f81120k.getThread().isAlive()) {
            this.f81118i.sendEmptyMessage(7);
            Q1(new Supplier() { // from class: io.bidmachine.media3.exoplayer.i1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return Boolean.valueOf(this.f81090b.G);
                }
            }, this.f81132w);
            return this.G;
        }
        return true;
    }

    public void z1() {
        this.f81118i.obtainMessage(6).sendToTarget();
    }
}
