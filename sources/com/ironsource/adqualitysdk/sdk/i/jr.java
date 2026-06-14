package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2900 = {'f', 's', 'a', 'u', 't', 'i', 'd', 'p', 'A', 'Q', 'l', 'y', 'S', 'D', 'K', 'E', 'v', 'e', 'n', 'G', 'r', 'o', ' ', 'g', IOUtils.DIR_SEPARATOR_UNIX, 'm', 'j', 'h', 'k', 'q', 'w', 'x', 'z', '{', '|', '}'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2901 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2902 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2903 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m7004(String str, at atVar, boolean z10, ao aoVar) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put(m7003("\u0001\u0002", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, (byte) (115 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern(), true);
            } catch (JSONException e10) {
                k.m7118(m7003("\t\u0007\u000f\t\u0004\b\u0000\u0005\u0006\u0011\u000e\u000f\u0010\u0011\f\u0017\u0001\u0016\f\u0017\u000e\u0017\u0003\u0005\u0016\u0015", 26 - Color.alpha(0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40)).intern(), m7003("\u000e\u0015\u0015\u0016\u0015\u0017\u0000\b\u000b\u0000\u0013\u0012\u0012\u0004\u0002\u0017\u0002\u0005\u0017\u0004\u0013\u0000\u0005\u0003ÃÃ\u001c\u0006\u0003\u0002\n\u001c\u0001\t\b\u0000\u0005\u0010\u001c\n\u0001\u001d\u0010\u0017\u0003\u0016\u0014\u001c\u0003\u0013Å", MotionEvent.axisFromString("") + 52, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 87)).intern(), e10);
            }
        }
        if (aoVar.m4747()) {
            f2901 = (f2903 + 61) % 128;
            jSONObject.put(m7003("\u0003\u0004\u0005\u0000â", Color.argb(0, 0, 0, 0) + 5, (byte) (125 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), true);
        }
        jSONObject.put(m7003("\t\u0001\u0000\u000b", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, (byte) (84 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern(), str);
        jz.m7083(jSONObject, atVar.m4913());
        jz.m7083(jSONObject, atVar.m4919());
        f2901 = (f2903 + 99) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7003(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2900;
                char c10 = f2902;
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
