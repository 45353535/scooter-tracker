package yads;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class pl3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f114701c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f114702d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f114703a = new w92();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f114704b = new StringBuilder();

    public static String a(w92 w92Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = w92Var.f117357b;
        int i11 = w92Var.f117358c;
        while (i10 < i11 && !z10) {
            char c10 = (char) w92Var.f117356a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        int i12 = w92Var.f117357b;
        w92Var.e((i10 - i12) + i12);
        return sb2.toString();
    }

    public static String b(w92 w92Var, StringBuilder sb2) {
        a(w92Var);
        if (w92Var.f117358c - w92Var.f117357b == 0) {
            return null;
        }
        String strA = a(w92Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) w92Var.m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        r8.e(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(yads.w92 r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f117358c
            int r3 = r8.f117357b
            int r4 = r2 - r3
            if (r4 <= 0) goto L59
            if (r1 == 0) goto L59
            byte[] r1 = r8.f117356a
            r4 = r1[r3]
            char r5 = (char) r4
            r6 = 9
            if (r5 == r6) goto L53
            r6 = 10
            if (r5 == r6) goto L53
            r6 = 12
            if (r5 == r6) goto L53
            r6 = 13
            if (r5 == r6) goto L53
            r6 = 32
            if (r5 == r6) goto L53
            int r5 = r3 + 2
            if (r5 > r2) goto L51
            int r3 = r3 + 1
            r6 = 47
            if (r4 != r6) goto L51
            r3 = r1[r3]
            r4 = 42
            if (r3 != r4) goto L51
        L35:
            int r3 = r5 + 1
            if (r3 >= r2) goto L49
            r7 = r1[r5]
            char r7 = (char) r7
            if (r7 != r4) goto L47
            r7 = r1[r3]
            char r7 = (char) r7
            if (r7 != r6) goto L47
            int r5 = r5 + 2
            r2 = r5
            goto L35
        L47:
            r5 = r3
            goto L35
        L49:
            int r1 = r8.f117357b
            int r2 = r2 - r1
            int r2 = r2 + r1
            r8.e(r2)
            goto L1
        L51:
            r1 = 0
            goto L2
        L53:
            int r3 = r3 + 1
            r8.e(r3)
            goto L1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pl3.a(yads.w92):void");
    }
}
