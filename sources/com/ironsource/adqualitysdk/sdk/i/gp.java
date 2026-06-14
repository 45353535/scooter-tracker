package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import jp.maio.sdk.android.MaioAds;

/* JADX INFO: loaded from: classes10.dex */
public final class gp extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2236 = {466222555, -1415867750, -826109828, -76992019, 872917414, 957241494, -1580637402, -305054276, -1207167165, 1766766734, 423897227, -272693523, -541437047, 82883115, 648651132, -1994170108, -29457662, -1268561349};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2237 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2238;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6514(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2236.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bu buVar = new bu(mo6489());
        f2237 = (f2238 + 85) % 128;
        return buVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2238 = (f2237 + 103) % 128;
        String strIntern = m6514(new int[]{205632231, -204140976, 919235390, -1329049541, -2005671753, 183694889, -1026868245, -1954004351, 2049927356, 1991180000, 1798293245, 1630322398, 424261212, -829557321}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26).intern();
        f2237 = (f2238 + 17) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2238;
        f2237 = (i10 + 39) % 128;
        f2237 = (i10 + 55) % 128;
        return MaioAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2237 + 59;
        f2238 = i10 % 128;
        return (i10 % 2 != 0 ? m6514(new int[]{1234510871, -163039237}, 5 >>> (ViewConfiguration.getJumpTapTimeout() % 5)) : m6514(new int[]{1234510871, -163039237}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4)).intern();
    }
}
