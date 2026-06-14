package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class tf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rf1 f116226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta2 f116227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sf1 f116228c;

    public /* synthetic */ tf1(Context context, String str) {
        this(new rf1(context, str), new ta2(context), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.sf1 a() {
        /*
            r6 = this;
            r0 = 0
            yads.rf1 r1 = r6.f116226a
            yads.kk2 r2 = r1.f115437b
            java.lang.String r3 = r1.f115436a
            r2.getClass()
            r2 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            boolean r3 = yads.lb1.f113032a
            r3 = r2
        L13:
            if (r3 == 0) goto L2f
            yads.kk2 r4 = r1.f115437b
            android.content.Context r1 = r1.f115438c
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r1
            r4.getClass()
            java.lang.String r1 = "getFusedLocationProviderClient"
            java.lang.Object r1 = yads.kk2.a(r3, r1, r5)
            if (r1 == 0) goto L2f
            yads.kx0 r3 = new yads.kx0
            r3.<init>(r1)
            goto L30
        L2f:
            r3 = r2
        L30:
            if (r3 == 0) goto L57
            yads.ta2 r1 = r6.f116227b
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r1 = r1.a(r4)
            yads.ta2 r4 = r6.f116227b
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = r4.a(r5)
            if (r1 != 0) goto L46
            if (r4 == 0) goto L57
        L46:
            java.lang.Object r1 = r3.f112883a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "getLastLocation"
            java.lang.Object r0 = yads.jk2.a(r1, r3, r0)
            if (r0 == 0) goto L57
            yads.sf1 r2 = new yads.sf1
            r2.<init>(r0)
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tf1.a():yads.sf1");
    }

    public tf1(rf1 rf1Var, ta2 ta2Var, sf1 sf1Var) {
        this.f116226a = rf1Var;
        this.f116227b = ta2Var;
        this.f116228c = sf1Var;
    }
}
