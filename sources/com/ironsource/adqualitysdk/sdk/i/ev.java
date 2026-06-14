package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;

/* JADX INFO: loaded from: classes10.dex */
public final class ev extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2026 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2027 = -1006282281212763005L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2028;

    public ev(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6463(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2027);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        int i10 = f2028 + 75;
        f2026 = i10 % 128;
        int i11 = i10 % 2;
        long elapsedCpuTime = Process.getElapsedCpuTime();
        String strIntern = m6463("⒦", i11 == 0 ? 51674 / (elapsedCpuTime > 1L ? 1 : (elapsedCpuTime == 1L ? 0 : -1)) : 51674 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1))).intern();
        f2026 = (f2028 + 27) % 128;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r4 instanceof java.lang.Double) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r3 instanceof java.lang.Long) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if ((r4 instanceof java.lang.Long) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return java.lang.Integer.valueOf(r3.intValue() % r4.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        return java.lang.Long.valueOf(r3.longValue() % r4.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if ((r4 instanceof java.lang.Double) != false) goto L21;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number mo6456(java.lang.Number r3, java.lang.Number r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ev.f2026
            int r1 = r0 + 63
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ev.f2028 = r1
            boolean r1 = r3 instanceof java.lang.Double
            if (r1 != 0) goto L48
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ev.f2028 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1e
            boolean r0 = r4 instanceof java.lang.Double
            r1 = 7
            int r1 = r1 / 0
            if (r0 == 0) goto L23
            goto L48
        L1e:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L23
            goto L48
        L23:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 != 0) goto L3a
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L2c
            goto L3a
        L2c:
            int r3 = r3.intValue()
            int r4 = r4.intValue()
            int r3 = r3 % r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L3a:
            long r0 = r3.longValue()
            long r3 = r4.longValue()
            long r0 = r0 % r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L48:
            double r0 = r3.doubleValue()
            double r3 = r4.doubleValue()
            double r0 = r0 % r3
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            int r4 = com.ironsource.adqualitysdk.sdk.i.ev.f2026
            int r4 = r4 + 79
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ev.f2028 = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ev.mo6456(java.lang.Number, java.lang.Number):java.lang.Number");
    }
}
