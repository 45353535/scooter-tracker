package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class be extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f804 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f805 = -6536688573272972428L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f806;

    public be(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5108(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f805);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo5098() {
        int i10 = f806;
        int i11 = i10 + 49;
        f804 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        int i12 = i10 + 117;
        f804 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 79 / 0;
        }
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo5099() {
        int i10 = f804 + 35;
        int i11 = i10 % 128;
        f806 = i11;
        boolean z10 = i10 % 2 == 0;
        int i12 = i11 + 93;
        f804 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 28 / 0;
        }
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        int i10 = f806 + 79;
        f804 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f806 = (f804 + 3) % 128;
        String strIntern = m5108("ꌱ乯禟擉ᙬƘⳎ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 60757).intern();
        int i10 = f806 + 81;
        f804 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        int i10 = (f806 + 111) % 128;
        f804 = i10;
        int i11 = i10 + 71;
        f806 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
