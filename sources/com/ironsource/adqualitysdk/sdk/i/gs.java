package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ogury.ad.OguryReward;
import io.presage.Presage;

/* JADX INFO: loaded from: classes10.dex */
public final class gs extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2248 = {'i', 'o', '.', 'p', 'r', 'e', 's', 'a', 'g', 'P', 'u', 'y', 'j', 'k', 'l', 'm'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2249 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2250 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2251;

    public static class a extends gl {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2252 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2253 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2254 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2255 = 2485;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2256 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6486() {
            by byVar = new by(mo6489());
            int i10 = f2256 + 17;
            f2254 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 99 / 0;
            }
            return byVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            char scrollBarSize;
            int iAxisFromString;
            int i10 = f2256 + 117;
            f2254 = i10 % 128;
            if (i10 % 2 != 0) {
                scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() % 49);
                iAxisFromString = MotionEvent.axisFromString("") - 1;
            } else {
                scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                iAxisFromString = (-1) - MotionEvent.axisFromString("");
            }
            String strIntern = m6519("Ї⳱励䃵壪폗홺猍畊\uec7eꝥ剠䃂Ｕ㸩ꆳﵗ\ud846愽\ud83b옃㨊塄膎", scrollBarSize, "\u0000\u0000\u0000\u0000", iAxisFromString, "莙\ueb0fȑ㆓").intern();
            int i11 = f2256 + 49;
            f2254 = i11 % 128;
            if (i11 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = f2254 + 57;
            int i11 = i10 % 128;
            f2256 = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            int i12 = i11 + 79;
            f2254 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 25 / 0;
            }
            return OguryReward.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6489() {
            f2254 = (f2256 + 87) % 128;
            String strIntern = m6519("뚛漐馳\ua62d␗", (char) (26391 - TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0', 0, 0) - 296328029, "ꉟ噤ᣮ㙧").intern();
            int i10 = f2256 + 53;
            f2254 = i10 % 128;
            if (i10 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6519(String str, char c10, String str2, int i10, String str3) {
            String str4;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            synchronized (j.f2697) {
                try {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i10));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    j.f2699 = 0;
                    while (true) {
                        int i11 = j.f2699;
                        if (i11 < length) {
                            int i12 = (i11 + 2) % 4;
                            int i13 = (i11 + 3) % 4;
                            int i14 = cArr4[i11 % 4] * 32718;
                            char c11 = cArr5[i12];
                            char c12 = (char) ((i14 + c11) % 65535);
                            j.f2698 = c12;
                            cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                            cArr4[i13] = c12;
                            int i15 = j.f2699;
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2252) ^ ((long) f2253)) ^ ((long) f2255));
                            j.f2699 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str4;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        ca caVar = new ca(mo6489());
        int i10 = f2250 + 109;
        f2251 = i10 % 128;
        if (i10 % 2 == 0) {
            return caVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int iIndexOf;
        int scrollBarSize;
        int i10 = f2250 + 29;
        f2251 = i10 % 128;
        if (i10 % 2 != 0) {
            iIndexOf = 99 % TextUtils.indexOf("", "", 0, 0);
            scrollBarSize = 57 - (ViewConfiguration.getScrollBarSize() % 36);
        } else {
            iIndexOf = 18 - TextUtils.indexOf("", "", 0, 0);
            scrollBarSize = 69 - (ViewConfiguration.getScrollBarSize() >> 8);
        }
        String strIntern = m6518("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0004\u0001\n\u0005\u0006\u0007\u0004\t\u0004", iIndexOf, (byte) scrollBarSize).intern();
        f2250 = (f2251 + 21) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2250;
        int i11 = i10 + 123;
        f2251 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        f2251 = (i10 + 41) % 128;
        return Presage.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2250 = (f2251 + 37) % 128;
        String strIntern = m6518("\u0000\t\b\u0006\u0095", 5 - TextUtils.indexOf("", ""), (byte) (28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern();
        f2250 = (f2251 + 83) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6518(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2248;
                char c10 = f2249;
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
