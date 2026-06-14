package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes10.dex */
public final class ft extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2116 = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', 'u', 'e', 'a', 'd', 'q', 'l', 't', 'y', 'k', 'I', 'S', 'A', 'Q', 'h', 'v', 'f', 'g'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2117 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2118 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2119 = 5;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final bd mo6486() {
        bf bfVar = new bf(mo6489());
        int i10 = f2118 + 105;
        f2117 = i10 % 128;
        if (i10 % 2 == 0) {
            return bfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String mo6487() {
        f2118 = (f2117 + 57) % 128;
        String strIntern = m6485("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013Ë", Color.red(0) + 51, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 82)).intern();
        int i10 = f2118 + 97;
        f2117 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Class mo6488() {
        int i10 = f2118 + 103;
        int i11 = i10 % 128;
        f2117 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        f2118 = (i11 + 113) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String mo6489() {
        int mode;
        int maximumDrawingCacheSize;
        int i10 = f2118 + 79;
        f2117 = i10 % 128;
        if (i10 % 2 != 0) {
            mode = 32 >>> View.MeasureSpec.getMode(0);
            maximumDrawingCacheSize = 74 - (ViewConfiguration.getMaximumDrawingCacheSize() >>> 59);
        } else {
            mode = 15 - View.MeasureSpec.getMode(0);
            maximumDrawingCacheSize = 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        }
        String strIntern = m6485("\u000b\f\u0011\f\u0014\u000b\u0006\u0005\f\u000b\f\u0015\u0004\n\u0099", mode, (byte) maximumDrawingCacheSize).intern();
        int i11 = f2117 + 89;
        f2118 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6485(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2116;
                char c10 = f2119;
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
