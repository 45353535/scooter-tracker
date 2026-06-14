package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class cn0 implements Handler.Callback, al1, e53, ul1, md0, xc2 {
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public bn0 L;
    public long M;
    public int N;
    public boolean O;
    public lm0 P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo[] f109464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f109465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo[] f109466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f53 f109467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g53 f109468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kd0 f109469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final am f109470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u23 f109471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f109472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f109473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e43 f109474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c43 f109475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f109476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f109477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd0 f109478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f109479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hv f109480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zm0 f109481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fl1 f109482t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final vl1 f109483u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ce1 f109484v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f109485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ou2 f109486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ec2 f109487y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ym0 f109488z;
    public boolean G = false;
    public boolean B = false;
    public long Q = -9223372036854775807L;

    public cn0(jo[] joVarArr, f53 f53Var, g53 g53Var, kd0 kd0Var, am amVar, int i10, me meVar, ou2 ou2Var, jd0 jd0Var, long j10, Looper looper, r23 r23Var, zm0 zm0Var, wc2 wc2Var) {
        this.f109481s = zm0Var;
        this.f109464b = joVarArr;
        this.f109467e = f53Var;
        this.f109468f = g53Var;
        this.f109469g = kd0Var;
        this.f109470h = amVar;
        this.F = i10;
        this.f109486x = ou2Var;
        this.f109484v = jd0Var;
        this.f109485w = j10;
        this.f109480r = r23Var;
        this.f109476n = kd0Var.a();
        this.f109477o = kd0Var.b();
        ec2 ec2VarA = ec2.a(g53Var);
        this.f109487y = ec2VarA;
        this.f109488z = new ym0(ec2VarA);
        this.f109466d = new jo[joVarArr.length];
        for (int i11 = 0; i11 < joVarArr.length; i11++) {
            joVarArr[i11].a(i11, wc2Var);
            this.f109466d[i11] = joVarArr[i11].b();
        }
        this.f109478p = new nd0(this, r23Var);
        this.f109479q = new ArrayList();
        this.f109465c = yv2.a();
        this.f109474l = new e43();
        this.f109475m = new c43();
        f53Var.a(this, amVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f109482t = new fl1(meVar, handler);
        this.f109483u = new vl1(this, meVar, handler, wc2Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f109472j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f109473k = looper2;
        this.f109471i = r23Var.a(looper2, this);
    }

    public final void a(xm0 xm0Var, int i10) throws Throwable {
        this.f109488z.a(1);
        vl1 vl1Var = this.f109483u;
        if (i10 == -1) {
            i10 = vl1Var.f117065b.size();
        }
        a(vl1Var.a(i10, xm0Var.f117893a, xm0Var.f117894b), false);
    }

    public final long b() {
        cl1 cl1Var = this.f109482t.f110775i;
        if (cl1Var == null) {
            return 0L;
        }
        long jMax = cl1Var.f109457o;
        if (!cl1Var.f109446d) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            jo[] joVarArr = this.f109464b;
            if (i10 >= joVarArr.length) {
                return jMax;
            }
            if (b(joVarArr[i10])) {
                jo joVar = this.f109464b[i10];
                if (joVar.f112413h != cl1Var.f109445c[i10]) {
                    continue;
                } else {
                    long j10 = joVar.f112416k;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j10, jMax);
                }
            }
            i10++;
        }
    }

    public final void c(bl1 bl1Var) throws lm0 {
        cl1 cl1Var = this.f109482t.f110776j;
        if (cl1Var == null || cl1Var.f109443a != bl1Var) {
            return;
        }
        float f10 = this.f109478p.getPlaybackParameters().f111141b;
        f43 f43Var = this.f109487y.f110310a;
        cl1Var.f109446d = true;
        v43 trackGroups = cl1Var.f109443a.getTrackGroups();
        cl1Var.f109455m = trackGroups;
        g53 g53VarA = cl1Var.f109452j.a(cl1Var.f109451i, trackGroups, cl1Var.f109448f.f110409a, f43Var);
        for (bo0 bo0Var : g53VarA.f111078c) {
            if (bo0Var != null) {
                bo0Var.a(f10);
            }
        }
        el1 el1Var = cl1Var.f109448f;
        long jMax = el1Var.f110410b;
        long j10 = el1Var.f110413e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = cl1Var.a(g53VarA, jMax, false, new boolean[cl1Var.f109451i.length]);
        long j11 = cl1Var.f109457o;
        el1 el1Var2 = cl1Var.f109448f;
        long j12 = el1Var2.f110410b;
        cl1Var.f109457o = (j12 - jA) + j11;
        if (jA != j12) {
            el1Var2 = new el1(el1Var2.f110409a, jA, el1Var2.f110411c, el1Var2.f110412d, el1Var2.f110413e, el1Var2.f110414f, el1Var2.f110415g, el1Var2.f110416h, el1Var2.f110417i);
        }
        cl1Var.f109448f = el1Var2;
        a(cl1Var.f109456n);
        if (cl1Var == this.f109482t.f110774h) {
            b(cl1Var.f109448f.f110410b);
            a(new boolean[this.f109464b.length]);
            ec2 ec2Var = this.f109487y;
            kl1 kl1Var = ec2Var.f110311b;
            long j13 = cl1Var.f109448f.f110410b;
            this.f109487y = a(kl1Var, j13, ec2Var.f110312c, j13, false, 5);
        }
        d();
    }

    public final void d() {
        int i10;
        cl1 cl1Var = this.f109482t.f110776j;
        if (cl1Var != null) {
            if ((!cl1Var.f109446d ? 0L : cl1Var.f109443a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                cl1 cl1Var2 = this.f109482t.f110776j;
                long jA = a(cl1Var2.f109446d ? cl1Var2.f109443a.getNextLoadPositionUs() : 0L);
                if (cl1Var2 != this.f109482t.f110774h) {
                    long j10 = cl1Var2.f109448f.f110410b;
                }
                kd0 kd0Var = this.f109469g;
                float f10 = this.f109478p.getPlaybackParameters().f111141b;
                va0 va0Var = kd0Var.f112678a;
                synchronized (va0Var) {
                    i10 = va0Var.f116915e * va0Var.f116912b;
                }
                boolean z10 = i10 >= kd0Var.f112687j;
                long jMin = kd0Var.f112679b;
                if (f10 > 1.0f) {
                    int i11 = w83.f117341a;
                    if (f10 != 1.0f) {
                        jMin = Math.round(jMin * ((double) f10));
                    }
                    jMin = Math.min(jMin, kd0Var.f112680c);
                }
                if (jA < Math.max(jMin, 500000L)) {
                    z = kd0Var.f112684g || !z10;
                    kd0Var.f112688k = z;
                    if (!z && jA < 500000) {
                        uf1.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (jA >= kd0Var.f112680c || z10) {
                    kd0Var.f112688k = false;
                }
                z = kd0Var.f112688k;
            }
        }
        this.E = z;
        if (z) {
            cl1 cl1Var3 = this.f109482t.f110776j;
            long j11 = this.M;
            if (cl1Var3.f109454l != null) {
                throw new IllegalStateException();
            }
            cl1Var3.f109443a.continueLoading(j11 - cl1Var3.f109457o);
        }
        n();
    }

    public final void e() throws Throwable {
        a(this.f109483u.a(), true);
    }

    public final void f() {
        this.f109488z.a(1);
        throw null;
    }

    public final void g() {
        this.f109488z.a(1);
        a(false, false, false, true);
        this.f109469g.a(false);
        b(this.f109487y.f110310a.c() ? 4 : 2);
        vl1 vl1Var = this.f109483u;
        qb0 qb0Var = (qb0) this.f109470h;
        qb0Var.getClass();
        if (vl1Var.f117074k) {
            throw new IllegalStateException();
        }
        vl1Var.f117075l = qb0Var;
        for (int i10 = 0; i10 < vl1Var.f117065b.size(); i10++) {
            tl1 tl1Var = (tl1) vl1Var.f117065b.get(i10);
            vl1Var.a(tl1Var);
            vl1Var.f117072i.add(tl1Var);
        }
        vl1Var.f117074k = true;
        this.f109471i.f116471a.sendEmptyMessage(2);
    }

    public final synchronized boolean h() {
        if (!this.A && this.f109472j.isAlive()) {
            this.f109471i.f116471a.sendEmptyMessage(7);
            a(new k23() { // from class: yads.x4
                @Override // yads.k23
                public final Object get() {
                    return this.f117697b.c();
                }
            }, this.f109485w);
            return this.A;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z10;
        cl1 cl1Var;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((bn0) message.obj);
                    break;
                case 4:
                    a((gc2) message.obj);
                    break;
                case 5:
                    this.f109486x = (ou2) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((bl1) message.obj);
                    break;
                case 9:
                    b((bl1) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    zc2 zc2Var = (zc2) message.obj;
                    zc2Var.getClass();
                    if (zc2Var.f118618f != this.f109473k) {
                        this.f109471i.a(15, zc2Var).b();
                    } else {
                        a(zc2Var);
                        int i10 = this.f109487y.f110314e;
                        if (i10 == 3 || i10 == 2) {
                            this.f109471i.f116471a.sendEmptyMessage(2);
                        }
                    }
                    break;
                case 15:
                    c((zc2) message.obj);
                    break;
                case 16:
                    gc2 gc2Var = (gc2) message.obj;
                    a(gc2Var, gc2Var.f111141b, true, false);
                    break;
                case 17:
                    a((xm0) message.obj);
                    break;
                case 18:
                    a((xm0) message.obj, message.arg1);
                    break;
                case 19:
                    a2.a(message.obj);
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (fw2) message.obj);
                    break;
                case 21:
                    a((fw2) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (RuntimeException e10) {
            lm0 lm0Var = new lm0(2, e10, ((e10 instanceof IllegalStateException) || (e10 instanceof IllegalArgumentException)) ? 1004 : 1000, 0);
            uf1.b("ExoPlayerImplInternal", uf1.a("Playback error", lm0Var));
            a(true, false);
            this.f109487y = this.f109487y.a(lm0Var);
        } catch (ba2 e11) {
            int i11 = e11.f108951c;
            if (i11 == 1) {
                i = e11.f108950b ? 3001 : 3003;
            } else if (i11 == 4) {
                i = e11.f108950b ? 3002 : 3004;
            }
            a(e11, i);
        } catch (d30 e12) {
            a(e12, e12.f109730b);
        } catch (gj0 e13) {
            a(e13, e13.f111227b);
        } catch (ro e14) {
            a(e14, 1002);
        } catch (IOException e15) {
            a(e15, 2000);
        } catch (lm0 e16) {
            e = e16;
            if (e.f113145d == 1 && (cl1Var = this.f109482t.f110775i) != null) {
                kl1 kl1Var = cl1Var.f109448f.f110409a;
                String message2 = e.getMessage();
                int i12 = w83.f117341a;
                e = new lm0(message2, e.getCause(), e.f109878b, e.f113145d, e.f113146e, e.f113147f, e.f113148g, e.f113149h, kl1Var, e.f109879c, e.f113151j);
            }
            if (e.f113151j && this.P == null) {
                uf1.d("ExoPlayerImplInternal", uf1.a("Recoverable renderer error", e));
                this.P = e;
                u23 u23Var = this.f109471i;
                t23 t23VarA = u23Var.a(25, e);
                Handler handler = u23Var.f116471a;
                Message message3 = t23VarA.f116042a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                t23VarA.a();
                z10 = false;
            } else {
                lm0 lm0Var2 = this.P;
                if (lm0Var2 != null) {
                    lm0Var2.addSuppressed(e);
                    e = this.P;
                }
                uf1.b("ExoPlayerImplInternal", uf1.a("Playback error", e));
                z10 = false;
                a(true, false);
                this.f109487y = this.f109487y.a(e);
            }
        }
        z10 = false;
        ym0 ym0Var = this.f109488z;
        ec2 ec2Var = this.f109487y;
        boolean z11 = ym0Var.f118292a | (ym0Var.f118293b != ec2Var ? true : z10);
        ym0Var.f118292a = z11;
        ym0Var.f118293b = ec2Var;
        if (!z11) {
            return true;
        }
        this.f109481s.a(ym0Var);
        this.f109488z = new ym0(this.f109487y);
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        this.f109469g.a(true);
        b(1);
        this.f109472j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void j() throws lm0 {
        int i10;
        boolean z10;
        float f10 = this.f109478p.getPlaybackParameters().f111141b;
        fl1 fl1Var = this.f109482t;
        cl1 cl1Var = fl1Var.f110774h;
        cl1 cl1Var2 = fl1Var.f110775i;
        boolean z11 = true;
        for (cl1 cl1Var3 = cl1Var; cl1Var3 != null && cl1Var3.f109446d; cl1Var3 = cl1Var3.f109454l) {
            g53 g53VarA = cl1Var3.f109452j.a(cl1Var3.f109451i, cl1Var3.f109455m, cl1Var3.f109448f.f110409a, this.f109487y.f110310a);
            boolean z12 = false;
            for (bo0 bo0Var : g53VarA.f111078c) {
                if (bo0Var != null) {
                    bo0Var.a(f10);
                }
            }
            g53 g53Var = cl1Var3.f109456n;
            if (g53Var != null && g53Var.f111078c.length == g53VarA.f111078c.length) {
                for (int i11 = 0; i11 < g53VarA.f111078c.length; i11++) {
                    if (w83.a(g53VarA.f111077b[i11], g53Var.f111077b[i11]) && w83.a(g53VarA.f111078c[i11], g53Var.f111078c[i11])) {
                    }
                }
                if (cl1Var3 == cl1Var2) {
                    z11 = false;
                }
            }
            if (z11) {
                fl1 fl1Var2 = this.f109482t;
                cl1 cl1Var4 = fl1Var2.f110774h;
                boolean zA = fl1Var2.a(cl1Var4);
                boolean[] zArr = new boolean[this.f109464b.length];
                long jA = cl1Var4.a(g53VarA, this.f109487y.f110327r, zA, zArr);
                ec2 ec2Var = this.f109487y;
                if (ec2Var.f110314e == 4 || jA == ec2Var.f110327r) {
                    z10 = false;
                } else {
                    z10 = false;
                    z12 = true;
                }
                ec2 ec2Var2 = this.f109487y;
                boolean z13 = z10;
                i10 = 4;
                this.f109487y = a(ec2Var2.f110311b, jA, ec2Var2.f110312c, ec2Var2.f110313d, z12, 5);
                if (z12) {
                    b(jA);
                }
                boolean[] zArr2 = new boolean[this.f109464b.length];
                ?? r82 = z13;
                while (true) {
                    jo[] joVarArr = this.f109464b;
                    if (r82 >= joVarArr.length) {
                        break;
                    }
                    jo joVar = joVarArr[r82];
                    boolean zB = b(joVar);
                    zArr2[r82] = zB;
                    iq2 iq2Var = cl1Var4.f109445c[r82];
                    if (zB) {
                        if (iq2Var != joVar.f112413h) {
                            a(joVar);
                        } else if (zArr[r82]) {
                            long j10 = this.M;
                            joVar.f112417l = z13;
                            joVar.f112416k = j10;
                            joVar.a(j10, z13);
                        }
                    }
                    r82++;
                }
                a(zArr2);
            } else {
                i10 = 4;
                this.f109482t.a(cl1Var3);
                if (cl1Var3.f109446d) {
                    cl1Var3.a(g53VarA, Math.max(cl1Var3.f109448f.f110410b, this.M - cl1Var3.f109457o), false, new boolean[cl1Var3.f109451i.length]);
                }
            }
            a(true);
            if (this.f109487y.f110314e != i10) {
                d();
                o();
                this.f109471i.f116471a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        cl1 cl1Var = this.f109482t.f110774h;
        this.C = cl1Var != null && cl1Var.f109448f.f110416h && this.B;
    }

    public final boolean l() {
        ec2 ec2Var = this.f109487y;
        return ec2Var.f110321l && ec2Var.f110322m == 0;
    }

    public final void m() {
        int i10;
        nd0 nd0Var = this.f109478p;
        nd0Var.f113826g = false;
        v03 v03Var = nd0Var.f113821b;
        if (v03Var.f116829c) {
            v03Var.a(v03Var.a());
            v03Var.f116829c = false;
        }
        for (jo joVar : this.f109464b) {
            if (b(joVar) && (i10 = joVar.f112412g) == 2) {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                joVar.f112412g = 1;
                joVar.k();
            }
        }
    }

    public final void n() {
        cl1 cl1Var = this.f109482t.f110776j;
        boolean z10 = this.E || (cl1Var != null && cl1Var.f109443a.isLoading());
        ec2 ec2Var = this.f109487y;
        if (z10 != ec2Var.f110316g) {
            this.f109487y = new ec2(ec2Var.f110310a, ec2Var.f110311b, ec2Var.f110312c, ec2Var.f110313d, ec2Var.f110314e, ec2Var.f110315f, z10, ec2Var.f110317h, ec2Var.f110318i, ec2Var.f110319j, ec2Var.f110320k, ec2Var.f110321l, ec2Var.f110322m, ec2Var.f110323n, ec2Var.f110325p, ec2Var.f110326q, ec2Var.f110327r, ec2Var.f110324o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cn0.o():void");
    }

    public final void e(boolean z10) throws lm0 {
        this.G = z10;
        fl1 fl1Var = this.f109482t;
        f43 f43Var = this.f109487y.f110310a;
        fl1Var.f110773g = z10;
        if (!fl1Var.a(f43Var)) {
            b(true);
        }
        a(false);
    }

    public static void a(zc2 zc2Var) {
        synchronized (zc2Var) {
        }
        try {
            zc2Var.f118613a.a(zc2Var.f118616d, zc2Var.f118617e);
        } finally {
            zc2Var.a(true);
        }
    }

    public final void b(bl1 bl1Var) {
        bl1 bl1Var2;
        cl1 cl1Var = this.f109482t.f110776j;
        if (cl1Var == null || (bl1Var2 = cl1Var.f109443a) != bl1Var) {
            return;
        }
        long j10 = this.M;
        if (cl1Var.f109454l == null) {
            if (cl1Var.f109446d) {
                bl1Var2.reevaluateBuffer(j10 - cl1Var.f109457o);
            }
            d();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(jo joVar) {
        if (b(joVar)) {
            nd0 nd0Var = this.f109478p;
            if (joVar == nd0Var.f113823d) {
                nd0Var.f113824e = null;
                nd0Var.f113823d = null;
                nd0Var.f113825f = true;
            }
            int i10 = joVar.f112412g;
            if (i10 == 2) {
                if (i10 == 2) {
                    joVar.f112412g = 1;
                    joVar.k();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (joVar.f112412g == 1) {
                zv0 zv0Var = joVar.f112408c;
                zv0Var.f118844a = null;
                zv0Var.f118845b = null;
                joVar.f112412g = 0;
                joVar.f112413h = null;
                joVar.f112414i = null;
                joVar.f112417l = false;
                joVar.h();
                this.K--;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static boolean b(jo joVar) {
        return joVar.f112412g != 0;
    }

    public final void b(zc2 zc2Var) {
        try {
            a(zc2Var);
        } catch (lm0 e10) {
            uf1.b("ExoPlayerImplInternal", uf1.a("Unexpected error delivering message on external thread.", e10));
            throw new RuntimeException(e10);
        }
    }

    public final void b(long j10) {
        cl1 cl1Var = this.f109482t.f110774h;
        long j11 = j10 + (cl1Var == null ? 1000000000000L : cl1Var.f109457o);
        this.M = j11;
        this.f109478p.f113821b.a(j11);
        for (jo joVar : this.f109464b) {
            if (b(joVar)) {
                long j12 = this.M;
                joVar.f112417l = false;
                joVar.f112416k = j12;
                joVar.a(j12, false);
            }
        }
        for (cl1 cl1Var2 = this.f109482t.f110774h; cl1Var2 != null; cl1Var2 = cl1Var2.f109454l) {
            for (bo0 bo0Var : cl1Var2.f109456n.f111078c) {
                if (bo0Var != null) {
                    bo0Var.i();
                }
            }
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.A);
    }

    public final void c(final zc2 zc2Var) {
        Looper looper = zc2Var.f118618f;
        if (!looper.getThread().isAlive()) {
            uf1.d("TAG", "Trying to send message on a dead thread.");
            zc2Var.a(false);
        } else {
            ((r23) this.f109480r).getClass();
            new Handler(looper, null).post(new Runnable() { // from class: yads.w4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117308b.b(zc2Var);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x05c3, code lost:
    
        if (r8 >= r4.f112687j) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0619 A[PHI: r13
  0x0619: PHI (r13v3 boolean) = (r13v2 boolean), (r13v2 boolean), (r13v4 boolean), (r13v2 boolean), (r13v2 boolean) binds: [B:311:0x04f5, B:323:0x0519, B:374:0x05c6, B:315:0x0505, B:321:0x0515] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182 A[EDGE_INSN: B:532:0x0182->B:74:0x0182 BREAK  A[LOOP:8: B:84:0x0198->B:101:0x01d0], EDGE_INSN: B:534:0x0182->B:74:0x0182 BREAK  A[LOOP:8: B:84:0x0198->B:101:0x01d0], EDGE_INSN: B:535:0x0182->B:74:0x0182 BREAK  A[LOOP:8: B:84:0x0198->B:101:0x01d0], EDGE_INSN: B:536:0x0182->B:74:0x0182 BREAK  A[LOOP:8: B:84:0x0198->B:101:0x01d0]] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v85, types: [yads.g53] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30, types: [yads.g53] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82, types: [int] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72, types: [int] */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r6v31, types: [yads.bo0[]] */
    /* JADX WARN: Type inference failed for: r6v32, types: [yads.bo0] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [int] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [yads.g53] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws yads.lm0 {
        /*
            Method dump skipped, instruction units count: 1984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cn0.a():void");
    }

    public final void d(boolean z10) throws lm0 {
        this.B = z10;
        k();
        if (this.C) {
            fl1 fl1Var = this.f109482t;
            if (fl1Var.f110775i != fl1Var.f110774h) {
                b(true);
                a(false);
            }
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        if (z10 || !this.f109487y.f110324o) {
            return;
        }
        this.f109471i.f116471a.sendEmptyMessage(2);
    }

    public final void b(boolean z10) throws lm0 {
        kl1 kl1Var = this.f109482t.f110774h.f109448f.f110409a;
        long jA = a(kl1Var, this.f109487y.f110327r, true, false);
        if (jA != this.f109487y.f110327r) {
            ec2 ec2Var = this.f109487y;
            this.f109487y = a(kl1Var, jA, ec2Var.f110312c, ec2Var.f110313d, z10, 5);
        }
    }

    public final void b(int i10) {
        ec2 ec2Var = this.f109487y;
        if (ec2Var.f110314e != i10) {
            if (i10 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f109487y = ec2Var.a(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean[] r22) throws yads.lm0 {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cn0.a(boolean[]):void");
    }

    public final long a(f43 f43Var, Object obj, long j10) {
        long jElapsedRealtime;
        f43Var.a(f43Var.a(obj, this.f109475m).f109216d, this.f109474l, 0L);
        e43 e43Var = this.f109474l;
        if (e43Var.f110192g != -9223372036854775807L && e43Var.a()) {
            e43 e43Var2 = this.f109474l;
            if (e43Var2.f110195j) {
                long j11 = e43Var2.f110193h;
                int i10 = w83.f117341a;
                if (j11 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = j11 + SystemClock.elapsedRealtime();
                }
                return w83.a(jElapsedRealtime - this.f109474l.f110192g) - (j10 + this.f109475m.f109218f);
            }
        }
        return -9223372036854775807L;
    }

    public final Pair a(f43 f43Var) {
        long j10 = 0;
        if (f43Var.c()) {
            return Pair.create(ec2.f110309s, 0L);
        }
        Pair pairA = f43Var.a(this.f109474l, this.f109475m, f43Var.a(this.G), -9223372036854775807L);
        kl1 kl1VarA = this.f109482t.a(f43Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (kl1VarA.a()) {
            f43Var.a(kl1VarA.f109962a, this.f109475m);
            if (kl1VarA.f109964c == this.f109475m.a(kl1VarA.f109963b)) {
                j10 = this.f109475m.f109220h.f109801d;
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(kl1VarA, Long.valueOf(j10));
    }

    public final long a(long j10) {
        cl1 cl1Var = this.f109482t.f110776j;
        if (cl1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.M - cl1Var.f109457o));
    }

    public final void a(IOException iOException, int i10) {
        lm0 lm0Var = new lm0(0, iOException, i10, 0);
        cl1 cl1Var = this.f109482t.f110774h;
        if (cl1Var != null) {
            kl1 kl1Var = cl1Var.f109448f.f110409a;
            String message = lm0Var.getMessage();
            int i11 = w83.f117341a;
            lm0Var = new lm0(message, lm0Var.getCause(), lm0Var.f109878b, lm0Var.f113145d, lm0Var.f113146e, lm0Var.f113147f, lm0Var.f113148g, lm0Var.f113149h, kl1Var, lm0Var.f109879c, lm0Var.f113151j);
        }
        uf1.b("ExoPlayerImplInternal", uf1.a("Playback error", lm0Var));
        a(false, false);
        this.f109487y = this.f109487y.a(lm0Var);
    }

    public final void a(boolean z10) {
        long j10;
        cl1 cl1Var = this.f109482t.f110776j;
        kl1 kl1Var = cl1Var == null ? this.f109487y.f110311b : cl1Var.f109448f.f110409a;
        boolean zEquals = this.f109487y.f110320k.equals(kl1Var);
        if (!zEquals) {
            this.f109487y = this.f109487y.a(kl1Var);
        }
        ec2 ec2Var = this.f109487y;
        if (cl1Var == null) {
            j10 = ec2Var.f110327r;
        } else if (!cl1Var.f109446d) {
            j10 = cl1Var.f109448f.f110410b;
        } else {
            long bufferedPositionUs = cl1Var.f109447e ? cl1Var.f109443a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? cl1Var.f109448f.f110413e : bufferedPositionUs;
        }
        ec2Var.f110325p = j10;
        ec2 ec2Var2 = this.f109487y;
        ec2Var2.f110326q = a(ec2Var2.f110325p);
        if ((!zEquals || z10) && cl1Var != null && cl1Var.f109446d) {
            a(cl1Var.f109456n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0214  */
    /* JADX WARN: Type inference failed for: r0v33, types: [yads.ec2] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v13, types: [yads.f43] */
    /* JADX WARN: Type inference failed for: r2v18, types: [yads.ec2] */
    /* JADX WARN: Type inference failed for: r2v25, types: [yads.f43] */
    /* JADX WARN: Type inference failed for: r37v0, types: [yads.cn0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.f43 r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cn0.a(yads.f43, boolean):void");
    }

    public final void a(gc2 gc2Var, float f10, boolean z10, boolean z11) {
        gc2 gc2Var2;
        int i10;
        if (z10) {
            if (z11) {
                this.f109488z.a(1);
            }
            ec2 ec2Var = this.f109487y;
            ec2 ec2Var2 = new ec2(ec2Var.f110310a, ec2Var.f110311b, ec2Var.f110312c, ec2Var.f110313d, ec2Var.f110314e, ec2Var.f110315f, ec2Var.f110316g, ec2Var.f110317h, ec2Var.f110318i, ec2Var.f110319j, ec2Var.f110320k, ec2Var.f110321l, ec2Var.f110322m, gc2Var, ec2Var.f110325p, ec2Var.f110326q, ec2Var.f110327r, ec2Var.f110324o);
            gc2Var2 = gc2Var;
            this.f109487y = ec2Var2;
        } else {
            gc2Var2 = gc2Var;
        }
        float f11 = gc2Var2.f111141b;
        cl1 cl1Var = this.f109482t.f110774h;
        while (true) {
            i10 = 0;
            if (cl1Var == null) {
                break;
            }
            bo0[] bo0VarArr = cl1Var.f109456n.f111078c;
            int length = bo0VarArr.length;
            while (i10 < length) {
                bo0 bo0Var = bo0VarArr[i10];
                if (bo0Var != null) {
                    bo0Var.a(f11);
                }
                i10++;
            }
            cl1Var = cl1Var.f109454l;
        }
        jo[] joVarArr = this.f109464b;
        int length2 = joVarArr.length;
        while (i10 < length2) {
            jo joVar = joVarArr[i10];
            if (joVar != null) {
                joVar.a(f10, gc2Var2.f111141b);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ec2 a(yads.kl1 r26, long r27, long r29, long r31, boolean r33, int r34) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cn0.a(yads.kl1, long, long, long, boolean, int):yads.ec2");
    }

    @Override // yads.dv2
    public final void a(ev2 ev2Var) {
        this.f109471i.a(9, (bl1) ev2Var).b();
    }

    @Override // yads.al1
    public final void a(bl1 bl1Var) {
        this.f109471i.a(8, bl1Var).b();
    }

    public final void a(int i10, int i11, fw2 fw2Var) throws Throwable {
        this.f109488z.a(1);
        vl1 vl1Var = this.f109483u;
        vl1Var.getClass();
        if (i10 >= 0 && i10 <= i11 && i11 <= vl1Var.f117065b.size()) {
            vl1Var.f117073j = fw2Var;
            vl1Var.a(i10, i11);
            a(vl1Var.a(), false);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[PHI: r5 r6 r8
  0x00d8: PHI (r5v4 yads.kl1) = (r5v3 yads.kl1), (r5v11 yads.kl1) binds: [B:39:0x00ae, B:41:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:39:0x00ae, B:41:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r8v3 long) = (r8v2 long), (r8v5 long) binds: [B:39:0x00ae, B:41:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cn0.a(boolean, boolean, boolean, boolean):void");
    }

    public final void a(f43 f43Var, f43 f43Var2) {
        if (f43Var.c() && f43Var2.c()) {
            return;
        }
        int size = this.f109479q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f109479q);
        } else {
            a2.a(this.f109479q.get(size));
            throw null;
        }
    }

    public static Pair a(f43 f43Var, bn0 bn0Var, boolean z10, int i10, boolean z11, e43 e43Var, c43 c43Var) {
        Pair pairA;
        f43 f43Var2;
        Object objA;
        f43 f43Var3 = bn0Var.f109056a;
        if (f43Var.c()) {
            return null;
        }
        boolean zC = f43Var3.c();
        f43 f43Var4 = f43Var3;
        if (zC) {
            f43Var4 = f43Var;
        }
        try {
            pairA = f43Var4.a(e43Var, c43Var, bn0Var.f109057b, bn0Var.f109058c);
            f43Var2 = f43Var4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (f43Var.equals(f43Var2)) {
            return pairA;
        }
        if (f43Var.a(pairA.first) != -1) {
            return (f43Var2.a(pairA.first, c43Var).f109219g && f43Var2.a(c43Var.f109216d, e43Var, 0L).f110201p == f43Var2.a(pairA.first)) ? f43Var.a(e43Var, c43Var, f43Var.a(pairA.first, c43Var).f109216d, bn0Var.f109058c) : pairA;
        }
        if (z10 && (objA = a(e43Var, c43Var, i10, z11, pairA.first, f43Var2, f43Var)) != null) {
            return f43Var.a(e43Var, c43Var, f43Var.a(objA, c43Var).f109216d, -9223372036854775807L);
        }
        return null;
    }

    public static Object a(e43 e43Var, c43 c43Var, int i10, boolean z10, Object obj, f43 f43Var, f43 f43Var2) {
        int iA = f43Var.a(obj);
        int iA2 = f43Var.a();
        int i11 = 0;
        int iA3 = iA;
        int iA4 = -1;
        while (i11 < iA2 && iA4 == -1) {
            e43 e43Var2 = e43Var;
            c43 c43Var2 = c43Var;
            int i12 = i10;
            boolean z11 = z10;
            f43 f43Var3 = f43Var;
            iA3 = f43Var3.a(iA3, c43Var2, e43Var2, i12, z11);
            if (iA3 == -1) {
                break;
            }
            iA4 = f43Var2.a(f43Var3.a(iA3));
            i11++;
            f43Var = f43Var3;
            c43Var = c43Var2;
            e43Var = e43Var2;
            i10 = i12;
            z10 = z11;
        }
        if (iA4 == -1) {
            return null;
        }
        return f43Var2.a(iA4);
    }

    public final void a(bn0 bn0Var) throws Throwable {
        long jLongValue;
        kl1 kl1VarA;
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        kl1 kl1Var;
        long j12;
        long jA;
        long j13;
        ec2 ec2Var;
        int i10;
        ec2 ec2Var2;
        kl1 kl1Var2;
        f43 f43Var;
        long j14;
        kl1 kl1Var3;
        boolean z12;
        long j15;
        this.f109488z.a(1);
        Pair pairA = a(this.f109487y.f110310a, bn0Var, true, this.F, this.G, this.f109474l, this.f109475m);
        if (pairA == null) {
            Pair pairA2 = a(this.f109487y.f110310a);
            kl1VarA = (kl1) pairA2.first;
            jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f109487y.f110310a.c();
            j11 = -9223372036854775807L;
            j10 = 0;
        } else {
            Object obj = pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            long j16 = bn0Var.f109058c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            kl1VarA = this.f109482t.a(this.f109487y.f110310a, obj, jLongValue);
            if (kl1VarA.a()) {
                this.f109487y.f110310a.a(kl1VarA.f109962a, this.f109475m);
                jLongValue = this.f109475m.a(kl1VarA.f109963b) == kl1VarA.f109964c ? this.f109475m.f109220h.f109801d : 0L;
                j10 = 0;
            } else {
                j10 = 0;
                if (bn0Var.f109058c != -9223372036854775807L) {
                    z10 = false;
                }
                j11 = j16;
            }
            z10 = true;
            j11 = j16;
        }
        try {
            if (this.f109487y.f110310a.c()) {
                this.L = bn0Var;
            } else if (pairA == null) {
                if (this.f109487y.f110314e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (kl1VarA.equals(this.f109487y.f110311b)) {
                    try {
                        cl1 cl1Var = this.f109482t.f110774h;
                        jA = (cl1Var == null || !cl1Var.f109446d || jLongValue == j10) ? jLongValue : cl1Var.f109443a.a(jLongValue, this.f109486x);
                        if (w83.b(jA) != w83.b(this.f109487y.f110327r) || ((i10 = (ec2Var = this.f109487y).f110314e) != 2 && i10 != 3)) {
                            z11 = z10;
                            j13 = j11;
                            kl1Var = kl1VarA;
                        }
                        long j17 = ec2Var.f110327r;
                        this.f109487y = a(kl1VarA, j17, j11, j17, z10, 2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z10;
                        kl1Var = kl1VarA;
                        j12 = jLongValue;
                        this.f109487y = a(kl1Var, j12, j11, j12, z11, 2);
                        throw th;
                    }
                }
                z11 = z10;
                j13 = j11;
                kl1Var = kl1VarA;
                jA = jLongValue;
                try {
                    boolean z13 = this.f109487y.f110314e == 4;
                    fl1 fl1Var = this.f109482t;
                    long jA2 = a(kl1Var, jA, fl1Var.f110774h != fl1Var.f110775i, z13);
                    boolean z14 = z11 | (jLongValue != jA2);
                    try {
                        ec2Var2 = this.f109487y;
                        kl1Var2 = kl1Var;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        f43Var = ec2Var2.f110310a;
                        j14 = j13;
                    } catch (Throwable th4) {
                        th = th4;
                        kl1Var = kl1Var2;
                        j11 = j13;
                        z11 = z14;
                        j12 = jA2;
                        this.f109487y = a(kl1Var, j12, j11, j12, z11, 2);
                        throw th;
                    }
                    try {
                        a(f43Var, kl1Var2, f43Var, ec2Var2.f110311b, j14);
                        kl1Var3 = kl1Var2;
                        j11 = j14;
                        z12 = z14;
                        j15 = jA2;
                        this.f109487y = a(kl1Var3, j15, j11, j15, z12, 2);
                    } catch (Throwable th5) {
                        th = th5;
                        kl1Var = kl1Var2;
                        j11 = j14;
                        z11 = z14;
                        j12 = jA2;
                        this.f109487y = a(kl1Var, j12, j11, j12, z11, 2);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j11 = j13;
                    j12 = jLongValue;
                    this.f109487y = a(kl1Var, j12, j11, j12, z11, 2);
                    throw th;
                }
            }
            z12 = z10;
            kl1Var3 = kl1VarA;
            j15 = jLongValue;
            this.f109487y = a(kl1Var3, j15, j11, j15, z12, 2);
        } catch (Throwable th7) {
            th = th7;
            z11 = z10;
        }
    }

    public final long a(kl1 kl1Var, long j10, boolean z10, boolean z11) throws lm0 {
        fl1 fl1Var;
        long jSeekToUs;
        long j11;
        cl1 cl1Var;
        m();
        this.D = false;
        if (z11 || this.f109487y.f110314e == 3) {
            b(2);
        }
        cl1 cl1Var2 = this.f109482t.f110774h;
        cl1 cl1Var3 = cl1Var2;
        while (cl1Var3 != null && !kl1Var.equals(cl1Var3.f109448f.f110409a)) {
            cl1Var3 = cl1Var3.f109454l;
        }
        if (z10 || cl1Var2 != cl1Var3 || (cl1Var3 != null && j10 + cl1Var3.f109457o < 0)) {
            for (jo joVar : this.f109464b) {
                a(joVar);
            }
            if (cl1Var3 != null) {
                while (true) {
                    fl1Var = this.f109482t;
                    if (fl1Var.f110774h == cl1Var3) {
                        break;
                    }
                    fl1Var.a();
                }
                fl1Var.a(cl1Var3);
                cl1Var3.f109457o = 1000000000000L;
                a(new boolean[this.f109464b.length]);
            }
        }
        if (cl1Var3 != null) {
            this.f109482t.a(cl1Var3);
            if (!cl1Var3.f109446d) {
                el1 el1Var = cl1Var3.f109448f;
                if (j10 == el1Var.f110410b) {
                    cl1Var = cl1Var3;
                    j11 = j10;
                } else {
                    cl1Var = cl1Var3;
                    j11 = j10;
                    el1Var = new el1(el1Var.f110409a, j11, el1Var.f110411c, el1Var.f110412d, el1Var.f110413e, el1Var.f110414f, el1Var.f110415g, el1Var.f110416h, el1Var.f110417i);
                }
                cl1Var.f109448f = el1Var;
            } else {
                cl1 cl1Var4 = cl1Var3;
                j11 = j10;
                if (cl1Var4.f109447e) {
                    jSeekToUs = cl1Var4.f109443a.seekToUs(j11);
                    cl1Var4.f109443a.discardBuffer(jSeekToUs - this.f109476n, this.f109477o);
                }
                b(jSeekToUs);
                d();
            }
            jSeekToUs = j11;
            b(jSeekToUs);
            d();
        } else {
            this.f109482t.b();
            b(j10);
            jSeekToUs = j10;
        }
        a(false);
        this.f109471i.f116471a.sendEmptyMessage(2);
        return jSeekToUs;
    }

    public static void a(jo joVar, long j10) {
        joVar.f112417l = true;
        if (joVar instanceof m33) {
            m33 m33Var = (m33) joVar;
            if (m33Var.f112417l) {
                m33Var.B = j10;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (jo joVar : this.f109464b) {
                    if (!b(joVar) && this.f109465c.remove(joVar)) {
                        if (joVar.f112412g == 0) {
                            zv0 zv0Var = joVar.f112408c;
                            zv0Var.f118844a = null;
                            zv0Var.f118845b = null;
                            joVar.i();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
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

    public final void a(xm0 xm0Var) throws Throwable {
        this.f109488z.a(1);
        if (xm0Var.f117895c != -1) {
            this.L = new bn0(new sd2(xm0Var.f117893a, xm0Var.f117894b), xm0Var.f117895c, xm0Var.f117896d);
        }
        vl1 vl1Var = this.f109483u;
        List list = xm0Var.f117893a;
        fw2 fw2Var = xm0Var.f117894b;
        vl1Var.a(0, vl1Var.f117065b.size());
        a(vl1Var.a(vl1Var.f117065b.size(), list, fw2Var), false);
    }

    public final void a(boolean z10, int i10, boolean z11, int i11) {
        this.f109488z.a(z11 ? 1 : 0);
        ym0 ym0Var = this.f109488z;
        ym0Var.f118292a = true;
        ym0Var.f118297f = true;
        ym0Var.f118298g = i11;
        ec2 ec2Var = this.f109487y;
        this.f109487y = new ec2(ec2Var.f110310a, ec2Var.f110311b, ec2Var.f110312c, ec2Var.f110313d, ec2Var.f110314e, ec2Var.f110315f, ec2Var.f110316g, ec2Var.f110317h, ec2Var.f110318i, ec2Var.f110319j, ec2Var.f110320k, z10, i10, ec2Var.f110323n, ec2Var.f110325p, ec2Var.f110326q, ec2Var.f110327r, ec2Var.f110324o);
        this.D = false;
        for (cl1 cl1Var = this.f109482t.f110774h; cl1Var != null; cl1Var = cl1Var.f109454l) {
            for (bo0 bo0Var : cl1Var.f109456n.f111078c) {
                if (bo0Var != null) {
                    bo0Var.a(z10);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i12 = this.f109487y.f110314e;
        if (i12 != 3) {
            if (i12 == 2) {
                this.f109471i.f116471a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.D = false;
        nd0 nd0Var = this.f109478p;
        nd0Var.f113826g = true;
        v03 v03Var = nd0Var.f113821b;
        if (!v03Var.f116829c) {
            ((r23) v03Var.f116828b).getClass();
            v03Var.f116831e = SystemClock.elapsedRealtime();
            v03Var.f116829c = true;
        }
        for (jo joVar : this.f109464b) {
            if (b(joVar)) {
                if (joVar.f112412g == 1) {
                    joVar.f112412g = 2;
                    joVar.j();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.f109471i.f116471a.sendEmptyMessage(2);
    }

    public final void a(gc2 gc2Var) {
        this.f109478p.a(gc2Var);
        gc2 playbackParameters = this.f109478p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f111141b, true, true);
    }

    public final void a(int i10) throws lm0 {
        this.F = i10;
        fl1 fl1Var = this.f109482t;
        f43 f43Var = this.f109487y.f110310a;
        fl1Var.f110772f = i10;
        if (!fl1Var.a(f43Var)) {
            b(true);
        }
        a(false);
    }

    public final void a(fw2 fw2Var) throws Throwable {
        this.f109488z.a(1);
        vl1 vl1Var = this.f109483u;
        int size = vl1Var.f117065b.size();
        if (fw2Var.f110953b.length != size) {
            fw2Var = new fw2(new int[0], new Random(fw2Var.f110952a.nextLong())).a(size);
        }
        vl1Var.f117073j = fw2Var;
        a(vl1Var.a(), false);
    }

    public final boolean a(f43 f43Var, kl1 kl1Var) {
        if (!kl1Var.a() && !f43Var.c()) {
            f43Var.a(f43Var.a(kl1Var.f109962a, this.f109475m).f109216d, this.f109474l, 0L);
            if (this.f109474l.a()) {
                e43 e43Var = this.f109474l;
                if (e43Var.f110195j && e43Var.f110192g != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f109488z.a(z11 ? 1 : 0);
        this.f109469g.a(true);
        b(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(g53 g53Var) {
        kd0 kd0Var = this.f109469g;
        jo[] joVarArr = this.f109464b;
        bo0[] bo0VarArr = g53Var.f111078c;
        int iMax = kd0Var.f112683f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < joVarArr.length) {
                    if (bo0VarArr[i10] != null) {
                        switch (joVarArr[i10].f112407b) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        kd0Var.f112687j = iMax;
        kd0Var.f112678a.a(iMax);
    }

    public final void a(f43 f43Var, kl1 kl1Var, f43 f43Var2, kl1 kl1Var2, long j10) {
        if (!a(f43Var, kl1Var)) {
            gc2 gc2Var = kl1Var.a() ? gc2.f111140e : this.f109487y.f110323n;
            if (this.f109478p.getPlaybackParameters().equals(gc2Var)) {
                return;
            }
            this.f109478p.a(gc2Var);
            return;
        }
        f43Var.a(f43Var.a(kl1Var.f109962a, this.f109475m).f109216d, this.f109474l, 0L);
        ce1 ce1Var = this.f109484v;
        kk1 kk1Var = this.f109474l.f110197l;
        int i10 = w83.f117341a;
        jd0 jd0Var = (jd0) ce1Var;
        jd0Var.getClass();
        jd0Var.f112303d = w83.a(kk1Var.f112731b);
        jd0Var.f112306g = w83.a(kk1Var.f112732c);
        jd0Var.f112307h = w83.a(kk1Var.f112733d);
        float f10 = kk1Var.f112734e;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        jd0Var.f112310k = f10;
        float f11 = kk1Var.f112735f;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        jd0Var.f112309j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            jd0Var.f112303d = -9223372036854775807L;
        }
        jd0Var.a();
        if (j10 != -9223372036854775807L) {
            jd0 jd0Var2 = (jd0) this.f109484v;
            jd0Var2.f112304e = a(f43Var, kl1Var.f109962a, j10);
            jd0Var2.a();
        } else {
            if (w83.a(!f43Var2.c() ? f43Var2.a(f43Var2.a(kl1Var2.f109962a, this.f109475m).f109216d, this.f109474l, 0L).f110187b : null, this.f109474l.f110187b)) {
                return;
            }
            jd0 jd0Var3 = (jd0) this.f109484v;
            jd0Var3.f112304e = -9223372036854775807L;
            jd0Var3.a();
        }
    }

    public final synchronized void a(k23 k23Var, long j10) {
        ((r23) this.f109480r).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) k23Var.get()).booleanValue() && j10 > 0) {
            try {
                this.f109480r.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((r23) this.f109480r).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
