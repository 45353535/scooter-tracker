package com.facebook.ads.redexgen.core;

import android.text.SpannableStringBuilder;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2194Jm {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2192Jk A00(C2192Jk c2192Jk, Map<String, C2199Jr> map) {
        while (c2192Jk != null) {
            C2199Jr c2199JrA02 = A02(c2192Jk.A04, c2192Jk.A0H(), map);
            if (c2199JrA02 != null && c2199JrA02.A09() == 1) {
                return c2192Jk;
            }
            c2192Jk = c2192Jk.A03;
        }
        return null;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, SignedBytes.MAX_POWER_OF_TWO, 88, 86, 93, 93, 86, 91, 84, 13, 95, 98, 79, 102, 65, 82, 101, 97, 13, 91, 92, 81, 82, 13, 100, 86, 97, 85, 92, 98, 97, 13, 82, 101, 78, 80, 97, 89, 102, 13, 92, 91, 82, 13, 97, 82, 101, 97, 13, 80, 85, 86, 89, 81, Ascii.ESC, -10, Ascii.SYN, Ascii.SI, Ascii.SO, -12, 7, Ascii.DLE, 6, 7, Ascii.DC4, -9, Ascii.SYN, Ascii.VT, Ascii.SO, 73, Ascii.SO, -9, 74, 102, Ascii.RS, 48, -6, -5, 75, Ascii.EM};
    }

    static {
        A05();
    }

    public static C2192Jk A01(C2192Jk c2192Jk, Map<String, C2199Jr> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c2192Jk);
        while (!arrayDeque.isEmpty()) {
            C2192Jk c2192Jk2 = (C2192Jk) arrayDeque.pop();
            C2199Jr c2199Jr = c2192Jk2.A04;
            String[] strArrA0H = c2192Jk2.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            C2199Jr c2199JrA02 = A02(c2199Jr, strArrA0H, map);
            if (c2199JrA02 != null && c2199JrA02.A09() == 3) {
                return c2192Jk2;
            }
            for (int iA0C = c2192Jk2.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(c2192Jk2.A0D(iA0C));
            }
        }
        return null;
    }

    public static C2199Jr A02(C2199Jr c2199Jr, String[] strArr, Map<String, C2199Jr> map) {
        int i10 = 0;
        if (c2199Jr == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C2199Jr c2199Jr2 = new C2199Jr();
                int length = strArr.length;
                while (i10 < length) {
                    c2199Jr2.A0O(map.get(strArr[i10]));
                    i10++;
                }
                return c2199Jr2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return c2199Jr.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i10 < length3) {
                        C2199Jr c2199Jr3 = map.get(strArr[i10]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        c2199Jr.A0O(c2199Jr3);
                        i10++;
                    }
                    return c2199Jr;
                }
            }
        }
        return c2199Jr;
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 53);
        String strA032 = A03(0, 1, 14);
        String strReplaceAll = str.replaceAll(strA03, strA032);
        String out = A03(4, 5, 69);
        String strReplaceAll2 = strReplaceAll.replaceAll(out, strA032);
        String strA033 = A03(3, 1, 6);
        String strReplaceAll3 = strReplaceAll2.replaceAll(strA032, strA033);
        String out2 = A03(77, 11, 123);
        return strReplaceAll3.replaceAll(out2, strA033);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(android.text.Spannable r8, int r9, int r10, com.facebook.ads.redexgen.core.C2199Jr r11, com.facebook.ads.redexgen.core.C2192Jk r12, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C2199Jr> r13, int r14) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2194Jm.A06(android.text.Spannable, int, int, com.facebook.ads.redexgen.X.Jr, com.facebook.ads.redexgen.X.Jk, java.util.Map, int):void");
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
