package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.inmobi.sdk.InMobiSdk;

/* JADX INFO: loaded from: classes10.dex */
public final class gm extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2225 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2226 = {'c', 'o', 'm', '.', 'i', 'n', 'b', 's', 'd', 'k', 'I', 'M', 'S', 'e', 'f', 'g'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2227 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2228 = 4;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bo boVar = new bo(mo6489());
        f2227 = (f2225 + 71) % 128;
        return boVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int iAxisFromString;
        byte touchSlop;
        int i10 = f2225 + 15;
        f2227 = i10 % 128;
        if (i10 % 2 == 0) {
            iAxisFromString = 57 >>> MotionEvent.axisFromString("");
            touchSlop = (byte) (85 / (ViewConfiguration.getTouchSlop() >> 7));
        } else {
            iAxisFromString = 23 - MotionEvent.axisFromString("");
            touchSlop = (byte) (78 - (ViewConfiguration.getTouchSlop() >> 8));
        }
        String strIntern = m6511("\u0001\u0002\u0003\u0000\u0005\u0006\u0003\u0002\u0007\u0005\u0007\u000b\t\n\u0002\u000b\u0007\t\u0002\u0005\b\u0000\t\n", iAxisFromString, touchSlop).intern();
        int i11 = f2225 + 99;
        f2227 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2225 + 27) % 128;
        f2227 = i10;
        f2225 = (i10 + 9) % 128;
        return InMobiSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int keyRepeatTimeout;
        int iMakeMeasureSpec;
        int i10 = f2225 + 71;
        f2227 = i10 % 128;
        if (i10 % 2 == 0) {
            keyRepeatTimeout = 36 << (ViewConfiguration.getKeyRepeatTimeout() - 21);
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 27;
        } else {
            keyRepeatTimeout = 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            iMakeMeasureSpec = 114 - View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        String strIntern = m6511("\u0005\u0006\u0003\u0002\u0007\u0005", keyRepeatTimeout, (byte) iMakeMeasureSpec).intern();
        int i11 = f2227 + 69;
        f2225 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6511(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2226;
                char c10 = f2228;
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
