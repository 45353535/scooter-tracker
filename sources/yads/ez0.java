package yads;

import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ez0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f110530a = Charsets.ISO_8859_1;

    public static final boolean a(Map map, f01 f01Var) {
        String strC = c(map, f01Var);
        if (strC == null) {
            return true;
        }
        return Boolean.parseBoolean(strC);
    }

    public static boolean b(Map map, f01 f01Var) {
        String strC = c(map, f01Var);
        if (strC == null) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }

    public static final String c(Map map, f01 f01Var) {
        if (map != null) {
            return (String) map.get(f01Var.f110568b);
        }
        return null;
    }

    public static int d(Map map, f01 f01Var) {
        String strC = c(map, f01Var);
        int i10 = rb.f115393b;
        if (strC == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList e(java.util.Map r10, yads.f01 r11) {
        /*
            r0 = 1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r10 = c(r10, r11)
            if (r10 == 0) goto Lb1
            int r11 = r10.length()
            if (r11 != 0) goto L14
            goto Lb1
        L14:
            kotlin.text.Regex r11 = new kotlin.text.Regex
            java.lang.String r2 = ","
            r11.<init>(r2)
            r2 = 0
            java.util.List r10 = r11.j(r10, r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L4b
            int r11 = r10.size()
            java.util.ListIterator r11 = r10.listIterator(r11)
        L2e:
            boolean r3 = r11.hasPrevious()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r11.previous()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L41
            goto L2e
        L41:
            int r11 = r11.nextIndex()
            int r11 = r11 + r0
            java.util.List r10 = kotlin.collections.CollectionsKt.take(r10, r11)
            goto L4f
        L4b:
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L4f:
            java.lang.String[] r11 = new java.lang.String[r2]
            java.lang.Object[] r10 = r10.toArray(r11)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r11 = r10.length
            r3 = r2
        L59:
            if (r3 >= r11) goto Lb1
            r4 = r10[r3]
            kotlin.Result$Companion r5 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L8a
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L8a
            int r5 = r5 - r0
            r6 = r2
            r7 = r6
        L66:
            if (r6 > r5) goto L8c
            if (r7 != 0) goto L6c
            r8 = r6
            goto L6d
        L6c:
            r8 = r5
        L6d:
            char r8 = r4.charAt(r8)     // Catch: java.lang.Throwable -> L8a
            r9 = 32
            int r8 = kotlin.jvm.internal.Intrinsics.compare(r8, r9)     // Catch: java.lang.Throwable -> L8a
            if (r8 > 0) goto L7b
            r8 = r0
            goto L7c
        L7b:
            r8 = r2
        L7c:
            if (r7 != 0) goto L84
            if (r8 != 0) goto L82
            r7 = r0
            goto L66
        L82:
            int r6 = r6 + r0
            goto L66
        L84:
            if (r8 != 0) goto L87
            goto L8c
        L87:
            int r5 = r5 + (-1)
            goto L66
        L8a:
            r4 = move-exception
            goto La6
        L8c:
            int r5 = r5 + r0
            java.lang.CharSequence r4 = r4.subSequence(r6, r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r5)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto La1
            r1.add(r4)     // Catch: java.lang.Throwable -> L8a
            goto La2
        La1:
            r4 = 0
        La2:
            kotlin.Result.b(r4)     // Catch: java.lang.Throwable -> L8a
            goto Laf
        La6:
            kotlin.Result$Companion r5 = kotlin.Result.f93230c
            java.lang.Object r4 = kotlin.d.a(r4)
            kotlin.Result.b(r4)
        Laf:
            int r3 = r3 + r0
            goto L59
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ez0.e(java.util.Map, yads.f01):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.nio.charset.Charset a(java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ez0.a(java.util.Map):java.nio.charset.Charset");
    }
}
