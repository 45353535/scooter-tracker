package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class fa extends eg {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2044 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2045 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2046 = 16633;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2047 = 28030;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2048 = 16548;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2049 = 36552;

    public fa(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6467(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2049)) ^ ((c11 >>> 5) + f2048)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2047) ^ ((c12 + i12) ^ ((c12 << 4) + f2046))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        f2044 = (f2045 + 33) % 128;
        String strIntern = m6467("\ufae6㊧", (ViewConfiguration.getPressedStateDuration() >> 16) + 2).intern();
        f2045 = (f2044 + 55) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        f2045 = (f2044 + 93) % 128;
        dr drVarM6434 = m6444().m6434(duVar, cqVar);
        if (!drVarM6434.m6379()) {
            return m6445().m6434(duVar, cqVar);
        }
        f2044 = (f2045 + 73) % 128;
        return drVarM6434;
    }
}
