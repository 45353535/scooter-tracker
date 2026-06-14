package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class fc extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2055 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2056 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2057 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2058 = 44270;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2059;

    public fc(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6469(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2059) ^ ((long) f2057)) ^ ((long) f2058));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        int i10 = f2055 + 83;
        f2056 = i10 % 128;
        return (i10 % 2 == 0 ? m6469("ꐀ", (char) (40518 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", (-1579825729) - TextUtils.lastIndexOf("", 'J'), "븅헅䚡톞") : m6469("ꐀ", (char) (40518 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') - 1579825729, "븅헅䚡톞")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo6456(Number number, Number number2) {
        int i10 = (f2056 + 107) % 128;
        f2055 = i10;
        if (!(number instanceof Double)) {
            f2056 = (i10 + 21) % 128;
            if (!(number2 instanceof Double)) {
                return ((number instanceof Long) || (number2 instanceof Long)) ? Long.valueOf(number.longValue() * number2.longValue()) : Integer.valueOf(number.intValue() * number2.intValue());
            }
        }
        return Double.valueOf(number.doubleValue() * number2.doubleValue());
    }
}
