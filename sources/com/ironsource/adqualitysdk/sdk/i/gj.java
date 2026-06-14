package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import com.five_corp.ad.FiveAd;

/* JADX INFO: loaded from: classes10.dex */
public final class gj extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2208 = {4013, 24897, 53859, 17216, 46120, 9671, 38648, 1931, 30865, 59981, 23393, 52252, 15678, 44672, 8175, 28810, 57824, 21352, 50279, 13592, 42539, 6127, 35050, 'f', 28297, 56758, 19653, 48097, 10756};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2209 = -225550483470192928L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2210 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2211 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bq bqVar = new bq(mo6489());
        int i10 = f2210 + 1;
        f2211 = i10 % 128;
        if (i10 % 2 != 0) {
            return bqVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int doubleTapTimeout;
        char mode;
        int size;
        int i10 = f2211 + 121;
        f2210 = i10 % 128;
        if (i10 % 2 != 0) {
            doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() + 1;
            mode = (char) (4390 >> View.MeasureSpec.getMode(0));
            size = 112 - View.MeasureSpec.getSize(0);
        } else {
            doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
            mode = (char) (4046 - View.MeasureSpec.getMode(0));
            size = View.MeasureSpec.getSize(0) + 23;
        }
        return m6507(doubleTapTimeout, mode, size).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2210 + 109) % 128;
        f2211 = i10;
        f2210 = (i10 + 45) % 128;
        return FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2211 = (f2210 + 43) % 128;
        String strIntern = m6507(Color.red(0) + 23, (char) (ViewConfiguration.getScrollBarSize() >> 8), 6 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        f2210 = (f2211 + 73) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6507(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2208[i10 + i12]) ^ (((long) i12) * f2209)) ^ ((long) c10));
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
