package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.qq.e.comm.managers.GDTAdSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class ha extends gl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2310 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2311 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2312 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2313 = {305, 317, 315, 252, 319, 307, 303, 316, 309, 320, 321, 277, 274, 290, 271, 306, 289, 313, 322};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2314 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2315 = 206;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        cf cfVar = new cf(mo6489());
        int i10 = f2310 + 111;
        f2312 = i10 % 128;
        if (i10 % 2 == 0) {
            return cfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2310 + 41;
        f2312 = i10 % 128;
        return m6532(null, i10 % 2 != 0 ? 19 - (ViewConfiguration.getKeyRepeatTimeout() / 6) : (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0092\u0090\u0091\u0090\u008f\u008e\u008d\u008c\u0084\u008b\u008a\u0086\u0089\u0087\u0088\u0087\u0083\u0084\u0083\u0083\u0082\u0081\u0084\u0086\u0084\u0085\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        Class<GDTAdSdk> cls;
        int i10 = f2312;
        int i11 = i10 + 43;
        f2310 = i11 % 128;
        if (i11 % 2 == 0) {
            cls = GDTAdSdk.class;
            int i12 = 1 / 0;
        } else {
            cls = GDTAdSdk.class;
        }
        int i13 = i10 + 111;
        f2310 = i13 % 128;
        if (i13 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2312 = (f2310 + 61) % 128;
        String strIntern = m6532(null, 127 - View.getDefaultSize(0, 0), null, "\u0093\u0088\u0086\u0081\u0088\u0086\u0093").intern();
        f2310 = (f2312 + 97) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6532(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2313;
                int i11 = f2315;
                if (f2314) {
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
                if (f2311) {
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
