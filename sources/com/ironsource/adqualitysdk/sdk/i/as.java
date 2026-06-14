package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.ar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class as extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f438 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f439 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f440 = {5, -1, -3, -2, 17, -2, -7, 7, 1, Ascii.SO, Ascii.VT, -8, 4, Ascii.SO, -6, -3, -1, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f441 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f442 = 80;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f443 = -1932141098783760248L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f444 = 1649618150;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f445 = -547976072;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f446 = (int) TimeUnit.SECONDS.toMillis(120);

    public as(ax axVar) {
        m4841("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        m4842(ExpandableListView.getPackedPositionChild(0L) + 547976073, (short) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getEdgeSlop() >> 16) - 1649618049, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Process.getGidForName("") - 70).intern();
        m4808(axVar);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m4843() {
        f438 = (f441 + 103) % 128;
        JSONObject jSONObjectOptJSONObject = m4805().optJSONObject(m4842((KeyEvent.getMaxKeyCode() >> 16) + 547976086, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.rgb(0, 0, 0) - 1632840817, (byte) (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 78).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(m4842(547976087 - TextUtils.indexOf((CharSequence) "", '0'), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1649618049, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 79).intern(), m4842(KeyEvent.normalizeMetaState(0) + 547976072, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1649618048, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 71).intern());
        }
        String strIntern = m4842((KeyEvent.getMaxKeyCode() >> 16) + 547976072, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1649618049, (byte) Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') - 'w').intern();
        f438 = (f441 + 115) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m4844() {
        f438 = (f441 + 39) % 128;
        JSONObject jSONObjectOptJSONObject = m4805().optJSONObject(m4842(TextUtils.getTrimmedLength("") + 547976086, (short) View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1649618034, (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-77) - KeyEvent.normalizeMetaState(0)).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(m4841("䙡㭔빜䘑璇", View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m4841("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", ExpandableListView.getPackedPositionGroup(0L)).intern());
        }
        String strIntern = m4841("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern();
        int i10 = f441 + 63;
        f438 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 68 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final long m4845() {
        JSONObject jSONObjectM4805;
        int iArgb;
        int i10 = f441 + 87;
        f438 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM4805 = m4805();
            iArgb = Color.argb(1, 0, 0, 1);
        } else {
            jSONObjectM4805 = m4805();
            iArgb = Color.argb(0, 0, 0, 0);
        }
        return jSONObjectM4805.optLong(m4841("祎\udfabퟰ礽噚罗隓", iArgb).intern(), 0L);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m4846() {
        f441 = (f438 + 15) % 128;
        long jOptLong = m4805().optLong(m4842((ViewConfiguration.getScrollBarSize() >> 8) + 547976088, (short) View.resolveSize(0, 0), (-1649618033) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79).intern(), 0L);
        f438 = (f441 + 93) % 128;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final long m4847() {
        f441 = (f438 + 115) % 128;
        long jOptLong = m4805().optLong(m4841("㵓\uead7宱㴧섺䨬", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern(), 0L);
        int i10 = f441 + 87;
        f438 = i10 % 128;
        if (i10 % 2 == 0) {
            return jOptLong;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m4848() {
        List<String> listM4953 = m4806().m4953();
        listM4953.addAll(jz.m7089(m4805(), m4841("ꝛ蠟鐍Ꜿꤾ姛핥", ViewConfiguration.getFadingEdgeLength() >> 16).intern(), new ArrayList()));
        f441 = (f438 + 33) % 128;
        return listM4953;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m4849() {
        JSONObject jSONObjectM4805;
        String strIntern;
        int i10;
        int i11 = f438 + 49;
        f441 = i11 % 128;
        if (i11 % 2 == 0) {
            jSONObjectM4805 = m4805();
            strIntern = m4841("訬向鍁詁ﶜ\uf4ef툢", TextUtils.getOffsetAfter("", 1)).intern();
            i10 = 28366;
        } else {
            jSONObjectM4805 = m4805();
            strIntern = m4841("訬向鍁詁ﶜ\uf4ef툢", TextUtils.getOffsetAfter("", 0)).intern();
            i10 = 9850;
        }
        return jSONObjectM4805.optInt(strIntern, i10);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m4850() {
        List<String> listM4961 = m4806().m4961();
        listM4961.addAll(jz.m7089(m4805(), m4842((ViewConfiguration.getPressedStateDuration() >> 16) + 547976084, (short) Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1649618049, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-77) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new ArrayList()));
        int i10 = f441 + 101;
        f438 = i10 % 128;
        if (i10 % 2 == 0) {
            return listM4961;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m4851() {
        f438 = (f441 + 27) % 128;
        int iOptInt = m4805().optInt(m4842(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 547976083, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.getCapsMode("", 0, 0) - 1649618041, (byte) KeyEvent.keyCodeFromString(""), (-77) - View.MeasureSpec.getMode(0)).intern(), 40);
        int i10 = f438 + 33;
        f441 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 85 / 0;
        }
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m4852() {
        f438 = (f441 + 103) % 128;
        int iOptInt = m4805().optInt(m4842((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 547976080, (short) ((-1) - MotionEvent.axisFromString("")), (-1649618050) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) - 77).intern(), this.f446);
        f441 = (f438 + 11) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4841(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f443, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f443));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4842(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f442;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f440;
                    i14 = bArr != null ? (byte) (bArr[f445 + i10] + i13) : (short) (f439[f445 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f445 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f444);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f440;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f439;
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
