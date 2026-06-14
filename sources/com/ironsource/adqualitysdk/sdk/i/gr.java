package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: loaded from: classes10.dex */
public final class gr extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2245 = 7563637630334370911L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2246 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2247 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bt btVar = new bt(mo6489());
        int i10 = f2247 + 99;
        f2246 = i10 % 128;
        if (i10 % 2 == 0) {
            return btVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2246 = (f2247 + 43) % 128;
        String strIntern = m6517("ꢯ唒쀰쟺\ua8cc턢죣䫉릺삻\uda65复訤\uf22a\uebf3瞝鲸\ueda4ﴬ؆\ued3a鼹軷ᒖﾷ躰ꁵ⌝쀴렱뇽㇑튂ꮣ䍽쀕⌜䕂哛\udf75㖐瓌", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i10 = f2246 + 75;
        f2247 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 47 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = (f2247 + 61) % 128;
        f2246 = i10;
        f2247 = (i10 + 73) % 128;
        return IronSource.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2246 + 109;
        f2247 = i10 % 128;
        int i11 = i10 % 2;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (i11 == 0) {
            m6517("ꑫ絛멨ﮇꐂ纂늹直땤漛ꀧ敬蛰嶝", (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1))).intern();
            throw null;
        }
        String strIntern = m6517("ꑫ絛멨ﮇꐂ纂늹直땤漛ꀧ敬蛰嶝", (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1))).intern();
        f2246 = (f2247 + 99) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6517(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f2245, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2245));
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
