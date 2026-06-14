package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class ge extends gl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2178 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2179 = 55040;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2180 = 29878;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2181 = 41542;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2182 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2183 = 39924;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bj bjVar = new bj(mo6489());
        f2178 = (f2182 + 113) % 128;
        return bjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2178 + 119;
        f2182 = i10 % 128;
        return m6500("మ팆突緙嵝륨৲\ue695굅\ue799߅뤮伉\ua87eꖭ떎븼媪\uaad8햰\uf1cb\ue045鲣杆ꕢ㧽\udd5f\uedd7뽥傣", i10 % 2 != 0 ? 79 - (ViewConfiguration.getJumpTapTimeout() / 115) : (ViewConfiguration.getJumpTapTimeout() >> 16) + 29).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2182 + 123;
        f2178 = i10 % 128;
        if (i10 % 2 != 0) {
            return b1.b.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        f2182 = (f2178 + 93) % 128;
        String strIntern = m6500("嵝륨৲\ue695굅\ue799߅뤮伉\ua87e", TextUtils.getOffsetBefore("", 0) + 10).intern();
        f2182 = (f2178 + 25) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6500(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2179)) ^ ((c11 >>> 5) + f2181)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2180) ^ ((c12 + i12) ^ ((c12 << 4) + f2183))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
