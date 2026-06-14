package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.google.common.primitives.SignedBytes;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.sdk.Ogury;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class by extends bd {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1192 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1193 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f1194 = {-78, -68, 68, -70, 66, -90, -107, 98, -68, 79, 66, -68, 66, -74, -74, -70, 70, -79, -110, 83, -91, 123, -120, -123, 123, -123, 113, 113, 125, -127, 118, 85, -96, 119, -115, 126, 104, 71, -67, 67, -69, 75, SignedBytes.MAX_POWER_OF_TWO, 87, -94, 105, -97, 65, -78, -65, 65, -65, 75, 75, 71, -69, 76, 111, -102, 77, -73, 68, 82, -107, 107, 73, -73, 68, -89, 92, -92, -91, 111, -79, 75, -72, -82, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1195 = -1192899773;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1196 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1197 = 121;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1198 = 24841;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1199 = 1693;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1200 = 5365;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1201 = 19646;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1202 = -780611821;

    public by(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5647(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1193 + 67;
        f1192 = i10 % 128;
        int i11 = i10 % 2;
        m5643(oguryInterstitialAd, oguryInterstitialAdListener);
        if (i11 == 0) {
            throw null;
        }
        f1192 = (f1193 + 69) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5648(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1192 + 39;
        f1193 = i10 % 128;
        int i11 = i10 % 2;
        m5644(oguryRewardedAd, oguryRewardedAdListener);
        if (i11 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5646("ㆽ쮋셖렴犱哩ৌ耧컥ɯ蜕귭㛪磇제ቹ\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", View.getDefaultSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                by.m5647((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5646("ㆽ쮋빺稸ﻱӎ靂职愖ꓛ搗鈐\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", View.resolveSize(0, 0) + 21).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                by.m5648((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        int i10 = f1192 + 47;
        f1193 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        int i10 = f1192 + 55;
        f1193 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                return Ogury.getSdkVersion();
            }
            Ogury.getSdkVersion();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.by.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5646(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1201)) ^ ((c11 >>> 5) + f1198)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1199) ^ ((c12 + i12) ^ ((c12 << 4) + f1200))));
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5643(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        f1193 = (f1192 + 5) % 128;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        f1192 = (f1193 + 91) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5644(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        f1192 = (f1193 + 71) % 128;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        f1192 = (f1193 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5645(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1197;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1194;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1202 + i10] + i13);
                    } else {
                        i14 = (short) (f1196[f1202 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1202 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1195);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1194;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1196;
                            int i17 = o.f3018;
                            o.f3018 = i17 - 1;
                            o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                        }
                        sb2.append(o.f3021);
                        o.f3020 = o.f3021;
                        o.f3022++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
