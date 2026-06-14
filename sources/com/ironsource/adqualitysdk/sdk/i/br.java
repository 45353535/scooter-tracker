package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class br extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1016 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1017 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1018 = -7017710411839432555L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1019 = 6795495270814316623L;

    public br(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m5377(ImpressionData impressionData) {
        f1016 = (f1017 + 55) % 128;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i10 = f1017 + 59;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static String m5378(ImpressionData impressionData) {
        f1016 = (f1017 + 75) % 128;
        String campaignId = impressionData.getCampaignId();
        f1016 = (f1017 + 117) % 128;
        return campaignId;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static String m5379(ImpressionData impressionData) {
        int i10 = f1016 + 37;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = impressionData.getCreativeId();
        if (i11 != 0) {
            int i12 = 61 / 0;
        }
        f1017 = (f1016 + 125) % 128;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static MediationManager m5381() {
        MediationManager companion;
        int i10 = f1017 + 73;
        f1016 = i10 % 128;
        if (i10 % 2 == 0) {
            companion = MediationManager.Companion.getInstance();
            int i11 = 31 / 0;
        } else {
            companion = MediationManager.Companion.getInstance();
        }
        int i12 = f1016 + 73;
        f1017 = i12 % 128;
        if (i12 % 2 == 0) {
            return companion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m5382(ImpressionData impressionData) {
        f1016 = (f1017 + 87) % 128;
        String demandSource = impressionData.getDemandSource();
        f1017 = (f1016 + 27) % 128;
        return demandSource;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m5383(ImpressionData impressionData) {
        int i10 = f1016 + 81;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        String variantId = impressionData.getVariantId();
        if (i11 != 0) {
            int i12 = 19 / 0;
        }
        return variantId;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m5385(ImpressionData impressionData) {
        int i10 = f1017 + 117;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m5386(ImpressionData impressionData) {
        int i10 = f1017 + 115;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getRenderingSdk();
        }
        impressionData.getRenderingSdk();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ MediationManager m5387() {
        f1017 = (f1016 + 97) % 128;
        MediationManager mediationManagerM5381 = m5381();
        f1016 = (f1017 + 67) % 128;
        return mediationManagerM5381;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ double m5389(ImpressionData impressionData) {
        int i10 = f1017 + 13;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5380(impressionData);
        }
        m5380(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ String m5391(ImpressionData impressionData) {
        f1017 = (f1016 + 87) % 128;
        String strM5378 = m5378(impressionData);
        f1016 = (f1017 + 5) % 128;
        return strM5378;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ String m5392(ImpressionData impressionData) {
        f1017 = (f1016 + 47) % 128;
        String strM5379 = m5379(impressionData);
        f1017 = (f1016 + 63) % 128;
        return strM5379;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static PlacementType m5393(ImpressionData impressionData) {
        int i10 = f1017 + 33;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5396(ImpressionData impressionData) {
        int i10 = f1016 + 25;
        f1017 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5383(impressionData);
        }
        m5383(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Constants.AdType m5400(Placement placement) {
        int i10 = f1017 + 17;
        f1016 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adTypeM5395 = m5395(placement);
        if (i11 == 0) {
            int i12 = 54 / 0;
        }
        f1016 = (f1017 + 95) % 128;
        return adTypeM5395;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ PlacementType m5404(ImpressionData impressionData) {
        int i10 = f1017 + 121;
        f1016 = i10 % 128;
        if (i10 % 2 == 0) {
            m5393(impressionData);
            throw null;
        }
        PlacementType placementTypeM5393 = m5393(impressionData);
        f1016 = (f1017 + 71) % 128;
        return placementTypeM5393;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ PlacementType m5410(Constants.AdType adType) {
        f1017 = (f1016 + 61) % 128;
        PlacementType placementTypeM5413 = m5413(adType);
        f1016 = (f1017 + 51) % 128;
        return placementTypeM5413;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ PlacementsHandler m5414(MediationManager mediationManager) {
        f1016 = (f1017 + 119) % 128;
        PlacementsHandler placementsHandlerM5405 = m5405(mediationManager);
        int i10 = f1016 + 37;
        f1017 = i10 % 128;
        if (i10 % 2 == 0) {
            return placementsHandlerM5405;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static double m5380(ImpressionData impressionData) {
        f1017 = (f1016 + 9) % 128;
        double netPayout = impressionData.getNetPayout();
        f1017 = (f1016 + 29) % 128;
        return netPayout;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m5384() {
        f1016 = (f1017 + 67) % 128;
        boolean zAssertStarted = FairBid.assertStarted();
        int i10 = f1017 + 125;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return zAssertStarted;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m5388(ImpressionData impressionData) {
        f1016 = (f1017 + 75) % 128;
        String strM5377 = m5377(impressionData);
        f1017 = (f1016 + 41) % 128;
        return strM5377;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ boolean m5390() {
        f1016 = (f1017 + 119) % 128;
        boolean zM5384 = m5384();
        int i10 = f1017 + 121;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM5384;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.fyber.fairbid.internal.Constants.AdType m5394(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 1
            r3 = 2
            r4 = 0
            switch(r0) {
                case -1372958932: goto L66;
                case 433141802: goto L4d;
                case 543046670: goto L2f;
                case 1951953708: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L8d
        Ld:
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0)
            int r0 = 20219 - r0
            java.lang.String r4 = "\uf80d뛵旷ᓰ쏦狺"
            java.lang.String r0 = m5397(r4, r0)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L8d
            int r6 = com.ironsource.adqualitysdk.sdk.i.br.f1016
            int r6 = r6 + 51
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.br.f1017 = r6
            r4 = r2
            goto L8e
        L2f:
            r0 = 0
            float r4 = android.util.TypedValue.complexToFraction(r4, r0, r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r4 = 59539(0xe893, float:8.3432E-41)
            int r4 = r4 - r0
            java.lang.String r0 = "\uf81d႙⤾䆷婑狔譸ꐎ"
            java.lang.String r0 = m5397(r0, r4)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == r2) goto L4b
            goto L8d
        L4b:
            r4 = r1
            goto L8e
        L4d:
            r0 = 16811469(0x10085cd, float:2.3605884E-38)
            int r5 = android.graphics.Color.rgb(r4, r4, r4)
            int r5 = r5 + r0
            java.lang.String r0 = "\uf81a緌\uf39e楦\uef34攙\udacf"
            java.lang.String r0 = m5397(r0, r5)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L8d
            goto L8e
        L66:
            r0 = 48
            char r0 = android.text.AndroidCharacter.getMirror(r0)
            int r0 = 49 - r0
            java.lang.String r4 = "ﵓﴚ䬔叏붯賑槸\u2002齕ㆮ⺅豘㦯陠䠼⸩"
            java.lang.String r0 = m5418(r4, r0)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L8d
            int r6 = com.ironsource.adqualitysdk.sdk.i.br.f1017
            int r6 = r6 + 29
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.br.f1016 = r0
            int r6 = r6 % r3
            if (r6 != 0) goto L8b
            r4 = 5
            goto L8e
        L8b:
            r4 = r3
            goto L8e
        L8d:
            r4 = -1
        L8e:
            if (r4 == 0) goto Lad
            if (r4 == r2) goto Laa
            r6 = 0
            if (r4 == r3) goto L9b
            if (r4 == r1) goto L98
            return r6
        L98:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.REWARDED
            return r6
        L9b:
            com.fyber.fairbid.internal.Constants$AdType r0 = com.fyber.fairbid.internal.Constants.AdType.INTERSTITIAL
            int r1 = com.ironsource.adqualitysdk.sdk.i.br.f1016
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.br.f1017 = r2
            int r1 = r1 % r3
            if (r1 != 0) goto La9
            return r0
        La9:
            throw r6
        Laa:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.BANNER
            return r6
        Lad:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.br.m5394(java.lang.String):com.fyber.fairbid.internal.Constants$AdType");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5399(RewardedListener rewardedListener) {
        f1017 = (f1016 + 93) % 128;
        m5420(rewardedListener);
        int i10 = f1017 + 111;
        f1016 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Constants.AdType m5401(String str) {
        int i10 = f1016 + 45;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adTypeM5394 = m5394(str);
        if (i11 != 0) {
            int i12 = 0 / 0;
        }
        return adTypeM5394;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m5408(MediationConfig mediationConfig) {
        int i10 = f1017 + 85;
        f1016 = i10 % 128;
        int i11 = i10 % 2;
        List<AdapterConfiguration> listM5419 = m5419(mediationConfig);
        if (i11 == 0) {
            int i12 = 12 / 0;
        }
        int i13 = f1017 + 31;
        f1016 = i13 % 128;
        if (i13 % 2 != 0) {
            return listM5419;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5411(FairBid.AdsConfig adsConfig) {
        int i10 = f1016 + 7;
        f1017 = i10 % 128;
        if (i10 % 2 != 0) {
            m5415(adsConfig);
            throw null;
        }
        String strM5415 = m5415(adsConfig);
        f1017 = (f1016 + 17) % 128;
        return strM5415;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5416(ImpressionData impressionData) {
        f1017 = (f1016 + 77) % 128;
        String strM5386 = m5386(impressionData);
        f1016 = (f1017 + 17) % 128;
        return strM5386;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5402(FairBid.AdsConfig adsConfig) {
        int i10 = f1016 + 11;
        f1017 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5406(adsConfig);
        }
        m5406(adsConfig);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5409(InterstitialListener interstitialListener) {
        int i10 = f1017 + 73;
        f1016 = i10 % 128;
        int i11 = i10 % 2;
        m5398(interstitialListener);
        if (i11 == 0) {
            int i12 = 52 / 0;
        }
        f1016 = (f1017 + 71) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5412(ImpressionData impressionData) {
        f1017 = (f1016 + 95) % 128;
        String strM5385 = m5385(impressionData);
        f1016 = (f1017 + 91) % 128;
        return strM5385;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5417(Placement placement) {
        f1016 = (f1017 + 27) % 128;
        String strM5407 = m5407(placement);
        int i10 = f1017 + 97;
        f1016 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
        return strM5407;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5397("\uf828䬇鹡\ue185㒞蟊쬨ḕ慓뒳ߢ䫎鸞\ue167㑗融쫸ᷗ愗둑ޥ䪍鷥\ue125㐙蝉쪸", View.getDefaultSize(0, 0) + 45869).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5387();
            }
        });
        map.put(m5418("곜겻㠞⃮䬌穒㻆眸컬䊣\ud80b\udb5b树\ue573뺲社詃ߪፇߦ◢馏\uf122ꑎ䜈㱂", -TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5410((Constants.AdType) list.get(0));
            }
        });
        map.put(m5397("\uf828삳褉凍ᩆ\ue2c2ꮫ琅㳴՝췜隳弍⟎\ue070\ua8cc熾㨶ˡ쭵鏘岧┄\ued95뙹绊䞑\u0015좃酿", View.getDefaultSize(0, 0) + 14489).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5404((ImpressionData) list.get(0));
            }
        });
        map.put(m5418("ꅿꄘ斒絢㋽Σꦔ\ue062썆Ἃꇱ䰔斤룜읆\uee6a蟭婇檺邭⡎쐥裢㌃䪿懎⹁함\uece9\u0378䶌瞱ᅘ", -Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5416((ImpressionData) list.get(0));
            }
        });
        map.put(m5418("\uec0f\uec68趠镐㏠ʾ佟ک踶\uf739ꃬ꫟⣔僮왛ࢡ쪝뉵殧癦放Ⱇ觿허ߏ觼⽜㎣ꆙ\ueb4a䲑酺尨䔗틳ﳐﻜ\ua6fc灅媘", 1 - TextUtils.indexOf("", "", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5412((ImpressionData) list.get(0));
            }
        });
        map.put(m5397("\uf828넩樽⌏\udc2e锰丯ܿ뀤椧∸\udb01鐅䴬\u0604뼖栞ℸ\uda1c錛䰒Ԟ빩睙\u2068\ud971鉳䭽Ѿ", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18691).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5403((ImpressionData) list.get(0));
            }
        });
        map.put(m5397("\uf828兕\uaac5ѻ州띄Ç婓도ോ曐끕\u09d5捸볜ᙊ濞륶ዀ汐엊ὅ棋쉒ᯮ界", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43391).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5396((ImpressionData) list.get(0));
            }
        });
        map.put(m5397("\uf828劕굅\uf83b勞궄\uf847匓귄\uf88b卐긕\uf8d5厸깜金叞꺮籠吖껳礪呜꼉戮咜", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43710).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Double.valueOf(br.m5389((ImpressionData) list.get(0)));
            }
        });
        map.put(m5418("旹斞䩇劷顖꤈Ꟃ\uee34߀マ\u0b5a䉂ꄢ霉淭\ue03c䍫疒쀑黻\uecc8\uebe1≞㵞踼上蓱\udb21⡤ⲃ\ue710", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5392((ImpressionData) list.get(0));
            }
        });
        map.put(m5397("\uf828픷ꈁ网䱖\u19ae\uf693쏡郔渹㬄ࠟ\ue57d뉲辸岈⧾ۣ퐡ꄞ繮䭜ᡅ\uf5bd슄鿿泏㨄ᜌ\ue46b녈躥宁", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11549).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5388((ImpressionData) list.get(0));
            }
        });
        map.put(m5418("馣駄귷딇\udd5b\uec05뤰\uf0c6ﮚ흮乗岰嵸点⣠ﻎ뼱鈢蔜耉႒\u0c51杀⎤牷ꦯ쇼엂퐵쬳ꈝ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5391((ImpressionData) list.get(0));
            }
        });
        map.put(m5418("舮艉ᔻ\u0dcb\uea6c\udb32⸆柸\ue00a澢祛쮏", TextUtils.getOffsetBefore("", 0) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5411((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m5397("\uf828⣍姵誩뮧\ueca3ᵗ乻", 53479 - TextUtils.getCapsMode("", 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5402((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m5397("\uf828\u0df1ᎍᦟ⽇㕩㬝䃆囲岎抂桉繥萶觜鿽ꖊꮶ녈읺촺틗\ud8f3\uee91", 62939 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5408((MediationConfig) list.get(0));
            }
        });
        map.put(m5397("\uf828䱁郭\ue55e⦏縹슮ᛇ孺꿩\uf40f㢢贊텄◁橳뺏̱", 46187 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5400((Placement) list.get(0));
            }
        });
        map.put(m5397("\uf828۽֕ҚͿȝĦ࿋ບඥేଆਕࣅ០ᚳ", TextUtils.indexOf("", "", 0, 0) + 65239).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5417((Placement) list.get(0));
            }
        });
        map.put(m5397("\uf828\ueca7턡언ꨗ黯荢矱届䃟㖣ᨴຠ\uf32e\ue798챢냻ꕾ觀繊", 5261 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5414((MediationManager) list.get(0));
            }
        });
        map.put(m5397("\uf828쵏鋱堡\u2dbf\uf2e2롨跼匂ᢇ\uedd3덭碞", 13669 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return br.m5401((String) list.get(0));
            }
        });
        map.put(m5397("\uf83c楋\udaf9䰥붥⻞遬ƚ猴\ue452嗬윐⢪駃୭粬\uee36彍샩㈙ꎵᓟ虫", TextUtils.getCapsMode("", 0, 0) + 37217).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                br.m5409((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m5397("\uf83c弿똑ഢ摾뭑ቐ榮삃➗绹헤Ⳛ萭\udb1d㈑襱\ue04f䝇", View.MeasureSpec.getSize(0) + 42773).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                br.m5399((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m5397("\uf82e걯傚ӓꥱ嶤Ǯ뙾媶໖댅枻\u0bcf", 21587 - TextUtils.getTrimmedLength("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(br.m5390());
            }
        });
        int i10 = f1017 + 97;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5403(ImpressionData impressionData) {
        int i10 = f1017 + 51;
        f1016 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5382(impressionData);
        }
        m5382(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5406(FairBid.AdsConfig adsConfig) {
        int i10 = f1016 + 101;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        String str = adsConfig.store;
        if (i11 != 0) {
            int i12 = 63 / 0;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5026(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.br.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5407(Placement placement) {
        f1016 = (f1017 + 47) % 128;
        String name = placement.getName();
        int i10 = f1016 + 87;
        f1017 = i10 % 128;
        if (i10 % 2 == 0) {
            return name;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        int i10 = f1016 + 53;
        f1017 = i10 % 128;
        try {
            try {
                String str = (String) (i10 % 2 != 0 ? FairBid.class.getDeclaredField(m5397("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", 16842065 >>> Color.rgb(1, 1, 0)).intern()) : FairBid.class.getDeclaredField(m5397("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", Color.rgb(0, 0, 0) + 16842065).intern())).get(null);
                int i11 = f1016 + 103;
                f1017 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 81 / 0;
                }
                return str;
            } catch (Exception unused) {
                return hu.m6637().m6639().m6739(FairBid.class, m5418("턩텷攡緯ࣥ㦓̠䫻댠ΰ鯀\ue6c6ᗜ롇ﵫ䓸\uf788媛傘㩮堤쒟닃馐㫐愳ᐏ", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementsHandler m5405(MediationManager mediationManager) {
        int i10 = f1016 + 105;
        f1017 = i10 % 128;
        if (i10 % 2 != 0) {
            mediationManager.getPlacementsHandler();
            throw null;
        }
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        f1016 = (f1017 + 29) % 128;
        return placementsHandler;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constants.AdType m5395(Placement placement) {
        int i10 = f1016 + 41;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adType = placement.getAdType();
        if (i11 != 0) {
            int i12 = 38 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5398(InterstitialListener interstitialListener) {
        int i10 = f1016 + 13;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5397(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1019);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementType m5413(Constants.AdType adType) {
        int i10 = f1017 + 103;
        f1016 = i10 % 128;
        int i11 = i10 % 2;
        PlacementType placementType = adType.getPlacementType();
        if (i11 == 0) {
            int i12 = 72 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5415(FairBid.AdsConfig adsConfig) {
        int i10 = f1016 + 55;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        String str = adsConfig.appId;
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1016 + 75;
        f1017 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 58 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m5419(MediationConfig mediationConfig) {
        int i10 = f1017 + 1;
        f1016 = i10 % 128;
        int i11 = i10 % 2;
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        if (i11 == 0) {
            int i12 = 88 / 0;
        }
        return adapterConfigurations;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5420(RewardedListener rewardedListener) {
        int i10 = f1016 + 25;
        f1017 = i10 % 128;
        int i11 = i10 % 2;
        Rewarded.setRewardedListener(rewardedListener);
        if (i11 != 0) {
            int i12 = 10 / 0;
        }
        f1017 = (f1016 + 15) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5418(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f1018, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f1018));
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
