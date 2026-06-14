package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class fj extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2067 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2068 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2069 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2070;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static fj f2071;

    static {
        m6471();
        f2071 = new fj();
        int i10 = f2070 + 111;
        f2069 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public fj() {
        super(dm.m6298("", -1));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m6471() {
        f2068 = (char) 2;
        f2067 = new char[]{'n', 'u', 'l', 'o'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized fj m6472() {
        fj fjVar;
        int i10 = (f2070 + 81) % 128;
        f2069 = i10;
        fjVar = f2071;
        int i11 = i10 + 99;
        f2070 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        return fjVar;
    }

    public final String toString() {
        int mode;
        byte bMyPid;
        int i10 = f2069 + 103;
        f2070 = i10 % 128;
        if (i10 % 2 != 0) {
            mode = 2 >>> View.MeasureSpec.getMode(0);
            bMyPid = (byte) (53 / (Process.myPid() * 121));
        } else {
            mode = View.MeasureSpec.getMode(0) + 4;
            bMyPid = (byte) (91 - (Process.myPid() >> 22));
        }
        String strIntern = m6473("\u0001\u0000ÇÇ", mode, bMyPid).intern();
        f2070 = (f2069 + 13) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6473(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2067;
                char c10 = f2068;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        int i10 = f2070 + 71;
        f2069 = i10 % 128;
        if (i10 % 2 != 0) {
            return drVar;
        }
        throw null;
    }
}
