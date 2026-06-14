package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import net.pubnative.lite.sdk.models.AdExperience;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48781a = "c";

    class a implements com.mbridge.msdk.tracker.h {
        a() {
        }

        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI == null) {
                jSONObjectI = new JSONObject();
            }
            try {
                jSONObjectI.put(C4240b4.i.W, eVar.g());
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                int iS = m0.s(contextD);
                if (!jSONObjectI.has("network_type")) {
                    jSONObjectI.put("network_type", iS);
                    jSONObjectI.put("network_str", m0.a(contextD, iS));
                }
                if (!jSONObjectI.has("st")) {
                    jSONObjectI.put("st", System.currentTimeMillis());
                }
                String strOptString = jSONObjectI.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f48255r.get(strOptString);
                    jSONObjectI.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !jSONObjectI.has("b")) {
                    jSONObjectI.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g) && !jSONObjectI.has(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                    jSONObjectI.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
                    return jSONObjectI;
                }
            } catch (Exception e10) {
                q0.b(c.f48781a, e10.getMessage());
            }
            return jSONObjectI;
        }
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            return true;
        }
        return b.a(gVarD, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove(AdExperience.BRAND);
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove(N6.f41375d0);
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove(CommonUrlParts.OS_VERSION);
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.f48757d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.f48758e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(N6.V0);
        jSONObject.remove("gaid2");
        jSONObject.remove(CommonUrlParts.HUAWEI_OAID);
        jSONObject.remove("az_aid_info");
    }
}
