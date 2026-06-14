package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class Cdo {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1819 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f1820 = null;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1821 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1822 = 1014900057;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1823 = -1249277938;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1824 = 117;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f1825 = {-45, -43, -29, -93, -91, -45, -98, -79, -99, -93, -122, -88, -120, -5, -23, -30, -8, -32, -6, -30, -2, -17, Ascii.SYN, -6, 17, Ascii.FF, 44, -40, Ascii.ESC, 5, -4, 70, 42, 57, 72, 87, 13, 53, 75, 53, 76, 45, 54, 39, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1826;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f1827;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> f1828;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1829;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityAdType f1830;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1831;

    public Cdo(JSONObject jSONObject) {
        this.f1830 = ISAdQualityAdType.UNKNOWN;
        this.f1831 = dz.m6421(jSONObject.optString(m6311(1249277938 - (Process.myTid() >> 22), (short) ((Process.myPid() >> 22) + 34), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1014899941, (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getTouchSlop() >> 8) - 113).intern()));
        String strM6421 = dz.m6421(jSONObject.optString(m6311((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1249277941, (short) (TextUtils.getTrimmedLength("") + 82), (-1014899960) - View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getTrimmedLength("") - 111).intern()));
        if (!TextUtils.isEmpty(strM6421)) {
            this.f1830 = ISAdQualityAdType.fromInt(Integer.parseInt(strM6421));
        }
        this.f1827 = jSONObject.optJSONObject(m6311(1249277946 - KeyEvent.normalizeMetaState(0), (short) (106 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) - 1014899945, (byte) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 112).intern());
        this.f1828 = jz.m7089(jSONObject, m6311(Color.blue(0) + 1249277951, (short) (19 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1014899961, (byte) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED).intern(), new ArrayList());
        this.f1829 = dz.m6421(jSONObject.optString(m6311((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1249277960, (short) (Gravity.getAbsoluteGravity(0, 0) - 9), KeyEvent.normalizeMetaState(0) - 1014899939, (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-107) - Color.green(0)).intern()));
        this.f1826 = dz.m6421(jSONObject.optString(m6311((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1249277968, (short) ((-57) - View.combineMeasuredStates(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 1014899938, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getTrimmedLength("") + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern()));
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m6312() {
        int i10 = f1819 + 37;
        f1821 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1826;
        }
        int i11 = 62 / 0;
        return this.f1826;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m6313() {
        JSONObject jSONObject;
        int i10 = f1819;
        int i11 = i10 + 117;
        f1821 = i11 % 128;
        if (i11 % 2 != 0) {
            jSONObject = this.f1827;
            int i12 = 2 / 0;
        } else {
            jSONObject = this.f1827;
        }
        f1821 = (i10 + 69) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6314() {
        int i10 = (f1821 + 67) % 128;
        f1819 = i10;
        String str = this.f1829;
        f1821 = (i10 + 111) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ISAdQualityAdType m6315() {
        int i10 = f1821;
        ISAdQualityAdType iSAdQualityAdType = this.f1830;
        f1819 = (i10 + 87) % 128;
        return iSAdQualityAdType;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m6316() {
        int i10 = f1819 + 99;
        int i11 = i10 % 128;
        f1821 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1828;
        int i12 = i11 + 109;
        f1819 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 70 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6317() {
        int i10 = f1821 + 5;
        f1819 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1831;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6311(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1824;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1825;
                    i14 = bArr != null ? (byte) (bArr[f1823 + i10] + i13) : (short) (f1820[f1823 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1823 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1822);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1825;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1820;
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
