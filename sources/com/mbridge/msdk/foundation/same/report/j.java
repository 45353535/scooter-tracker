package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.purchase.ADJPConstants;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.models.AdExperience;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48826b = "j";

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] list;
            try {
                String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_CRASH_INFO);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                File file = new File(strB);
                if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                    for (String str : list) {
                        File file2 = new File(strB + "/" + str);
                        if (file2.exists()) {
                            String strE = o0.e(file2);
                            if (!TextUtils.isEmpty(strE)) {
                                String[] strArrSplit = strE.split("====");
                                if (strArrSplit.length > 0) {
                                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(new JSONObject(strArrSplit[0]));
                                }
                            }
                            com.mbridge.msdk.foundation.same.d.a(file2);
                        }
                    }
                }
            } catch (Throwable th2) {
                q0.b(j.f48826b, th2.getMessage());
            }
        }
    }

    public static boolean a() {
        try {
            return System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS > ((Long) y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static void b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.put(C4240b4.i.W, "2000054");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", "");
            jSONObject.put("result", 2);
            if (campaignEx.getAdType() == 287) {
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 3);
            } else if (campaignEx.getAdType() == 94) {
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            } else if (campaignEx.getAdType() == 296) {
                jSONObject.put("ad_type", 5);
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 297) {
                jSONObject.put("ad_type", 6);
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 298) {
                jSONObject.put("ad_type", 7);
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
            } else {
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            }
            jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void c() {
        try {
            y0.b(com.mbridge.msdk.foundation.controller.c.n().d(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static JSONObject a(Campaign campaign, int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i10);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
                return jSONObject;
            }
            jSONObject.put("value", "");
            return jSONObject;
        } catch (Exception e10) {
            q0.b(f48826b, e10.getMessage());
            return jSONObject;
        }
    }

    public static com.mbridge.msdk.foundation.same.net.wrapper.e a(Context context) {
        String str = "1";
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        try {
            eVar.a("platform", "1");
            eVar.a("package_name", URLEncoder.encode(m0.t(context)));
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
                eVar.a(AdExperience.BRAND, URLEncoder.encode(m0.s()));
                eVar.a("model", URLEncoder.encode(m0.n()));
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a(N6.V0, "");
                } else {
                    eVar.a(N6.V0, com.mbridge.msdk.foundation.tools.g.d());
                }
                eVar.a("mnc", m0.r(context));
                eVar.a("mcc", m0.q(context));
                int iS = m0.s(context);
                eVar.a("network_type", iS + "");
                eVar.a("network_str", m0.a(context, iS));
                eVar.a("language", URLEncoder.encode(m0.p(context)));
                eVar.a("timezone", URLEncoder.encode(m0.w()));
                eVar.a(N6.f41375d0, URLEncoder.encode(m0.i()));
                eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
                if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                    str = "0";
                }
                eVar.a("adid_limit_dev", str);
            }
            eVar.a(ADJPConstants.KEY_SDK_VERSION, MBConfiguration.SDK_VERSION);
            eVar.a(CommonUrlParts.APP_VERSION, URLEncoder.encode(m0.B(context)));
            eVar.a("orientation", URLEncoder.encode(m0.F(context) + ""));
            eVar.a("screen_size", m0.n(context) + "x" + m0.m(context));
            if (com.mbridge.msdk.util.b.a()) {
                com.mbridge.msdk.foundation.same.net.wrapper.f.f(eVar);
            }
            k.a(eVar, context);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            if (gVarD != null) {
                JSONObject jSONObjectA = a(context, gVarD);
                if (!TextUtils.isEmpty(jSONObjectA.toString())) {
                    String strB = k0.b(jSONObjectA.toString());
                    if (!TextUtils.isEmpty(strB)) {
                        eVar.a("dvi", strB);
                        return eVar;
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    public static void b() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000090");
            jSONObject.put("reason", TextUtils.isEmpty(str) ? "" : str);
            jSONObject.put("result", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48826b, e10.getMessage());
        }
    }

    public static JSONObject a(Context context, com.mbridge.msdk.setting.g gVar) throws Exception {
        return k.a(context, gVar);
    }

    public static JSONObject a(String str, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, str);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
            return null;
        }
    }

    public static void a(Context context, String str, String str2, int i10, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000076");
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("reason", str3);
                jSONObject.put("result", i10);
                jSONObject.put("url", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b(f48826b, th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, String str3, int i11) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000073");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", str3);
            jSONObject.put("result", i10);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i11 != -1) {
                jSONObject.put("d_t", i11);
            }
            jSONObject.put("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, int i11, int i12) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000075");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("type", i10);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("status", i11);
            if (i12 != -1) {
                jSONObject.put("d_t", i12);
            }
            jSONObject.put("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, int i11) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000074");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("type", i10);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i11 != -1) {
                jSONObject.put("d_t", i11);
            }
            jSONObject.put("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, boolean z10, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000047");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.f48255r.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (campaignEx != null) {
                    jSONObject.put("cid", campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                jSONObject.put("st", System.currentTimeMillis());
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
                jSONObject.put("reason", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b(f48826b, th2.getMessage());
            }
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, boolean z10) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                CampaignEx campaignEx2 = list.get(i10);
                if (i10 < list.size() - 1) {
                    sb2.append(campaignEx2.getRtinsType());
                    sb2.append(StringUtils.COMMA);
                } else {
                    sb2.append(campaignEx2.getRtinsType());
                }
            }
            jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, sb2.toString());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, boolean z10, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000104");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = com.mbridge.msdk.foundation.controller.a.f48255r.get(str2);
                    if (str7 == null) {
                        str7 = "";
                    }
                    jSONObject.put("u_stid", str7);
                }
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put("rid", str3);
                jSONObject.put("rid_n", str4);
                jSONObject.put("cid", str5);
                jSONObject.put("template_id", str6);
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
                jSONObject.put("reason", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b(f48826b, th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C4240b4.i.W, "2000054");
                    jSONObject.put("network_type", m0.s(context));
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    jSONObject.put("reason", str2);
                    jSONObject.put("result", 1);
                    jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
                    if (campaignEx != null) {
                        jSONObject.put("cid", campaignEx.getId());
                        if (campaignEx.getAdType() == 287) {
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 3);
                        } else if (campaignEx.getAdType() == 94) {
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        } else if (campaignEx.getAdType() == 296) {
                            jSONObject.put("ad_type", 5);
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
                        } else if (campaignEx.getAdType() == 297) {
                            jSONObject.put("ad_type", 6);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else if (campaignEx.getAdType() == 298) {
                            jSONObject.put("ad_type", 7);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else {
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        }
                        jSONObject.put("devid", com.mbridge.msdk.foundation.tools.g.d());
                        if (campaignEx.isBidCampaign()) {
                            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
                        }
                        jSONObject.put("rid", campaignEx.getRequestId());
                        jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                        jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
            } catch (Throwable th2) {
                q0.b(f48826b, th2.getMessage());
            }
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, String str2, int i12, int i13, int i14, String str3) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C4240b4.i.W, URLEncoder.encode("2000094", D5.N));
            if (campaignEx != null) {
                eVar.a("rid", URLEncoder.encode(campaignEx.getRequestId(), D5.N));
                eVar.a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), D5.N));
                eVar.a("cid", URLEncoder.encode(campaignEx.getId(), D5.N));
                cVar = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
            } else {
                cVar = null;
            }
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, D5.N));
            if (i10 == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "0";
                }
                eVar.a("video_prg", str3 + "");
            } else {
                eVar.a("video_prg", i10 + "");
            }
            eVar.a(TypedValues.CycleType.S_WAVE_PHASE, i11 + "");
            eVar.a("feedback_content", URLEncoder.encode(str2, D5.N));
            eVar.a("feedback_close", i12 + "");
            eVar.a("type", i14 + "");
            eVar.a("ad_type", i13 + "");
            eVar.a("network_type", URLEncoder.encode(String.valueOf(m0.s(com.mbridge.msdk.foundation.controller.c.n().d())), D5.N));
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.n(str);
            cVar.a(i13);
            cVar.a("2000094", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000094", cVar);
        } catch (Exception e10) {
            q0.b(f48826b, e10.getMessage());
        }
    }

    public static void a(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000088");
            jSONObject.put("state", str);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null || b.a(gVarD, jSONObject.toString())) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i10, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000114");
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(DomainCampaignEx.KEY_GH_ID, TextUtils.isEmpty(campaignEx.getGhId()) ? "" : campaignEx.getGhId());
            jSONObject.put(DomainCampaignEx.KEY_GH_PATH, TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : campaignEx.getGhPath());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("result", i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("reason", str);
            jSONObject.put("cid", campaignEx.getId());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(int i10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000080");
            jSONObject.put("ad_type", i10);
            jSONObject.put("url", str);
            jSONObject.put("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48826b, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, "2000121");
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("type", i10);
            jSONObject.put("result", i11);
            jSONObject.put("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48826b, e10.getMessage());
        }
    }

    public static void a(String str, int i10, int i11, String str2, int i12, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C4240b4.i.W, URLEncoder.encode("m_water_mark_result", D5.N));
            eVar.a("water_mark_result", i11 + "");
            eVar.a("water_mark_error_msg", URLEncoder.encode(str2, D5.N));
            eVar.a("render_result", i12 + "");
            eVar.a("water_mark_str", URLEncoder.encode(str3, D5.N));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a(i10);
            cVar.n(str);
            cVar.a("m_water_mark_result", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_water_mark_result", cVar);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }

    public static void a(boolean z10, long j10, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("status", z10 ? "1" : "2");
            eVar.a("is_allow_crash", com.mbridge.msdk.foundation.controller.c.n().e().b() ? "1" : "2");
            eVar.a("is_allow_anr", com.mbridge.msdk.foundation.controller.c.n().e().a() ? "1" : "2");
            eVar.a("executionTime", String.valueOf(j10));
            if (!TextUtils.isEmpty(str)) {
                eVar.a("reason", str);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a("m_init_sdk", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_init_sdk", cVar);
        } catch (Throwable th2) {
            q0.b(f48826b, th2.getMessage());
        }
    }
}
