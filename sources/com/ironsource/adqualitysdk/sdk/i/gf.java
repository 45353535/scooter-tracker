package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gf extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2184 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2185 = {'1', 'm', 'v', 'l', 'd', 'b', 'g', 'h', 'd'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2186;

    public static class c extends gf {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2187 = 93071209712816154L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2188 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2189;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            f2188 = (f2189 + 87) % 128;
            String strIntern = m6502("딣땀\uf30b捾ㄫᅲ띻ܛ\uf529⏰熚䞨㖗\ue380뀘蘆瑾ꉷ\uf06d욙듨抟ドۥ\uf74eⅇ猯䕉㜠\ue1e5뎽藫瞚ꆉ\uf217쑳똊怿㉯ҁ\uf6a5ₙ狯䓊ㅠ\ue745땝", ViewConfiguration.getScrollDefaultDelay() >> 16).intern();
            int i10 = f2189 + 11;
            f2188 = i10 % 128;
            if (i10 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = (f2189 + 81) % 128;
            f2188 = i10;
            f2189 = (i10 + 23) % 128;
            return PAGSdk.class;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6502(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2308) {
                try {
                    char[] cArrM6531 = h.m6531(f2187, cArr, i10);
                    h.f2309 = 4;
                    while (true) {
                        int i11 = h.f2309;
                        if (i11 < cArrM6531.length) {
                            h.f2307 = i11 - 4;
                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2187));
                            h.f2309++;
                        } else {
                            str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public static class e extends gf {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2190 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2191 = -2504831861112177843L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2192 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            int i10 = f2192 + 75;
            f2190 = i10 % 128;
            String strIntern = (i10 % 2 != 0 ? m6503("\u0af6ક\uf8ce年Ϭཹ飙椐\ue7a0ံᨴ䞧탺ⴚ⣢哵촏㨉䟋ℾ빍䣽劋㸞ꢗ旱慱ୖ薽爯簷᧨盎輣諉\uf6ee挅鱇駟", AndroidCharacter.getMirror('1') * 'E') : m6503("\u0af6ક\uf8ce年Ϭཹ飙椐\ue7a0ံᨴ䞧탺ⴚ⣢哵촏㨉䟋ℾ빍䣽劋㸞ꢗ旱慱ୖ薽爯簷᧨盎輣諉\uf6ee挅鱇駟", '1' - AndroidCharacter.getMirror('0'))).intern();
            int i11 = f2192 + 113;
            f2190 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 63 / 0;
            }
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = f2190 + 73;
            f2192 = i10 % 128;
            if (i10 % 2 != 0) {
                return TTAdSdk.class;
            }
            int i11 = 82 / 0;
            return TTAdSdk.class;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6503(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2308) {
                try {
                    char[] cArrM6531 = h.m6531(f2191, cArr, i10);
                    h.f2309 = 4;
                    while (true) {
                        int i11 = h.f2309;
                        if (i11 < cArrM6531.length) {
                            h.f2307 = i11 - 4;
                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2191));
                            h.f2309++;
                        } else {
                            str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bk bkVar = new bk(mo6489());
        f2186 = (f2184 + 49) % 128;
        return bkVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2184 = (f2186 + 13) % 128;
        String strIntern = m6501(new int[]{0, 9, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false).intern();
        f2184 = (f2186 + 53) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6501(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2185, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
