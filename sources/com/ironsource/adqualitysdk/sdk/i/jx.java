package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.View;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class jx {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2943 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2944 = 7;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2945;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2946 = {'A', 'd', 'Q', 'u', 'a', 'l', 'i', 't', 'y', 'U', 's', 'E', 'r', 'o', ' ', 'e', 'x', 'c', 'n', 'g', 'k', 'S', IOUtils.DIR_SEPARATOR_UNIX, 'C', 'B', 'P', 'K', '5', 'W', 'I', 'T', 'H', 'M', 'D', 'N', '2', '6', '-', 'O', 'L', 'F', '8', 'p', 'G', 'J', 'R', 'V', 'X', 'Y'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m7065(String str) {
        int length;
        int i10;
        int i11 = f2943 + 111;
        f2945 = i11 % 128;
        int i12 = 0;
        if (i11 % 2 != 0) {
            length = str.length();
            i10 = length % 2;
        } else {
            length = str.length();
            i10 = length / 2;
        }
        byte[] bArr = new byte[i10];
        while (i12 < length) {
            int i13 = f2943 + 115;
            f2945 = i13 % 128;
            if (i13 % 2 != 0) {
                bArr[i12 >> 3] = (byte) ((Character.digit(str.charAt(i12), 37) % 2) / Character.digit(str.charAt(i12 >> 1), 126));
                i12 += 75;
            } else {
                bArr[i12 / 2] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
                i12 += 2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static long m7066() {
        int i10 = f2943 + 91;
        f2945 = i10 % 128;
        if (i10 % 2 != 0) {
            SystemClock.elapsedRealtime();
            throw null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = f2943 + 79;
        f2945 = i11 % 128;
        if (i11 % 2 == 0) {
            return jElapsedRealtime;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012d A[Catch: all -> 0x017f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x017f, blocks: (B:16:0x00e5, B:26:0x012d), top: B:59:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m7067(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jx.m7067(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7070(ir irVar) {
        f2945 = (f2943 + 101) % 128;
        try {
            Executors.newSingleThreadExecutor().execute(irVar);
            f2943 = (f2945 + 97) % 128;
        } catch (Throwable th2) {
            kd.m7160(m7069("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\r\u0000\u0003\f", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, (byte) (110 - View.resolveSizeAndState(0, 0, 0))).intern(), m7069("\f\r\r\u0007\u0007\u0013\u0010\u0011\u0010\u0012\u0000\n\u0004\u0014\u0014\u000f\u0003\u000b\u000b\u000f\u0012\u000f\u000b\u0000\r\u0011", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, (byte) (23 - Color.blue(0))).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m7071(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            int i10 = f2943 + 51;
            f2945 = i10 % 128;
            if (i10 % 2 != 0) {
                hashSet.addAll(list2);
                throw null;
            }
            hashSet.addAll(list2);
            f2945 = (f2943 + 67) % 128;
        }
        return new ArrayList(hashSet);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static long m7068() {
        int i10 = f2943 + 111;
        f2945 = i10 % 128;
        if (i10 % 2 != 0) {
            Calendar.getInstance().getTimeInMillis();
            throw null;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f2945 = (f2943 + 101) % 128;
        return timeInMillis;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7069(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2946;
                char c10 = f2944;
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
}
