package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class nf1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f113852f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile nf1 f113853g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1 f113854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pf1 f113855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt2 f113856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bv2 f113857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f113858e;

    public nf1(Context context, qf1 qf1Var, pf1 pf1Var, vt2 vt2Var, bv2 bv2Var) {
        this.f113854a = qf1Var;
        this.f113855b = pf1Var;
        this.f113856c = vt2Var;
        this.f113857d = bv2Var;
        this.f113858e = gz.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location a() {
        /*
            r4 = this;
            java.lang.Object r0 = yads.nf1.f113852f
            monitor-enter(r0)
            yads.vt2 r1 = r4.f113856c     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L4e
            yads.bv2 r1 = r4.f113857d     // Catch: java.lang.Throwable -> L41
            android.content.Context r2 = r4.f113858e     // Catch: java.lang.Throwable -> L41
            r1.getClass()     // Catch: java.lang.Throwable -> L41
            boolean r1 = yads.bv2.a(r2)     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L4e
            yads.pf1 r1 = r4.f113855b     // Catch: java.lang.Throwable -> L41
            android.content.Context r2 = r4.f113858e     // Catch: java.lang.Throwable -> L41
            r1.getClass()     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r1 = yads.pf1.a(r2)     // Catch: java.lang.Throwable -> L41
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L41
        L2b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L41
            yads.of1 r3 = (yads.of1) r3     // Catch: java.lang.Throwable -> L41
            android.location.Location r3 = r3.a()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L2b
            r2.add(r3)     // Catch: java.lang.Throwable -> L41
            goto L2b
        L41:
            r1 = move-exception
            goto L51
        L43:
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r2)     // Catch: java.lang.Throwable -> L41
            yads.qf1 r2 = r4.f113854a     // Catch: java.lang.Throwable -> L41
            android.location.Location r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L41
            goto L4f
        L4e:
            r1 = 0
        L4f:
            monitor-exit(r0)
            return r1
        L51:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nf1.a():android.location.Location");
    }
}
