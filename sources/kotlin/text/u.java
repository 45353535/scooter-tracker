package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class u extends t {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean s(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.u.s(java.lang.String):boolean");
    }

    public static Double t(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (s(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (s(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
