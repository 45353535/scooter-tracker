package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JX {
    public static byte[] A02;
    public static String[] A03 = {"HuWf33fpJVnWiQs5jgU1coBxnkVs6NRv", "s99wI42TXu9zb6TF", "znB4eml4mMdVjhFim0h8Ic", "vwm3UU3z6IIrXLlJTF572ZAqfrELMHnc", "3Hoi8QCDYq5dLz7zrQI8B3P9CeceMza0", "88mhCIZfB8fBAcvooczZpqGcVMp3sArj", "twULWMK01HtAAxLhlSW3WXsxhxQi2bS3", "0mJGu"};
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final Pattern A07;
    public final int A00;
    public final PointF A01;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{71, 124, 69, 86, 65, 65, 90, 87, 86, 19, 91, 82, SignedBytes.MAX_POWER_OF_TWO, 19, 81, 92, 71, 91, 19, 111, 67, 92, SignedBytes.MAX_POWER_OF_TWO, Ascii.ESC, 75, Ascii.US, 74, Ascii.SUB, 19, 82, 93, 87, 19, 111, 94, 92, 69, 86, Ascii.ESC, 75, 2, Ascii.US, 74, 2, Ascii.US, 75, 1, Ascii.US, 74, 1, Ascii.SUB, 8, 19, 70, SignedBytes.MAX_POWER_OF_TWO, 90, 93, 84, 19, 111, 67, 92, SignedBytes.MAX_POWER_OF_TWO, 19, 69, 82, 95, 70, 86, SignedBytes.MAX_POWER_OF_TWO, Ascii.GS, 19, 92, 69, 86, 65, 65, 90, 87, 86, Ascii.SO, Ascii.DC4, 45, 13, Ascii.US, 45, 10, 7, Ascii.DC2, Ascii.ESC, 80, 49, 8, Ascii.ESC, Ascii.FF, Ascii.FF, Ascii.ETB, Ascii.SUB, Ascii.ESC, 13, Ascii.FS, Ascii.FS, 33, 46, 104, Ascii.FS, 36, 107, 105, Ascii.SI, Ascii.SI, 62, 60, 37, 54, Ascii.SI, 123, 118, 98, 119, 32, Ascii.DEL, 118, 98, 119, 32, Ascii.DEL, 123, 118, 98, 119, 32, 122, Ascii.DEL, 123, 118, 98, 119, 32, 122, 123, 108, 105, Ascii.DEL, 118, 98, 119, 32, Ascii.DEL, 118, 98, 119, 32, 122, 108, Ascii.SI, 122, 65, 65, 109, 114, 110, 65, 53, 53, 56, 44, 57, 110, 52, 49, 53, 56, 44, 57, 110, 52, 65, 52, 56, Ascii.ETB, 78, 56, 0, 79, 76, 91, 94, 56, 74, 56, 0, 79, 77, 91, 56, Ascii.ETB, 78, 70, 97, 50, 65, 68, 103, 71, 48, 51, 70, 103};
    }

    static {
        A05();
        A05 = Pattern.compile(A03(198, 11, 23));
        String strA03 = A03(179, 19, 105);
        A07 = Pattern.compile(AbstractC18094a.A0n(A03(157, 22, 16), strA03));
        A06 = Pattern.compile(AbstractC18094a.A0n(A03(109, 48, 94), strA03));
        A04 = Pattern.compile(A03(100, 9, 77));
    }

    public JX(int i10, PointF pointF) {
        this.A00 = i10;
        this.A01 = pointF;
    }

    public static int A00(String str) {
        Matcher matcher = A04.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        if (A03[1].length() == 17) {
            throw new RuntimeException();
        }
        A03[2] = "vLvehkH4B3ak8JU9onbvIk";
        return C2182Ja.A01((String) C3M.A01(matcher.group(1)));
    }

    public static PointF A01(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = A07.matcher(str);
        Matcher matcher2 = A06.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AnonymousClass44.A06(A03(82, 18, 115), A03(1, 81, 62) + str + A03(0, 1, 109));
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else if (zFind2) {
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        } else {
            return null;
        }
        return new PointF(Float.parseFloat(((String) C3M.A01(strGroup)).trim()), Float.parseFloat(((String) C3M.A01(strGroup2)).trim()));
    }

    public static JX A02(String str) {
        int parsedAlignment = -1;
        PointF pointF = null;
        Matcher matcher = A05.matcher(str);
        while (true) {
            boolean zFind = matcher.find();
            if (A03[1].length() == 17) {
                break;
            }
            A03[2] = "4wlmcdEyXnPZaqMgrsXq3d";
            if (zFind) {
                String strGroup = matcher.group(1);
                if (A03[1].length() == 17) {
                    break;
                }
                A03[2] = "M6jPqZAMoTJlOEJJxCI750";
                String str2 = (String) C3M.A01(strGroup);
                try {
                    PointF position = A01(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA00 = A00(str2);
                    if (iA00 != -1) {
                        parsedAlignment = iA00;
                    }
                } catch (RuntimeException unused2) {
                }
            } else {
                return new JX(parsedAlignment, pointF);
            }
        }
        throw new RuntimeException();
    }

    public static String A04(String str) {
        return A05.matcher(str).replaceAll(A03(0, 0, 78));
    }
}
