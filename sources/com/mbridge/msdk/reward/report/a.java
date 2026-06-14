package com.mbridge.msdk.reward.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n nVarA = n.a(g.a(context));
                if (TextUtils.isEmpty(str) || nVarA == null || nVarA.d() <= 0) {
                    return;
                }
                List<com.mbridge.msdk.foundation.entity.n> listA = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA2 = nVarA.a("2000021");
                List<com.mbridge.msdk.foundation.entity.n> listA3 = nVarA.a("2000039");
                List<com.mbridge.msdk.foundation.entity.n> listA4 = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA5 = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA6 = nVarA.a("2000044");
                o.e(listA2);
                o.a(listA);
                o.c(listA3);
                o.b(listA4);
                o.f(listA5);
                o.d(listA6);
            } catch (Exception e10) {
                q0.b("RewardReport", e10.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str) {
        int iA;
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (v0.c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            if (campaignEx.getRewardTemplateMode() != null && (iA = d.a(campaignEx, campaignEx.getRewardTemplateMode().j())) != -1) {
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, iA);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("RewardReport", th2.getMessage());
        }
    }
}
