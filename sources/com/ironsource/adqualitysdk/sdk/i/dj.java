package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class dj extends cz implements cl {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1763 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1765 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1773;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1774;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1776;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1770 = {3780, 55073, 48418, 33580, 26889, 20239, 5396, 64381, 49527, 42858, 'b', 55703, 45954, 36236, 26557, 16828, 2020, 56858, 46081, 35330, 24624, 17971, 7204, 62044, 51287, 44545, 25051, 47163, 53808, 60423, 1557, 8194, 31237, 38003, 44652, 51307, 57936, 15476, 22085, 28834, 35499, 42157, 65210, 6293, 12970, 19595, 26365, 32995, 'g', 55699, 45976, 36259, 26556, 16796, 7073, 62924, 53205, 43464, 33769, 24055, 16835, 38967, 62012, 52239, 9743, ',', 23061, 46194, 36472, 59505, 49755, 7236, 30281, 20671, 43710, 33935, 56992, 33365, 23457, 12714, 3993, 58777, 50111, 39299, 30715, 19958, 11259, 451, 'g', 55699, 45976, 36256, 26538, 16801, 7077, 62942, 53203, 43463, 33775, 24038, 14285, 4360, 60177, 50436, 40724, 31000, 21293, 11567, 1885};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1768 = 1655881082737973750L;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f1764 = true;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1766 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1769 = 273;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1767 = {319, 388, 374, 389, 340, 384, 383, 372, 387, 351, 370, 382, 376, 350, 373, 378, 392, 380, 338, 355, 391, 390, 346, 343, 381, 353, 347};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1775 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private double f1772 = -1.0d;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f1771 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6239() {
        String strIntern;
        int i10 = f1765 + 33;
        f1763 = i10 % 128;
        if (i10 % 2 != 0) {
            m6240();
            throw null;
        }
        if (m6240()) {
            strIntern = m6245(View.resolveSize(0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 3746), 10 - TextUtils.indexOf("", "", 0, 0)).intern();
            f1763 = (f1765 + 117) % 128;
        } else {
            strIntern = m6245(Process.getGidForName("") + 11, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6245((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1929), 10 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb2.append(this.f1775);
        sb2.append(m6246(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u0081").intern());
        sb2.append(strIntern);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean m6240() {
        int i10 = f1763 + 53;
        f1765 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1773;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6241() {
        int i10 = f1763;
        String str = this.f1774;
        f1765 = (i10 + 21) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6243() {
        int i10 = f1765 + 121;
        f1763 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1775;
        }
        int i11 = 54 / 0;
        return this.f1775;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Double m6244() {
        int i10 = f1765 + 95;
        f1763 = i10 % 128;
        if (i10 % 2 == 0) {
            return Double.valueOf(this.f1772);
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6247(boolean z10) {
        int i10 = f1763;
        this.f1773 = z10;
        int i11 = i10 + 93;
        f1765 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 89 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6249(String str) {
        int i10 = (f1763 + 61) % 128;
        f1765 = i10;
        this.f1775 = str;
        f1763 = (i10 + 95) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6250(String str) {
        int i10 = (f1763 + 89) % 128;
        f1765 = i10;
        this.f1776 = str;
        f1763 = (i10 + 111) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m6242() {
        int i10 = f1763 + 113;
        f1765 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1776;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6245(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1770[i10 + i12]) ^ (((long) i12) * f1768)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m6248() {
        int i10 = f1763;
        boolean z10 = this.f1771;
        f1765 = (i10 + 25) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6252(Double d10) {
        f1763 = (f1765 + 61) % 128;
        this.f1772 = d10.doubleValue();
        int i10 = f1765 + 71;
        f1763 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m6254() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ih.f2566, this.f1776);
            double d10 = this.f1772;
            if (d10 > -1.0d) {
                int i10 = f1765 + 25;
                f1763 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject2.put(ih.f2515, d10);
                    throw null;
                }
                jSONObject2.put(ih.f2515, d10);
            }
            jSONObject2.put(ih.f2518, this.f1774);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                if (this.f1771) {
                    f1763 = (f1765 + 37) % 128;
                    jSONObject2.put(ih.f2514, true);
                    f1765 = (f1763 + 89) % 128;
                }
                jSONObject.put(ih.f2517, jSONObject2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6251(boolean z10) {
        int i10 = (f1765 + 91) % 128;
        f1763 = i10;
        this.f1771 = z10;
        f1765 = (i10 + 37) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6253(String str) {
        int i10 = (f1763 + 43) % 128;
        f1765 = i10;
        this.f1774 = str;
        f1763 = (i10 + 115) % 128;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a A[PHI: r3
  0x009a: PHI (r3v4 byte) = (r3v0 byte), (r3v8 byte) binds: [B:24:0x00e9, B:15:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f4  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5100(java.lang.String r11, java.util.List<java.lang.Object> r12, com.ironsource.adqualitysdk.sdk.i.ch r13) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dj.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6246(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1767;
                int i11 = f1769;
                if (f1766) {
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
                if (f1764) {
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
