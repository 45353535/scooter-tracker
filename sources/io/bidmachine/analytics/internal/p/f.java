package io.bidmachine.analytics.internal.p;

import java.lang.reflect.Method;
import kotlin.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f79722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f79724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f79725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f79726e;

    public f() {
        Result.Companion companion = Result.f93230c;
        this.f79722a = Result.b(kotlin.d.a(new NullPointerException()));
        this.f79723b = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
        this.f79724c = "c3RhcnQ=";
        this.f79725d = "Z2V0SW5wdXRTdHJlYW0=";
        this.f79726e = "ZGVzdHJveQ==";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream a(java.util.List r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            kotlin.Result$Companion r3 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r6.f79723b     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = io.bidmachine.analytics.internal.a.e.a(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r4 = r3.getConstructor(r4)     // Catch: java.lang.Throwable -> L38
            java.util.List r7 = kotlin.collections.CollectionsKt.toList(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            r1[r0] = r7     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r4.newInstance(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r6.f79724c     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = io.bidmachine.analytics.internal.a.e.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r0 = r3.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r0.invoke(r7, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L38
            goto L43
        L38:
            r7 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r7 = kotlin.d.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L43:
            r6.f79722a = r7
            boolean r0 = kotlin.Result.j(r7)
            if (r0 == 0) goto L72
            if (r7 == 0) goto L64
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r6.f79725d     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = io.bidmachine.analytics.internal.a.e.a(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L64
            java.lang.Object r7 = r0.invoke(r7, r2)     // Catch: java.lang.Throwable -> L62
            goto L65
        L62:
            r7 = move-exception
            goto L6c
        L64:
            r7 = r2
        L65:
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L62
            goto L76
        L6c:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r7 = kotlin.d.a(r7)
        L72:
            java.lang.Object r7 = kotlin.Result.b(r7)
        L76:
            boolean r0 = kotlin.Result.i(r7)
            if (r0 == 0) goto L7d
            goto L7e
        L7d:
            r2 = r7
        L7e:
            java.io.InputStream r2 = (java.io.InputStream) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.p.f.a(java.util.List):java.io.InputStream");
    }

    public final void a() {
        Object obj = this.f79722a;
        if (!Result.j(obj)) {
            Result.b(obj);
            return;
        }
        Object objInvoke = null;
        if (obj != null) {
            try {
                Method method = obj.getClass().getMethod(io.bidmachine.analytics.internal.a.e.a(this.f79726e), null);
                if (method != null) {
                    objInvoke = method.invoke(obj, null);
                }
            } catch (Throwable th2) {
                Result.Companion companion = Result.f93230c;
                Result.b(kotlin.d.a(th2));
                return;
            }
        }
        Result.b(objInvoke);
    }
}
