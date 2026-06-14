package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class eh extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1978 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1979 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1980 = 34869;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1981 = 36419;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1982 = 13667;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1983 = 55957;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f1984;

    public eh(ed edVar, dm dmVar) {
        super(dmVar);
        this.f1984 = edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6446(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1981)) ^ ((c11 >>> 5) + f1982)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1980) ^ ((c12 + i12) ^ ((c12 << 4) + f1983))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.eh.f1979 = (r2 + 97) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.eh.class == r6.getClass()) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.eh) r6;
        r0 = r5.f1984;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.eh.f1978 + 1;
        com.ironsource.adqualitysdk.sdk.i.eh.f1979 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return r0.equals(r6.f1984);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r0.equals(r6.f1984);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r6.f1984 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.eh.f1978 = (r0 + 115) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.eh.f1979
            int r1 = r0 + 89
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1978 = r2
            int r1 = r1 % 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L14
            r1 = 90
            int r1 = r1 / r4
            if (r5 != r6) goto L1d
            goto L16
        L14:
            if (r5 != r6) goto L1d
        L16:
            int r0 = r0 + 115
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1978 = r0
            return r3
        L1d:
            if (r6 == 0) goto L52
            int r2 = r2 + 97
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1979 = r2
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.eh> r1 = com.ironsource.adqualitysdk.sdk.i.eh.class
            if (r1 == r0) goto L2e
            goto L52
        L2e:
            com.ironsource.adqualitysdk.sdk.i.eh r6 = (com.ironsource.adqualitysdk.sdk.i.eh) r6
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f1984
            if (r0 == 0) goto L4d
            int r1 = com.ironsource.adqualitysdk.sdk.i.eh.f1978
            int r1 = r1 + r3
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1979 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L46
            com.ironsource.adqualitysdk.sdk.i.ed r6 = r6.f1984
            boolean r6 = r0.equals(r6)
            return r6
        L46:
            com.ironsource.adqualitysdk.sdk.i.ed r6 = r6.f1984
            r0.equals(r6)
            r6 = 0
            throw r6
        L4d:
            com.ironsource.adqualitysdk.sdk.i.ed r6 = r6.f1984
            if (r6 != 0) goto L52
            return r3
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ed edVar = this.f1984;
        if (edVar != null) {
            f1979 = (f1978 + 39) % 128;
            return edVar.hashCode();
        }
        f1978 = (f1979 + 27) % 128;
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6446("骒戮", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
        sb2.append(this.f1984);
        sb2.append(m6446("핮\ueab8", 1 - TextUtils.getOffsetBefore("", 0)).intern());
        String string = sb2.toString();
        f1978 = (f1979 + 37) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        f1979 = (f1978 + 3) % 128;
        dr drVarM6434 = this.f1984.m6434(duVar, cqVar);
        f1979 = (f1978 + 113) % 128;
        return drVarM6434;
    }
}
