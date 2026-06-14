package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bg extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f811 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f812 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f813 = 47;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f814 = {-126, 124, -115, -124, 118, -116, 0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f815 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f816 = -1813798625;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f817 = -374900078;

    public bg(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo5098() {
        f812 = (f811 + 37) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo5099() {
        f812 = (f811 + 17) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        f812 = (f811 + 107) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f812 = (f811 + 103) % 128;
        String strIntern = m5110(1813798625 - Color.argb(0, 0, 0, 0), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 124), 374900146 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) View.resolveSize(0, 0), (-40) - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i10 = f811 + 65;
        f812 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        int i10 = (f812 + 107) % 128;
        f811 = i10;
        f812 = (i10 + 75) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5110(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f813;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f814;
                    i14 = bArr != null ? (byte) (bArr[f816 + i10] + i13) : (short) (f815[f816 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f816 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f817);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f814;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f815;
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
