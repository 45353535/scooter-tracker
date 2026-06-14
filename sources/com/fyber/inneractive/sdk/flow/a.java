package com.fyber.inneractive.sdk.flow;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static void a(InneractiveAdRequest inneractiveAdRequest, InneractiveInfrastructureError inneractiveInfrastructureError, x xVar, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
        String string;
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() == i.ADM_FETCH_FAILED || inneractiveInfrastructureError.getErrorCode().getMetricable() != InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS) {
            return;
        }
        if (xVar == null || xVar.c() || xVar.isVideoAd()) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_LOAD_FAILED;
            if (inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                return;
            }
            IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
            if (inneractiveInfrastructureError.getCause() != null) {
                string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
            } else {
                StringBuilder sb2 = new StringBuilder();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i10 = 7; i10 >= 0 && i10 < 13 && i10 < stackTrace.length; i10++) {
                    sb2.append(stackTrace[i10].toString());
                    sb2.append(StringUtils.COMMA);
                }
                Log.d("stack trace:", sb2.toString());
                string = sb2.toString();
            }
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.f21417b = tVar;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArray;
            JSONObject jSONObject = new JSONObject();
            String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
            try {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, string2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, string2);
            }
            try {
                jSONObject.put("description", string);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "description", string);
            }
            String strDescription = inneractiveInfrastructureError.description();
            try {
                jSONObject.put("extra_description", strDescription);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
            }
            wVar.f21421f.put(jSONObject);
            wVar.a((String) null);
            inneractiveInfrastructureError.addReportedError(tVar);
        }
    }
}
