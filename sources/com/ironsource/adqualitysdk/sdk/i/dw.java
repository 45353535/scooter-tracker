package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.util.TypedValue;
import com.ironsource.D5;

/* JADX INFO: loaded from: classes10.dex */
public final class dw extends ed {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1905 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1906 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1907 = 2;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1908 = {' ', D5.T, '!', '\"'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f1909;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ek f1910;

    public dw(ek ekVar, ed edVar, dm dmVar) {
        super(dmVar);
        this.f1910 = ekVar;
        this.f1909 = edVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r2.equals(r5.f1910) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r5.f1910 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r2 = r4.f1909;
        r5 = r5.f1909;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        return r2.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto Lc
            int r5 = com.ironsource.adqualitysdk.sdk.i.dw.f1906
            int r5 = r5 + 45
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1905 = r5
            return r0
        Lc:
            r1 = 0
            if (r5 == 0) goto L4b
            int r2 = com.ironsource.adqualitysdk.sdk.i.dw.f1906
            int r2 = r2 + 87
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1905 = r2
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dw> r3 = com.ironsource.adqualitysdk.sdk.i.dw.class
            if (r3 == r2) goto L20
            goto L4b
        L20:
            com.ironsource.adqualitysdk.sdk.i.dw r5 = (com.ironsource.adqualitysdk.sdk.i.dw) r5
            com.ironsource.adqualitysdk.sdk.i.ek r2 = r4.f1910
            if (r2 == 0) goto L37
            int r3 = com.ironsource.adqualitysdk.sdk.i.dw.f1906
            int r3 = r3 + 115
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1905 = r3
            com.ironsource.adqualitysdk.sdk.i.ek r3 = r5.f1910
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3c
            goto L3b
        L37:
            com.ironsource.adqualitysdk.sdk.i.ek r2 = r5.f1910
            if (r2 == 0) goto L3c
        L3b:
            return r1
        L3c:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f1909
            com.ironsource.adqualitysdk.sdk.i.ed r5 = r5.f1909
            if (r2 == 0) goto L47
            boolean r5 = r2.equals(r5)
            return r5
        L47:
            if (r5 != 0) goto L4a
            return r0
        L4a:
            return r1
        L4b:
            int r5 = com.ironsource.adqualitysdk.sdk.i.dw.f1905
            int r5 = r5 + 113
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1906 = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L58
            return r1
        L58:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ek ekVar = this.f1910;
        if (ekVar != null) {
            iHashCode = ekVar.hashCode();
        } else {
            f1905 = (f1906 + 97) % 128;
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        ed edVar = this.f1909;
        int iHashCode2 = i10 + (edVar != null ? edVar.hashCode() : 0);
        int i11 = f1906 + 93;
        f1905 = i11 % 128;
        if (i11 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1910);
        sb2.append(m6402("\u0001\u0000\u0084", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, (byte) (101 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern());
        sb2.append(this.f1909);
        String string = sb2.toString();
        int i10 = f1906 + 21;
        f1905 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 18 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        int i10 = f1906 + 47;
        f1905 = i10 % 128;
        if (i10 % 2 == 0) {
            duVar.m6397(this.f1910.m6451(), this.f1909.m6434(duVar, cqVar).m6377());
            throw null;
        }
        dr drVarM6434 = this.f1909.m6434(duVar, cqVar);
        duVar.m6397(this.f1910.m6451(), drVarM6434.m6377());
        f1905 = (f1906 + 7) % 128;
        return drVarM6434;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ek m6403() {
        int i10 = f1906;
        ek ekVar = this.f1910;
        int i11 = i10 + 65;
        f1905 = i11 % 128;
        if (i11 % 2 != 0) {
            return ekVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6402(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f1908;
                char c10 = f1907;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2158 = 0;
                    while (true) {
                        int i11 = g.f2158;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2157 = cArr[i11];
                        g.f2155 = cArr[g.f2158 + 1];
                        if (g.f2157 == g.f2155) {
                            cArr3[g.f2158] = (char) (g.f2157 - b10);
                            cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                        } else {
                            g.f2156 = g.f2157 / c10;
                            g.f2154 = g.f2157 % c10;
                            g.f2159 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            if (g.f2154 == g.f2152) {
                                g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                int i12 = (g.f2156 * c10) + g.f2154;
                                int i13 = (g.f2159 * c10) + g.f2152;
                                int i14 = g.f2158;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2156 == g.f2159) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                int i15 = (g.f2156 * c10) + g.f2154;
                                int i16 = (g.f2159 * c10) + g.f2152;
                                int i17 = g.f2158;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2156 * c10) + g.f2152;
                                int i19 = (g.f2159 * c10) + g.f2154;
                                int i20 = g.f2158;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2158 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
