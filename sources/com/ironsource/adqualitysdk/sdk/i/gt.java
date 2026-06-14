package com.ironsource.adqualitysdk.sdk.i;

import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes10.dex */
public final class gt extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2257 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2258 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2259 = {'n', 'e', 't', '.', 'p', 'u', 'b', 'a', 'i', 'v', 'l', 's', 'd', 'k', 'H', 'y', 'B', 'o', 'q', 'r', 'w', 'x', 'z', '{', '|'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2260 = 5;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bx bxVar = new bx(mo6489());
        f2258 = (f2257 + 15) % 128;
        return bxVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2258 = (f2257 + 69) % 128;
        String strIntern = m6520("\u0001\u0002\u0003\u0004\u0000\t\u0005\u0001\f\u0007\t\u0005\u0002\u0004\r\u0005\u0003\u0002\u0001\r\r\u000e\u0004\r\u0010\u0011\u0007\r", 27 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (Gravity.getAbsoluteGravity(0, 0) + 50)).intern();
        int i10 = f2257 + 27;
        f2258 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2257 + 23;
        f2258 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0 / 0;
        }
        return HyBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int defaultSize;
        int absoluteGravity;
        int i10 = f2257 + 99;
        f2258 = i10 % 128;
        if (i10 % 2 == 0) {
            defaultSize = 15 - View.getDefaultSize(1, 1);
            absoluteGravity = Gravity.getAbsoluteGravity(0, 0) * 30;
        } else {
            defaultSize = View.getDefaultSize(0, 0) + 9;
            absoluteGravity = 64 - Gravity.getAbsoluteGravity(0, 0);
        }
        return m6520("\u0000\t\u0005\u0001\f\u0007\t\u0005¥", defaultSize, (byte) absoluteGravity).intern();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6520(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2259;
                char c10 = f2260;
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
