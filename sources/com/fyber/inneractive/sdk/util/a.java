package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f23843a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23845c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23844b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23846d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23847e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23848f = 0;

    public final void a(boolean z10) {
        this.f23845c = z10;
        if (this.f23844b) {
            IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", z10 ? "skip" : "close");
            return;
        }
        IAlog.a("%s%s timer started", "AdExperienceLatency: ", z10 ? "skip" : "close");
        this.f23846d = System.currentTimeMillis();
        this.f23844b = true;
    }

    public final void a(String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f23844b) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.f23846d) - this.f23848f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str2 = seconds + "." + millis;
            InneractiveAdSpot inneractiveAdSpot = this.f23843a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = this.f23845c ? com.fyber.inneractive.sdk.network.u.USER_SKIP_ACTION_LATENCY : com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f21035a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f21037c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f21418c = uVar;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArrayB;
            JSONObject jSONObject = new JSONObject();
            String str3 = this.f23845c ? "skip_action_latency" : "close_action_latency";
            try {
                jSONObject.put(str3, str2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", str3, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject.put("origin", str);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
                }
            }
            wVar.f21421f.put(jSONObject);
            wVar.a((String) null);
            this.f23846d = 0L;
            this.f23847e = 0L;
            this.f23848f = 0L;
            this.f23844b = false;
        }
    }
}
