package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes10.dex */
public final class gb extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2164 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2165 = -1193984871553583857L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2166 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bi biVar = new bi(mo6489());
        int i10 = f2164 + 63;
        f2166 = i10 % 128;
        if (i10 % 2 != 0) {
            return biVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2164 + 33;
        f2166 = i10 % 128;
        return (i10 % 2 == 0 ? m6497("땬睁ㄠ\uf342뷪翚㦹ﮄꑨ晐\u202c\ue20a겭滑⢥\uea8b霱兿ጭ\udd0c鿗姕ᮯ양虹䁥ȱ찟", 49697 << (ViewConfiguration.getScrollBarFadeDuration() * 79)) : m6497("땬睁ㄠ\uf342뷪翚㦹ﮄꑨ晐\u202c\ue20a겭滑⢥\uea8b霱兿ጭ\udd0c鿗姕ᮯ양虹䁥ȱ찟", 49697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2166 + 33;
        f2164 = i10 % 128;
        if (i10 % 2 == 0) {
            return AppLovinSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2164 + 17;
        f2166 = i10 % 128;
        return m6497("땮ퟪ灕鋜㼴妐礼ݲ", i10 % 2 == 0 ? 3258 >>> MotionEvent.axisFromString("") : 25236 - MotionEvent.axisFromString("")).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6497(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2165);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
