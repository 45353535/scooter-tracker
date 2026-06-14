package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes10.dex */
public final class gc extends gl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2167 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2168 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2169 = {5, Ascii.VT, -3, Ascii.VT, -20, 36, -19, 35, -36, 2, -15, -3, 6, Ascii.FS, -27, -1, -3, 41, Ascii.ESC, -61, 7, -15, 69, -61, 7, -15, -6, 5, Ascii.VT, -3, Ascii.VT, -20, 4, 13, 3, 51, -55, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, -63, -2, Ascii.FF, 9, 6, -1, -13, 17, -7, -11, 2, 13, 3, 0, 0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2170 = 44;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2171 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2172 = -1709537723;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2173 = 1006258830;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6498(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2170;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2169;
                    i14 = bArr != null ? (byte) (bArr[f2173 + i10] + i13) : (short) (f2171[f2173 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f2173 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f2172);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f2169;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f2171;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bg bgVar = new bg(mo6489());
        f2168 = (f2167 + 7) % 128;
        return bgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2168 + 121;
        f2167 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m6498(Drawable.resolveOpacity(1, 1) - 1006258830, (short) View.resolveSize(1, 1), Gravity.getAbsoluteGravity(1, 0) * 1709537822, (byte) TextUtils.getTrimmedLength(""), 7 >>> ((Process.getThreadPriority(1) * 85) / 66)) : m6498((-1006258830) - Drawable.resolveOpacity(0, 0), (short) View.resolveSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 1709537822, (byte) TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 7)).intern();
        int i11 = f2167 + 99;
        f2168 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        f2167 = (f2168 + 83) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2167 + 17;
        f2168 = i10 % 128;
        int i11 = i10 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return (i11 == 0 ? m6498((jElapsedRealtime > 1L ? 1 : (jElapsedRealtime == 1L ? 0 : -1)) * (-1006258779), (short) (ViewConfiguration.getJumpTapTimeout() + 58), 1709537819 << (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionType(1L), Color.alpha(0) * 118) : m6498((-1006258779) - (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1709537819, (byte) ExpandableListView.getPackedPositionType(0L), Color.alpha(0) - 33)).intern();
    }
}
