package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.jc;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2218 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2219 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2220 = 15;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2221 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2222 = {-4, -68, 1, 3, -5, 17, -2, -9, 0, -1, Ascii.FF, -12, 2, -9};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2223 = 1028029097;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2224 = -1175308846;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6509(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2220;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2222;
                    i14 = bArr != null ? (byte) (bArr[f2224 + i10] + i13) : (short) (f2221[f2224 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f2224 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f2223);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f2222;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f2221;
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

    /* JADX INFO: renamed from: ﻐ */
    public abstract bd mo6486();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final jc.e m6510() {
        int i10 = f2219 + 19;
        f2218 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4771().mo4785().m4768();
            throw null;
        }
        if (!ar.m4771().mo4785().m4768()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6509(1175308846 - KeyEvent.normalizeMetaState(0), (short) View.resolveSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1028028998, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 16).intern());
            sb2.append(mo6489());
            return new jc.e(sb2.toString(), m6509((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1175308856, (short) View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1028029042, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-16) - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        }
        String strM4770 = ar.m4771().mo4785().m4770(mo6489());
        if (TextUtils.isEmpty(strM4770)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6509(1175308846 - KeyEvent.getDeadChar(0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (-1028028998) - Gravity.getAbsoluteGravity(0, 0), (byte) (AndroidCharacter.getMirror('0') - '0'), (-16) - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb3.append(mo6489());
        jc.c cVar = new jc.c(sb3.toString(), m6509((ViewConfiguration.getFadingEdgeLength() >> 16) + 1175308857, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1028029043) - ExpandableListView.getPackedPositionChild(0L), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-17) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), strM4770);
        f2219 = (f2218 + 93) % 128;
        return cVar;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract String mo6487();

    /* JADX INFO: renamed from: ﾇ */
    public abstract Class mo6488();

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo6489();
}
