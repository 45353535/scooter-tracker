package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class gi extends gl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2202 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2203 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2204 = 215;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2205 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2206;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2207 = {314, 326, 324, 261, 317, 336, 313, 316, 329, 320, 325, 312, 331, 333, 330, 315, 322, 335, 323, 288, 280, 292, 318};

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bv bvVar = new bv(mo6489());
        f2202 = (f2206 + 123) % 128;
        return bvVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2206 + 3;
        f2202 = i10 % 128;
        return m6506(null, i10 % 2 == 0 ? (ViewConfiguration.getWindowTouchSlop() >>> 34) + 75 : (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, "\u0089\u0088\u0097\u008c\u008b\u008c\u0096\u0090\u0095\u0088\u008e\u008a\u008d\u0081\u008c\u0089\u0088\u008b\u008b\u0094\u0084\u0093\u008c\u008b\u0089\u0088\u008d\u0092\u0088\u0084\u0091\u0090\u008f\u0084\u0088\u008e\u008a\u008d\u0081\u008c\u0089\u0088\u008b\u008b\u008a\u0084\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2202 + 105;
        f2206 = i10 % 128;
        if (i10 % 2 == 0) {
            return InneractiveAdManager.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2206 + 35;
        f2202 = i10 % 128;
        return (i10 % 2 == 0 ? m6506(null, 110 / View.resolveSizeAndState(1, 0, 0), null, "\u0088\u008e\u008a\u008d\u0081\u008c\u0089\u0088\u008b\u008b\u008a") : m6506(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0088\u008e\u008a\u008d\u0081\u008c\u0089\u0088\u008b\u008b\u008a")).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6506(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3012) {
            try {
                char[] cArr2 = f2207;
                int i11 = f2204;
                if (f2203) {
                    int length = bArr.length;
                    m.f3014 = length;
                    char[] cArr3 = new char[length];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i12 = m.f3013;
                        int i13 = m.f3014 - 1;
                        int i14 = m.f3013;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3013 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2205) {
                    int length2 = cArr.length;
                    m.f3014 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i15 = m.f3013;
                        int i16 = m.f3014 - 1;
                        int i17 = m.f3013;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3013 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3014 = length3;
                char[] cArr5 = new char[length3];
                m.f3013 = 0;
                while (m.f3013 < m.f3014) {
                    int i18 = m.f3013;
                    int i19 = m.f3014 - 1;
                    int i20 = m.f3013;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3013 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
