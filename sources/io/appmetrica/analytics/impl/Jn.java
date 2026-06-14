package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Jn {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.appmetrica.analytics.impl.In a(java.lang.Throwable r9, int r10, int r11) {
        /*
            java.lang.Class r0 = r9.getClass()
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = r9.getMessage()
            r0 = 0
            java.lang.StackTraceElement[] r1 = r9.getStackTrace()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r0]
        L14:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r1.length
            r4.<init>(r5)
            int r5 = r1.length
            r6 = r0
        L1c:
            if (r6 >= r5) goto L2b
            r7 = r1[r6]
            io.appmetrica.analytics.impl.Hl r8 = new io.appmetrica.analytics.impl.Hl
            r8.<init>(r7)
            r4.add(r8)
            int r6 = r6 + 1
            goto L1c
        L2b:
            java.lang.Throwable r1 = r9.getCause()
            r5 = 0
            if (r1 == 0) goto L41
            if (r11 >= r10) goto L35
            goto L36
        L35:
            r1 = r5
        L36:
            if (r1 == 0) goto L41
            int r6 = r11 + 1
            r7 = 30
            io.appmetrica.analytics.impl.In r1 = a(r1, r7, r6)
            goto L42
        L41:
            r1 = r5
        L42:
            if (r11 >= r10) goto L5e
            java.lang.Throwable[] r9 = r9.getSuppressed()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = r9.length
            r5.<init>(r10)
            int r10 = r9.length
        L4f:
            if (r0 >= r10) goto L5e
            r6 = r9[r0]
            r7 = 1
            io.appmetrica.analytics.impl.In r6 = a(r6, r7, r11)
            r5.add(r6)
            int r0 = r0 + 1
            goto L4f
        L5e:
            r6 = r5
            r5 = r1
            io.appmetrica.analytics.impl.In r1 = new io.appmetrica.analytics.impl.In
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Jn.a(java.lang.Throwable, int, int):io.appmetrica.analytics.impl.In");
    }
}
