package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class dp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1832 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1833 = -3367701063337788816L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1834 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1835;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1836;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1837;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1838;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1839;

    public dp(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1839 = jSONObject.optString(m6318("ϱ屼ꑬ៖Ά\ue67e탭㣶\uea41\uf829諭", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
            this.f1836 = jSONObject.optString(m6318("㋬읺Κᓝ㊏絥眗㯠\udb43挤", ExpandableListView.getPackedPositionGroup(0L)).intern());
            this.f1838 = jSONObject.optString(m6318("擣넖瞊놡撆ଞ̞麃赂", ExpandableListView.getPackedPositionType(0L)).intern());
            this.f1837 = jSONObject.optString(m6318("砤៷䎙셧硓귢㜛\uee41醍뎢ᵎ", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            this.f1835 = jSONObject.optBoolean(m6318("翝臭攛帽羨㯮ᆞ焨陥▩㯉䝌갗౮", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m6319() {
        int i10 = f1832 + 51;
        int i11 = i10 % 128;
        f1834 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1838;
        int i12 = i11 + 53;
        f1832 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6320() {
        int i10 = f1832 + 47;
        f1834 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1836;
        }
        int i11 = 22 / 0;
        return this.f1836;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6321() {
        boolean z10;
        int i10 = f1832 + 19;
        int i11 = i10 % 128;
        f1834 = i11;
        if (i10 % 2 == 0) {
            z10 = this.f1835;
            int i12 = 25 / 0;
        } else {
            z10 = this.f1835;
        }
        int i13 = i11 + 45;
        f1832 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 69 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6322() {
        int i10 = f1832;
        String str = this.f1839;
        int i11 = i10 + 103;
        f1834 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6323() {
        int i10 = f1832 + 51;
        int i11 = i10 % 128;
        f1834 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1837;
        int i12 = i11 + 53;
        f1832 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6318(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f1833, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f1833));
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
}
