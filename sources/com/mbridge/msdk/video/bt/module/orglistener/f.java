package com.mbridge.msdk.video.bt.module.orglistener;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52265a = "com.mbridge.msdk.video.bt.module.orglistener.f";

    public static void a(Context context, CampaignEx campaignEx, String str, int i10) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000054");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", "");
            jSONObject.put("templateshowtype", i10 + " offer show success");
            jSONObject.put("result", 2);
            jSONObject.put("ad_type", campaignEx.getAdType() == 287 ? 3 : 1);
            String str2 = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(Reporting.Key.CREATIVE, URLEncoder.encode(str2, "UTF-8"));
            }
            jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f52265a, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000054");
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("reason", str2);
                jSONObject.put("templateshowtype", i10);
                jSONObject.put("result", 1);
                String str3 = campaignEx.getendcard_url();
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put(Reporting.Key.CREATIVE, URLEncoder.encode(str3, "UTF-8"));
                }
                jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
                jSONObject.put("ad_type", campaignEx.getAdType() == 287 ? 3 : 1);
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th2) {
            q0.b(f52265a, th2.getMessage());
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000054");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(list.get(i10).getId());
            }
            jSONObject.put("cid", arrayList);
            jSONObject.put("result", 2);
            if (list.get(0) != null) {
                CampaignEx campaignEx = list.get(0);
                jSONObject.put("reason", "");
                jSONObject.put("templateshowtype", "two offer ec show success");
                jSONObject.put("ad_type", campaignEx.getAdType());
                jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f52265a, th2.getMessage());
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context == null || list == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000054");
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    arrayList.add(list.get(i10).getId());
                }
                jSONObject.put("cid", arrayList);
                jSONObject.put("reason", str2);
                jSONObject.put("result", 1);
                jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
                if (list.get(0) != null) {
                    CampaignEx campaignEx = list.get(0);
                    jSONObject.put("ad_type", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                    jSONObject.put("templateshowtype", campaignEx.getMof_tplid());
                    jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th2) {
            q0.b(f52265a, th2.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000115");
            jSONObject.put("network_type", m0.s(contextD));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("play_cur_time", i10);
            jSONObject.put("reason", "close ad in advance " + campaignEx.getMof_tplid());
            jSONObject.put("result", 1);
            jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
            jSONObject.put("ad_type", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f52265a, th2.getMessage());
        }
    }
}
