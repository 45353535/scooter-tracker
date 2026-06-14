package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.ironsource.C4605wc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeRevenueParamsEntityForTradPlus extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForTradPlus(String str, String str2) {
        super(str, str2);
        setMediationName("TradPlus");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setTradPlusAdInfo(String str) {
        String strReplace;
        if (!TextUtils.isEmpty(str)) {
            try {
                String strReplace2 = str.replace("\"", "\\\"").replace("----------------------\n", "{\"").replaceAll("(?<!\"):(?!\")", "\":\"").replace(IOUtils.LINE_SEPARATOR_UNIX, "\",\"");
                if (strReplace2.endsWith("\"")) {
                    strReplace = (strReplace2 + "}").replace(",\"}", "}");
                } else {
                    strReplace = strReplace2 + "\"}";
                }
                JSONObject jSONObject = new JSONObject(strReplace);
                setAdType(jSONObject.optInt("placementAdType") + "");
                setMediationUnitId(jSONObject.optString("tpAdUnitId"));
                setNetworkName(jSONObject.optString(C4605wc.f45738a));
                setBidType(Boolean.valueOf(jSONObject.optBoolean("isBiddingNetwork", false)));
                setRevenue(jSONObject.optString("ecpm", ""));
                setPrecision(jSONObject.optString("ecpmPrecision", ""));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("instanceName", jSONObject.optString(C4605wc.f45738a, ""));
                jSONObject2.put("instanceId", jSONObject.optString("adSourceId", ""));
                setNetworkInfo(jSONObject2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        setSourceData(str, str);
    }
}
