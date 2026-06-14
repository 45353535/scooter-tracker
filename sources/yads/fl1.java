package yads;

import android.os.Handler;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class fl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c43 f110767a = new c43();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e43 f110768b = new e43();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me f110769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f110770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f110771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f110772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f110773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cl1 f110774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cl1 f110775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cl1 f110776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f110777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f110778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f110779m;

    public fl1(me meVar, Handler handler) {
        this.f110769c = meVar;
        this.f110770d = handler;
    }

    public final cl1 a() {
        cl1 cl1Var = this.f110774h;
        if (cl1Var == null) {
            return null;
        }
        if (cl1Var == this.f110775i) {
            this.f110775i = cl1Var.f109454l;
        }
        cl1Var.b();
        int i10 = this.f110777k - 1;
        this.f110777k = i10;
        if (i10 == 0) {
            this.f110776j = null;
            cl1 cl1Var2 = this.f110774h;
            this.f110778l = cl1Var2.f109444b;
            this.f110779m = cl1Var2.f109448f.f110409a.f109965d;
        }
        this.f110774h = this.f110774h.f109454l;
        c();
        return this.f110774h;
    }

    public final void b() {
        if (this.f110777k == 0) {
            return;
        }
        cl1 cl1Var = this.f110774h;
        if (cl1Var == null) {
            throw new IllegalStateException();
        }
        this.f110778l = cl1Var.f109444b;
        this.f110779m = cl1Var.f109448f.f110409a.f109965d;
        while (cl1Var != null) {
            cl1Var.b();
            cl1Var = cl1Var.f109454l;
        }
        this.f110774h = null;
        this.f110776j = null;
        this.f110775i = null;
        this.f110777k = 0;
        c();
    }

    public final void c() {
        final u31 u31VarF = y31.f();
        for (cl1 cl1Var = this.f110774h; cl1Var != null; cl1Var = cl1Var.f109454l) {
            u31VarF.a(cl1Var.f109448f.f110409a);
        }
        cl1 cl1Var2 = this.f110775i;
        final kl1 kl1Var = cl1Var2 == null ? null : cl1Var2.f109448f.f110409a;
        this.f110770d.post(new Runnable() { // from class: yads.r6
            @Override // java.lang.Runnable
            public final void run() {
                this.f115334b.a(u31VarF, kl1Var);
            }
        });
    }

    public final el1 a(f43 f43Var, cl1 cl1Var, long j10) {
        long j11;
        f43 f43Var2;
        long j12;
        Object obj;
        long j13;
        el1 el1Var = cl1Var.f109448f;
        long j14 = (cl1Var.f109457o + el1Var.f110413e) - j10;
        boolean z10 = false;
        if (el1Var.f110415g) {
            long j15 = 0;
            int iA = f43Var.a(f43Var.a(el1Var.f110409a.f109962a), this.f110767a, this.f110768b, this.f110772f, this.f110773g);
            if (iA == -1) {
                return null;
            }
            int i10 = f43Var.a(iA, this.f110767a, true).f109216d;
            Object obj2 = this.f110767a.f109215c;
            obj2.getClass();
            long j16 = el1Var.f110409a.f109965d;
            if (f43Var.a(i10, this.f110768b, 0L).f110201p == iA) {
                Pair pairA = f43Var.a(this.f110768b, this.f110767a, i10, -9223372036854775807L, Math.max(0L, j14));
                if (pairA == null) {
                    return null;
                }
                Object obj3 = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                cl1 cl1Var2 = cl1Var.f109454l;
                if (cl1Var2 != null && cl1Var2.f109444b.equals(obj3)) {
                    j16 = cl1Var2.f109448f.f110409a.f109965d;
                } else {
                    j16 = this.f110771e;
                    this.f110771e = 1 + j16;
                }
                obj = obj3;
                j13 = jLongValue;
                j15 = -9223372036854775807L;
            } else {
                obj = obj2;
                j13 = 0;
            }
            kl1 kl1VarA = a(f43Var, obj, j13, j16, this.f110768b, this.f110767a);
            if (j15 != -9223372036854775807L && el1Var.f110411c != -9223372036854775807L) {
                if (f43Var.a(el1Var.f110409a.f109962a, this.f110767a).f109220h.f109800c > 0) {
                    d6 d6Var = this.f110767a.f109220h;
                    if (d6Var.a(d6Var.f109803f).f109259h) {
                        z10 = true;
                    }
                }
                if (kl1VarA.a() && z10) {
                    j15 = el1Var.f110411c;
                } else if (z10) {
                    j13 = el1Var.f110411c;
                }
            }
            long j17 = j15;
            f43Var.a(kl1VarA.f109962a, this.f110767a);
            if (kl1VarA.a()) {
                return a(f43Var, kl1VarA.f109962a, kl1VarA.f109963b, kl1VarA.f109964c, j17, kl1VarA.f109965d);
            }
            return a(f43Var, kl1VarA.f109962a, j13, j17, kl1VarA.f109965d);
        }
        kl1 kl1Var = el1Var.f110409a;
        f43Var.a(kl1Var.f109962a, this.f110767a);
        if (kl1Var.a()) {
            int i11 = kl1Var.f109963b;
            int i12 = this.f110767a.f109220h.a(i11).f109254c;
            if (i12 == -1) {
                return null;
            }
            int iA2 = this.f110767a.f109220h.a(i11).a(kl1Var.f109964c);
            if (iA2 < i12) {
                return a(f43Var, kl1Var.f109962a, i11, iA2, el1Var.f110411c, kl1Var.f109965d);
            }
            long jLongValue2 = el1Var.f110411c;
            if (jLongValue2 == -9223372036854775807L) {
                e43 e43Var = this.f110768b;
                c43 c43Var = this.f110767a;
                Pair pairA2 = f43Var.a(e43Var, c43Var, c43Var.f109216d, -9223372036854775807L, Math.max(0L, j14));
                f43Var2 = f43Var;
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairA2.second).longValue();
            } else {
                f43Var2 = f43Var;
            }
            Object obj4 = kl1Var.f109962a;
            int i13 = kl1Var.f109963b;
            f43Var2.a(obj4, this.f110767a);
            long j18 = this.f110767a.f109220h.a(i13).f109253b;
            if (j18 == Long.MIN_VALUE) {
                j12 = this.f110767a.f109217e;
            } else {
                j12 = this.f110767a.f109220h.a(i13).f109258g + j18;
            }
            return a(f43Var, kl1Var.f109962a, Math.max(j12, jLongValue2), el1Var.f110411c, kl1Var.f109965d);
        }
        int iA3 = this.f110767a.a(kl1Var.f109966e);
        if (this.f110767a.f109220h.a(kl1Var.f109966e).f109259h) {
            c6 c6VarA = this.f110767a.f109220h.a(kl1Var.f109966e);
            if (c6VarA.f109254c != -1 && c6VarA.f109256e[iA3] == 3) {
                z10 = true;
            }
        }
        if (iA3 != this.f110767a.f109220h.a(kl1Var.f109966e).f109254c && !z10) {
            return a(f43Var, kl1Var.f109962a, kl1Var.f109966e, iA3, el1Var.f110413e, kl1Var.f109965d);
        }
        Object obj5 = kl1Var.f109962a;
        int i14 = kl1Var.f109966e;
        f43Var.a(obj5, this.f110767a);
        long j19 = this.f110767a.f109220h.a(i14).f109253b;
        if (j19 == Long.MIN_VALUE) {
            j11 = this.f110767a.f109217e;
        } else {
            j11 = this.f110767a.f109220h.a(i14).f109258g + j19;
        }
        return a(f43Var, kl1Var.f109962a, j11, el1Var.f110413e, kl1Var.f109965d);
    }

    public final el1 a(f43 f43Var, Object obj, int i10, int i11, long j10, long j11) {
        kl1 kl1Var = new kl1(obj, i10, i11, j11);
        long jA = f43Var.a(obj, this.f110767a).a(i10, i11);
        long jMax = i11 == this.f110767a.a(i10) ? this.f110767a.f109220h.f109801d : 0L;
        boolean z10 = this.f110767a.f109220h.a(i10).f109259h;
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new el1(kl1Var, jMax, j10, -9223372036854775807L, jA, z10, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.el1 a(yads.f43 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fl1.a(yads.f43, java.lang.Object, long, long, long):yads.el1");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.el1 a(yads.f43 r18, yads.el1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            yads.kl1 r3 = r2.f110409a
            boolean r4 = r3.a()
            r5 = 0
            r6 = 1
            r7 = -1
            if (r4 != 0) goto L17
            int r4 = r3.f109966e
            if (r4 != r7) goto L17
            r12 = r6
            goto L18
        L17:
            r12 = r5
        L18:
            boolean r4 = r3.a()
            if (r4 != 0) goto L40
            int r4 = r3.f109966e
            if (r4 != r7) goto L40
            java.lang.Object r4 = r3.f109962a
            yads.c43 r8 = r0.f110767a
            yads.c43 r4 = r1.a(r4, r8)
            int r4 = r4.f109216d
            java.lang.Object r8 = r3.f109962a
            int r8 = r1.a(r8)
            yads.e43 r9 = r0.f110768b
            r10 = 0
            yads.e43 r4 = r1.a(r4, r9, r10)
            int r4 = r4.f110202q
            if (r4 != r8) goto L40
            r13 = r6
            goto L41
        L40:
            r13 = r5
        L41:
            boolean r14 = r0.a(r1, r3, r12)
            yads.kl1 r4 = r2.f110409a
            java.lang.Object r4 = r4.f109962a
            yads.c43 r8 = r0.f110767a
            r1.a(r4, r8)
            boolean r1 = r3.a()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L69
            int r1 = r3.f109966e
            if (r1 != r7) goto L5e
            goto L69
        L5e:
            yads.c43 r4 = r0.f110767a
            yads.d6 r4 = r4.f109220h
            yads.c6 r1 = r4.a(r1)
            long r10 = r1.f109253b
            goto L6a
        L69:
            r10 = r8
        L6a:
            boolean r1 = r3.a()
            if (r1 == 0) goto L7b
            yads.c43 r1 = r0.f110767a
            int r4 = r3.f109963b
            int r8 = r3.f109964c
            long r8 = r1.a(r4, r8)
            goto L8c
        L7b:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L88
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L86
            goto L88
        L86:
            r8 = r10
            goto L8c
        L88:
            yads.c43 r1 = r0.f110767a
            long r8 = r1.f109217e
        L8c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L9f
            yads.c43 r1 = r0.f110767a
            int r4 = r3.f109963b
            yads.d6 r1 = r1.f109220h
            yads.c6 r1 = r1.a(r4)
            boolean r5 = r1.f109259h
            goto Lb0
        L9f:
            int r1 = r3.f109966e
            if (r1 == r7) goto Lb0
            yads.c43 r4 = r0.f110767a
            yads.d6 r4 = r4.f109220h
            yads.c6 r1 = r4.a(r1)
            boolean r1 = r1.f109259h
            if (r1 == 0) goto Lb0
            r5 = r6
        Lb0:
            yads.el1 r1 = new yads.el1
            r6 = r3
            long r3 = r2.f110410b
            r18 = r1
            long r0 = r2.f110411c
            r15 = r10
            r9 = r8
            r7 = r15
            r11 = r5
            r2 = r6
            r5 = r0
            r1 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fl1.a(yads.f43, yads.el1):yads.el1");
    }

    public final boolean a(f43 f43Var, kl1 kl1Var, boolean z10) {
        int iA = f43Var.a(kl1Var.f109962a);
        return !f43Var.a(f43Var.a(iA, this.f110767a, false).f109216d, this.f110768b, 0L).f110195j && f43Var.a(iA, this.f110767a, this.f110768b, this.f110772f, this.f110773g) == -1 && z10;
    }

    public final void a(u31 u31Var, kl1 kl1Var) {
        me meVar = this.f110769c;
        nk2 nk2VarA = u31Var.a();
        xa0 xa0Var = (xa0) meVar;
        wa0 wa0Var = xa0Var.f117757d;
        qc2 qc2Var = xa0Var.f117760g;
        qc2Var.getClass();
        wa0Var.getClass();
        wa0Var.f117364b = y31.a((Collection) nk2VarA);
        if (!nk2VarA.isEmpty()) {
            wa0Var.f117367e = (kl1) nk2VarA.get(0);
            kl1Var.getClass();
            wa0Var.f117368f = kl1Var;
        }
        if (wa0Var.f117366d == null) {
            wa0Var.f117366d = wa0.a(qc2Var, wa0Var.f117364b, wa0Var.f117367e, wa0Var.f117363a);
        }
        vm0 vm0Var = (vm0) qc2Var;
        vm0Var.u();
        wa0Var.a(vm0Var.Z.f110310a);
    }

    public final boolean a(cl1 cl1Var) {
        if (cl1Var != null) {
            int i10 = 0;
            if (cl1Var.equals(this.f110776j)) {
                return false;
            }
            this.f110776j = cl1Var;
            boolean z10 = false;
            while (true) {
                cl1Var = cl1Var.f109454l;
                if (cl1Var == null) {
                    break;
                }
                if (cl1Var == this.f110775i) {
                    this.f110775i = this.f110774h;
                    z10 = true;
                }
                cl1Var.b();
                this.f110777k--;
            }
            cl1 cl1Var2 = this.f110776j;
            if (cl1Var2.f109454l != null) {
                cl1Var2.a();
                cl1Var2.f109454l = null;
                while (true) {
                    g53 g53Var = cl1Var2.f109456n;
                    if (i10 >= g53Var.f111076a) {
                        break;
                    }
                    boolean zA = g53Var.a(i10);
                    bo0 bo0Var = cl1Var2.f109456n.f111078c[i10];
                    if (zA && bo0Var != null) {
                        bo0Var.a();
                    }
                    i10++;
                }
            }
            c();
            return z10;
        }
        throw new IllegalStateException();
    }

    public static kl1 a(f43 f43Var, Object obj, long j10, long j11, e43 e43Var, c43 c43Var) {
        f43Var.a(obj, c43Var);
        f43Var.a(c43Var.f109216d, e43Var, 0L);
        int iA = f43Var.a(obj);
        while (c43Var.f109217e == 0) {
            d6 d6Var = c43Var.f109220h;
            if (d6Var.f109800c <= 0 || !d6Var.a(d6Var.f109803f).f109259h || c43Var.b(0L) != -1) {
                break;
            }
            int i10 = iA + 1;
            if (iA >= e43Var.f110202q) {
                break;
            }
            f43Var.a(i10, c43Var, true);
            obj = c43Var.f109215c;
            obj.getClass();
            iA = i10;
        }
        f43Var.a(obj, c43Var);
        int iB = c43Var.b(j10);
        if (iB == -1) {
            return new kl1(c43Var.a(j10), j11, obj);
        }
        return new kl1(obj, iB, c43Var.a(iB), j11);
    }

    public final kl1 a(f43 f43Var, Object obj, long j10) {
        long j11;
        int iA;
        Object obj2 = obj;
        int i10 = f43Var.a(obj2, this.f110767a).f109216d;
        Object obj3 = this.f110778l;
        if (obj3 != null && (iA = f43Var.a(obj3)) != -1 && f43Var.a(iA, this.f110767a, false).f109216d == i10) {
            j11 = this.f110779m;
        } else {
            cl1 cl1Var = this.f110774h;
            while (true) {
                if (cl1Var != null) {
                    if (cl1Var.f109444b.equals(obj2)) {
                        j11 = cl1Var.f109448f.f110409a.f109965d;
                        break;
                    }
                    cl1Var = cl1Var.f109454l;
                } else {
                    cl1 cl1Var2 = this.f110774h;
                    while (true) {
                        if (cl1Var2 != null) {
                            int iA2 = f43Var.a(cl1Var2.f109444b);
                            if (iA2 != -1 && f43Var.a(iA2, this.f110767a, false).f109216d == i10) {
                                j11 = cl1Var2.f109448f.f110409a.f109965d;
                                break;
                            }
                            cl1Var2 = cl1Var2.f109454l;
                        } else {
                            j11 = this.f110771e;
                            this.f110771e = 1 + j11;
                            if (this.f110774h == null) {
                                this.f110778l = obj2;
                                this.f110779m = j11;
                            }
                        }
                    }
                }
            }
        }
        long j12 = j11;
        f43Var.a(obj2, this.f110767a);
        f43Var.a(this.f110767a.f109216d, this.f110768b, 0L);
        boolean z10 = false;
        for (int iA3 = f43Var.a(obj); iA3 >= this.f110768b.f110201p; iA3--) {
            f43Var.a(iA3, this.f110767a, true);
            c43 c43Var = this.f110767a;
            boolean z11 = c43Var.f109220h.f109800c > 0;
            z10 |= z11;
            if (c43Var.b(c43Var.f109217e) != -1) {
                obj2 = this.f110767a.f109215c;
                obj2.getClass();
            }
            if (z10 && (!z11 || this.f110767a.f109217e != 0)) {
                break;
            }
        }
        return a(f43Var, obj2, j10, j12, this.f110768b, this.f110767a);
    }

    public final boolean a(f43 f43Var) {
        f43 f43Var2;
        cl1 cl1Var;
        cl1 cl1Var2 = this.f110774h;
        if (cl1Var2 == null) {
            return true;
        }
        int iA = f43Var.a(cl1Var2.f109444b);
        while (true) {
            f43Var2 = f43Var;
            iA = f43Var2.a(iA, this.f110767a, this.f110768b, this.f110772f, this.f110773g);
            while (true) {
                cl1Var = cl1Var2.f109454l;
                if (cl1Var == null || cl1Var2.f109448f.f110415g) {
                    break;
                }
                cl1Var2 = cl1Var;
            }
            if (iA == -1 || cl1Var == null || f43Var2.a(cl1Var.f109444b) != iA) {
                break;
            }
            cl1Var2 = cl1Var;
            f43Var = f43Var2;
        }
        boolean zA = a(cl1Var2);
        cl1Var2.f109448f = a(f43Var2, cl1Var2.f109448f);
        return !zA;
    }

    public final boolean a(f43 f43Var, long j10, long j11) {
        el1 el1VarA;
        el1 el1Var;
        boolean z10;
        el1 el1Var2;
        f43 f43Var2 = f43Var;
        cl1 cl1Var = this.f110774h;
        cl1 cl1Var2 = null;
        while (cl1Var != null) {
            el1 el1Var3 = cl1Var.f109448f;
            if (cl1Var2 == null) {
                el1VarA = a(f43Var2, el1Var3);
            } else {
                el1 el1VarA2 = a(f43Var2, cl1Var2, j10);
                if (el1VarA2 == null) {
                    return !a(cl1Var2);
                }
                if (el1Var3.f110410b != el1VarA2.f110410b || !el1Var3.f110409a.equals(el1VarA2.f110409a)) {
                    return !a(cl1Var2);
                }
                el1VarA = el1VarA2;
            }
            long j12 = el1Var3.f110411c;
            if (j12 == el1VarA.f110411c) {
                el1Var = el1VarA;
                z10 = true;
                el1Var2 = el1Var3;
            } else {
                z10 = true;
                el1Var2 = el1Var3;
                el1Var = new el1(el1VarA.f110409a, el1VarA.f110410b, j12, el1VarA.f110412d, el1VarA.f110413e, el1VarA.f110414f, el1VarA.f110415g, el1VarA.f110416h, el1VarA.f110417i);
            }
            cl1Var.f109448f = el1Var;
            long j13 = el1Var2.f110413e;
            long j14 = el1VarA.f110413e;
            if (j13 != -9223372036854775807L && j13 != j14) {
                bl1 bl1Var = cl1Var.f109443a;
                if (bl1Var instanceof dv) {
                    long j15 = el1Var.f110412d;
                    if (j15 == -9223372036854775807L) {
                        j15 = Long.MIN_VALUE;
                    }
                    dv dvVar = (dv) bl1Var;
                    dvVar.f110081f = 0L;
                    dvVar.f110082g = j15;
                }
                boolean z11 = (cl1Var != this.f110775i || el1Var.f110414f || (j11 != Long.MIN_VALUE && j11 < ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : cl1Var.f109457o + j14))) ? false : z10;
                if (a(cl1Var) || z11) {
                    return false;
                }
                return z10;
            }
            cl1Var2 = cl1Var;
            cl1Var = cl1Var.f109454l;
            f43Var2 = f43Var;
        }
        return true;
    }
}
