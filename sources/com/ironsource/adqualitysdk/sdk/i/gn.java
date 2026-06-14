package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.my.target.common.MyTargetManager;

/* JADX INFO: loaded from: classes10.dex */
public final class gn extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2229 = {'c', 'o', 'm', '.', 'y', 't', 'a', 'r', 'g', 'e', 'n', 'M', 'T', 'd', 'f', 'h'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2230 = 4;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2231 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2232;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bz bzVar = new bz(mo6489());
        int i10 = f2231 + 125;
        f2232 = i10 % 128;
        if (i10 % 2 == 0) {
            return bzVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2231 + 53;
        f2232 = i10 % 128;
        return (i10 % 2 != 0 ? m6512("\u0001\u0002\u0003\u0000\u0000\u0006\u0001\u0007\u0007\u0004\t\n\u0007\u0001\u0001\u0002uu\u0002\t\u0007\u000f\b\u0000\u0007\u0004\t\n\u0007\t\n\u000e\u0004\n\u000b\u0005", 109 / (ViewConfiguration.getEdgeSlop() * 86), (byte) (90 / (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)))) : m6512("\u0001\u0002\u0003\u0000\u0000\u0006\u0001\u0007\u0007\u0004\t\n\u0007\u0001\u0001\u0002uu\u0002\t\u0007\u000f\b\u0000\u0007\u0004\t\n\u0007\t\n\u000e\u0004\n\u000b\u0005", (ViewConfiguration.getEdgeSlop() >> 16) + 36, (byte) (9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2232 + 77;
        int i11 = i10 % 128;
        f2231 = i11;
        if (i10 % 2 == 0) {
            int i12 = 68 / 0;
        }
        int i13 = i11 + 1;
        f2232 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 15 / 0;
        }
        return MyTargetManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int iNormalizeMetaState;
        int iIndexOf;
        int i10 = f2232 + 17;
        f2231 = i10 % 128;
        if (i10 % 2 == 0) {
            iNormalizeMetaState = 69 << KeyEvent.normalizeMetaState(0);
            iIndexOf = 120 >> TextUtils.indexOf((CharSequence) "", 'C', 1, 0);
        } else {
            iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 8;
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25;
        }
        String strIntern = m6512("\u0000\u0006\u0006\u0007\u0004\u000b\r\t", iNormalizeMetaState, (byte) iIndexOf).intern();
        f2232 = (f2231 + 107) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6512(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2229;
                char c10 = f2230;
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
