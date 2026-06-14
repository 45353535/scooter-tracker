package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBAdRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class fy extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2142 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2143 = {'c', 'o', 'm', '.', 'a', 'z', 'n', 'd', 'e', 'v', 'i', 's', 'D', 'T', 'B', 'A', 'R', 'q', 'u', 't', 'p', 'f', 'g', 'h', 'j'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2144 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2145 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bm bmVar = new bm(mo6489());
        int i10 = f2144 + 105;
        f2145 = i10 % 128;
        if (i10 % 2 != 0) {
            return bmVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int iAlpha;
        byte mirror;
        int i10 = f2144 + 17;
        f2145 = i10 % 128;
        if (i10 % 2 == 0) {
            iAlpha = 105 - Color.alpha(0);
            mirror = (byte) (5 / AndroidCharacter.getMirror('c'));
        } else {
            iAlpha = Color.alpha(0) + 34;
            mirror = (byte) (AndroidCharacter.getMirror('0') + 5);
        }
        return m6494("\u0001\u0002\u0003\u0004\u0000\u0003\u0000\t\u0006\u000b\u0002\b\t\u0005\u000f\u0005\r\b\u0002\t\r\u0001\r\u000e\n\u0013\u0006\u0011\u0007\u0012\u0017\r\u000e\u0010", iAlpha, mirror).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        f2144 = (f2145 + 7) % 128;
        return DTBAdRequest.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2145 = (f2144 + 89) % 128;
        String strIntern = m6494("\u0000\u0003\u0000\t\u0006\u000b\u0000\u0018¤", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49)).intern();
        f2145 = (f2144 + 37) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6494(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2143;
                char c10 = f2142;
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
