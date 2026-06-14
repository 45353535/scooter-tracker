package com.appsflyer.internal;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFg1bSDK {
    @VisibleForTesting
    private static String getCurrencyIso4217Code(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 == 0 || i10 == str.length() - 1) {
                sb2.append(str.charAt(i10));
            } else {
                sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
            }
        }
        return sb2.toString();
    }

    public static void getMediationNetwork(String str, @Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getCurrencyIso4217Code(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getMonetizationNetwork("tcstring"));
                }
                if (jSONObject.has(Constants.REFERRER)) {
                    jSONObject.put(Constants.REFERRER, getMonetizationNetwork(Constants.REFERRER));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb2.toString());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e10);
            }
        }
    }

    public static String getMonetizationNetwork(String str) {
        if (str.length() <= 20) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 10));
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        return sb2.toString();
    }
}
