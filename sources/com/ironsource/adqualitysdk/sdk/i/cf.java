package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class cf extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1325 = {30, 'U', 'p', 'y', '^', 'E', 'P', 'P', '`', 'y', '|', '}', '}', '|', 132, '|', 'w', '|', '[', ']', Ascii.MAX, ']', 'W', ' ', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '^', 'V', 'e', 'f', 'm', 'k', '4', 'V', '9', 'P', 'k', 'b', 'G', 'I', 'I', 'O', 'q', 'O', 'M', 'n', 'i', 'n', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'T', 'k', 'm', 'f', 'l', 199, 183, 183, 200, 223, 221, 215, 224, 224, 222, 220, 203, 215, 235, 227, 228, 228, 227, '9', 's', 's', 'i', 'e', 'n', 'Z', 'B', 'B', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'n', 'i', 'n', 'M', 'O', 'q', 'O', 'I', 'I', 'G', 'b', 'k', 'P', '?', '_', 304, 291, 270, 305, 295, 294, 299, 312, 294, 308, 291, 313, 295, 276, 315, 310, 299, 312, 299, 310, 293, 259, 262, 259, 295, 306, 291, 293, 309, 294, 'G', 140, 160, 176, 175, 184, 184, 184, 189, 188, 181, 182, 187, 165, 160, 174, 177, 177, 177, 181, 171, ')', '[', 'n', 'l', 'i', 'k', ']', '_', 'f', 'd', 'j', 'X', 'B', '&', ']', 'h', 'b', 'R', 'R', 'Z', 'X', 'i', 'i', 'g', 'p', '*', 'a', 'k', 'g', 'g', 'g', 'd', 'S', 'Q', 'g', 'n', 'i', 'k', 'd', '_', 'g', 'n', '2', 'i', 'i', 'l', 's', 'n', 'Z', 'H', 'B', 'Y', 'k', 'i', 'n', 'g', 'Q', 'S', 'd', 'g', 'g', 'g', 'k', 'a', 'c', '1', 'c', 'l', '[', 'C', 'I', '[', 'o', 'm', 'T', 'R', 'k', 't', 't', '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'H', 'B', 'U', 170, 176, 161, 137, 144, 142, 150, 156, 155, 171, 174, 170, 175, '3', 'f', 'l', 'Z', 'X', 'p', IOUtils.DIR_SEPARATOR_WINDOWS, 'V', '<', 'v', 's', 'i', 'U', '[', 'j', 'j', 'k', 'f', 'l', IOUtils.DIR_SEPARATOR_WINDOWS, '8', 'u', Ascii.MAX, 'q', 'g', ']', ']', 'v', 't', 'w', 'y', 'f', 'n', 'w', 'q'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1326 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1327 = 2149923499359415332L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1328;

    public cf(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static IGDTAdManager m5800() {
        f1326 = (f1328 + 89) % 128;
        IGDTAdManager gDTAdManger = GDTAdSdk.getGDTAdManger();
        int i10 = f1326 + 105;
        f1328 = i10 % 128;
        if (i10 % 2 == 0) {
            return gDTAdManger;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ IGDTAdManager m5801() {
        IGDTAdManager iGDTAdManagerM5800;
        int i10 = f1326 + 63;
        f1328 = i10 % 128;
        if (i10 % 2 != 0) {
            iGDTAdManagerM5800 = m5800();
            int i11 = 23 / 0;
        } else {
            iGDTAdManagerM5800 = m5800();
        }
        f1328 = (f1326 + 59) % 128;
        return iGDTAdManagerM5800;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m5806(RewardVideoAD rewardVideoAD) {
        f1326 = (f1328 + 39) % 128;
        Map<String, String> mapM5804 = m5804(rewardVideoAD);
        f1328 = (f1326 + 27) % 128;
        return mapM5804;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ int m5807(RewardVideoAD rewardVideoAD) {
        f1328 = (f1326 + 31) % 128;
        int iM5810 = m5810(rewardVideoAD);
        f1326 = (f1328 + 77) % 128;
        return iM5810;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m5811(LiteAbstractAD liteAbstractAD) {
        f1328 = (f1326 + 49) % 128;
        Map<String, Object> mapM5809 = m5809(liteAbstractAD);
        f1326 = (f1328 + 45) % 128;
        return mapM5809;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m5813(UnifiedInterstitialAD unifiedInterstitialAD) {
        f1328 = (f1326 + 35) % 128;
        Map mapM5803 = m5803(unifiedInterstitialAD);
        f1328 = (f1326 + 39) % 128;
        return mapM5803;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5802(new int[]{254, 14, 68, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cf.m5801();
            }
        });
        map.put(m5802(new int[]{268, 8, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cf.m5808((APPStatus) list.get(0));
            }
        });
        map.put(m5802(new int[]{276, 12, 0, 8}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cf.m5811((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m5802(new int[]{288, 15, 11, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Integer.valueOf(cf.m5807((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m5805("ⱃ귚⽦ꢧ⨭ꑔ◧ꝫₘꈲ㱎뷈㼘뢏㨭", 33179 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cf.m5806((RewardVideoAD) list.get(0));
            }
        });
        map.put(m5805("ⱃ⢼▪⊚㾾㒡ㆯຽிµᶯ\u1a8fទ沜榞暲掌碝", ExpandableListView.getPackedPositionGroup(0L) + 1277).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cf.m5813((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i10 = f1326 + 99;
        f1328 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5808(APPStatus aPPStatus) {
        f1326 = (f1328 + 17) % 128;
        String strM5812 = m5812(aPPStatus);
        f1326 = (f1328 + 1) % 128;
        return strM5812;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m5810(RewardVideoAD rewardVideoAD) {
        f1328 = (f1326 + 123) % 128;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        f1328 = (f1326 + 69) % 128;
        return rewardAdType;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f1326 = (f1328 + 27) % 128;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        f1328 = (f1326 + 121) % 128;
        return integrationSDKVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0311  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cf.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5805(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1327);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, Object> m5809(LiteAbstractAD liteAbstractAD) {
        f1326 = (f1328 + 61) % 128;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        f1326 = (f1328 + 109) % 128;
        return extraInfo;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, String> m5804(RewardVideoAD rewardVideoAD) {
        int i10 = f1326 + 3;
        f1328 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> exts = rewardVideoAD.getExts();
        if (i11 != 0) {
            int i12 = 37 / 0;
        }
        int i13 = f1326 + 63;
        f1328 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 42 / 0;
        }
        return exts;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map m5803(UnifiedInterstitialAD unifiedInterstitialAD) {
        f1326 = (f1328 + 57) % 128;
        Map ext = unifiedInterstitialAD.getExt();
        int i10 = f1326 + 15;
        f1328 = i10 % 128;
        if (i10 % 2 == 0) {
            return ext;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5802(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1325, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5812(APPStatus aPPStatus) {
        int i10 = f1328 + 87;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            return aPPStatus.getAPPID();
        }
        aPPStatus.getAPPID();
        throw null;
    }
}
