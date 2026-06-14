package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.ar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ap extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f376 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f377 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f378 = -634914241;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f379;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f380;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4762(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f376) ^ ((long) f378)) ^ ((long) f380));
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r0.opt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ap.f379 = (com.ironsource.adqualitysdk.sdk.i.ap.f377 + 101) % 128;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m4763(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ap.f377
            int r0 = r0 + 53
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ap.f379 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            org.json.JSONObject r0 = r2.m4765()
            r1 = 49
            int r1 = r1 / 0
            if (r0 != 0) goto L27
            goto L1d
        L17:
            org.json.JSONObject r0 = r2.m4765()
            if (r0 != 0) goto L27
        L1d:
            int r3 = com.ironsource.adqualitysdk.sdk.i.ap.f377
            int r3 = r3 + 101
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ap.f379 = r3
            r3 = 0
            return r3
        L27:
            java.lang.Object r3 = r0.opt(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ap.m4763(java.lang.String):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4764() {
        f377 = (f379 + 109) % 128;
        String strOptString = m4805().optString(m4762("䀆횊ꊹ", (char) (42876 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", 1321286499 - Color.green(0), "揷섻籎Ꭷ").intern());
        int i10 = f377 + 79;
        f379 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m4765() {
        f377 = (f379 + 77) % 128;
        JSONObject jSONObjectOptJSONObject = m4805().optJSONObject(m4762("佾㒫䀜妦赇곜", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47601), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMinimumFlingVelocity() >> 16, "嚙寉\uf1b8Ჹ").intern());
        int i10 = f379 + 41;
        f377 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
        }
        return jSONObjectOptJSONObject;
    }
}
