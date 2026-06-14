package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.common.PlaybackException;
import com.ironsource.adqualitysdk.sdk.i.ce;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class gz extends gl {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2294 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2295 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2296 = 1396974205;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2297 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2298 = 122;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2299 = -184600376;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2300 = {-88, -22, -10, -34, -25, -12, -19, 6, -66, -11, -17, -33, 1, 19, -97, -22, -10, -34, -25, -12, -19, -26, 53, -82, 41, -98, -11, -17, -33, -31, 51, -71, -38, -20, -114, -50, -46, -87, -44, -54, -102, -104};

    public static class d extends gl {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2301 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2302 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2303 = 295;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f2304 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean f2305 = true;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2306 = {394, 406, 404, 341, 412, 405, 400, 411, 416, 346, 395, 410, 396, 409, 413, 392, 360, 380};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static boolean m6529() {
            boolean zM5090 = bc.m5090(new gz());
            int i10 = f2302 + 95;
            f2301 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 26 / 0;
            }
            return zM5090;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6486() {
            ce.d dVar = new ce.d(mo6489());
            int i10 = f2302 + 95;
            f2301 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 76 / 0;
            }
            return dVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            int i10 = f2302 + 83;
            f2301 = i10 % 128;
            if (i10 % 2 == 0) {
                m6529();
                throw null;
            }
            if (!m6529()) {
                return m6530(null, 127 - View.MeasureSpec.getMode(0), null, "\u0089\u0088\u0087\u008f\u0087\u0088\u0081\u0091\u0088\u0087\u0086\u0092\u008b\u0091\u0084\u0088\u0087\u0086\u0085\u008b\u0090\u0084\u008c\u008b\u0090\u0084\u008c\u008d\u0081\u0087\u008f\u008e\u008d\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            }
            int i11 = f2302 + 23;
            f2301 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 91 / 0;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            f2301 = (f2302 + 83) % 128;
            if (!m6529()) {
                return AdUnitActivity.class;
            }
            int i10 = f2301 + 77;
            f2302 = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6489() {
            int i10 = f2302 + 25;
            f2301 = i10 % 128;
            String strIntern = (i10 % 2 == 0 ? m6530(null, 24 / (ViewConfiguration.getMaximumDrawingCacheSize() >>> 77), null, "\u008c\u008b\u0090\u0089\u0088\u0087\u0086\u0085") : m6530(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u008c\u008b\u0090\u0089\u0088\u0087\u0086\u0085")).intern();
            int i11 = f2302 + 21;
            f2301 = i11 % 128;
            if (i11 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m6530(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f3012) {
                try {
                    char[] cArr2 = f2306;
                    int i11 = f2303;
                    if (f2304) {
                        int length = bArr.length;
                        m.f3014 = length;
                        char[] cArr3 = new char[length];
                        m.f3013 = 0;
                        while (m.f3013 < m.f3014) {
                            int i12 = m.f3013;
                            int i13 = m.f3014 - 1;
                            int i14 = m.f3013;
                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                            m.f3013 = i14 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f2305) {
                        int length2 = cArr.length;
                        m.f3014 = length2;
                        char[] cArr4 = new char[length2];
                        m.f3013 = 0;
                        while (m.f3013 < m.f3014) {
                            int i15 = m.f3013;
                            int i16 = m.f3014 - 1;
                            int i17 = m.f3013;
                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                            m.f3013 = i17 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f3014 = length3;
                    char[] cArr5 = new char[length3];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i18 = m.f3013;
                        int i19 = m.f3014 - 1;
                        int i20 = m.f3013;
                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                        m.f3013 = i20 + 1;
                    }
                    return new String(cArr5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        ce ceVar = new ce(mo6489());
        int i10 = f2294 + 55;
        f2295 = i10 % 128;
        if (i10 % 2 == 0) {
            return ceVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2294 = (f2295 + 17) % 128;
        String strIntern = m6528((-1396974204) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED), (ViewConfiguration.getFadingEdgeLength() >> 16) + 184600475, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 114), KeyEvent.getDeadChar(0, 0) - 123).intern();
        int i10 = f2294 + 5;
        f2295 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        f2294 = (f2295 + 111) % 128;
        return UnityServices.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2294 = (f2295 + 103) % 128;
        String strIntern = m6528(TextUtils.getTrimmedLength("") - 1396974171, (short) ((Process.myTid() >> 22) - 56), 184600493 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED), (ViewConfiguration.getEdgeSlop() >> 16) - 123).intern();
        f2294 = (f2295 + 17) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6528(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2298;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2300;
                    i14 = bArr != null ? (byte) (bArr[f2296 + i10] + i13) : (short) (f2297[f2296 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f2296 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f2299);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f2300;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f2297;
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
