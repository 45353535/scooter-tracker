package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class hh extends hb<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2336 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2337 = {'O', 'n', 'T', 'o', 'u', 'c', 'h', 'L', 'i', 's', 't', 'e', 'r', 'D', 'a', 'E', ' ', 'm', 'b', 'P', 'Q', 'R', 'S', 'U', 'V'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2338 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2339 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private c f2340;

    public interface c {
        /* JADX INFO: renamed from: ｋ */
        boolean mo6121(hh hhVar, View view, MotionEvent motionEvent);
    }

    public hh(View.OnTouchListener onTouchListener, c cVar) {
        super(onTouchListener);
        this.f2340 = cVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6537(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2337;
                char c10 = f2336;
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

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f2340.mo6121(this, view, motionEvent);
        } catch (Throwable th2) {
            kd.m7160(m6537("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0006\u0010\r\u000e\n\u0006\u0002\r\n\u000b\u0002\r", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (byte) (Color.rgb(0, 0, 0) + 16777314)).intern(), m6537("\u0011\n\r\u0002\u000b\u0011\u0006\u0003\u0011\u0012\u0003\u0011\b\t\u0005\u000e\u0010\u0006\f\r\u0012\u0001\u0002\u0003\u0004\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 28, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 83)).intern(), th2, false);
        }
        if (mo5030() != null) {
            f2338 = (f2339 + 103) % 128;
            return mo5030().onTouch(view, motionEvent);
        }
        f2338 = (f2339 + 35) % 128;
        return false;
    }
}
