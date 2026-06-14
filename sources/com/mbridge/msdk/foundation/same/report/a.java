package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appsflyer.AppsFlyerProperties;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static JSONObject a() {
        JSONObject jSONObject;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        try {
            jSONObject = j.a(contextD).c();
        } catch (Exception e10) {
            q0.b("CommonDeviceInfo", "getCommonProperty error", e10);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g)) {
                com.mbridge.msdk.foundation.same.a.f48595g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g)) {
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
            }
            jSONObject.put("open", com.mbridge.msdk.foundation.same.a.S);
            String strA = Aa.a();
            if (strA == null) {
                strA = "";
            }
            jSONObject.put(AppsFlyerProperties.CHANNEL, strA);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.b().a());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            JSONObject jSONObjectA = a(gVarD);
            if (jSONObjectA != null) {
                String string = jSONObjectA.toString();
                if (!TextUtils.isEmpty(string)) {
                    String strB = k0.b(string);
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObject.put("dvi", strB);
                    }
                }
            }
            jSONObject.put("app_id", com.mbridge.msdk.foundation.controller.c.n().b());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(v0.m(contextD)));
            String strK = "UNKNOWN";
            if (gVarD != null) {
                strK = gVarD.k();
                jSONObject.put("a_stid", gVarD.a());
            }
            jSONObject.put("country_code", strK);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(com.mbridge.msdk.setting.g gVar) {
        try {
            return j.a(com.mbridge.msdk.foundation.controller.c.n().d(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
