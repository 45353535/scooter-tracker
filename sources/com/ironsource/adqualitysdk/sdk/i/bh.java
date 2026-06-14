package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bh extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f818 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f819 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f820 = {'E', 'N', 'A', 'B', 'L', 'D', 'F', 'G', 'H'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f821 = 3;

    public bh(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo5099() {
        int i10 = f818 + 61;
        f819 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 98 / 0;
        }
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        f819 = (f818 + 11) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f819 = (f818 + 105) % 128;
        String strIntern = m5111("\u0001\u0002\u0000\u0005\u0003\u0001À", 7 - TextUtils.indexOf("", "", 0), (byte) (172 - AndroidCharacter.getMirror('0'))).intern();
        int i10 = f818 + 83;
        f819 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 56 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        int i10 = f818 + 65;
        f819 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5111(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f820;
                char c10 = f821;
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
