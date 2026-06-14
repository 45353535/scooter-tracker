package com.mbridge.msdk.video.dynview.request;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52367a = "com.mbridge.msdk.video.dynview.request.a";

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.request.a$a, reason: collision with other inner class name */
    class C0587a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f52368a;

        C0587a(ViewGroup viewGroup) {
            this.f52368a = viewGroup;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, this.f52368a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, this.f52368a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.b(campaign, this.f52368a);
        }
    }

    public static void a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000091");
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g)) {
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, 0);
                jSONObject.put("rid_n", str3);
                jSONObject.put("reason", str);
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, v0.b(campaignEx.getRewardTemplateMode().j()));
                }
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b(f52367a, th2.getMessage());
            }
        }
    }

    public static void a(CampaignUnit campaignUnit, int i10, int i11, String str) {
        int i12;
        String impressionURL;
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0 || campaignUnit.getAds().get(i10) == null) {
            return;
        }
        if (i11 == 0 && campaignUnit.getAds().get(i10).mMoreOfferImpShow) {
            return;
        }
        String strA = c1.a(campaignUnit.getAds().get(i10).getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(strA)) {
            strA = c1.a(campaignUnit.getAds().get(i10).getendcard_url(), "mof_uid");
        }
        String str2 = TextUtils.isEmpty(strA) ? str : strA;
        if (i11 == 0) {
            i12 = com.mbridge.msdk.click.retry.a.f46603m;
            impressionURL = campaignUnit.getAds().get(i10).getImpressionURL();
        } else if (i11 != 1) {
            impressionURL = "";
            i12 = 0;
        } else {
            i12 = com.mbridge.msdk.click.retry.a.f46604n;
            impressionURL = campaignUnit.getAds().get(i10).getOnlyImpressionURL();
        }
        String str3 = impressionURL;
        int i13 = i12;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        com.mbridge.msdk.click.a.a(c.n().d(), campaignUnit.getAds().get(i10), str2, str3, false, true, i13);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, View view) {
        if (context == null || campaignEx == null) {
            return;
        }
        a(context, campaignEx);
        com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(context, str);
        if (view instanceof ViewGroup) {
            aVar.a(new C0587a((ViewGroup) view));
        }
        aVar.a(campaignEx);
    }

    private static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }
}
