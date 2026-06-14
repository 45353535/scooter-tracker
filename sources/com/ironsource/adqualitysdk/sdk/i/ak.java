package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class ak {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f319 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f320 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f321 = {'g', 'e', 't', 'I', 'n', 's', 'a', 'c', 'r', 'i', 'R', 'v', 'u', 'd', 'o', 'x', '.', 'l', 'b', 'm', 'L', 'B', 'M', 'h', 'j'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f322 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m4717(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        f319 = (f322 + 59) % 128;
        try {
            kb.m7131(obj, m4716("\u0006\u0003\u0004\u0005\u0007\u0000\u0003\u0006\u000b\u0000\u0006\u0002\u0006\u000e\u0003\u0006", 16 - TextUtils.getOffsetAfter("", 0), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1)).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            f319 = (f322 + 95) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m4718(Context context) {
        f322 = (f319 + 117) % 128;
        try {
            return kb.m7131(m4715(), m4716("\u0001\u0002\u0003\u0004\u0000\t\u0001\u0007\u0002\tÃ", 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (94 - Gravity.getAbsoluteGravity(0, 0))).intern(), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            int i10 = f319 + 117;
            f322 = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m4719(Object obj, BroadcastReceiver broadcastReceiver) {
        f319 = (f322 + 13) % 128;
        try {
            kb.m7131(obj, m4716("\u000e\u0002\u0006\u0003\u0004\u0005\u0007\u0000\u0003\u0006\u000b\u0000\u0006\u0002\u0006\u000e\u0003\u0006", (ViewConfiguration.getScrollBarSize() >> 8) + 18, (byte) (124 - View.MeasureSpec.getSize(0))).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i10 = f322 + 77;
            f319 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Class m4715() {
        f322 = (f319 + 91) % 128;
        Class clsM7136 = kb.m7136(m4716("\t\u0001\u0012\r\u0013\u000e\n\u0012\u0011\u0012\f\t\u0007\u0010\u0017\r\u000b\t\f\b\u0007\u0006\u0004\u0011\t\u0001\u0005\u0001\u0003\u0006\u0011\u0006\u0013\t\u0003\u0002\u0000\u0003\u000f\u0015\f\t\u0007\u0010\u0017\u0006\u000b\t\f\b\u0007\u0006\u0007\u0002\t\u0001\u0005\u0001\u0003\u0006", TextUtils.indexOf("", "", 0, 0) + 60, (byte) (Color.rgb(0, 0, 0) + 16777286)).intern(), false);
        int i10 = f322 + 93;
        f319 = i10 % 128;
        if (i10 % 2 == 0) {
            return clsM7136;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4716(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f321;
                char c10 = f320;
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
