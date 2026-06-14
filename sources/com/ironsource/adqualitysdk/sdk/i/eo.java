package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public abstract class eo extends el {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2003 = 41273;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2004 = 56333;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2005 = 55382;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2006 = 63806;

    public eo(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6457(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2005)) ^ ((c11 >>> 5) + f2004)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2003) ^ ((c12 + i12) ^ ((c12 << 4) + f2006))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo6454(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6457("穂⚂䚀˞ṇ餜✯\uf395릀ꉽ┍駶℻궆ᾊ遲", 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        sb2.append(str);
        sb2.append(m6457("蘣哦礦ꃉᾊ遲", 5 - Color.green(0)).intern());
        sb2.append(str2);
        throw new RuntimeException(sb2.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo6453(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6457("穂⚂䚀˞ṇ餜✯\uf395릀ꉽ┍駶℻궆ᾊ遲", 14 - TextUtils.lastIndexOf("", '0')).intern());
        sb2.append(obj);
        sb2.append(m6457("蘣哦礦ꃉᾊ遲", 5 - Color.argb(0, 0, 0, 0)).intern());
        sb2.append(obj2);
        throw new RuntimeException(sb2.toString());
    }
}
