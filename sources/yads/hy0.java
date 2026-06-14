package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class hy0 implements zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky0 f111801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final my0 f111802b;

    public /* synthetic */ hy0(Context context) {
        this(new ky0(context), new my0(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    @Override // yads.zd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.rd a() {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            yads.ky0 r2 = r9.f111801a
            r2.getClass()
            r3 = 0
            yads.kk2 r4 = r2.f112892a     // Catch: java.lang.Throwable -> L53
            r4.getClass()     // Catch: java.lang.Throwable -> L53
            java.lang.Class<com.google.android.gms.ads.identifier.AdvertisingIdClient> r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.class
            int r5 = com.google.android.gms.ads.identifier.AdvertisingIdClient.f25284a     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            boolean r4 = yads.lb1.f113032a     // Catch: java.lang.Throwable -> L53
            r4 = r3
        L15:
            if (r4 == 0) goto L51
            yads.kk2 r5 = r2.f112892a     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "getAdvertisingIdInfo"
            android.content.Context r7 = r2.f112894c     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L53
            r8[r1] = r7     // Catch: java.lang.Throwable -> L53
            r5.getClass()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = yads.kk2.a(r4, r6, r8)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L51
            java.lang.String r5 = "getId"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = yads.jk2.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "isLimitAdTrackingEnabled"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = yads.jk2.a(r4, r6, r7)     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L53
            yads.sd r2 = r2.f112893b     // Catch: java.lang.Throwable -> L53
            r2.getClass()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L51
            if (r5 == 0) goto L51
            yads.rd r2 = new yads.rd     // Catch: java.lang.Throwable -> L53
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L53
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L53
            goto L56
        L51:
            r2 = r3
            goto L56
        L53:
            boolean r2 = yads.lb1.f113032a
            goto L51
        L56:
            if (r2 != 0) goto L98
            yads.my0 r2 = r9.f111802b
            yads.oy0 r4 = r2.f113648d
            r4.getClass()
            android.content.Intent r4 = yads.oy0.a()
            yads.bq2 r5 = r2.f113645a
            android.content.Context r6 = r2.f113646b
            r5.getClass()
            android.content.pm.PackageManager r5 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L73
            android.content.pm.ResolveInfo r1 = r5.resolveService(r4, r1)     // Catch: java.lang.Throwable -> L73
            goto L76
        L73:
            boolean r1 = yads.lb1.f113032a
            r1 = r3
        L76:
            if (r1 == 0) goto L99
            yads.jy0 r1 = new yads.jy0     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            android.content.Context r5 = r2.f113646b     // Catch: java.lang.Throwable -> L95
            boolean r0 = r5.bindService(r4, r1, r0)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L92
            yads.ny0 r0 = r2.f113647c     // Catch: java.lang.Throwable -> L95
            yads.rd r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L95
            android.content.Context r2 = r2.f113646b     // Catch: java.lang.Throwable -> L95
            r2.unbindService(r1)     // Catch: java.lang.Throwable -> L95
            r3 = r0
            goto L99
        L92:
            boolean r0 = yads.lb1.f113032a     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            boolean r0 = yads.lb1.f113032a
            goto L99
        L98:
            r3 = r2
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hy0.a():yads.rd");
    }

    public hy0(ky0 ky0Var, my0 my0Var) {
        this.f111801a = ky0Var;
        this.f111802b = my0Var;
    }
}
