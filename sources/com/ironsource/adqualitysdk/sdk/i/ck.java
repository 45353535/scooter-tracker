package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ck extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1373 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1374 = {IOUtils.DIR_SEPARATOR_UNIX, ']', '`', '_', '[', '`', 'I', 'E', 'D', 'C', '`', 'I', ',', '\'', 'i', 203, 203, 210, 185, 177, 177, 'Z', 171, 173, 165, 165, 181, 187, 192, 197, '8', '_', '^', 'i', 'd', 'S', 'X', 146, 276, 274, 296, 303, 298, 300, 282, 141, 288, 295, 290, 292, 274, 267, 273, 275, 295, 300, 293, 290, 290, 292, 275, 141, 293, 312, 310, 282, 280, 302, 309, 304, 306, 288, 281, 282, 269, 238, 291, 273, 277, 258, 286, 273, 282, ':', 132, 157, 159, 134, 133, '{', 240, 215, 214, 220, 222, 242, 247, 240, 237, 237, 239, 222, 213, ':', 'q', 'i', 'i', 'i', 'd', 'b', 'f', 'n', 'j', '[', '[', 'h', 'g', 'a', 'c', 'f', 'e', 'b', 'R', ':', ']', 'U', 'R', 'W', 'i', 'e', 'k', 'j', 'k', 'o', 'l', '#', ']', 'p', 'l', 'o', 'k', 'j', 'k', 'e', 'i', 'W', 'R', 'X', 'Z', 'n', 's', 'l', 'i', 'i', 'k', '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'X', 'R', 'V', 'f', 'e', 'n', 'n', 'n', 's', 'r', 'k', 'l', 'q', '[', '|', 254, 242, 226, 220, 216, 217, 221, 244, 254, 255, 255, 252, 260, '9', 'k', 'd', 'd', 'R', 'R', 'X', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'b', '[', 'n', 'l', ':', 'n', 'o', 'o', 'n', 'k', 'R', 'S', 'h', 'i', 'j', 'q', 'e', 'B', 'K', 'o', 'Q', 'M', 'f', 'g', 'p', 'k', 'l', 'q', 'k', 'K', 'P', 'k', 'b', 'G', 'I', 'h', 'i', 'j', 'q', 'u', 'R', 'M', 'n', 'i', 'n', 144, 285, 264, 263, 288, 281, 282, 294, 287, '+', 'e', 'q', 'j', 'i', 'h', 'S', 'X', 'l', 'V', 'W', 'j', 'g', 'i', 'q', '3', 'j', 'q', 'e', 'e', 'q', 'i', 'g', 'j', 'W', 'R', 'c', '^', '^', 'h', '7', 'a', 'g', '{', 'c', 'e', 'w', 'q', 'H', 150, 138, 131, 150, 148, 145, 147, 140, 140, 133, 135, 142, 140, 146};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1375 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1376 = -4148709506585531902L;

    public ck(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5863(Placement placement) {
        int i10 = f1375 + 15;
        f1373 = i10 % 128;
        int i11 = i10 % 2;
        String strM5867 = m5867(placement);
        if (i11 == 0) {
            int i12 = 37 / 0;
        }
        return strM5867;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5866(AdPayload.AdUnit adUnit) {
        int i10 = f1373 + 15;
        f1375 = i10 % 128;
        if (i10 % 2 == 0) {
            return adUnit.getCampaign();
        }
        adUnit.getCampaign();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5869(AdPayload.AdUnit adUnit) {
        f1373 = (f1375 + 1) % 128;
        String strM5866 = m5866(adUnit);
        f1375 = (f1373 + 51) % 128;
        return strM5866;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.AdUnit m5874(AdPayload adPayload) {
        int i10 = f1375 + 69;
        f1373 = i10 % 128;
        int i11 = i10 % 2;
        AdPayload.AdUnit adUnitM5864 = m5864(adPayload);
        if (i11 == 0) {
            int i12 = 5 / 0;
        }
        return adUnitM5864;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    final String mo5025() {
        int i10 = f1375 + 27;
        f1373 = i10 % 128;
        try {
            return i10 % 2 == 0 ? mo5107().split(m5868("ꏑꏼ܌긶ꋟ", TextUtils.getOffsetAfter("", 0)).intern())[1] : mo5107().split(m5868("ꏑꏼ܌긶ꋟ", TextUtils.getOffsetAfter("", 0)).intern())[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5867(Placement placement) {
        int i10 = f1375 + 53;
        f1373 = i10 % 128;
        int i11 = i10 % 2;
        String referenceId = placement.getReferenceId();
        if (i11 == 0) {
            int i12 = 12 / 0;
        }
        int i13 = f1373 + 101;
        f1375 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 33 / 0;
        }
        return referenceId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5871(AppNode appNode) {
        f1375 = (f1373 + 105) % 128;
        String strM5865 = m5865(appNode);
        f1375 = (f1373 + 19) % 128;
        return strM5865;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.TemplateSettings m5875(AdPayload.AdUnit adUnit) {
        f1375 = (f1373 + 49) % 128;
        AdPayload.TemplateSettings templateSettingsM5862 = m5862(adUnit);
        f1373 = (f1375 + 27) % 128;
        return templateSettingsM5862;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5868("鼫齌肾\ue0ea映櫙㒚\ud867㝇ዡ鲈G콏", Color.red(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ck.m5874((AdPayload) list.get(0));
            }
        });
        map.put(m5872(new int[]{289, 8, 11, 0}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ck.m5871((AppNode) list.get(0));
            }
        });
        map.put(m5868("䳖䲱䕤㬸薶꼃\uef48㯳\ue4bf휍䝜\ue3ddᲧ缔ὀ诅뒜ꜛ\uf754㏄\uec97켥佹\udbfdқ眠❠菍범鼺", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ck.m5876((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m5868("郾邙뜅\ud925ꆧ嵢ൕῢ㢗╢ꕙ쟈삇走ﵟ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ck.m5869((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m5868("뷔붳谏졉̾晨\u1c39뵨ᖰṤ됦敕\ueda9뙸\uec33൜䖅湱", ExpandableListView.getPackedPositionGroup(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ck.m5863((Placement) list.get(0));
            }
        });
        map.put(m5868("蕮蔉埶\ueef4\ud85f붑㪄昍ⴃ양銈븽픟涐쪅혚紓떘⊜渨┠\uddb3骣", TextUtils.getOffsetAfter("", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ck.m5875((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m5872(new int[]{297, 15, 40, 0}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(ck.m5877((Placement) list.get(0)));
            }
        });
        f1373 = (f1375 + 39) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5868(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f1376, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f1376));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5870(AdPayload.CacheableReplacement cacheableReplacement) {
        f1375 = (f1373 + 67) % 128;
        String url = cacheableReplacement.getUrl();
        f1375 = (f1373 + 105) % 128;
        return url;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5876(AdPayload.CacheableReplacement cacheableReplacement) {
        f1373 = (f1375 + 109) % 128;
        String strM5870 = m5870(cacheableReplacement);
        f1375 = (f1373 + 93) % 128;
        return strM5870;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m5873(Placement placement) {
        int i10 = f1373 + 11;
        f1375 = i10 % 128;
        if (i10 % 2 == 0) {
            return placement.isRewardedVideo();
        }
        placement.isRewardedVideo();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m5877(Placement placement) {
        f1373 = (f1375 + 67) % 128;
        boolean zM5873 = m5873(placement);
        int i10 = f1375 + 49;
        f1373 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM5873;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5872(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1374, i10, cArr, 0, i11);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo5107() {
        f1373 = (f1375 + 29) % 128;
        try {
            String strM6739 = hu.m6637().m6639().m6739(BuildConfig.class, m5872(new int[]{0, 14, 0, 0}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", false).intern());
            int i10 = f1373 + 13;
            f1375 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 79 / 0;
            }
            return strM6739;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AdPayload.AdUnit m5864(AdPayload adPayload) {
        f1375 = (f1373 + 43) % 128;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        f1373 = (f1375 + 39) % 128;
        return adUnit;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5865(AppNode appNode) {
        int i10 = f1373 + 123;
        f1375 = i10 % 128;
        if (i10 % 2 == 0) {
            return appNode.getAppId();
        }
        appNode.getAppId();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        byte b10 = 3;
        switch (str.hashCode()) {
            case -1836618638:
                b10 = !str.equals(m5868("\udae1\udaa0곖ꖃ\ufaff䚰燆䒚犝㺵\ud9f9鲘誅隽", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1791176561:
                if (!str.equals(m5872(new int[]{37, 8, 193, 1}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    f1373 = (f1375 + 53) % 128;
                    b10 = 6;
                }
                break;
            case -1560947009:
                b10 = !str.equals(m5868("谉豪醑끠ኲ篼搉겚⑷Ϯ찂瓛\udc75ꯦ鑚᳅瑵珸籒ꓮⱈᯝ쐪䳱쑓ꏭ갥ᓹ籎", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1494265129:
                if (!str.equals(m5872(new int[]{209, 41, 0, 40}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000", true).intern())) {
                    b10 = -1;
                } else {
                    f1375 = (f1373 + 61) % 128;
                    b10 = Ascii.CAN;
                }
                break;
            case -1435839138:
                if (!str.equals(m5872(new int[]{123, 12, 0, 2}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    b10 = -1;
                } else {
                    f1373 = (f1375 + 65) % 128;
                    b10 = 15;
                }
                break;
            case -1179107681:
                b10 = !str.equals(m5872(new int[]{250, 9, 181, 5}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false).intern()) ? (byte) -1 : Ascii.EM;
                break;
            case -609786639:
                b10 = !str.equals(m5868("クヽ熢퇲\ua634鯅ցᡓ飕\ue3cc궛쁞惾䯔", View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case -498709917:
                b10 = str.equals(m5872(new int[]{ModuleDescriptor.MODULE_VERSION, 22, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true).intern()) ? Ascii.DC2 : (byte) -1;
                break;
            case -498060603:
                if (!str.equals(m5868("혏홟㞥㶺İ\uddcb\ue9df뽕繢ꗂ䇓材虫", ViewConfiguration.getScrollBarSize() >> 8).intern())) {
                    b10 = -1;
                } else {
                    f1375 = (f1373 + 113) % 128;
                    b10 = 20;
                }
                break;
            case -486531311:
                b10 = !str.equals(m5872(new int[]{177, 14, 147, 2}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000", false).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -393802555:
                b10 = !str.equals(m5872(new int[]{191, 18, 0, 14}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", false).intern()) ? (byte) -1 : Ascii.SYN;
                break;
            case -43797322:
                b10 = !str.equals(m5872(new int[]{103, 20, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000", true).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case 307971376:
                b10 = !str.equals(m5872(new int[]{61, 12, 199, 4}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 320151695:
                b10 = !str.equals(m5868("滑淚촭偹濆❁萉톥兾彔Ⰱডꥠ\uf756琌憼ŝ⽓", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 324239304:
                b10 = str.equals(m5872(new int[]{89, 14, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 12}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false).intern()) ? Ascii.FF : (byte) -1;
                break;
            case 389759008:
                if (!str.equals(m5868("殦毧惶⇬ﴭ誐\uf5a1䍅쏚\uf299嶒魍㯗媈", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    f1375 = (f1373 + 33) % 128;
                }
                break;
            case 484680813:
                b10 = !str.equals(m5872(new int[]{14, 7, 95, 0}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 870529955:
                b10 = !str.equals(m5872(new int[]{30, 7, 0, 5}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 961844241:
                b10 = !str.equals(m5872(new int[]{73, 10, 172, 3}, null, true).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 989853769:
                if (!str.equals(m5868("췽춞㫾櫧㉢킓뺎豊斃ꢁᚅ吋鶁\u0089仝㰕㖁\ud897ꛕ萕涳남Ầ氶薻ࢵ皧㑢㶸\ue0a5껽鰕喡뢅ڸ搨跔\u10ca绊챐◌", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern())) {
                    b10 = -1;
                } else {
                    f1373 = (f1375 + 9) % 128;
                    b10 = 1;
                }
                break;
            case 1205766784:
                b10 = !str.equals(m5868("\ud98d\ud9db\u18fd頽牉\uf28a䱗차燩誒\ue470ᐤ觩⊆뱟簶⇡爵", View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 1208038126:
                if (!str.equals(m5872(new int[]{274, 15, 0, 4}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", true).intern())) {
                    b10 = -1;
                } else {
                    f1373 = (f1375 + 125) % 128;
                    b10 = Ascii.ESC;
                }
                break;
            case 1442693170:
                if (!str.equals(m5872(new int[]{135, 20, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    f1375 = (f1373 + 109) % 128;
                    b10 = 16;
                }
                break;
            case 1505622627:
                b10 = !str.equals(m5872(new int[]{45, 16, 185, 15}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", false).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1839869899:
                b10 = !str.equals(m5872(new int[]{21, 9, 83, 4}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", true).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 1853648591:
                b10 = !str.equals(m5868("⃒ₐ㡲褡閏툑嵖⯬袜ꨍ\uf541\uf3ed炱ȃ굇鯼\ud8af\uda06䕼⏵", ViewConfiguration.getScrollBarSize() >> 8).intern()) ? (byte) -1 : (byte) 13;
                break;
            case 1930966324:
                b10 = !str.equals(m5872(new int[]{259, 15, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", false).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case 1982630644:
                b10 = !str.equals(m5872(new int[]{83, 6, 51, 0}, "\u0001\u0001\u0000\u0000\u0000\u0001", false).intern()) ? (byte) -1 : Ascii.VT;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return AdActivity.class;
            case 2:
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case 8:
                return BannerAdSize.class;
            case 9:
            case 10:
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case 12:
                return BaseAdListener.class;
            case 13:
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m5862(AdPayload.AdUnit adUnit) {
        int i10 = f1375 + 121;
        f1373 = i10 % 128;
        if (i10 % 2 != 0) {
            return adUnit.getTemplateSettings();
        }
        adUnit.getTemplateSettings();
        throw null;
    }
}
