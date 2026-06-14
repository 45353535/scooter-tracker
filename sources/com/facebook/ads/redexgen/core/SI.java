package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SI {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, Ascii.ETB, Ascii.EM, Ascii.RS, Ascii.ESC, -42, Ascii.SUB, 37, 45, 36, 34, 37, Ascii.ETB, Ascii.SUB, -42, Ascii.FS, Ascii.ETB, Ascii.US, 34, 43, 40, Ascii.ESC, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, Ascii.SYN, 17, Ascii.NAK, 36, Ascii.ETB, 19, 38, Ascii.ESC, 40, Ascii.ETB, 17, 37, Ascii.ESC, 44, Ascii.ETB, 17, Ascii.DC4, 43, 38, Ascii.ETB, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, Ascii.GS, 32, Ascii.ESC, 34, 43, 46, 41, Ascii.GS, 48, Ascii.ESC, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, Ascii.RS, Ascii.FS, Ascii.RS, 35, 32, Utf8.REPLACEMENT_BYTE, 61, Utf8.REPLACEMENT_BYTE, 68, 65, 59, Utf8.REPLACEMENT_BYTE, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, Ascii.ETB, Ascii.ESC, Ascii.SI, Ascii.NAK, 19, Ascii.FS, Ascii.US, 17, Ascii.DC4, Ascii.SI, 36, Ascii.EM, Ascii.GS, Ascii.NAK, 70, 67, 61};
    }

    static {
        A01();
        A09 = SI.class.getSimpleName();
        A05 = AbstractC2433Sv.A0o;
        A06 = AbstractC2433Sv.A0s;
        A02 = AbstractC2433Sv.A0l;
        A01 = AbstractC2433Sv.A0k;
        A03 = AbstractC2433Sv.A0m;
        A00 = AbstractC2433Sv.A0i;
        A04 = AbstractC2433Sv.A0n;
        A07 = AbstractC2433Sv.A0t;
    }

    public static void A02(SQ sq, S8 s82, int i10, String str, long j10) {
        if (!A06(sq)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), s82.A01);
            jSONObject.put(A00(134, 13, 46), s82.A02);
            if (j10 > 0) {
                jSONObject.put(A00(191, 9, 73), XG.A07(System.currentTimeMillis() - j10));
            }
            C2434Sw c2434Sw = new C2434Sw(str);
            c2434Sw.A07(jSONObject);
            c2434Sw.A05(1);
            sq.A08().AAz(A00(154, 5, 84), i10, c2434Sw);
        } catch (Throwable deLogException) {
            sq.A08().A4A(deLogException);
        }
    }

    public static void A03(SQ sq, SD sd2, String str, int i10, String str2, Long l10, Long l11) {
        if (A06(sq)) {
            A05(sq, sd2.A06, sd2.A07, sd2.A08, A00(186, 5, 71), str, i10, str2, l10, l11, null);
        }
    }

    public static void A04(SQ sq, SH sh2, boolean z10) {
        if (!A06(sq)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), sh2.A01);
            jSONObject.put(A00(134, 13, 46), sh2.A03);
            jSONObject.put(A00(104, 16, 23), sh2.A02);
            jSONObject.put(A00(159, 13, 117), sh2.A00);
            if (U7.A2M(sq)) {
                jSONObject.put(A00(200, 3, 106), sh2.A04);
            }
            String strA00 = z10 ? A00(61, 10, 6) : A00(71, 11, 23);
            int i10 = z10 ? A05 : A06;
            C2434Sw c2434Sw = new C2434Sw(strA00);
            c2434Sw.A07(jSONObject);
            c2434Sw.A05(1);
            sq.A08().AAz(A00(154, 5, 84), i10, c2434Sw);
        } catch (Throwable th2) {
            sq.A08().A4A(th2);
        }
    }

    public static void A05(SQ sq, String str, String str2, String str3, String str4, String str5, int i10, String str6, Long l10, Long l11, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l10 != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l10));
            }
            if (l11 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l11));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (U7.A2M(sq)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String strA00 = A00(19, 19, 14);
            if (i10 == A03) {
                strA00 = A00(38, 23, 79);
            } else if (i10 == A01) {
                strA00 = A00(0, 19, 39);
            }
            C2434Sw c2434Sw = new C2434Sw(strA00);
            c2434Sw.A07(jSONObject);
            c2434Sw.A05(1);
            sq.A08().AAz(A00(154, 5, 84), i10, c2434Sw);
        } catch (Throwable th2) {
            sq.A08().A4A(th2);
        }
    }

    public static boolean A06(SQ sq) {
        int iA06;
        if (sq.A05().AAF()) {
            iA06 = 1;
        } else {
            iA06 = U9.A06(sq);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || sq.A09().A00() <= 1.0d / ((double) iA06);
    }
}
