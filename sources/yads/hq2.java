package yads;

import android.util.SparseArray;
import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public final class hq2 implements z43 {
    public yv0 A;
    public yv0 B;
    public boolean C;
    public boolean D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dq2 f111680a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nj0 f111683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jj0 f111684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gq2 f111685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yv0 f111686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hj0 f111687h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f111695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f111696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f111697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f111698s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f111702w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f111705z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eq2 f111681b = new eq2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f111688i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f111689j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f111690k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f111693n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f111692m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f111691l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y43[] f111694o = new y43[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz2 f111682c = new rz2(new uy() { // from class: yads.b8
        @Override // yads.uy
        public final void accept(Object obj) {
            ((fq2) obj).f110831b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f111699t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f111700u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f111701v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f111704y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f111703x = true;

    public hq2(ke keVar, nj0 nj0Var, jj0 jj0Var) {
        this.f111683d = nj0Var;
        this.f111684e = jj0Var;
        this.f111680a = new dq2(keVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x001a, B:9:0x001f, B:12:0x0023, B:16:0x002c, B:21:0x0078, B:23:0x007c, B:25:0x0087, B:27:0x009d, B:29:0x00a5, B:30:0x00a8, B:31:0x00ad, B:32:0x00ae, B:34:0x00b6, B:37:0x00c5, B:38:0x00d6, B:39:0x00db, B:40:0x00dc, B:41:0x00e1, B:43:0x00ea, B:24:0x0085, B:19:0x005f), top: B:48:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(long r8, int r10, long r11, int r13, yads.y43 r14) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hq2.a(long, int, long, int, yads.y43):void");
    }

    @Override // yads.z43
    public /* synthetic */ int b(y20 y20Var, int i10, boolean z10) {
        return m71.a(this, y20Var, i10, z10);
    }

    public final void c(int i10) {
        dq2 dq2Var = this.f111680a;
        long jB = b(i10);
        if (jB > dq2Var.f110029g) {
            throw new IllegalArgumentException();
        }
        dq2Var.f110029g = jB;
        if (jB != 0) {
            cq2 cq2Var = dq2Var.f110026d;
            if (jB != cq2Var.f109517a) {
                while (dq2Var.f110029g > cq2Var.f109518b) {
                    cq2Var = cq2Var.f109520d;
                }
                cq2 cq2Var2 = cq2Var.f109520d;
                cq2Var2.getClass();
                dq2Var.a(cq2Var2);
                cq2 cq2Var3 = new cq2(dq2Var.f110024b, cq2Var.f109518b);
                cq2Var.f109520d = cq2Var3;
                if (dq2Var.f110029g == cq2Var.f109518b) {
                    cq2Var = cq2Var3;
                }
                dq2Var.f110028f = cq2Var;
                if (dq2Var.f110027e == cq2Var2) {
                    dq2Var.f110027e = cq2Var3;
                    return;
                }
                return;
            }
        }
        dq2Var.a(dq2Var.f110026d);
        cq2 cq2Var4 = new cq2(dq2Var.f110024b, dq2Var.f110029g);
        dq2Var.f110026d = cq2Var4;
        dq2Var.f110027e = cq2Var4;
        dq2Var.f110028f = cq2Var4;
    }

    public final long d(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iE = e(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f111693n[iE]);
            if ((this.f111692m[iE] & 1) != 0) {
                return jMax;
            }
            iE--;
            if (iE == -1) {
                iE = this.f111688i - 1;
            }
        }
        return jMax;
    }

    public final int e(int i10) {
        int i11 = this.f111697r + i10;
        int i12 = this.f111688i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @Override // yads.z43
    public /* synthetic */ void b(int i10, w92 w92Var) {
        m71.b(this, i10, w92Var);
    }

    public final long b(int i10) {
        int i11 = this.f111696q;
        int i12 = this.f111695p;
        int i13 = (i11 + i12) - i10;
        if (i13 >= 0 && i13 <= i12 - this.f111698s) {
            int i14 = i12 - i13;
            this.f111695p = i14;
            this.f111701v = Math.max(this.f111700u, d(i14));
            this.f111702w = i13 == 0 && this.f111702w;
            this.f111682c.a(i10);
            int i15 = this.f111695p;
            if (i15 == 0) {
                return 0L;
            }
            int iE = e(i15 - 1);
            return this.f111690k[iE] + ((long) this.f111691l[iE]);
        }
        throw new IllegalArgumentException();
    }

    public final synchronized void e() {
        this.f111698s = 0;
        dq2 dq2Var = this.f111680a;
        dq2Var.f110027e = dq2Var.f110026d;
    }

    public final void d() {
        hj0 hj0Var = this.f111687h;
        if (hj0Var != null) {
            hj0Var.a(this.f111684e);
            this.f111687h = null;
            this.f111686g = null;
        }
    }

    public final synchronized long b() {
        return this.f111701v;
    }

    public final void b(boolean z10) {
        dq2 dq2Var = this.f111680a;
        dq2Var.a(dq2Var.f110026d);
        dq2Var.f110026d.a(dq2Var.f110024b, 0L);
        cq2 cq2Var = dq2Var.f110026d;
        dq2Var.f110027e = cq2Var;
        dq2Var.f110028f = cq2Var;
        dq2Var.f110029g = 0L;
        ((va0) dq2Var.f110023a).c();
        this.f111695p = 0;
        this.f111696q = 0;
        this.f111697r = 0;
        this.f111698s = 0;
        this.f111703x = true;
        this.f111699t = Long.MIN_VALUE;
        this.f111700u = Long.MIN_VALUE;
        this.f111701v = Long.MIN_VALUE;
        this.f111702w = false;
        rz2 rz2Var = this.f111682c;
        for (int i10 = 0; i10 < rz2Var.f115651b.size(); i10++) {
            rz2Var.f115652c.accept(rz2Var.f115651b.valueAt(i10));
        }
        rz2Var.f115650a = -1;
        rz2Var.f115651b.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f111704y = true;
        }
    }

    public final synchronized yv0 c() {
        return this.f111704y ? null : this.B;
    }

    public final synchronized boolean b(long j10, boolean z10) throws Throwable {
        try {
            try {
                e();
                int iE = e(this.f111698s);
                int i10 = this.f111698s;
                int i11 = this.f111695p;
                if (i10 != i11 && j10 >= this.f111693n[iE]) {
                    if (j10 <= this.f111701v || z10) {
                        int iA = a(iE, i11 - i10, j10, true);
                        if (iA == -1) {
                            return false;
                        }
                        this.f111699t = j10;
                        this.f111698s += iA;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final long a(int i10) {
        this.f111700u = Math.max(this.f111700u, d(i10));
        this.f111695p -= i10;
        int i11 = this.f111696q + i10;
        this.f111696q = i11;
        int i12 = this.f111697r + i10;
        this.f111697r = i12;
        int i13 = this.f111688i;
        if (i12 >= i13) {
            this.f111697r = i12 - i13;
        }
        int i14 = this.f111698s - i10;
        this.f111698s = i14;
        if (i14 < 0) {
            this.f111698s = 0;
        }
        this.f111682c.b(i11);
        if (this.f111695p == 0) {
            int i15 = this.f111697r;
            if (i15 == 0) {
                i15 = this.f111688i;
            }
            int i16 = i15 - 1;
            return this.f111690k[i16] + ((long) this.f111691l[i16]);
        }
        return this.f111690k[this.f111697r];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            r11 = this;
            yads.dq2 r0 = r11.f111680a
            monitor-enter(r11)
            int r1 = r11.f111695p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f111693n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f111697r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.f111698s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r8 = r12
            r10 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.a(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.a(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.a(r2)
            return
        L40:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hq2.a(long, boolean, boolean):void");
    }

    public final void a() {
        long jA;
        dq2 dq2Var = this.f111680a;
        synchronized (this) {
            int i10 = this.f111695p;
            jA = i10 == 0 ? -1L : a(i10);
        }
        dq2Var.a(jA);
    }

    public final int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f111693n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f111692m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f111688i) {
                i10 = 0;
            }
        }
        return i12;
    }

    @Override // yads.z43
    public final void a(yv0 yv0Var) {
        yv0 yv0Var2;
        if (this.E == 0 || yv0Var.f118402q == Long.MAX_VALUE) {
            yv0Var2 = yv0Var;
        } else {
            xv0 xv0Var = new xv0(yv0Var);
            xv0Var.f117986o = yv0Var.f118402q + this.E;
            yv0Var2 = new yv0(xv0Var);
        }
        boolean z10 = false;
        this.f111705z = false;
        this.A = yv0Var;
        synchronized (this) {
            try {
                this.f111704y = false;
                if (!w83.a(yv0Var2, this.B)) {
                    if (this.f111682c.f115651b.size() != 0) {
                        SparseArray sparseArray = this.f111682c.f115651b;
                        if (((fq2) sparseArray.valueAt(sparseArray.size() - 1)).f110830a.equals(yv0Var2)) {
                            SparseArray sparseArray2 = this.f111682c.f115651b;
                            this.B = ((fq2) sparseArray2.valueAt(sparseArray2.size() - 1)).f110830a;
                        }
                        yv0 yv0Var3 = this.B;
                        this.C = tr1.a(yv0Var3.f118398m, yv0Var3.f118395j);
                        this.D = false;
                        z10 = true;
                    }
                    this.B = yv0Var2;
                    yv0 yv0Var32 = this.B;
                    this.C = tr1.a(yv0Var32.f118398m, yv0Var32.f118395j);
                    this.D = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gq2 gq2Var = this.f111685f;
        if (gq2Var == null || !z10) {
            return;
        }
        zh2 zh2Var = (zh2) gq2Var;
        zh2Var.f118702q.post(zh2Var.f118700o);
    }

    public final synchronized int a(long j10, boolean z10) throws Throwable {
        try {
            try {
                int iE = e(this.f111698s);
                int i10 = this.f111698s;
                int i11 = this.f111695p;
                if (i10 == i11 || j10 < this.f111693n[iE]) {
                    return 0;
                }
                if (j10 > this.f111701v && z10) {
                    return i11 - i10;
                }
                int iA = a(iE, i11 - i10, j10, true);
                if (iA == -1) {
                    return 0;
                }
                return iA;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    public final synchronized boolean a(boolean z10) {
        yv0 yv0Var;
        int i10 = this.f111698s;
        boolean z11 = false;
        if (i10 != this.f111695p) {
            if (((fq2) this.f111682c.c(this.f111696q + i10)).f110830a != this.f111686g) {
                return true;
            }
            int iE = e(this.f111698s);
            hj0 hj0Var = this.f111687h;
            if (hj0Var == null || hj0Var.c() == 4 || ((this.f111692m[iE] & 1073741824) == 0 && this.f111687h.a())) {
                z11 = true;
            }
            return z11;
        }
        if (z10 || this.f111702w || ((yv0Var = this.B) != null && yv0Var != this.f111686g)) {
            z11 = true;
        }
        return z11;
    }

    public final void a(yv0 yv0Var, zv0 zv0Var) {
        yv0 yv0Var2;
        yv0 yv0Var3 = this.f111686g;
        boolean z10 = yv0Var3 == null;
        fj0 fj0Var = z10 ? null : yv0Var3.f118401p;
        this.f111686g = yv0Var;
        fj0 fj0Var2 = yv0Var.f118401p;
        nj0 nj0Var = this.f111683d;
        if (nj0Var != null) {
            int iA = nj0Var.a(yv0Var);
            xv0 xv0Var = new xv0(yv0Var);
            xv0Var.D = iA;
            yv0Var2 = new yv0(xv0Var);
        } else {
            yv0Var2 = yv0Var;
        }
        zv0Var.f118845b = yv0Var2;
        zv0Var.f118844a = this.f111687h;
        if (this.f111683d == null) {
            return;
        }
        if (z10 || !w83.a(fj0Var, fj0Var2)) {
            hj0 hj0Var = this.f111687h;
            hj0 hj0VarB = this.f111683d.b(this.f111684e, yv0Var);
            this.f111687h = hj0VarB;
            zv0Var.f118844a = hj0VarB;
            if (hj0Var != null) {
                hj0Var.a(this.f111684e);
            }
        }
    }

    public final int a(zv0 zv0Var, fa0 fa0Var, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        eq2 eq2Var = this.f111681b;
        synchronized (this) {
            try {
                fa0Var.f110671e = false;
                int i12 = this.f111698s;
                i11 = -5;
                if (i12 != this.f111695p) {
                    yv0 yv0Var = ((fq2) this.f111682c.c(this.f111696q + i12)).f110830a;
                    if (!z11 && yv0Var == this.f111686g) {
                        int iE = e(this.f111698s);
                        hj0 hj0Var = this.f111687h;
                        if (hj0Var != null && hj0Var.c() != 4 && ((this.f111692m[iE] & 1073741824) != 0 || !this.f111687h.a())) {
                            fa0Var.f110671e = true;
                            i11 = -3;
                        }
                        int i13 = this.f111692m[iE];
                        fa0Var.f112430b = i13;
                        long j10 = this.f111693n[iE];
                        fa0Var.f110672f = j10;
                        if (j10 < this.f111699t) {
                            fa0Var.f112430b = i13 | Integer.MIN_VALUE;
                        }
                        eq2Var.f110437a = this.f111691l[iE];
                        eq2Var.f110438b = this.f111690k[iE];
                        eq2Var.f110439c = this.f111694o[iE];
                        i11 = -4;
                    }
                    a(yv0Var, zv0Var);
                } else {
                    if (!z10 && !this.f111702w) {
                        yv0 yv0Var2 = this.B;
                        if (yv0Var2 == null || (!z11 && yv0Var2 == this.f111686g)) {
                            i11 = -3;
                        } else {
                            a(yv0Var2, zv0Var);
                        }
                    }
                    fa0Var.f112430b = 4;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !fa0Var.b(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    dq2 dq2Var = this.f111680a;
                    dq2.a(dq2Var.f110027e, fa0Var, this.f111681b, dq2Var.f110025c);
                } else {
                    dq2 dq2Var2 = this.f111680a;
                    dq2Var2.f110027e = dq2.a(dq2Var2.f110027e, fa0Var, this.f111681b, dq2Var2.f110025c);
                }
            }
            if (!z12) {
                this.f111698s++;
            }
        }
        return i11;
    }

    @Override // yads.z43
    public final int a(y20 y20Var, int i10, boolean z10) throws EOFException {
        dq2 dq2Var = this.f111680a;
        cq2 cq2Var = dq2Var.f110028f;
        if (cq2Var.f109519c == null) {
            je jeVarA = ((va0) dq2Var.f110023a).a();
            cq2 cq2Var2 = new cq2(dq2Var.f110024b, dq2Var.f110028f.f109518b);
            cq2Var.f109519c = jeVarA;
            cq2Var.f109520d = cq2Var2;
        }
        int iMin = Math.min(i10, (int) (dq2Var.f110028f.f109518b - dq2Var.f110029g));
        cq2 cq2Var3 = dq2Var.f110028f;
        je jeVar = cq2Var3.f109519c;
        int iC = y20Var.c(jeVar.f112328a, ((int) (dq2Var.f110029g - cq2Var3.f109517a)) + jeVar.f112329b, iMin);
        if (iC == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = dq2Var.f110029g + ((long) iC);
        dq2Var.f110029g = j10;
        cq2 cq2Var4 = dq2Var.f110028f;
        if (j10 == cq2Var4.f109518b) {
            dq2Var.f110028f = cq2Var4.f109520d;
        }
        return iC;
    }

    @Override // yads.z43
    public final void a(int i10, w92 w92Var) {
        dq2 dq2Var = this.f111680a;
        while (i10 > 0) {
            cq2 cq2Var = dq2Var.f110028f;
            if (cq2Var.f109519c == null) {
                je jeVarA = ((va0) dq2Var.f110023a).a();
                cq2 cq2Var2 = new cq2(dq2Var.f110024b, dq2Var.f110028f.f109518b);
                cq2Var.f109519c = jeVarA;
                cq2Var.f109520d = cq2Var2;
            }
            int iMin = Math.min(i10, (int) (dq2Var.f110028f.f109518b - dq2Var.f110029g));
            cq2 cq2Var3 = dq2Var.f110028f;
            je jeVar = cq2Var3.f109519c;
            w92Var.a(jeVar.f112328a, ((int) (dq2Var.f110029g - cq2Var3.f109517a)) + jeVar.f112329b, iMin);
            i10 -= iMin;
            long j10 = dq2Var.f110029g + ((long) iMin);
            dq2Var.f110029g = j10;
            cq2 cq2Var4 = dq2Var.f110028f;
            if (j10 == cq2Var4.f109518b) {
                dq2Var.f110028f = cq2Var4.f109520d;
            }
        }
        dq2Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    @Override // yads.z43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r10, int r12, int r13, int r14, yads.y43 r15) {
        /*
            r9 = this;
            boolean r1 = r9.f111705z
            if (r1 == 0) goto L12
            yads.yv0 r1 = r9.A
            if (r1 == 0) goto Lc
            r9.a(r1)
            goto L12
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L12:
            r1 = r12 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            boolean r5 = r9.f111703x
            if (r5 == 0) goto L24
            if (r4 != 0) goto L22
            goto L31
        L22:
            r9.f111703x = r2
        L24:
            long r4 = r9.E
            long r4 = r4 + r10
            boolean r2 = r9.C
            if (r2 == 0) goto L53
            long r6 = r9.f111699t
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L32
        L31:
            return
        L32:
            if (r1 != 0) goto L53
            boolean r1 = r9.D
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Overriding unexpected non-sync sample for format: "
            r1.<init>(r2)
            yads.yv0 r2 = r9.B
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SampleQueue"
            yads.uf1.d(r2, r1)
            r9.D = r3
        L4f:
            r1 = r12 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r12
        L54:
            yads.dq2 r1 = r9.f111680a
            long r1 = r1.f110029g
            long r7 = (long) r13
            long r1 = r1 - r7
            r7 = r14
            long r7 = (long) r7
            long r1 = r1 - r7
            r6 = r4
            r4 = r1
            r1 = r6
            r0 = r9
            r6 = r13
            r7 = r15
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hq2.a(long, int, int, int, yads.y43):void");
    }

    public static hq2 a(ke keVar) {
        return new hq2(keVar, null, null);
    }

    public static hq2 a(ke keVar, nj0 nj0Var, jj0 jj0Var) {
        nj0Var.getClass();
        jj0Var.getClass();
        return new hq2(keVar, nj0Var, jj0Var);
    }
}
