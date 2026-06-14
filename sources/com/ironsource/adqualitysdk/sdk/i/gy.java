package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.network.VungleApiClient;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gy extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2278 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2279 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2280 = {-8985427, -1559085221, -531917094, 1944577923, -1166147287, 1301719090, -637277444, -972790288, -832508165, 1998381331, 1982553413, 770973026, -639769929, 1215005747, 58563681, 805664756, -138552365, 1514827584};

    public static class a extends gy {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2281 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2282 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2283 = {46, 59, 8, 7, 91, -22, Ascii.VT, 85, -24, Ascii.VT, 47, Ascii.VT, Ascii.VT, 37, 92, -15, Ascii.VT, 49, Ascii.FF, 49, 53, -3, 116, -14, 57, 1, 8, 55, 3, 46, 47, 73, -55, 53, 49, 65, -5, Ascii.VT, 47, Ascii.VT, Ascii.VT, 5, 124, -13, 6, 56, 0};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static short[] f2284 = null;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2285 = 15;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2286 = 1852227107;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2287 = 241576904;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6486() {
            ck ckVar = new ck(mo6489());
            f2282 = (f2281 + 57) % 128;
            return ckVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            f2282 = (f2281 + 5) % 128;
            String strIntern = m6526((ViewConfiguration.getTapTimeout() >> 16) - 1852227107, (short) ((-29) - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.getOffsetAfter("", 0) - 241576805, (byte) (22 - ExpandableListView.getPackedPositionChild(0L)), 32 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
            f2281 = (f2282 + 113) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = f2282 + 67;
            int i11 = i10 % 128;
            f2281 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            f2282 = (i11 + 113) % 128;
            return VungleApiClient.class;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m6526(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3017) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2285;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2283;
                        i14 = bArr != null ? (byte) (bArr[f2286 + i10] + i13) : (short) (f2284[f2286 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3018 = ((i10 + i14) - 2) + f2286 + i15;
                        o.f3019 = b10;
                        char c10 = (char) (i11 + f2287);
                        o.f3021 = c10;
                        sb2.append(c10);
                        o.f3020 = o.f3021;
                        o.f3022 = 1;
                        while (o.f3022 < i14) {
                            byte[] bArr2 = f2283;
                            if (bArr2 != null) {
                                int i16 = o.f3018;
                                o.f3018 = i16 - 1;
                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                            } else {
                                short[] sArr = f2284;
                                int i17 = o.f3018;
                                o.f3018 = i17 - 1;
                                o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                            }
                            sb2.append(o.f3021);
                            o.f3020 = o.f3021;
                            o.f3022++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }
    }

    public static class e extends gy {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2288 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean f2289 = true;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static boolean f2290 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2291 = {360, 372, 370, 307, 379, 378, 371, 364, 369, 362, 380, 358, 375, 347, 326, 373, 366, 328, 377};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2292 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2293 = 261;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m6527(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f2291;
                    int i11 = f2293;
                    if (f2289) {
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
                    if (f2290) {
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

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6486() {
            cd cdVar = new cd(m6527(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u008a\u0089\u0088\u0087\u0086\u0085").intern());
            int i10 = f2288 + 75;
            f2292 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 84 / 0;
            }
            return cdVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            int i10 = f2292 + 55;
            f2288 = i10 % 128;
            return m6527(null, i10 % 2 == 0 ? ExpandableListView.getPackedPositionChild(0L) * 2505 : ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u0093\u0087\u008a\u0091\u0089\u0092\u0091\u0090\u008f\u008a\u0089\u0088\u0087\u0086\u008e\u0084\u0087\u008a\u008d\u008d\u008c\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = (f2288 + 77) % 128;
            f2292 = i10;
            f2288 = (i10 + 61) % 128;
            return com.vungle.warren.VungleApiClient.class;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6525(int[] iArr, int i10) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2280.clone();
                com.ironsource.adqualitysdk.sdk.i.e.f1937 = 0;
                while (true) {
                    int i11 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        com.ironsource.adqualitysdk.sdk.i.e.f1939 = (c10 << 16) + c11;
                        com.ironsource.adqualitysdk.sdk.i.e.f1938 = (c12 << 16) + c13;
                        com.ironsource.adqualitysdk.sdk.i.e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = com.ironsource.adqualitysdk.sdk.i.e.f1939 ^ iArr2[i13];
                            com.ironsource.adqualitysdk.sdk.i.e.f1939 = i14;
                            com.ironsource.adqualitysdk.sdk.i.e.f1938 = com.ironsource.adqualitysdk.sdk.i.e.m6422(i14) ^ com.ironsource.adqualitysdk.sdk.i.e.f1938;
                            int i15 = com.ironsource.adqualitysdk.sdk.i.e.f1939;
                            com.ironsource.adqualitysdk.sdk.i.e.f1939 = com.ironsource.adqualitysdk.sdk.i.e.f1938;
                            com.ironsource.adqualitysdk.sdk.i.e.f1938 = i15;
                        }
                        int i16 = com.ironsource.adqualitysdk.sdk.i.e.f1939;
                        com.ironsource.adqualitysdk.sdk.i.e.f1939 = com.ironsource.adqualitysdk.sdk.i.e.f1938;
                        com.ironsource.adqualitysdk.sdk.i.e.f1938 = i16;
                        com.ironsource.adqualitysdk.sdk.i.e.f1938 = i16 ^ iArr2[16];
                        com.ironsource.adqualitysdk.sdk.i.e.f1939 ^= iArr2[17];
                        int i17 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                        int i18 = com.ironsource.adqualitysdk.sdk.i.e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = com.ironsource.adqualitysdk.sdk.i.e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        com.ironsource.adqualitysdk.sdk.i.e.m6423(iArr2);
                        int i20 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        com.ironsource.adqualitysdk.sdk.i.e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2278 = (f2279 + 45) % 128;
        String strIntern = m6525(new int[]{-1817536935, -1200560156, -399695104, -2038985592}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5).intern();
        int i10 = f2278 + 123;
        f2279 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }
}
