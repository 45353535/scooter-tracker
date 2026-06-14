package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.adqualitysdk.sdk.i.jz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class dn {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1804 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f1805 = null;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1806 = {75, -77, -67, 68, -24, -5, Ascii.SYN, 7, -8, -24, -8, Ascii.FF, 0, Ascii.SO, -8, 5, -11, UnsignedBytes.MAX_POWER_OF_TWO, 122, 116, -119, -3, 4, Ascii.VT, -19, 19, -15, Ascii.VT, -7, 10, -15, 6, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1807 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1808 = -728715457;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1809 = -1658449544;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1810 = 53;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, dl> f1811;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, ds> f1812;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1813;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<Cdo> f1814;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1815;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1816;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f1817;

    public dn(final String str, String str2, JSONObject jSONObject) {
        this.f1816 = dz.m6421(str2);
        this.f1815 = dz.m6421(jSONObject.optString(m6301((ViewConfiguration.getScrollBarSize() >> 8) + 1658449544, (short) ((-1) - Process.getGidForName("")), 728715572 - (KeyEvent.getMaxKeyCode() >> 16), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 69), (-47) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()));
        this.f1813 = jSONObject.optBoolean(m6301(1658449548 - Color.argb(0, 0, 0, 0), (short) Gravity.getAbsoluteGravity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 728715553, (byte) ((-7) - View.MeasureSpec.getSize(0)), Color.argb(0, 0, 0, 0) - 45).intern());
        this.f1817 = m6302(jz.m7093(jSONObject.optJSONArray(m6301(1658449554 - TextUtils.lastIndexOf("", '0', 0, 0), (short) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 728715565, (byte) (13 - TextUtils.getTrimmedLength("")), (-47) - MotionEvent.axisFromString("")).intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo4838(JSONArray jSONArray, int i10) {
                return dz.m6421(jSONArray.optString(i10));
            }
        }));
        this.f1814 = m6302(jz.m7093(jSONObject.optJSONArray(m6301(KeyEvent.keyCodeFromString("") + 1658449561, (short) (MotionEvent.axisFromString("") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 728715572, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 123), Color.red(0) - 48).intern()), new jz.b<Cdo>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ Cdo mo4838(JSONArray jSONArray, int i10) {
                return new Cdo(jSONArray.optJSONObject(i10));
            }
        }));
        this.f1811 = m6303(jz.m7085(jSONObject.optJSONObject(m6301((ViewConfiguration.getLongPressTimeout() >> 16) + 1658449565, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 728715559 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2), Drawable.resolveOpacity(0, 0) - 47).intern()), new jz.c<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ dl mo4837(JSONObject jSONObject2, String str3) {
                return new dl(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f1812 = m6303(jz.m7085(jSONObject.optJSONObject(m6301(1658449570 - (Process.myTid() >> 22), (short) View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 728715566, (byte) (TextUtils.indexOf((CharSequence) "", '0') - 1), (-46) - KeyEvent.normalizeMetaState(0)).intern()), new jz.c<ds>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ ds mo4837(JSONObject jSONObject2, String str3) {
                return new ds(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> List<T> m6302(List<T> list) {
        int i10 = f1804 + 41;
        int i11 = i10 % 128;
        f1807 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (list == null) {
            return new ArrayList();
        }
        f1804 = (i11 + 89) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Map<String, dl> m6304() {
        int i10 = f1804 + 7;
        f1807 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1811;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Cdo> m6305() {
        int i10 = (f1804 + 97) % 128;
        f1807 = i10;
        List<Cdo> list = this.f1814;
        f1804 = (i10 + 25) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6306() {
        int i10 = (f1807 + 107) % 128;
        f1804 = i10;
        boolean z10 = this.f1813;
        int i11 = i10 + 3;
        f1807 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Map<String, ds> m6307() {
        Map<String, ds> map;
        int i10 = f1807 + 111;
        int i11 = i10 % 128;
        f1804 = i11;
        if (i10 % 2 == 0) {
            map = this.f1812;
            int i12 = 99 / 0;
        } else {
            map = this.f1812;
        }
        f1807 = (i11 + 5) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6309() {
        int i10 = (f1807 + 7) % 128;
        f1804 = i10;
        String str = this.f1816;
        int i11 = i10 + 91;
        f1807 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 40 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m6310() {
        int i10 = f1807 + 9;
        f1804 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1817;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6301(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1810;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1806;
                    i14 = bArr != null ? (byte) (bArr[f1809 + i10] + i13) : (short) (f1805[f1809 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1809 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1808);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1806;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1805;
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <K, V> Map<K, V> m6303(Map<K, V> map) {
        int i10 = f1804;
        f1807 = (i10 + 79) % 128;
        if (map != null) {
            int i11 = i10 + 111;
            f1807 = i11 % 128;
            if (i11 % 2 == 0) {
                return map;
            }
            throw null;
        }
        HashMap map2 = new HashMap();
        int i12 = f1804 + 41;
        f1807 = i12 % 128;
        if (i12 % 2 == 0) {
            return map2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6308() {
        int i10 = f1804;
        String str = this.f1815;
        int i11 = i10 + 115;
        f1807 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
