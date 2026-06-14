package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f23749a;

    public k(o oVar) {
        this.f23749a = oVar;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final void a(b bVar) {
        float f10;
        Long lValueOf;
        bVar.f23710a.D = false;
        IAConfigManager.O.f20318x.f20514e = false;
        ImpressionData impressionData = new ImpressionData();
        Map mapB = this.f23749a.b();
        String strA = a(mapB, n.RETURNED_AD_TYPE);
        a(mapB, n.ERROR_CODE);
        String strA2 = a(mapB, n.SESSION_ID);
        String strA3 = a(mapB, n.CONTENT_ID);
        a(mapB, n.PUBLISHER_ID);
        String strA4 = a(mapB, n.WIDTH);
        String strA5 = a(mapB, n.HEIGHT);
        String strA6 = a(mapB, n.SDK_IMPRESSION_URL);
        String strA7 = a(mapB, n.SDK_CLICK_URL);
        String strA8 = a(mapB, n.ATTRIBUTION_IMPRESSION_URL);
        String strA9 = a(mapB, n.ATTRIBUTION_CLICK_URL);
        String strA10 = a(mapB, n.AD_TIMEOUT);
        String strA11 = a(mapB, n.AD_COMPLETION_URL);
        bVar.f23711b = a(mapB, n.AD_UNIT_ID);
        a(mapB, n.AD_UNIT_TYPE);
        String strA12 = a(mapB, n.AD_UNIT_DISPLAY_TYPE);
        String strA13 = a(mapB, n.AD_NETWORK);
        String strA14 = a(mapB, n.AD_NETWORK_ID);
        String strA15 = a(mapB, n.CREATIVE_ID);
        String strA16 = a(mapB, n.AD_DOMAIN);
        String strA17 = a(mapB, n.APP_BUNDLE);
        String strA18 = a(mapB, n.CAMPAIGN_ID);
        String strA19 = a(mapB, n.CPM_VALUE);
        String strA20 = a(mapB, n.CPM_CURRENCY);
        impressionData.setCpmValue(strA19);
        impressionData.setCurrency(strA20);
        String strA21 = a(mapB, n.BANNER_MRC_PERCENT);
        String strA22 = a(mapB, n.BANNER_MRC_DURATION);
        String strA23 = a(mapB, n.BANNER_MRC_IMPRESSION_URL);
        String strA24 = a(mapB, n.INTERSTITIAL_SKIP_MODE);
        String strA25 = a(mapB, n.IGNITE_INSTALL_URL);
        String strA26 = a(mapB, n.IGNITE_MODE);
        String strA27 = a(mapB, n.APP_BUNDLE_LAUNCHER);
        String strA28 = a(mapB, n.BRAND_BIDDER_SHOW_ENDCARD);
        String strA29 = a(mapB, n.BRAND_BIDDER_CTA_TEXT);
        String strA30 = a(mapB, n.MRAID_VIDEO_SIGNAL);
        String strA31 = a(mapB, n.CREATIVE_TYPE);
        if (bVar.c()) {
            bVar.f23710a.f23738r = mapB;
        }
        bVar.f23710a.a(strA10);
        impressionData.setImpressionId(strA2);
        impressionData.setDemandSource(strA13);
        e eVar = bVar.f23710a;
        eVar.f23724d = strA3;
        eVar.A = strA17;
        if (!TextUtils.isEmpty(strA14)) {
            if (TextUtils.isEmpty(strA14)) {
                lValueOf = null;
                impressionData.setDemandId(lValueOf);
            } else {
                try {
                    lValueOf = Long.valueOf(strA14);
                } catch (NumberFormatException unused) {
                    lValueOf = null;
                }
                impressionData.setDemandId(lValueOf);
            }
        }
        if (!TextUtils.isEmpty(strA)) {
            bVar.f23710a.f23727g = Integer.valueOf(strA).intValue();
        }
        if (!TextUtils.isEmpty(strA4)) {
            bVar.f23710a.f23725e = Integer.valueOf(strA4).intValue();
        }
        if (!TextUtils.isEmpty(strA5)) {
            bVar.f23710a.f23726f = Integer.valueOf(strA5).intValue();
        }
        e eVar2 = bVar.f23710a;
        eVar2.f23731k = strA6;
        eVar2.f23732l = strA7;
        eVar2.f23733m = strA8;
        eVar2.f23734n = strA9;
        eVar2.f23737q = strA11;
        eVar2.f23735o = bVar.f23711b;
        try {
            eVar2.f23736p = UnitDisplayType.fromValue(strA12);
        } catch (IllegalArgumentException unused2) {
            bVar.f23710a.f23736p = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(strA15)) {
            impressionData.setCreativeId(strA15);
        }
        if (!TextUtils.isEmpty(strA16)) {
            impressionData.setAdvertiserDomain(strA16);
        }
        if (!TextUtils.isEmpty(strA18)) {
            impressionData.setCampaignId(strA18);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        e eVar3 = bVar.f23710a;
        eVar3.f23740t = impressionData;
        eVar3.f23742v = v.a(strA21, 0);
        e eVar4 = bVar.f23710a;
        if (TextUtils.isEmpty(strA22)) {
            f10 = -1.0f;
        } else {
            try {
                f10 = Float.parseFloat(strA22);
            } catch (NumberFormatException unused3) {
                f10 = -1.0f;
            }
        }
        eVar4.f23743w = f10;
        e eVar5 = bVar.f23710a;
        eVar5.f23744x = strA23;
        eVar5.f23745y = v.a(strA24, -1);
        if (!TextUtils.isEmpty(strA25)) {
            bVar.f23710a.G = strA25;
        }
        if (!TextUtils.isEmpty(strA26)) {
            e eVar6 = bVar.f23710a;
            m mVarA = m.a(strA26);
            if (mVarA == null) {
                eVar6.getClass();
                mVarA = m.NONE;
            }
            eVar6.H = mVarA;
        }
        if (!TextUtils.isEmpty(strA27)) {
            bVar.f23710a.I = strA27;
        }
        if (!TextUtils.isEmpty(strA28)) {
            bVar.f23710a.E = strA28;
        }
        if (!TextUtils.isEmpty(strA29)) {
            bVar.f23710a.F = strA29;
        }
        bVar.f23710a.J = "1".equals(strA30) || Boolean.parseBoolean(strA30);
        bVar.f23710a.M = CreativeType.fromValue(strA31);
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f23749a.a().toString();
    }

    public final String a(Map map, n nVar) {
        String lowerCase = nVar.a().toLowerCase(Locale.US);
        String str = (String) map.get(lowerCase);
        IAlog.e("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        return str;
    }
}
