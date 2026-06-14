package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48824b = "h";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48825a;

    public h(Context context, int i10) {
        this.f48825a = context;
    }

    public void a(String str, com.mbridge.msdk.foundation.entity.e eVar, String str2) {
        JSONObject jSONObjectA = com.mbridge.msdk.foundation.entity.e.a(eVar);
        if (jSONObjectA != null) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObjectA);
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(C4240b4.i.W, URLEncoder.encode("2000066", D5.N));
            jSONObject.put("rid", URLEncoder.encode(str, D5.N));
            jSONObject.put("rid_n", URLEncoder.encode(str2, D5.N));
            jSONObject.put("cid", URLEncoder.encode(str3, D5.N));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, D5.N));
            jSONObject.put("err_method", str5);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48824b, e10.getMessage());
        }
    }

    public h(Context context) {
        this.f48825a = context.getApplicationContext();
    }

    public void a(int i10, int i11, String str, String str2, String str3) {
        i.a(this.f48825a, i10, i11, str, str2, str3);
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(C4240b4.i.W, URLEncoder.encode("2000065", D5.N));
            jSONObject.put("rid", URLEncoder.encode(str, D5.N));
            jSONObject.put("rid_n", URLEncoder.encode(str2, D5.N));
            jSONObject.put("cid", URLEncoder.encode(str3, D5.N));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, D5.N));
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, URLEncoder.encode(str5, D5.N));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48824b, e10.getMessage());
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        try {
            int iS = m0.s(this.f48825a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, URLEncoder.encode("2000071", D5.N));
            jSONObject.put("rid", URLEncoder.encode(str, D5.N));
            jSONObject.put("rid_n", URLEncoder.encode(str2, D5.N));
            jSONObject.put("cid", URLEncoder.encode(str3, D5.N));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, D5.N));
            jSONObject.put("reason", URLEncoder.encode(str5, D5.N));
            jSONObject.put("network_type", URLEncoder.encode(String.valueOf(iS), D5.N));
            jSONObject.put("result", URLEncoder.encode("0", D5.N));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48824b, e10.getMessage());
        }
    }

    public void a() {
        try {
            if (j.a()) {
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(strB);
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                String strD = com.mbridge.msdk.foundation.tools.g.d();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000053");
                jSONObject.put("Appid", strB);
                jSONObject.put("uptips2", gVarD.s0());
                jSONObject.put("info_status", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().g());
                jSONObject.put("iseu", gVarD.F());
                if (!TextUtils.isEmpty(strD)) {
                    jSONObject.put(N6.V0, strD);
                }
                jSONObject.put("GDPR_area", gVarD.F0());
                jSONObject.put("GDPR_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                j.c();
            }
        } catch (Throwable th2) {
            q0.b(f48824b, th2.getMessage());
        }
    }

    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(j.a((Campaign) null, i10, "request"));
    }

    public void a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_type", "1");
            jSONObject.put("cid", str);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(C4240b4.i.W, "2000027");
            jSONObject.put("http_url", str3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f48824b, e10.getMessage());
        }
    }
}
