package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.ViewConfiguration;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class aj {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f315 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f316 = {'a', 'd', 'q', '_', 'i', 'n', 't', 'b', 'l', 'o', 'c', 'e', 'f', 'g', 'h', 'j'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f317 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f318 = 4;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m4710(String str) {
        f317 = (f315 + 123) % 128;
        boolean zEquals = m4714("\u0001\u0002\u0003\u0000\u0005\u0006\u0005\u0007\u0007\u000b\t\nº", Drawable.resolveOpacity(0, 0) + 13, (byte) (87 - Process.getGidForName(""))).intern().equals(str);
        f317 = (f315 + 103) % 128;
        return zEquals;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m4711(String str, String str2) {
        if (kc.m7150(str, 64)) {
            f317 = (f315 + 79) % 128;
            if (kc.m7150(str2, 64)) {
                int i10 = f315 + 83;
                f317 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 33 / 0;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r2.size() < ((m4712(r2) ? 1 : 0) + 5)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2.containsKey(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2.containsKey(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.aj.f317 = (com.ironsource.adqualitysdk.sdk.i.aj.f315 + 123) % 128;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4713(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.aj.f317
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.aj.f315 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            boolean r3 = r2.containsKey(r3)
            r0 = 22
            int r0 = r0 / r1
            if (r3 == 0) goto L26
            goto L1d
        L17:
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L26
        L1d:
            int r2 = com.ironsource.adqualitysdk.sdk.i.aj.f315
            int r2 = r2 + 123
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.aj.f317 = r2
            return r1
        L26:
            int r3 = r2.size()
            boolean r2 = m4712(r2)
            r0 = 1
            int r2 = r2 + 5
            if (r3 < r2) goto L34
            return r0
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aj.m4713(java.util.Map, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4714(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f316;
                char c10 = f318;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m4712(Map<String, String> map) {
        f315 = (f317 + 19) % 128;
        boolean zContainsKey = map.containsKey(m4714("\u0001\u0002\u0003\u0000\u0005\u0006\u0005\u0007\u0007\u000b\t\nº", Color.rgb(0, 0, 0) + 16777229, (byte) (88 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
        int i10 = f317 + 33;
        f315 = i10 % 128;
        if (i10 % 2 != 0) {
            return zContainsKey;
        }
        throw null;
    }
}
