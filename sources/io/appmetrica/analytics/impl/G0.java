package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.amazon.device.ads.DTBMetricsConfiguration;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class G0 {
    public static String a(F0 f02) {
        try {
            return Base64.encodeToString(new JSONObject().put(DTBMetricsConfiguration.APSMETRICS_APIKEY, f02.f75748a).put("packageName", f02.f75749b).put("reporterType", f02.f75750c.getStringValue()).put("processID", f02.f75751d).put("processSessionID", f02.f75752e).put("errorEnvironment", f02.f75753f).toString().getBytes(Charsets.UTF_8), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static F0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
            return new F0(jSONObject.getString(DTBMetricsConfiguration.APSMETRICS_APIKEY), jSONObject.getString("packageName"), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
