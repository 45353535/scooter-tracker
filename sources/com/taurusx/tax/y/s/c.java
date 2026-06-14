package com.taurusx.tax.y.s;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f67650z = "InputStreamUtil";

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:8:0x001f */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String z(java.io.InputStream r3, java.nio.charset.Charset r4) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
        L14:
            if (r2 == 0) goto L25
            r3.append(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            goto L14
        L1e:
            r3 = move-exception
            r0 = r1
            goto L46
        L21:
            r3 = move-exception
            goto L38
        L23:
            r3 = move-exception
            goto L38
        L25:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e java.lang.Error -> L21 java.lang.Exception -> L23
            r1.close()     // Catch: java.io.IOException -> L2d
            return r3
        L2d:
            r4 = move-exception
            r4.printStackTrace()
            return r3
        L32:
            r3 = move-exception
            goto L46
        L34:
            r3 = move-exception
            goto L37
        L36:
            r3 = move-exception
        L37:
            r1 = r0
        L38:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L41
            goto L45
        L41:
            r3 = move-exception
            r3.printStackTrace()
        L45:
            return r0
        L46:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r4 = move-exception
            r4.printStackTrace()
        L50:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.y.s.c.z(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    public static String z(String str) {
        return str.replace("cat", "cat_remove");
    }
}
