package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class fz extends gl {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2146 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2147 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2148 = 103;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2149 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2150;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2151 = {202, 214, 212, 149, 208, 217, 213, 218, 220, 204, 200, 203, 216, 211, 219, 224, 210, 176, 186, 168, 184, 207};

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bh bhVar = new bh(mo6489());
        f2150 = (f2146 + 99) % 128;
        return bhVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2146 = (f2150 + 93) % 128;
        String strIntern = m6495(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0090\u008f\u0085\u008e\u008b\u0089\u0095\u008c\u0094\u008a\u0081\u0086\u0089\u0082\u0093\u0087\u0082\u0086\u0092\u0084\u0091\u008c\u0088\u0084\u0091\u008c\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b\u0084\u008a\u0081\u0086\u0089\u0082\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i10 = f2146 + 7;
        f2150 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2150 + 79;
        int i11 = i10 % 128;
        f2146 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        f2150 = (i11 + 101) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2146 = (f2150 + 15) % 128;
        String strIntern = m6495(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0088\u008e\u0085\u008f\u0089\u008c\u008a\u0086\u008b\u0096\u0088\u008d\u008c\u008b").intern();
        int i10 = f2146 + 75;
        f2150 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6495(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2151;
                int i11 = f2148;
                if (f2149) {
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
                if (f2147) {
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
