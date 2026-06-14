package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class co {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1400 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1401 = {351, 350, 344, 300, 315};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1402 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1403 = 268;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1404 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1405;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m5911(String str, String str2, Throwable th2) {
        int i10 = f1400 + 73;
        f1405 = i10 % 128;
        int i11 = i10 % 2;
        m5912(str, str2, th2);
        if (i11 != 0) {
            int i12 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5912(String str, String str2, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5913(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u0085\u0083\u0082\u0081").intern());
        sb2.append(str);
        kd.m7163(sb2.toString(), str2, Integer.toHexString(str2.hashCode()), th2, null, false);
        int i10 = f1400 + 79;
        f1405 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 68 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m5914(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5913(null, 127 - View.combineMeasuredStates(0, 0), null, "\u0084\u0083\u0082\u0081").intern());
        sb2.append(str);
        k.m7117(sb2.toString(), str2);
        f1400 = (f1405 + 19) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5913(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1401;
                int i11 = f1403;
                if (f1404) {
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
                if (f1402) {
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
}
