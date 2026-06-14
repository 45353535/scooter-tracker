package yads;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zh2 implements bl1, ap0, je1, ne1, gq2 {
    public static final Map N;
    public static final yv0 O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f118687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c30 f118688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nj0 f118689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fe1 f118690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ol1 f118691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jj0 f118692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vh2 f118693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ke f118694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f118695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f118696k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tq f118698m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public al1 f118703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a11 f118704s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f118707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f118708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f118709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public yh2 f118710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public nu2 f118711z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qe1 f118697l = new qe1("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hy f118699n = new hy();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f118700o = new Runnable() { // from class: yads.q71
        @Override // java.lang.Runnable
        public final void run() {
            this.f114887b.g();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f118701p = new Runnable() { // from class: yads.r71
        @Override // java.lang.Runnable
        public final void run() {
            this.f115357b.e();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f118702q = w83.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public xh2[] f118706u = new xh2[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public hq2[] f118705t = new hq2[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N = DesugarCollections.unmodifiableMap(map);
        xv0 xv0Var = new xv0();
        xv0Var.f117972a = "icy";
        xv0Var.f117982k = "application/x-icy";
        O = new yv0(xv0Var);
    }

    public zh2(Uri uri, c30 c30Var, tq tqVar, nj0 nj0Var, jj0 jj0Var, fe1 fe1Var, ol1 ol1Var, vh2 vh2Var, ke keVar, String str, int i10) {
        this.f118687b = uri;
        this.f118688c = c30Var;
        this.f118689d = nj0Var;
        this.f118692g = jj0Var;
        this.f118690e = fe1Var;
        this.f118691f = ol1Var;
        this.f118693h = vh2Var;
        this.f118694i = keVar;
        this.f118695j = str;
        this.f118696k = i10;
        this.f118698m = tqVar;
    }

    @Override // yads.ap0
    public final void a() {
        this.f118707v = true;
        this.f118702q.post(this.f118700o);
    }

    public final void b(nu2 nu2Var) {
        this.f118711z = this.f118704s == null ? nu2Var : new mu2(-9223372036854775807L, 0L);
        this.A = nu2Var.c();
        boolean z10 = !this.G && nu2Var.c() == -9223372036854775807L;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        vh2 vh2Var = this.f118693h;
        long j10 = this.A;
        boolean zB = nu2Var.b();
        boolean z11 = this.B;
        ci2 ci2Var = (ci2) vh2Var;
        if (j10 == -9223372036854775807L) {
            j10 = ci2Var.f109414i;
        }
        if (ci2Var.f109413h || ci2Var.f109414i != j10 || ci2Var.f109415j != zB || ci2Var.f109416k != z11) {
            ci2Var.f109414i = j10;
            ci2Var.f109415j = zB;
            ci2Var.f109416k = z11;
            ci2Var.f109413h = false;
            long j11 = ci2Var.f109414i;
            bx2 bx2Var = new bx2(j11, j11, ci2Var.f109415j, ci2Var.f109416k, ci2Var.f109406a);
            f43 ai2Var = bx2Var;
            if (ci2Var.f109413h) {
                ai2Var = new ai2(bx2Var);
            }
            ci2Var.refreshSourceInfo(ai2Var);
        }
        if (this.f118708w) {
            return;
        }
        g();
    }

    public final void c() {
        if (!this.f118708w) {
            throw new IllegalStateException();
        }
        this.f118710y.getClass();
        this.f118711z.getClass();
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        if (this.L || this.f118697l.f114976c != null || this.J) {
            return false;
        }
        if (this.f118708w && this.F == 0) {
            return false;
        }
        boolean zD = this.f118699n.d();
        if (this.f118697l.b()) {
            return zD;
        }
        i();
        return true;
    }

    public final int d() {
        int i10 = 0;
        for (hq2 hq2Var : this.f118705t) {
            i10 += hq2Var.f111696q + hq2Var.f111695p;
        }
        return i10;
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) throws Throwable {
        c();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f118710y.f118187c;
        int length = this.f118705t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f118705t[i10].a(j10, z10, zArr[i10]);
        }
    }

    public final void e() {
        if (this.M) {
            return;
        }
        al1 al1Var = this.f118703r;
        al1Var.getClass();
        al1Var.a((ev2) this);
    }

    public final /* synthetic */ void f() {
        this.G = true;
    }

    public final void g() {
        if (this.M || this.f118708w || !this.f118707v || this.f118711z == null) {
            return;
        }
        for (hq2 hq2Var : this.f118705t) {
            if (hq2Var.c() == null) {
                return;
            }
        }
        hy hyVar = this.f118699n;
        synchronized (hyVar) {
            hyVar.f111800a = false;
        }
        int length = this.f118705t.length;
        u43[] u43VarArr = new u43[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            yv0 yv0VarC = this.f118705t[i10].c();
            yv0VarC.getClass();
            String str = yv0VarC.f118398m;
            boolean zEquals = "audio".equals(tr1.c(str));
            boolean z10 = zEquals || "video".equals(tr1.c(str));
            zArr[i10] = z10;
            this.f118709x = z10 | this.f118709x;
            a11 a11Var = this.f118704s;
            if (a11Var != null) {
                if (zEquals || this.f118706u[i10].f117819b) {
                    fr1 fr1Var = yv0VarC.f118396k;
                    fr1 fr1Var2 = fr1Var == null ? new fr1(a11Var) : new fr1((er1[]) w83.a((Object[]) fr1Var.f110835b, (Object[]) new er1[]{a11Var}));
                    xv0 xv0Var = new xv0(yv0VarC);
                    xv0Var.f117980i = fr1Var2;
                    yv0VarC = new yv0(xv0Var);
                }
                if (zEquals && yv0VarC.f118392g == -1 && yv0VarC.f118393h == -1 && a11Var.f108509b != -1) {
                    xv0 xv0Var2 = new xv0(yv0VarC);
                    xv0Var2.f117977f = a11Var.f108509b;
                    yv0VarC = new yv0(xv0Var2);
                }
            }
            int iA = this.f118689d.a(yv0VarC);
            xv0 xv0Var3 = new xv0(yv0VarC);
            xv0Var3.D = iA;
            u43VarArr[i10] = new u43(Integer.toString(i10), new yv0(xv0Var3));
        }
        this.f118710y = new yh2(new v43(u43VarArr), zArr);
        this.f118708w = true;
        al1 al1Var = this.f118703r;
        al1Var.getClass();
        al1Var.a((bl1) this);
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        long jA;
        boolean z10;
        c();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = this.I;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f118709x) {
            int length = this.f118705t.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                yh2 yh2Var = this.f118710y;
                if (yh2Var.f118186b[i10] && yh2Var.f118187c[i10]) {
                    hq2 hq2Var = this.f118705t[i10];
                    synchronized (hq2Var) {
                        z10 = hq2Var.f111702w;
                    }
                    if (!z10) {
                        jA = Math.min(jA, this.f118705t[i10].b());
                    }
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = a(false);
        }
        return jA == Long.MIN_VALUE ? this.H : jA;
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        c();
        return this.f118710y.f118185a;
    }

    public final void h() {
        this.f118702q.post(new Runnable() { // from class: yads.t71
            @Override // java.lang.Runnable
            public final void run() {
                this.f116101b.f();
            }
        });
    }

    public final void i() {
        uh2 uh2Var = new uh2(this, this.f118687b, this.f118688c, this.f118698m, this, this.f118699n);
        if (this.f118708w) {
            long j10 = this.I;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.A;
            if (j11 != -9223372036854775807L && j10 > j11) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            nu2 nu2Var = this.f118711z;
            nu2Var.getClass();
            long j12 = nu2Var.b(this.I).f113228a.f114790b;
            long j13 = this.I;
            uh2Var.f116647f.f108980a = j12;
            uh2Var.f116650i = j13;
            uh2Var.f116649h = true;
            uh2Var.f116653l = false;
            for (hq2 hq2Var : this.f118705t) {
                hq2Var.f111699t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = d();
        this.f118697l.a(uh2Var, this, ((ld0) this.f118690e).a(this.C));
        h30 h30Var = uh2Var.f116651j;
        ol1 ol1Var = this.f118691f;
        Uri uri = h30Var.f111452a;
        ol1Var.c(new ge1(), new tk1(1, -1, null, 0, null, ol1Var.a(uh2Var.f116650i), ol1Var.a(this.A)));
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        boolean z10;
        if (!this.f118697l.b()) {
            return false;
        }
        hy hyVar = this.f118699n;
        synchronized (hyVar) {
            z10 = hyVar.f111800a;
        }
        return z10;
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() throws IOException {
        this.f118697l.a(((ld0) this.f118690e).a(this.C));
        if (this.L && !this.f118708w) {
            throw new ba2("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && d() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    @Override // yads.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r7) {
        /*
            r6 = this;
            r6.c()
            yads.yh2 r0 = r6.f118710y
            boolean[] r0 = r0.f118186b
            yads.nu2 r1 = r6.f118711z
            boolean r1 = r1.b()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r7 = 0
        L12:
            r1 = 0
            r6.E = r1
            r6.H = r7
            long r2 = r6.I
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            r6.I = r7
            return r7
        L25:
            int r2 = r6.C
            r3 = 7
            if (r2 == r3) goto L46
            yads.hq2[] r2 = r6.f118705t
            int r2 = r2.length
            r3 = r1
        L2e:
            if (r3 >= r2) goto L85
            yads.hq2[] r4 = r6.f118705t
            r4 = r4[r3]
            boolean r4 = r4.b(r7, r1)
            if (r4 != 0) goto L43
            boolean r4 = r0[r3]
            if (r4 != 0) goto L46
            boolean r4 = r6.f118709x
            if (r4 != 0) goto L43
            goto L46
        L43:
            int r3 = r3 + 1
            goto L2e
        L46:
            r6.J = r1
            r6.I = r7
            r6.L = r1
            yads.qe1 r0 = r6.f118697l
            boolean r0 = r0.b()
            if (r0 == 0) goto L72
            yads.hq2[] r0 = r6.f118705t
            int r2 = r0.length
            r3 = r1
        L58:
            if (r3 >= r2) goto L62
            r4 = r0[r3]
            r4.a()
            int r3 = r3 + 1
            goto L58
        L62:
            yads.qe1 r0 = r6.f118697l
            yads.le1 r0 = r0.f114975b
            if (r0 == 0) goto L6c
            r0.a(r1)
            return r7
        L6c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L72:
            yads.qe1 r0 = r6.f118697l
            r2 = 0
            r0.f114976c = r2
            yads.hq2[] r0 = r6.f118705t
            int r2 = r0.length
            r3 = r1
        L7b:
            if (r3 >= r2) goto L85
            r4 = r0[r3]
            r4.b(r1)
            int r3 = r3 + 1
            goto L7b
        L85:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zh2.seekToUs(long):long");
    }

    @Override // yads.bl1
    public final long a(long j10, ou2 ou2Var) {
        c();
        if (!this.f118711z.b()) {
            return 0L;
        }
        lu2 lu2VarB = this.f118711z.b(j10);
        return ou2Var.a(j10, lu2VarB.f113228a.f114789a, lu2VarB.f113229b.f114789a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            yads.hq2[] r3 = r6.f118705t
            int r3 = r3.length
            if (r2 >= r3) goto L27
            if (r7 != 0) goto L15
            yads.yh2 r3 = r6.f118710y
            r3.getClass()
            boolean[] r3 = r3.f118187c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            yads.hq2[] r3 = r6.f118705t
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.f111701v     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zh2.a(boolean):long");
    }

    public final void a(int i10) {
        c();
        boolean[] zArr = this.f118710y.f118186b;
        if (this.J && zArr[i10] && !this.f118705t[i10].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (hq2 hq2Var : this.f118705t) {
                hq2Var.b(false);
            }
            al1 al1Var = this.f118703r;
            al1Var.getClass();
            al1Var.a((ev2) this);
        }
    }

    @Override // yads.ne1
    public final void b() {
        for (hq2 hq2Var : this.f118705t) {
            hq2Var.b(true);
            hq2Var.d();
        }
        tq tqVar = this.f118698m;
        xo0 xo0Var = tqVar.f116342b;
        if (xo0Var != null) {
            xo0Var.release();
            tqVar.f116342b = null;
        }
        tqVar.f116343c = null;
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11, boolean z10) {
        uh2 uh2Var = (uh2) me1Var;
        Uri uri = uh2Var.f116643b.f109698c;
        ge1 ge1Var = new ge1();
        this.f118690e.getClass();
        ol1 ol1Var = this.f118691f;
        ol1Var.a(ge1Var, new tk1(1, -1, null, 0, null, ol1Var.a(uh2Var.f116650i), ol1Var.a(this.A)));
        if (z10) {
            return;
        }
        for (hq2 hq2Var : this.f118705t) {
            hq2Var.b(false);
        }
        if (this.F > 0) {
            al1 al1Var = this.f118703r;
            al1Var.getClass();
            al1Var.a((ev2) this);
        }
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11) {
        nu2 nu2Var;
        uh2 uh2Var = (uh2) me1Var;
        if (this.A == -9223372036854775807L && (nu2Var = this.f118711z) != null) {
            boolean zB = nu2Var.b();
            long jA = a(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.A = j12;
            vh2 vh2Var = this.f118693h;
            boolean z10 = this.B;
            ci2 ci2Var = (ci2) vh2Var;
            if (j12 == -9223372036854775807L) {
                j12 = ci2Var.f109414i;
            }
            if (ci2Var.f109413h || ci2Var.f109414i != j12 || ci2Var.f109415j != zB || ci2Var.f109416k != z10) {
                ci2Var.f109414i = j12;
                ci2Var.f109415j = zB;
                ci2Var.f109416k = z10;
                ci2Var.f109413h = false;
                long j13 = ci2Var.f109414i;
                bx2 bx2Var = new bx2(j13, j13, ci2Var.f109415j, ci2Var.f109416k, ci2Var.f109406a);
                f43 ai2Var = bx2Var;
                if (ci2Var.f109413h) {
                    ai2Var = new ai2(bx2Var);
                }
                ci2Var.refreshSourceInfo(ai2Var);
            }
        }
        Uri uri = uh2Var.f116643b.f109698c;
        ge1 ge1Var = new ge1();
        this.f118690e.getClass();
        ol1 ol1Var = this.f118691f;
        ol1Var.b(ge1Var, new tk1(1, -1, null, 0, null, ol1Var.a(uh2Var.f116650i), ol1Var.a(this.A)));
        this.L = true;
        al1 al1Var = this.f118703r;
        al1Var.getClass();
        al1Var.a((ev2) this);
    }

    @Override // yads.je1
    public final ke1 a(me1 me1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        ke1 ke1Var;
        nu2 nu2Var;
        uh2 uh2Var = (uh2) me1Var;
        Uri uri = uh2Var.f116643b.f109698c;
        ge1 ge1Var = new ge1();
        int i11 = w83.f117341a;
        ((ld0) this.f118690e).getClass();
        if ((iOException instanceof ba2) || (iOException instanceof FileNotFoundException) || (iOException instanceof a01) || (iOException instanceof pe1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = d30.f109729c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof d30) && ((d30) cause).f109730b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            ke1Var = qe1.f114973e;
        } else {
            int iD = d();
            int i13 = iD > this.K ? 1 : 0;
            if (!this.G && ((nu2Var = this.f118711z) == null || nu2Var.c() == -9223372036854775807L)) {
                boolean z10 = this.f118708w;
                if (z10 && !this.E && this.I == -9223372036854775807L) {
                    this.J = true;
                    ke1Var = qe1.f114972d;
                } else {
                    this.E = z10;
                    this.H = 0L;
                    this.K = 0;
                    for (hq2 hq2Var : this.f118705t) {
                        hq2Var.b(false);
                    }
                    uh2Var.f116647f.f108980a = 0L;
                    uh2Var.f116650i = 0L;
                    uh2Var.f116649h = true;
                    uh2Var.f116653l = false;
                }
            } else {
                this.K = iD;
            }
            ke1Var = new ke1(i13, jMin);
        }
        int i14 = ke1Var.f112694a;
        boolean z11 = i14 == 0 || i14 == 1;
        ol1 ol1Var = this.f118691f;
        ol1Var.a(ge1Var, new tk1(1, -1, null, 0, null, ol1Var.a(uh2Var.f116650i), ol1Var.a(this.A)), iOException, !z11);
        if (!z11) {
            this.f118690e.getClass();
        }
        return ke1Var;
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        this.f118703r = al1Var;
        this.f118699n.d();
        i();
    }

    public final hq2 a(xh2 xh2Var) {
        int length = this.f118705t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (xh2Var.equals(this.f118706u[i10])) {
                return this.f118705t[i10];
            }
        }
        hq2 hq2VarA = hq2.a(this.f118694i, this.f118689d, this.f118692g);
        hq2VarA.f111685f = this;
        int i11 = length + 1;
        xh2[] xh2VarArr = (xh2[]) Arrays.copyOf(this.f118706u, i11);
        xh2VarArr[length] = xh2Var;
        this.f118706u = xh2VarArr;
        hq2[] hq2VarArr = (hq2[]) Arrays.copyOf(this.f118705t, i11);
        hq2VarArr[length] = hq2VarA;
        this.f118705t = hq2VarArr;
        return hq2VarA;
    }

    @Override // yads.ap0
    public final void a(final nu2 nu2Var) {
        this.f118702q.post(new Runnable() { // from class: yads.s71
            @Override // java.lang.Runnable
            public final void run() {
                this.f115716b.b(nu2Var);
            }
        });
    }

    @Override // yads.bl1
    public final long a(bo0[] bo0VarArr, boolean[] zArr, iq2[] iq2VarArr, boolean[] zArr2, long j10) {
        bo0 bo0Var;
        c();
        yh2 yh2Var = this.f118710y;
        v43 v43Var = yh2Var.f118185a;
        boolean[] zArr3 = yh2Var.f118187c;
        int i10 = this.F;
        for (int i11 = 0; i11 < bo0VarArr.length; i11++) {
            iq2 iq2Var = iq2VarArr[i11];
            if (iq2Var != null && (bo0VarArr[i11] == null || !zArr[i11])) {
                int i12 = ((wh2) iq2Var).f117456b;
                if (zArr3[i12]) {
                    this.F--;
                    zArr3[i12] = false;
                    iq2VarArr[i11] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i13 = 0; i13 < bo0VarArr.length; i13++) {
            if (iq2VarArr[i13] == null && (bo0Var = bo0VarArr[i13]) != null) {
                if (bo0Var.g() == 1) {
                    if (bo0Var.b(0) == 0) {
                        int iIndexOf = v43Var.f116874c.indexOf(bo0Var.c());
                        if (iIndexOf < 0) {
                            iIndexOf = -1;
                        }
                        if (!zArr3[iIndexOf]) {
                            this.F++;
                            zArr3[iIndexOf] = true;
                            iq2VarArr[i13] = new wh2(this, iIndexOf);
                            zArr2[i13] = true;
                            if (!z10) {
                                hq2 hq2Var = this.f118705t[iIndexOf];
                                z10 = (hq2Var.b(j10, true) || hq2Var.f111696q + hq2Var.f111698s == 0) ? false : true;
                            }
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
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f118697l.b()) {
                for (hq2 hq2Var2 : this.f118705t) {
                    hq2Var2.a();
                }
                le1 le1Var = this.f118697l.f114975b;
                if (le1Var != null) {
                    le1Var.a(false);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                for (hq2 hq2Var3 : this.f118705t) {
                    hq2Var3.b(false);
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            for (int i14 = 0; i14 < iq2VarArr.length; i14++) {
                if (iq2VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.D = true;
        return j10;
    }

    @Override // yads.ap0
    public final z43 a(int i10, int i11) {
        return a(new xh2(false, i10));
    }
}
