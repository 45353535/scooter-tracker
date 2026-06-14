package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.facebook.ads.AdSettings;

/* JADX INFO: loaded from: classes10.dex */
public final class gd extends gl {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2176 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2177;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2175 = {10578, 12384, 6944, 25253, 19887, 22374, 48678, 39398, 57507, 51824, 54578, 15600, 2039, 24950, 18481, 21472, 47871, 33902, 61193, 63224, 53644, 15187, 529, 28106, 29839, 24152, 47374, 6733, 884, 10292, 20980, 32433, 25714, 36144, 43762};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2174 = 2999190736284293438L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bn bnVar = new bn(mo6489());
        int i10 = f2176 + 69;
        f2177 = i10 % 128;
        if (i10 % 2 == 0) {
            return bnVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2177 = (f2176 + 43) % 128;
        String strIntern = m6499(Color.green(0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 10545), View.MeasureSpec.makeMeasureSpec(0, 0) + 27).intern();
        f2176 = (f2177 + 63) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2176 + 13) % 128;
        f2177 = i10;
        int i11 = i10 + 51;
        f2176 = i11 % 128;
        if (i11 % 2 != 0) {
            return AdSettings.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2177 + 125;
        f2176 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6499(51 << ExpandableListView.getPackedPositionChild(0L), (char) (KeyEvent.getDeadChar(0, 1) + 27692), 107 >>> TextUtils.indexOf((CharSequence) "", 'L', 1)) : m6499(ExpandableListView.getPackedPositionChild(0L) + 28, (char) (6699 - KeyEvent.getDeadChar(0, 0)), 7 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern();
        int i11 = f2177 + 87;
        f2176 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6499(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2175[i10 + i12]) ^ (((long) i12) * f2174)) ^ ((long) c10));
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
}
