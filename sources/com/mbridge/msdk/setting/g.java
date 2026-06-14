package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g extends b {
    public static g C(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.b(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("Setting", "parseSetting", e10);
            }
            return null;
        }
    }

    public String M0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", k());
            jSONObject.put("cfc", m());
            jSONObject.put("cfb", C0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, a0());
            jSONObject.put("awct", i());
            jSONObject.put("rurl", J0());
            jSONObject.put("ujds", K0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, b0());
            jSONObject.put("tcto", p0());
            jSONObject.put("mv_wildcard", P());
            jSONObject.put("is_startup_crashsystem", E());
            jSONObject.put("sfct", m0());
            jSONObject.put("pcrn", W());
            jSONObject.put("adct", e());
            jSONObject.put("atrqt", h());
            jSONObject.put("omsdkjs_url", U());
            jSONObject.put("mcs", N());
            jSONObject.put("GDPR_area", F0());
            jSONObject.put("alrbs", f());
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE, t());
            jSONObject.put("isDefault", D());
            jSONObject.put("st_net", o0());
            jSONObject.put("vtag", w0());
            return jSONObject.toString();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("Setting", "toJSON", th2);
            return null;
        }
    }
}
