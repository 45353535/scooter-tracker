package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.ads.MobileAds;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.adqualitysdk.sdk.i.ay;

/* JADX INFO: loaded from: classes10.dex */
public final class fx extends gl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2135 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2136 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2137 = {61, 17, -18, -53, 49, 53, -63, Ascii.DLE, 45, -119, 61, 49, 1, -119, 52, 52, Ascii.VT, -8, -55, -56, -49, 60, -60, Utf8.REPLACEMENT_BYTE, 1, -5, -53, 55, -54, 50, 58, Ascii.VT, -13, -52, 62, 68, -75, 104, -106, -78, 75, -69, 76, SignedBytes.MAX_POWER_OF_TWO, 66, 101, -10, 66, 78, 126, -10, 75, 75, 116, -121, -74, -73, -80, 67, -69, SignedBytes.MAX_POWER_OF_TWO, 126, -124, -76, 72, -75, 77, 69, 116, -116, -77, 65, -11, 4, Ascii.SI, 5, 0, 0, 0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2138 = -551801176;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2139 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2140 = 117;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2141 = 112251052;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m6492() {
        int i10 = f2135 + 1;
        f2136 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Prode.m4529();
                throw null;
            }
            if (Prode.m4529()) {
                f2136 = (f2135 + 97) % 128;
                return true;
            }
            Class.forName(m6493(TextUtils.indexOf("", "") - 112251017, (short) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 551801275, (byte) ((Process.myPid() >> 22) + 77), (-79) - TextUtils.indexOf("", "")).intern());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        f2135 = (f2136 + 63) % 128;
        if (!m6492()) {
            return new ay(mo6489());
        }
        ay.e eVar = new ay.e(mo6489());
        f2136 = (f2135 + 87) % 128;
        return eVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2136 = (f2135 + 39) % 128;
        String strIntern = m6493((-112251052) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) TextUtils.indexOf("", "", 0, 0), 551801275 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (50 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.getDefaultSize(0, 0) - 81).intern();
        int i10 = f2135 + 43;
        f2136 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 33 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2135 + 81) % 128;
        f2136 = i10;
        int i11 = i10 + 23;
        f2135 = i11 % 128;
        if (i11 % 2 == 0) {
            return MobileAds.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2135 = (f2136 + 103) % 128;
        String strIntern = m6493((-112250980) - (Process.myPid() >> 22), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 551801272, (byte) (6 - Drawable.resolveOpacity(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 112).intern();
        f2135 = (f2136 + 121) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6493(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2140;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2137;
                    i14 = bArr != null ? (byte) (bArr[f2141 + i10] + i13) : (short) (f2139[f2141 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f2141 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f2138);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f2137;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f2139;
                            int i17 = o.f3018;
                            o.f3018 = i17 - 1;
                            o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                        }
                        sb2.append(o.f3021);
                        o.f3020 = o.f3021;
                        o.f3022++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
