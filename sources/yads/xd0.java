package yads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class xd0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k23 f117794h = new k23() { // from class: yads.e71
        @Override // yads.k23
        public final Object get() {
            return xd0.a();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f117795i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e43 f117796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c43 f117797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f117798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k23 f117799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc2 f117800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f43 f117801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f117802g;

    public xd0() {
        this(f117794h);
    }

    public final synchronized void a(re reVar) {
        jc2 jc2Var;
        this.f117802g = null;
        Iterator it = this.f117798c.values().iterator();
        while (it.hasNext()) {
            wd0 wd0Var = (wd0) it.next();
            it.remove();
            if (wd0Var.f117431e && (jc2Var = this.f117800e) != null) {
                ((yk1) jc2Var).b(reVar, wd0Var.f117427a);
            }
        }
    }

    public final void b(re reVar) {
        kl1 kl1Var;
        if (reVar.f115411b.c()) {
            this.f117802g = null;
            return;
        }
        wd0 wd0Var = (wd0) this.f117798c.get(this.f117802g);
        this.f117802g = a(reVar.f115412c, reVar.f115413d).f117427a;
        c(reVar);
        kl1 kl1Var2 = reVar.f115413d;
        if (kl1Var2 == null || !kl1Var2.a()) {
            return;
        }
        if (wd0Var != null) {
            long j10 = wd0Var.f117429c;
            kl1 kl1Var3 = reVar.f115413d;
            if (j10 == kl1Var3.f109965d && (kl1Var = wd0Var.f117430d) != null && kl1Var.f109963b == kl1Var3.f109963b && kl1Var.f109964c == kl1Var3.f109964c) {
                return;
            }
        }
        kl1 kl1Var4 = reVar.f115413d;
        a(reVar.f115412c, new kl1(kl1Var4.f109962a, kl1Var4.f109965d));
        this.f117800e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.f109965d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(yads.re r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            yads.jc2 r0 = r7.f117800e     // Catch: java.lang.Throwable -> L2f
            r0.getClass()     // Catch: java.lang.Throwable -> L2f
            yads.f43 r0 = r8.f115411b     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L10
            monitor-exit(r7)
            return
        L10:
            java.util.HashMap r0 = r7.f117798c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r7.f117802g     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2f
            yads.wd0 r0 = (yads.wd0) r0     // Catch: java.lang.Throwable -> L2f
            yads.kl1 r1 = r8.f115413d     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L3a
            if (r0 == 0) goto L3a
            long r2 = r0.f117429c     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L32
            int r0 = r0.f117428b     // Catch: java.lang.Throwable -> L2f
            int r2 = r8.f115412c     // Catch: java.lang.Throwable -> L2f
            if (r0 == r2) goto L3a
            goto L38
        L2f:
            r8 = move-exception
            goto Lc2
        L32:
            long r4 = r1.f109965d     // Catch: java.lang.Throwable -> L2f
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3a
        L38:
            monitor-exit(r7)
            return
        L3a:
            int r0 = r8.f115412c     // Catch: java.lang.Throwable -> L2f
            yads.wd0 r0 = r7.a(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r7.f117802g     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L48
            java.lang.String r1 = r0.f117427a     // Catch: java.lang.Throwable -> L2f
            r7.f117802g = r1     // Catch: java.lang.Throwable -> L2f
        L48:
            yads.kl1 r1 = r8.f115413d     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            if (r1 == 0) goto L9c
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L9c
            yads.kl1 r1 = new yads.kl1     // Catch: java.lang.Throwable -> L2f
            yads.kl1 r3 = r8.f115413d     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r3.f109962a     // Catch: java.lang.Throwable -> L2f
            long r5 = r3.f109965d     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.f109963b     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L2f
            int r3 = r8.f115412c     // Catch: java.lang.Throwable -> L2f
            yads.wd0 r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r1.f117431e     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L9c
            r1.f117431e = r2     // Catch: java.lang.Throwable -> L2f
            yads.f43 r1 = r8.f115411b     // Catch: java.lang.Throwable -> L2f
            yads.kl1 r3 = r8.f115413d     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.f109962a     // Catch: java.lang.Throwable -> L2f
            yads.c43 r4 = r7.f117797b     // Catch: java.lang.Throwable -> L2f
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L2f
            yads.c43 r1 = r7.f117797b     // Catch: java.lang.Throwable -> L2f
            yads.kl1 r3 = r8.f115413d     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.f109963b     // Catch: java.lang.Throwable -> L2f
            yads.d6 r1 = r1.f109220h     // Catch: java.lang.Throwable -> L2f
            yads.c6 r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L2f
            long r3 = r1.f109253b     // Catch: java.lang.Throwable -> L2f
            long r3 = yads.w83.b(r3)     // Catch: java.lang.Throwable -> L2f
            yads.c43 r1 = r7.f117797b     // Catch: java.lang.Throwable -> L2f
            long r5 = r1.f109218f     // Catch: java.lang.Throwable -> L2f
            long r5 = yads.w83.b(r5)     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 + r3
            r3 = 0
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L2f
            yads.jc2 r1 = r7.f117800e     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
        L9c:
            boolean r1 = r0.f117431e     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto La7
            r0.f117431e = r2     // Catch: java.lang.Throwable -> L2f
            yads.jc2 r1 = r7.f117800e     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
        La7:
            java.lang.String r1 = r0.f117427a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r7.f117802g     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto Lc0
            boolean r1 = r0.f117432f     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto Lc0
            r0.f117432f = r2     // Catch: java.lang.Throwable -> L2f
            yads.jc2 r1 = r7.f117800e     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.f117427a     // Catch: java.lang.Throwable -> L2f
            yads.yk1 r1 = (yads.yk1) r1     // Catch: java.lang.Throwable -> L2f
            r1.a(r8, r0)     // Catch: java.lang.Throwable -> L2f
        Lc0:
            monitor-exit(r7)
            return
        Lc2:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xd0.c(yads.re):void");
    }

    public xd0(k23 k23Var) {
        this.f117799d = k23Var;
        this.f117796a = new e43();
        this.f117797b = new c43();
        this.f117798c = new HashMap();
        this.f117801f = f43.f110599b;
    }

    public static String a() {
        byte[] bArr = new byte[12];
        f117795i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.wd0 a(int r14, yads.kl1 r15) {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.f117798c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r0.next()
            yads.wd0 r4 = (yads.wd0) r4
            long r5 = r4.f117429c
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L2e
            int r5 = r4.f117428b
            if (r14 != r5) goto L2e
            if (r15 == 0) goto L2e
            long r5 = r15.f109965d
            r4.f117429c = r5
        L2e:
            if (r15 != 0) goto L35
            int r5 = r4.f117428b
            if (r14 != r5) goto L10
            goto L5c
        L35:
            yads.kl1 r5 = r4.f117430d
            if (r5 != 0) goto L48
            boolean r5 = r15.a()
            if (r5 != 0) goto L10
            long r5 = r15.f109965d
            long r9 = r4.f117429c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L10
            goto L5c
        L48:
            long r9 = r15.f109965d
            long r11 = r5.f109965d
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10
            int r6 = r15.f109963b
            int r9 = r5.f109963b
            if (r6 != r9) goto L10
            int r6 = r15.f109964c
            int r5 = r5.f109964c
            if (r6 != r5) goto L10
        L5c:
            long r5 = r4.f117429c
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L75
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L67
            goto L75
        L67:
            if (r7 != 0) goto L10
            int r5 = yads.w83.f117341a
            yads.kl1 r5 = r1.f117430d
            if (r5 == 0) goto L10
            yads.kl1 r5 = r4.f117430d
            if (r5 == 0) goto L10
            r1 = r4
            goto L10
        L75:
            r1 = r4
            r2 = r5
            goto L10
        L78:
            if (r1 != 0) goto L8c
            yads.k23 r0 = r13.f117799d
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            yads.wd0 r1 = new yads.wd0
            r1.<init>(r13, r0, r14, r15)
            java.util.HashMap r14 = r13.f117798c
            r14.put(r0, r1)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xd0.a(int, yads.kl1):yads.wd0");
    }

    public final void a(jc2 jc2Var) {
        this.f117800e = jc2Var;
    }

    public final synchronized void a(re reVar, int i10) {
        try {
            this.f117800e.getClass();
            Iterator it = this.f117798c.values().iterator();
            while (it.hasNext()) {
                wd0 wd0Var = (wd0) it.next();
                if (wd0Var.a(reVar)) {
                    it.remove();
                    if (wd0Var.f117431e) {
                        if (wd0Var.f117427a.equals(this.f117802g)) {
                            this.f117802g = null;
                        }
                        ((yk1) this.f117800e).b(reVar, wd0Var.f117427a);
                    }
                }
            }
            b(reVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
