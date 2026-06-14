package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.yandex.mobile.ads.common.MobileAds;

/* JADX INFO: loaded from: classes10.dex */
public final class gx extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2275 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2276 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2277 = -1466685836665518762L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        cj cjVar = new cj(mo6489());
        int i10 = f2276 + 19;
        f2275 = i10 % 128;
        if (i10 % 2 != 0) {
            return cjVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        int i10 = f2275 + 103;
        f2276 = i10 % 128;
        if (i10 % 2 != 0) {
            m6524("녃넠\u0a46轿鑋麊둶\u245aꑢᖰ뻠腤鮖㼁꯸麅\uf124䩃푗\uf43c\ue446嗧ﻧ셜\udb88罟\ueb8d\ude8fㄾ詴ᑙ㐦␅閌㻱Œᯪ뼅⮃ộ焿쩢", TextUtils.getTrimmedLength("")).intern();
            throw null;
        }
        String strIntern = m6524("녃넠\u0a46轿鑋麊둶\u245aꑢᖰ뻠腤鮖㼁꯸麅\uf124䩃푗\uf43c\ue446嗧ﻧ셜\udb88罟\ueb8d\ude8fㄾ詴ᑙ㐦␅閌㻱Œᯪ뼅⮃ộ焿쩢", TextUtils.getTrimmedLength("")).intern();
        f2276 = (f2275 + 47) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        f2276 = (f2275 + 69) % 128;
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2276 + 91;
        f2275 = i10 % 128;
        return m6524("✷❎㉂띵ௌĎꭀ㬦㈊ⶣ", i10 % 2 == 0 ? 1 >> TextUtils.lastIndexOf("", 'y', 0, 0) : TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6524(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f2277, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2277));
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
