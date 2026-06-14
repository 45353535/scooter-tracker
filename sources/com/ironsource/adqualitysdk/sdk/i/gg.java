package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;

/* JADX INFO: loaded from: classes10.dex */
public final class gg extends gl {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2194 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2196 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2195 = {5998, 25266, 64704, 30291, 49195, 23140, 54671, 12248, 47615, 13171, 36203, 6300, 37540, 60655, 26159, 61524, 19049, 'f', 30129, 60361, 24834, 55074, 19833, 49796};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2193 = 4798225458005177808L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        br brVar = new br(mo6489());
        f2194 = (f2196 + 7) % 128;
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2196 = (f2194 + 1) % 128;
        String strIntern = m6504(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (5901 - TextUtils.indexOf("", "")), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        f2196 = (f2194 + 93) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2196 + 51) % 128;
        f2194 = i10;
        f2196 = (i10 + 97) % 128;
        return FairBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2194 = (f2196 + 59) % 128;
        String strIntern = m6504(MotionEvent.axisFromString("") + 18, (char) TextUtils.getCapsMode("", 0, 0), TextUtils.getTrimmedLength("") + 7).intern();
        f2196 = (f2194 + 19) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6504(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2195[i10 + i12]) ^ (((long) i12) * f2193)) ^ ((long) c10));
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
