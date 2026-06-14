package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class df extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1703 = 54888;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1704 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1705 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1706 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1707 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m6167(cq cqVar, List<Object> list, du duVar) {
        f1705 = (f1707 + 109) % 128;
        t.m7284(m6172(cqVar, list, duVar), m6166(list));
        int i10 = f1707 + 63;
        f1705 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 70 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m6168(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1705 + 45;
        f1707 = i10 % 128;
        if (i10 % 2 != 0) {
            t.m7283(m6172(cqVar, list, duVar));
            return null;
        }
        t.m7283(m6172(cqVar, list, duVar));
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m6169(cq cqVar, List<Object> list, du duVar) {
        f1705 = (f1707 + 123) % 128;
        t.m7288(m6172(cqVar, list, duVar));
        int i10 = f1705 + 41;
        f1707 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m6170(cq cqVar, List<Object> list, du duVar) {
        f1707 = (f1705 + 9) % 128;
        t.m7282(m6172(cqVar, list, duVar), m6166(list));
        int i10 = f1707 + 113;
        f1705 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m6171(cq cqVar, List<Object> list, du duVar) {
        f1707 = (f1705 + 63) % 128;
        t.m7281(m6172(cqVar, list, duVar));
        int i10 = f1705 + 89;
        f1707 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.cz.m6138(r8, 0, com.ironsource.adqualitysdk.sdk.i.ir.class) != false) goto L11;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.ir m6172(final com.ironsource.adqualitysdk.sdk.i.cq r7, java.util.List<java.lang.Object> r8, final com.ironsource.adqualitysdk.sdk.i.du r9) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.df.f1705
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1707 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r3 = com.ironsource.adqualitysdk.sdk.i.ir.class
            r4 = 0
            if (r0 != 0) goto L19
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6138(r8, r4, r3)     // Catch: java.lang.Exception -> L17
            if (r0 == r2) goto L1f
            goto L26
        L17:
            r8 = move-exception
            goto L5b
        L19:
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6138(r8, r4, r3)     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L26
        L1f:
            java.lang.Object r8 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r8, r4, r3)     // Catch: java.lang.Exception -> L17
            com.ironsource.adqualitysdk.sdk.i.ir r8 = (com.ironsource.adqualitysdk.sdk.i.ir) r8     // Catch: java.lang.Exception -> L17
            return r8
        L26:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ds> r0 = com.ironsource.adqualitysdk.sdk.i.ds.class
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r8, r4, r0)     // Catch: java.lang.Exception -> L17
            com.ironsource.adqualitysdk.sdk.i.ds r0 = (com.ironsource.adqualitysdk.sdk.i.ds) r0     // Catch: java.lang.Exception -> L17
            int r3 = r8.size()     // Catch: java.lang.Exception -> L17
            if (r3 <= r1) goto L51
            int r3 = com.ironsource.adqualitysdk.sdk.i.df.f1707
            int r3 = r3 + 39
            int r5 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1705 = r5
            int r3 = r3 % r1
            if (r3 == 0) goto L45
            r1 = 5
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m6141(r8, r1)     // Catch: java.lang.Exception -> L17
            goto L49
        L45:
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m6141(r8, r1)     // Catch: java.lang.Exception -> L17
        L49:
            int r1 = com.ironsource.adqualitysdk.sdk.i.df.f1707
            int r1 = r1 + r2
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1705 = r1
            goto L55
        L51:
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m6141(r8, r2)     // Catch: java.lang.Exception -> L17
        L55:
            com.ironsource.adqualitysdk.sdk.i.df$3 r1 = new com.ironsource.adqualitysdk.sdk.i.df$3     // Catch: java.lang.Exception -> L17
            r1.<init>()     // Catch: java.lang.Exception -> L17
            return r1
        L5b:
            java.lang.String r7 = r7.m5971()
            r9 = 48
            java.lang.String r0 = ""
            int r9 = android.text.TextUtils.indexOf(r0, r9, r4)
            r1 = 54805(0xd615, float:7.6798E-41)
            int r1 = r1 - r9
            char r9 = (char) r1
            int r0 = android.text.TextUtils.indexOf(r0, r0, r4)
            java.lang.String r1 = "㨬癐\u169f\ue1d6"
            java.lang.String r2 = "蒶䘪䀶ᐏ�짖ᕁ曜闆蟿㝀Ꮀꤦ塭륃\u0dbcಮ郝鲥ꛆ\ue95f\ua879ϱ낶螾钅㋒䮢ä빊"
            java.lang.String r3 = "\u0000\u0000\u0000\u0000"
            java.lang.String r9 = m6165(r2, r9, r3, r0, r1)
            java.lang.String r9 = r9.intern()
            com.ironsource.adqualitysdk.sdk.i.co.m5911(r7, r9, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.df.m6172(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List, com.ironsource.adqualitysdk.sdk.i.du):com.ironsource.adqualitysdk.sdk.i.ir");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m6173(cq cqVar, List<Object> list, du duVar) {
        f1705 = (f1707 + 77) % 128;
        t.m7279(m6172(cqVar, list, duVar));
        f1707 = (f1705 + 125) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6165(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2697) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2699 = 0;
                while (true) {
                    int i11 = j.f2699;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2698 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2699;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1704) ^ ((long) f1706)) ^ ((long) f1703));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r4
  0x0020: PHI (r4v1 long) = (r4v0 long), (r4v3 long) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m6166(java.util.List<java.lang.Object> r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.df.f1707
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1705 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r3 = 1
            if (r0 == 0) goto L18
            int r0 = r6.size()
            r4 = 1
            if (r0 <= 0) goto L32
            goto L20
        L18:
            int r0 = r6.size()
            r4 = 0
            if (r0 <= r3) goto L32
        L20:
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6138(r6, r3, r2)
            if (r0 == 0) goto L32
            java.lang.Object r6 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r3, r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r0 = (long) r6
            return r0
        L32:
            int r0 = r6.size()
            if (r0 <= r1) goto L4c
            int r0 = com.ironsource.adqualitysdk.sdk.i.df.f1707
            int r0 = r0 + 21
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1705 = r0
            java.lang.Object r6 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r1, r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r0 = (long) r6
            return r0
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.df.m6166(java.util.List):long");
    }
}
