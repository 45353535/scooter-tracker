package yads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xa0 implements me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv f117754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c43 f117755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e43 f117756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa0 f117757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f117758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ae1 f117759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qc2 f117760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u23 f117761h;

    public xa0(hv hvVar) {
        this.f117754a = (hv) fi.a(hvVar);
        this.f117759f = new ae1(w83.c(), hvVar, new yd1() { // from class: yads.b61
            @Override // yads.yd1
            public final void a(Object obj, pu0 pu0Var) {
                xa0.a((te) obj, pu0Var);
            }
        });
        c43 c43Var = new c43();
        this.f117755b = c43Var;
        this.f117756c = new e43();
        this.f117757d = new wa0(c43Var);
        this.f117758e = new SparseArray();
    }

    public static /* synthetic */ void a(te teVar, pu0 pu0Var) {
    }

    public final re b() {
        return a(this.f117757d.f117368f);
    }

    public final re e(int i10, kl1 kl1Var) {
        this.f117760g.getClass();
        if (kl1Var != null) {
            return ((f43) this.f117757d.f117365c.get(kl1Var)) != null ? a(kl1Var) : a(f43.f110599b, i10, kl1Var);
        }
        vm0 vm0Var = (vm0) this.f117760g;
        vm0Var.u();
        f43 f43Var = vm0Var.Z.f110310a;
        if (i10 >= f43Var.b()) {
            f43Var = f43.f110599b;
        }
        return a(f43Var, i10, (kl1) null);
    }

    @Override // yads.oc2
    public final void onCues(final List list) {
        final re reVarA = a();
        a(reVarA, 27, new xd1() { // from class: yads.e61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                List list2 = list;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onIsLoadingChanged(final boolean z10) {
        final re reVarA = a();
        a(reVarA, 3, new xd1() { // from class: yads.p61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                boolean z11 = z10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onIsPlayingChanged(final boolean z10) {
        final re reVarA = a();
        a(reVarA, 7, new xd1() { // from class: yads.i61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                boolean z11 = z10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final re reVarA = a();
        a(reVarA, 5, new xd1() { // from class: yads.j61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                boolean z11 = z10;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onPlaybackStateChanged(final int i10) {
        final re reVarA = a();
        a(reVarA, 4, new xd1() { // from class: yads.r51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final re reVarA = a();
        a(reVarA, 6, new xd1() { // from class: yads.zx0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final re reVarA = a();
        a(reVarA, -1, new xd1() { // from class: yads.u11
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                boolean z11 = z10;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onRenderedFirstFrame() {
    }

    @Override // yads.oc2
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final re reVarB = b();
        a(reVarB, 23, new xd1() { // from class: yads.v61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                boolean z11 = z10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final re reVarB = b();
        a(reVarB, 24, new xd1() { // from class: yads.a21
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                int i12 = i10;
                int i13 = i11;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void onVolumeChanged(final float f10) {
        final re reVarB = b();
        a(reVarB, 22, new xd1() { // from class: yads.e31
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                float f11 = f10;
                ((te) obj).getClass();
            }
        });
    }

    public final re a() {
        return a(this.f117757d.f117366d);
    }

    public final re a(kl1 kl1Var) {
        this.f117760g.getClass();
        f43 f43Var = kl1Var == null ? null : (f43) this.f117757d.f117365c.get(kl1Var);
        if (kl1Var != null && f43Var != null) {
            return a(f43Var, f43Var.a(kl1Var.f109962a, this.f117755b).f109216d, kl1Var);
        }
        int iG = ((vm0) this.f117760g).g();
        vm0 vm0Var = (vm0) this.f117760g;
        vm0Var.u();
        f43 f43Var2 = vm0Var.Z.f110310a;
        if (iG >= f43Var2.b()) {
            f43Var2 = f43.f110599b;
        }
        return a(f43Var2, iG, (kl1) null);
    }

    @Override // yads.kj0
    public final void d(int i10, kl1 kl1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1026, new xd1() { // from class: yads.y61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ((te) obj).getClass();
            }
        });
    }

    public static void b(re reVar, int i10, long j10, long j11, te teVar) {
        String str;
        yk1 yk1Var = (yk1) teVar;
        yk1Var.getClass();
        kl1 kl1Var = reVar.f115413d;
        if (kl1Var != null) {
            xd0 xd0Var = yk1Var.f118253b;
            f43 f43Var = reVar.f115411b;
            synchronized (xd0Var) {
                str = xd0Var.a(f43Var.a(kl1Var.f109962a, xd0Var.f117797b).f109216d, kl1Var).f117427a;
            }
            Long l10 = (Long) yk1Var.f118259h.get(str);
            Long l11 = (Long) yk1Var.f118258g.get(str);
            yk1Var.f118259h.put(str, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            yk1Var.f118258g.put(str, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public static void c(re reVar, ca0 ca0Var, te teVar) {
        yk1 yk1Var = (yk1) teVar;
        yk1Var.f118275x += ca0Var.f109301g;
        yk1Var.f118276y += ca0Var.f109299e;
    }

    public final void d(final ca0 ca0Var) {
        final re reVarB = b();
        a(reVarB, 1015, new xd1() { // from class: yads.c61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                ca0 ca0Var2 = ca0Var;
                ((te) obj).getClass();
            }
        });
    }

    public final void d() {
        final re reVarA = a();
        a(reVarA, 1028, new xd1() { // from class: yads.r61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                ((te) obj).getClass();
            }
        });
        ae1 ae1Var = this.f117759f;
        for (zd1 zd1Var : ae1Var.f108656d) {
            yd1 yd1Var = ae1Var.f108655c;
            zd1Var.f118631d = true;
            if (zd1Var.f118630c) {
                yd1Var.a(zd1Var.f118628a, zd1Var.f118629b.a());
            }
        }
        ae1Var.f108656d.clear();
        ae1Var.f108659g = true;
    }

    @Override // yads.kj0
    public final void c(int i10, kl1 kl1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1025, new xd1() { // from class: yads.u61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.pl1
    public final void c(int i10, kl1 kl1Var, final ge1 ge1Var, final tk1 tk1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1002, new xd1() { // from class: yads.d51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ge1 ge1Var2 = ge1Var;
                tk1 tk1Var2 = tk1Var;
                ((te) obj).getClass();
            }
        });
    }

    public final void c(final Exception exc) {
        final re reVarB = b();
        a(reVarB, 1030, new xd1() { // from class: yads.fw0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                Exception exc2 = exc;
                ((te) obj).getClass();
            }
        });
    }

    public final void c(final ca0 ca0Var) {
        final re reVarA = a(this.f117757d.f117367e);
        a(reVarA, 1020, new xd1() { // from class: yads.a71
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.c(reVarA, ca0Var, (te) obj);
            }
        });
    }

    public final re a(f43 f43Var, int i10, kl1 kl1Var) {
        kl1 kl1Var2 = f43Var.c() ? null : kl1Var;
        ((r23) this.f117754a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        vm0 vm0Var = (vm0) this.f117760g;
        vm0Var.u();
        boolean z10 = f43Var.equals(vm0Var.Z.f110310a) && i10 == ((vm0) this.f117760g).g();
        long jB = 0;
        if (kl1Var2 == null || !kl1Var2.a()) {
            if (z10) {
                jB = ((vm0) this.f117760g).d();
            } else if (!f43Var.c()) {
                jB = w83.b(f43Var.a(i10, this.f117756c, 0L).f110199n);
            }
        } else if (z10 && ((vm0) this.f117760g).e() == kl1Var2.f109963b && ((vm0) this.f117760g).f() == kl1Var2.f109964c) {
            vm0 vm0Var2 = (vm0) this.f117760g;
            vm0Var2.u();
            jB = w83.b(vm0Var2.a(vm0Var2.Z));
        }
        kl1 kl1Var3 = this.f117757d.f117366d;
        vm0 vm0Var3 = (vm0) this.f117760g;
        vm0Var3.u();
        f43 f43Var2 = vm0Var3.Z.f110310a;
        int iG = ((vm0) this.f117760g).g();
        vm0 vm0Var4 = (vm0) this.f117760g;
        vm0Var4.u();
        long jB2 = w83.b(vm0Var4.a(vm0Var4.Z));
        vm0 vm0Var5 = (vm0) this.f117760g;
        vm0Var5.u();
        return new re(jElapsedRealtime, f43Var, i10, kl1Var2, jB, f43Var2, iG, kl1Var3, jB2, w83.b(vm0Var5.Z.f110326q));
    }

    public final void c() {
        u23 u23Var = this.f117761h;
        if (u23Var != null) {
            u23Var.f116471a.post(new Runnable() { // from class: yads.z61
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118582b.d();
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public final void b(final ca0 ca0Var) {
        final re reVarB = b();
        a(reVarB, 1007, new xd1() { // from class: yads.mz0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                ca0 ca0Var2 = ca0Var;
                ((te) obj).getClass();
            }
        });
    }

    public final void b(final Exception exc) {
        final re reVarB = b();
        a(reVarB, 1014, new xd1() { // from class: yads.y11
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                Exception exc2 = exc;
                ((te) obj).getClass();
            }
        });
    }

    public final void b(final int i10, final long j10, final long j11) {
        wa0 wa0Var = this.f117757d;
        final re reVarA = a(wa0Var.f117364b.isEmpty() ? null : (kl1) gc1.a(wa0Var.f117364b));
        a(reVarA, 1006, new xd1() { // from class: yads.x61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.b(reVarA, i10, j10, j11, (te) obj);
            }
        });
    }

    @Override // yads.pl1
    public final void b(int i10, kl1 kl1Var, final tk1 tk1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1004, new xd1() { // from class: yads.h61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.a(reVarE, tk1Var, (te) obj);
            }
        });
    }

    @Override // yads.kj0
    public final void b(int i10, kl1 kl1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1027, new xd1() { // from class: yads.d71
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.pl1
    public final void b(int i10, kl1 kl1Var, final ge1 ge1Var, final tk1 tk1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1000, new xd1() { // from class: yads.ay0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ge1 ge1Var2 = ge1Var;
                tk1 tk1Var2 = tk1Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void b(final lm0 lm0Var) {
        final re reVarA;
        dl1 dl1Var;
        if (androidx.activity.s.a(lm0Var) && (dl1Var = lm0Var.f113150i) != null) {
            reVarA = a(new kl1(dl1Var));
        } else {
            reVarA = a();
        }
        a(reVarA, 10, new xd1() { // from class: yads.x51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                dc2 dc2Var = lm0Var;
                ((te) obj).getClass();
            }
        });
    }

    public final void b(final String str, final long j10, final long j11) {
        final re reVarB = b();
        a(reVarB, 1016, new xd1() { // from class: yads.l61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                ((te) obj).getClass();
            }
        });
    }

    public final void b(final String str) {
        final re reVarB = b();
        a(reVarB, 1019, new xd1() { // from class: yads.m61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                String str2 = str;
                ((te) obj).getClass();
            }
        });
    }

    public final void b(final int i10, final long j10) {
        final re reVarA = a(this.f117757d.f117367e);
        a(reVarA, 1021, new xd1() { // from class: yads.g61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                long j11 = j10;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    public final void b(final yv0 yv0Var, final ia0 ia0Var) {
        final re reVarB = b();
        a(reVarB, 1017, new xd1() { // from class: yads.y51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                yv0 yv0Var2 = yv0Var;
                ia0 ia0Var2 = ia0Var;
                ((te) obj).getClass();
            }
        });
    }

    public static void a(re reVar, tk1 tk1Var, te teVar) {
        String str;
        yk1 yk1Var = (yk1) teVar;
        yk1Var.getClass();
        if (reVar.f115413d == null) {
            return;
        }
        yv0 yv0Var = tk1Var.f116273c;
        yv0Var.getClass();
        int i10 = tk1Var.f116274d;
        xd0 xd0Var = yk1Var.f118253b;
        f43 f43Var = reVar.f115411b;
        kl1 kl1Var = reVar.f115413d;
        kl1Var.getClass();
        synchronized (xd0Var) {
            str = xd0Var.a(f43Var.a(kl1Var.f109962a, xd0Var.f117797b).f109216d, kl1Var).f117427a;
        }
        xk1 xk1Var = new xk1(yv0Var, i10, str);
        int i11 = tk1Var.f116272b;
        if (i11 != 0) {
            if (i11 == 1) {
                yk1Var.f118267p = xk1Var;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                yk1Var.f118268q = xk1Var;
                return;
            }
        }
        yk1Var.f118266o = xk1Var;
    }

    public static void a(re reVar, ge1 ge1Var, tk1 tk1Var, IOException iOException, boolean z10, te teVar) {
        yk1 yk1Var = (yk1) teVar;
        yk1Var.getClass();
        yk1Var.f118273v = tk1Var.f116271a;
    }

    public static void a(re reVar, dc2 dc2Var, te teVar) {
        ((yk1) teVar).f118265n = dc2Var;
    }

    public static void a(re reVar, int i10, pc2 pc2Var, pc2 pc2Var2, te teVar) {
        teVar.getClass();
        yk1 yk1Var = (yk1) teVar;
        if (i10 == 1) {
            yk1Var.f118272u = true;
        }
        yk1Var.f118262k = i10;
    }

    public static void a(re reVar, tg3 tg3Var, te teVar) {
        yk1 yk1Var = (yk1) teVar;
        xk1 xk1Var = yk1Var.f118266o;
        if (xk1Var != null) {
            yv0 yv0Var = xk1Var.f117846a;
            if (yv0Var.f118404s == -1) {
                xv0 xv0Var = new xv0(yv0Var);
                xv0Var.f117987p = tg3Var.f116240b;
                xv0Var.f117988q = tg3Var.f116241c;
                yk1Var.f118266o = new xk1(new yv0(xv0Var), xk1Var.f117847b, xk1Var.f117848c);
            }
        }
        int i10 = tg3Var.f116240b;
    }

    public final /* synthetic */ void a(qc2 qc2Var, te teVar, pu0 pu0Var) {
        ((yk1) teVar).a(qc2Var, new se(pu0Var, this.f117758e));
    }

    public final void a(final Exception exc) {
        final re reVarB = b();
        a(reVarB, 1029, new xd1() { // from class: yads.ey0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                Exception exc2 = exc;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final String str, final long j10, final long j11) {
        final re reVarB = b();
        a(reVarB, 1008, new xd1() { // from class: yads.q61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final String str) {
        final re reVarB = b();
        a(reVarB, 1012, new xd1() { // from class: yads.k61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                String str2 = str;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final ca0 ca0Var) {
        final re reVarA = a(this.f117757d.f117367e);
        a(reVarA, 1013, new xd1() { // from class: yads.t51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                ca0 ca0Var2 = ca0Var;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final yv0 yv0Var, final ia0 ia0Var) {
        final re reVarB = b();
        a(reVarB, 1009, new xd1() { // from class: yads.v51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                yv0 yv0Var2 = yv0Var;
                ia0 ia0Var2 = ia0Var;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final long j10) {
        final re reVarB = b();
        a(reVarB, 1010, new xd1() { // from class: yads.by0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                long j11 = j10;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final int i10, final long j10, final long j11) {
        final re reVarB = b();
        a(reVarB, 1011, new xd1() { // from class: yads.t61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarB;
                int i11 = i10;
                long j12 = j10;
                long j13 = j11;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final nc2 nc2Var) {
        final re reVarA = a();
        a(reVarA, 13, new xd1() { // from class: yads.yx0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                nc2 nc2Var2 = nc2Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final c20 c20Var) {
        final re reVarA = a();
        a(reVarA, 27, new xd1() { // from class: yads.z11
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                c20 c20Var2 = c20Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final qf0 qf0Var) {
        final re reVarA = a();
        a(reVarA, 29, new xd1() { // from class: yads.w51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                qf0 qf0Var2 = qf0Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final boolean z10, final int i10) {
        final re reVarA = a();
        a(reVarA, 30, new xd1() { // from class: yads.r11
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                int i11 = i10;
                boolean z11 = z10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1023, new xd1() { // from class: yads.w61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var, final int i11) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1022, new xd1() { // from class: yads.s61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                int i12 = i11;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var, final Exception exc) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1024, new xd1() { // from class: yads.b71
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                Exception exc2 = exc;
                ((te) obj).getClass();
            }
        });
    }

    public final void a(final int i10, final long j10) {
        final re reVarA = a(this.f117757d.f117367e);
        a(reVarA, 1018, new xd1() { // from class: yads.xx0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                int i11 = i10;
                long j11 = j10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, final ge1 ge1Var, final tk1 tk1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1001, new xd1() { // from class: yads.z51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                ge1 ge1Var2 = ge1Var;
                tk1 tk1Var2 = tk1Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, final ge1 ge1Var, final tk1 tk1Var, final IOException iOException, final boolean z10) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1003, new xd1() { // from class: yads.cy0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.a(reVarE, ge1Var, tk1Var, iOException, z10, (te) obj);
            }
        });
    }

    @Override // yads.oc2
    public final void a(final rk1 rk1Var, final int i10) {
        final re reVarA = a();
        a(reVarA, 1, new xd1() { // from class: yads.c71
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                rk1 rk1Var2 = rk1Var;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final vk1 vk1Var) {
        final re reVarA = a();
        a(reVarA, 14, new xd1() { // from class: yads.d61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                vk1 vk1Var2 = vk1Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final fr1 fr1Var) {
        final re reVarA = a();
        a(reVarA, 28, new xd1() { // from class: yads.q51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                fr1 fr1Var2 = fr1Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final gc2 gc2Var) {
        final re reVarA = a();
        a(reVarA, 12, new xd1() { // from class: yads.c51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                gc2 gc2Var2 = gc2Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final lm0 lm0Var) {
        final re reVarA;
        dl1 dl1Var;
        if (androidx.activity.s.a(lm0Var) && (dl1Var = lm0Var.f113150i) != null) {
            reVarA = a(new kl1(dl1Var));
        } else {
            reVarA = a();
        }
        a(reVarA, 10, new xd1() { // from class: yads.s51
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.a(reVarA, lm0Var, (te) obj);
            }
        });
    }

    @Override // yads.oc2
    public final void a(final pc2 pc2Var, final pc2 pc2Var2, final int i10) {
        wa0 wa0Var = this.f117757d;
        qc2 qc2Var = this.f117760g;
        qc2Var.getClass();
        wa0Var.f117366d = wa0.a(qc2Var, wa0Var.f117364b, wa0Var.f117367e, wa0Var.f117363a);
        final re reVarA = a();
        a(reVarA, 11, new xd1() { // from class: yads.w11
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.a(reVarA, i10, pc2Var, pc2Var2, (te) obj);
            }
        });
    }

    public final void a(final Object obj, final long j10) {
        final re reVarB = b();
        a(reVarB, 26, new xd1() { // from class: yads.o61
            @Override // yads.xd1
            public final void invoke(Object obj2) {
                re reVar = reVarB;
                Object obj3 = obj;
                long j11 = j10;
                ((te) obj2).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final int i10) {
        wa0 wa0Var = this.f117757d;
        qc2 qc2Var = this.f117760g;
        qc2Var.getClass();
        wa0Var.f117366d = wa0.a(qc2Var, wa0Var.f117364b, wa0Var.f117367e, wa0Var.f117363a);
        vm0 vm0Var = (vm0) qc2Var;
        vm0Var.u();
        wa0Var.a(vm0Var.Z.f110310a);
        final re reVarA = a();
        a(reVarA, 0, new xd1() { // from class: yads.x11
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                int i11 = i10;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final b63 b63Var) {
        final re reVarA = a();
        a(reVarA, 2, new xd1() { // from class: yads.a61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarA;
                b63 b63Var2 = b63Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, final tk1 tk1Var) {
        final re reVarE = e(i10, kl1Var);
        a(reVarE, 1005, new xd1() { // from class: yads.f61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                re reVar = reVarE;
                tk1 tk1Var2 = tk1Var;
                ((te) obj).getClass();
            }
        });
    }

    @Override // yads.oc2
    public final void a(final tg3 tg3Var) {
        final re reVarB = b();
        a(reVarB, 25, new xd1() { // from class: yads.n61
            @Override // yads.xd1
            public final void invoke(Object obj) {
                xa0.a(reVarB, tg3Var, (te) obj);
            }
        });
    }

    public final void a(re reVar, int i10, xd1 xd1Var) {
        this.f117758e.put(i10, reVar);
        ae1 ae1Var = this.f117759f;
        ae1Var.a(i10, xd1Var);
        ae1Var.a();
    }

    public final void a(final qc2 qc2Var, Looper looper) {
        if (this.f117760g != null && !this.f117757d.f117364b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.f117760g = qc2Var;
        this.f117761h = ((r23) this.f117754a).a(looper, null);
        ae1 ae1Var = this.f117759f;
        yd1 yd1Var = new yd1() { // from class: yads.u51
            @Override // yads.yd1
            public final void a(Object obj, pu0 pu0Var) {
                this.f116525a.a(qc2Var, (te) obj, pu0Var);
            }
        };
        this.f117759f = new ae1(ae1Var.f108656d, looper, ae1Var.f108653a, yd1Var);
    }
}
