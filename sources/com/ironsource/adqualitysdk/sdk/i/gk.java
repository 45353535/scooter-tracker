package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.hyprmx.android.sdk.placement.PlacementType;

/* JADX INFO: loaded from: classes10.dex */
public final class gk extends gl {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2212 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2213 = 1400;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2214 = 22706;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2215 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2216 = 30494;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2217 = 16338;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bp bpVar = new bp(mo6489());
        f2212 = (f2215 + 119) % 128;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2215 = (f2212 + 107) % 128;
        String strIntern = m6508("똹인藪⿴ꝃ鴬琊ሑ▼臶ꮌ뫦⋓ᢣ䣆鑚䥃一ഩ飠ㄧ寉繄\ue24d䬛\ue94dา\uee19燮\uf0db젓ឯⲸ泇䬛\ue94dา\uee19燮\uf0db젓ឯ矸\ud8f1孂瓠", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47).intern();
        int i10 = f2212 + 49;
        f2215 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 40 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2212;
        f2215 = (i10 + 61) % 128;
        int i11 = i10 + 25;
        f2215 = i11 % 128;
        if (i11 % 2 == 0) {
            return PlacementType.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2215 + 125;
        f2212 = i10 % 128;
        int i11 = i10 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strIntern = m6508("ꝃ鴬琊ሑ▼臶", i11 == 0 ? 4 >> (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)) : (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)) + 5).intern();
        int i12 = f2212 + 119;
        f2215 = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6508(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2213)) ^ ((c11 >>> 5) + f2216)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2217) ^ ((c12 + i12) ^ ((c12 << 4) + f2214))));
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
