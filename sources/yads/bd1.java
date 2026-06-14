package yads;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes4.dex */
public final class bd1 implements of1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1 f108976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f108977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v23 f108978c;

    public bd1(Context context, qf1 qf1Var) {
        this.f108976a = qf1Var;
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.f108977b = locationManager;
        this.f108978c = new v23(context.getApplicationContext(), locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    @Override // yads.of1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location a() {
        /*
            r9 = this;
            r0 = 0
            android.location.LocationManager r1 = r9.f108977b     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            java.util.List r1 = r1.getAllProviders()     // Catch: java.lang.Throwable -> Lc
            goto Lf
        La:
            r1 = r0
            goto Lf
        Lc:
            boolean r1 = yads.lb1.f113032a
            goto La
        Lf:
            if (r1 == 0) goto L6e
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            yads.v23 r4 = r9.f108978c
            yads.ta2 r5 = r4.f116855b
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r5 = r5.a(r6)
            yads.ta2 r6 = r4.f116855b
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r6 = r6.a(r7)
            java.util.HashSet r7 = yads.v23.f116852c
            boolean r7 = r7.contains(r3)
            java.util.HashSet r8 = yads.v23.f116853d
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L4c
            if (r7 != 0) goto L5d
            if (r5 == 0) goto L5d
            if (r6 == 0) goto L5d
            goto L50
        L4c:
            if (r7 != 0) goto L5d
            if (r5 == 0) goto L5d
        L50:
            android.location.LocationManager r4 = r4.f116854a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L5d
            android.location.Location r3 = r4.getLastKnownLocation(r3)     // Catch: java.lang.Throwable -> L5b
            boolean r4 = yads.lb1.f113032a     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            boolean r3 = yads.lb1.f113032a
        L5d:
            r3 = r0
        L5e:
            if (r3 == 0) goto L19
            r2.add(r3)
            goto L19
        L64:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r2)
            yads.qf1 r1 = r9.f108976a
            android.location.Location r0 = r1.a(r0)
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bd1.a():android.location.Location");
    }
}
