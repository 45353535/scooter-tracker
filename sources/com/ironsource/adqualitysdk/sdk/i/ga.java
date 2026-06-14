package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes10.dex */
public final class ga extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2160 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2161 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2162 = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', 'u', 'e', 'a', 'd', 'q', 'l', 't', 'y', 'k', 'I', 'S', 'A', 'Q', 'h', 'f', 'g', 'j'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2163 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6496(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2162;
                char c10 = f2163;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        be beVar = new be(mo6489());
        int i10 = f2161 + 87;
        f2160 = i10 % 128;
        if (i10 % 2 == 0) {
            return beVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2160 + 71;
        f2161 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6496("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013ë", 26 % TextUtils.lastIndexOf("", 'N', 1), (byte) (21 << TextUtils.getOffsetAfter("", 0))) : m6496("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013ë", 50 - TextUtils.lastIndexOf("", '0', 0), (byte) (TextUtils.getOffsetAfter("", 0) + 114))).intern();
        int i11 = f2160 + 87;
        f2161 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2161 + 9;
        f2160 = i10 % 128;
        if (i10 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10;
        int iIndexOf;
        int i11 = f2161 + 25;
        f2160 = i11 % 128;
        if (i11 % 2 != 0) {
            i10 = (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)) * 88;
            iIndexOf = TextUtils.indexOf((CharSequence) "", '5', 1) * 64;
        } else {
            i10 = 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            iIndexOf = 121 - TextUtils.indexOf((CharSequence) "", '0', 0);
        }
        String strIntern = m6496("\u000b\f\r\u0007\u000b\u000e\t\u0013\u0011\u0005\u0014\u000b\u0006\u0005Þ", i10, (byte) iIndexOf).intern();
        f2161 = (f2160 + 51) % 128;
        return strIntern;
    }
}
