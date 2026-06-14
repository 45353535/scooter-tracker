package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class ew extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2029 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2030 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2031 = 8812308453087429859L;

    public ew(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        f2029 = (f2030 + 79) % 128;
        String strIntern = m6464("쓟⇡", View.MeasureSpec.makeMeasureSpec(0, 0) + 58687).intern();
        int i10 = f2030 + 27;
        f2029 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo6452(int i10) {
        int i11 = f2030;
        f2029 = (i11 + 53) % 128;
        if (i10 > 0) {
            return false;
        }
        f2029 = (i11 + 63) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6464(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2031);
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
}
