package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1673 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1674 = -3665845259407612904L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1675;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((!r2) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r2 != false) goto L13;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static <T> boolean m6138(java.util.List<java.lang.Object> r2, int r3, java.lang.Class<T> r4) {
        /*
            java.lang.Object r2 = r2.get(r3)
            r3 = 1
            if (r2 == 0) goto L27
            int r0 = com.ironsource.adqualitysdk.sdk.i.cz.f1673
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1675 = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r4.isAssignableFrom(r2)
            if (r0 == 0) goto L22
            r4 = 79
            int r4 = r4 / r1
            if (r2 == 0) goto L26
            goto L27
        L22:
            r2 = r2 ^ r3
            if (r2 == r3) goto L26
            goto L27
        L26:
            return r1
        L27:
            int r2 = com.ironsource.adqualitysdk.sdk.i.cz.f1675
            int r2 = r2 + 13
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1673 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.m6138(java.util.List, int, java.lang.Class):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m6139(List<Object> list, int i10, Class<T> cls) {
        T t10 = (T) list.get(i10);
        if (t10 != null) {
            f1673 = (f1675 + 99) % 128;
            if (!cls.isAssignableFrom(t10.getClass())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6140("毟䰬䟸殜\ue855憎ྦᚯ\ufbd0砠齈虂䭾袇⽼\uf7a1", ViewConfiguration.getDoubleTapTimeout() >> 16).intern());
                sb2.append(t10.getClass().getName());
                sb2.append(m6140("ݰᬰ柷ݐ뽜\ue572⾨च", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(cls.getName());
                throw new ClassCastException(sb2.toString());
            }
        }
        int i11 = f1675 + 85;
        f1673 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 40 / 0;
        }
        return t10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    protected static List<Object> m6141(List<Object> list, int i10) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i10) {
            f1675 = (f1673 + 59) % 128;
            if (m6138(list, i10, List.class)) {
                int i11 = f1675 + 21;
                f1673 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                return (List) m6139(list, i10, List.class);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6140(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f1674, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f1674));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
