package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rn implements ib2, du, go, pm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v5 f115506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4 f115507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es2 f115508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f115509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r8 f115510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f115511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e83 f115512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bv2 f115513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final he1 f115514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rs2 f115515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dz0 f115516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final af2 f115517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z13 f115518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nn2 f115519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jb2 f115520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n4 f115521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y5 f115522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f115523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f115524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public bm f115525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t9 f115526v;

    public /* synthetic */ rn(Context context, v5 v5Var, c4 c4Var, es2 es2Var, CoroutineScope coroutineScope) {
        r8 r8Var = new r8(c4Var, es2Var, context);
        Handler handler = new Handler(Looper.getMainLooper());
        qb qbVar = new qb();
        bv2 bv2Var = new bv2();
        he1 he1Var = new he1(context, c4Var);
        rs2 rs2Var = new rs2(context, es2Var, coroutineScope, v5Var, null, null, 2097136);
        dz0 dz0Var = new dz0(es2Var, c4Var);
        af2 af2Var = new af2(es2Var, c4Var);
        z13 z13Var = z13.f118512b;
        this(context, v5Var, c4Var, es2Var, coroutineScope, r8Var, handler, qbVar, bv2Var, he1Var, rs2Var, dz0Var, af2Var, y13.a(), new nn2(), jb2.f112281h.a(context), new n4(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(yads.rn r18, yads.e83 r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r1 = r20
            r0.getClass()
            boolean r2 = r1 instanceof yads.jn
            if (r2 == 0) goto L1a
            r2 = r1
            yads.jn r2 = (yads.jn) r2
            int r3 = r2.f112395f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f112395f = r3
            goto L1f
        L1a:
            yads.jn r2 = new yads.jn
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.f112393d
            java.lang.Object r3 = pf.b.g()
            int r4 = r2.f112395f
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            yads.e83 r0 = r2.f112392c
            yads.rn r2 = r2.f112391b
            kotlin.d.b(r1)
            goto L54
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.d.b(r1)
            yads.rs2 r1 = r0.f115515k
            yads.z41 r4 = yads.z41.f118542d
            r2.f112391b = r0
            r6 = r19
            r2.f112392c = r6
            r2.f112395f = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L52
            return r3
        L52:
            r2 = r0
            r0 = r6
        L54:
            yads.js2 r1 = (yads.js2) r1
            boolean r3 = r1 instanceof yads.is2
            if (r3 == 0) goto La9
            yads.c4 r3 = r2.f115507c
            yads.is2 r1 = (yads.is2) r1
            yads.pd r4 = r1.f112117a
            yads.ax r3 = r3.f109195b
            r3.f108851b = r4
            yads.fl0 r1 = r1.f112118b
            r3.f108850a = r1
            java.lang.Object r1 = yads.vt2.f117186j
            yads.vt2 r1 = yads.ut2.a()
            android.content.Context r3 = r2.f115505a
            yads.hr2 r1 = r1.a(r3)
            r3 = 0
            if (r1 == 0) goto L7a
            yads.zo r1 = r1.f111716a0
            goto L7b
        L7a:
            r1 = r3
        L7b:
            if (r1 == 0) goto L93
            yads.v5 r4 = r2.f115506b
            yads.u5 r5 = yads.u5.f116503g
            r4.a(r5, r3)
            kotlinx.coroutines.CoroutineScope r6 = r2.f115509e
            yads.mn r9 = new yads.mn
            r9.<init>(r2, r0, r1, r3)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            eg.g.d(r6, r7, r8, r9, r10, r11)
            goto Lb4
        L93:
            monitor-enter(r2)
            kotlinx.coroutines.CoroutineScope r12 = r2.f115509e     // Catch: java.lang.Throwable -> La6
            yads.in r15 = new yads.in     // Catch: java.lang.Throwable -> La6
            r15.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> La6
            r16 = 3
            r17 = 0
            r13 = 0
            r14 = 0
            eg.g.d(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r2)
            goto Lb4
        La6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        La9:
            boolean r0 = r1 instanceof yads.hs2
            if (r0 == 0) goto Lb4
            yads.hs2 r1 = (yads.hs2) r1
            yads.k4 r0 = r1.f111773a
            r2.b(r0)
        Lb4:
            kotlin.Unit r0 = kotlin.Unit.f93236a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.rn.a(yads.rn, yads.e83, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract hn a(String str, String str2);

    public synchronized void b(e9 e9Var) {
        try {
            Objects.toString(this.f115522r);
            boolean z10 = lb1.f113032a;
            if (this.f115522r != y5.f118086d) {
                if (a(e9Var)) {
                    this.f115506b.a();
                    this.f115506b.b(u5.f116501e);
                    this.f115518n.b(tc1.f116191b, this);
                    c(e9Var);
                } else {
                    i();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        if (!a()) {
            this.f115523s = true;
            n();
            kotlinx.coroutines.a0.j(this.f115515k.f115568c.getCoroutineContext(), null, 1, null);
            n4 n4Var = this.f115521q;
            sm2 sm2Var = n4Var.f113717a;
            Context context = n4Var.f113719c;
            String str = n4Var.f113718b;
            sm2Var.getClass();
            sm2.a(context, str);
            this.f115511g.removeCallbacksAndMessages(null);
            this.f115518n.a(tc1.f116191b, this);
            this.f115526v = null;
            this.f115510f.a();
            kotlinx.coroutines.i.f(this.f115509e, null, 1, null);
            getClass().toString();
            boolean z10 = lb1.f113032a;
        }
    }

    public void d() {
        c();
        getClass().toString();
        boolean z10 = lb1.f113032a;
    }

    public final c4 e() {
        return this.f115507c;
    }

    public final v5 f() {
        return this.f115506b;
    }

    public final Context g() {
        return this.f115505a;
    }

    public final es2 h() {
        return this.f115508d;
    }

    public void i() {
        j();
    }

    public synchronized void j() {
        boolean z10 = lb1.f113032a;
        bm bmVar = this.f115525u;
        if (bmVar != null) {
            bmVar.b();
        }
    }

    public final void k() {
        String str;
        yl2 yl2Var = yl2.f118285c;
        cp1 cp1Var = this.f115507c.f109205l;
        if (cp1Var == null || (str = cp1Var.f109504b) == null) {
            str = wl2.f117511a;
        }
        this.f115506b.a(u5.f116499c, new yb(yl2Var, str), null);
        this.f115506b.a(u5.f116501e);
        this.f115518n.a(tc1.f116191b, this);
        a(y5.f118087e);
        this.f115524t = SystemClock.elapsedRealtime();
    }

    public void l() {
        o4.a(this.f115507c.f109194a.f115230b);
        k();
        j();
    }

    public final void m() {
        getClass().toString();
        boolean z10 = lb1.f113032a;
        this.f115520p.a(this);
    }

    public final void n() {
        getClass().toString();
        boolean z10 = lb1.f113032a;
        this.f115520p.b(this);
    }

    public k4 o() {
        he1 he1Var = this.f115514j;
        List listPlus = CollectionsKt.plus((Collection) he1Var.a(), (Iterable) CollectionsKt.listOfNotNull(he1Var.f111563b.f109197d.f114071a == null ? f9.f110651l : null));
        String str = he1Var.f111563b.f109194a.f115230b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList.add(((k4) it.next()).f112580c);
        }
        o4.a(str, arrayList);
        return (k4) CollectionsKt.firstOrNull(listPlus);
    }

    public void b(k4 k4Var) {
        String str;
        wa1.c(k4Var.f112580c, new Object[0]);
        a(y5.f118088f);
        yl2 yl2Var = yl2.f118286d;
        cp1 cp1Var = this.f115507c.f109205l;
        if (cp1Var == null || (str = cp1Var.f109504b) == null) {
            str = wl2.f117511a;
        }
        this.f115506b.a(u5.f116499c, new yb(yl2Var, str), null);
        this.f115506b.a(u5.f116501e);
        this.f115518n.a(tc1.f116191b, this);
        a(k4Var);
    }

    public rn(Context context, v5 v5Var, c4 c4Var, es2 es2Var, CoroutineScope coroutineScope, r8 r8Var, Handler handler, e83 e83Var, bv2 bv2Var, he1 he1Var, rs2 rs2Var, dz0 dz0Var, af2 af2Var, z13 z13Var, nn2 nn2Var, jb2 jb2Var, n4 n4Var) {
        this.f115505a = context;
        this.f115506b = v5Var;
        this.f115507c = c4Var;
        this.f115508d = es2Var;
        this.f115509e = coroutineScope;
        this.f115510f = r8Var;
        this.f115511g = handler;
        this.f115512h = e83Var;
        this.f115513i = bv2Var;
        this.f115514j = he1Var;
        this.f115515k = rs2Var;
        this.f115516l = dz0Var;
        this.f115517m = af2Var;
        this.f115518n = z13Var;
        this.f115519o = nn2Var;
        this.f115520p = jb2Var;
        this.f115521q = n4Var;
        this.f115522r = y5.f118085c;
    }

    public final synchronized void c(e9 e9Var) {
        a(e9Var, this.f115512h);
    }

    @Override // yads.pm2
    public final void b() {
        this.f115506b.a(u5.f116514r);
        this.f115506b.a(u5.f116515s, null);
    }

    public final synchronized void a(y5 y5Var) {
        Objects.toString(y5Var);
        boolean z10 = lb1.f113032a;
        this.f115522r = y5Var;
    }

    @Override // yads.du
    public final synchronized boolean a() {
        return this.f115523s;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(yads.e9 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            yads.t9 r0 = r5.f115526v     // Catch: java.lang.Throwable -> L2f
            yads.y5 r1 = r5.f115522r     // Catch: java.lang.Throwable -> L2f
            yads.y5 r2 = yads.y5.f118088f     // Catch: java.lang.Throwable -> L2f
            if (r1 != r2) goto La
            goto L42
        La:
            if (r0 == 0) goto L42
            long r1 = r5.f115524t     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L42
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2f
            long r3 = r5.f115524t     // Catch: java.lang.Throwable -> L2f
            long r1 = r1 - r3
            int r0 = r0.J     // Catch: java.lang.Throwable -> L2f
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L2f
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L42
            if (r6 == 0) goto L31
            yads.c4 r0 = r5.f115507c     // Catch: java.lang.Throwable -> L2f
            yads.e9 r0 = r0.f109198e     // Catch: java.lang.Throwable -> L2f
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L42
            goto L31
        L2f:
            r6 = move-exception
            goto L45
        L31:
            android.content.Context r6 = r5.f115505a     // Catch: java.lang.Throwable -> L2f
            yads.g92 r6 = yads.gz.b(r6)     // Catch: java.lang.Throwable -> L2f
            int r6 = r6.f111116b     // Catch: java.lang.Throwable -> L2f
            yads.c4 r0 = r5.f115507c     // Catch: java.lang.Throwable -> L2f
            int r0 = r0.f109208o     // Catch: java.lang.Throwable -> L2f
            if (r6 == r0) goto L40
            goto L42
        L40:
            r6 = 0
            goto L43
        L42:
            r6 = 1
        L43:
            monitor-exit(r5)
            return r6
        L45:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.rn.a(yads.e9):boolean");
    }

    public synchronized void a(k4 k4Var) {
        bm bmVar = this.f115525u;
        if (bmVar != null) {
            bmVar.a(k4Var);
        }
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        if (oj3Var instanceof g4) {
            b(m4.a(this.f115507c, ((g4) oj3Var).f111054c));
        }
    }

    @Override // yads.ib2
    public void a(eb2 eb2Var) {
        Objects.toString(eb2Var);
        boolean z10 = lb1.f113032a;
    }

    public final void a(mx2 mx2Var) {
        nx2 nx2Var = this.f115507c.f109197d;
        if (mx2Var == null) {
            nx2Var.getClass();
            wa1.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        mx2 mx2Var2 = nx2Var.f114071a;
        if (mx2Var2 != null && !Intrinsics.areEqual(mx2Var2, mx2Var)) {
            wa1.c("Ad size can't be set twice.", new Object[0]);
        } else {
            nx2Var.f114071a = mx2Var;
        }
    }

    public final synchronized void a(e9 e9Var, e83 e83Var) {
        try {
            a(y5.f118086d);
            this.f115507c.f109198e = e9Var;
            k4 k4VarO = o();
            if (k4VarO == null) {
                eg.i.d(this.f115509e, null, null, new qn(this, e83Var, null), 3, null);
            } else {
                b(k4VarO);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
