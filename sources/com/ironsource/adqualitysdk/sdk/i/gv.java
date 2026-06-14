package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.smaato.sdk.core.SmaatoSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class gv extends gl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2266 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2267 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2268 = {384, 396, 394, 331, 400, 382, 401, 385, 392, 399, 386, 368};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2269 = 285;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2270 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2271 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6522(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2268;
                int i11 = f2269;
                if (f2267) {
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
                if (f2271) {
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        cb cbVar = new cb(mo6489());
        f2270 = (f2266 + 89) % 128;
        return cbVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2266 + 1;
        f2270 = i10 % 128;
        return m6522(null, i10 % 2 != 0 ? MotionEvent.axisFromString("") + 6 : 126 - MotionEvent.axisFromString(""), null, "\u0089\u0088\u008c\u0082\u0087\u0086\u0086\u0083\u008c\u0084\u008b\u008a\u0082\u0081\u0084\u0089\u0088\u0085\u0084\u0082\u0087\u0086\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2270 + 123) % 128;
        f2266 = i10;
        int i11 = i10 + 59;
        f2270 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 97 / 0;
        }
        return SmaatoSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2270 + 45;
        f2266 = i10 % 128;
        return m6522(null, i10 % 2 == 0 ? 123 >> View.resolveSize(0, 0) : 127 - View.resolveSize(0, 0), null, "\u0082\u0087\u0086\u0086\u0083\u0085").intern();
    }
}
