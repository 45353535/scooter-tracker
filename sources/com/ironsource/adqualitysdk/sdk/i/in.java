package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class in {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2600 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2601 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2602 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2603;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2604;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, Integer> f2605;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2606;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Integer> f2607;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Object> f2608;

    static {
        m6800();
        f2608 = new HashMap();
        f2605 = new HashMap();
        f2607 = new HashMap();
        f2601 = (f2602 + 87) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6798(Context context, String str, JSONObject jSONObject, Object... objArr) {
        ij.m6785(context).m6790(new Intent(str).putExtra(ih.f2519, jSONObject.toString()));
        int i10 = f2602 + 107;
        f2601 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6799(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2600)) ^ ((c11 >>> 5) + f2603)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2604) ^ ((c12 + i12) ^ ((c12 << 4) + f2606))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static void m6800() {
        f2600 = (char) 49744;
        f2604 = (char) 42214;
        f2603 = (char) 16025;
        f2606 = (char) 21861;
    }
}
