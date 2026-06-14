package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInfrastructureError f20641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20642b;

    public e(f fVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f20642b = fVar;
        this.f20641a = inneractiveInfrastructureError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String string;
        com.fyber.inneractive.sdk.response.e eVar = this.f20642b.f20729b;
        if (eVar == null || (str = eVar.f23728h) == null) {
            return;
        }
        Map map = eVar.f23738r;
        if (map == null && eVar.f23739s == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f20315u.f20484b;
        String strA = oVar.a("max_failed_creatives_interval_hours", f.f20727e);
        String strA2 = oVar.a("max_failed_creatives_per_interval", f.f20728f);
        int iA = com.fyber.inneractive.sdk.util.v.a(strA, 24);
        int iA2 = com.fyber.inneractive.sdk.util.v.a(strA2, 1);
        Application application = com.fyber.inneractive.sdk.util.o.f23888a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString("lt", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.f20642b.f21125a) && !com.fyber.inneractive.sdk.metrics.a.a(iA, iA2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    try {
                        string = new JSONObject(map).toString();
                    } catch (Throwable unused2) {
                        string = "";
                    }
                } else {
                    string = this.f20642b.f20729b.f23739s;
                }
                f fVar = this.f20642b;
                InneractiveAdRequest inneractiveAdRequest = fVar.f20730c;
                com.fyber.inneractive.sdk.response.e eVar2 = fVar.f20729b;
                InneractiveInfrastructureError inneractiveInfrastructureError = this.f20641a;
                JSONArray jSONArray2 = fVar.f20731d;
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_FAILURE_DATA;
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                wVar.f21417b = tVar;
                wVar.f21416a = inneractiveAdRequest;
                wVar.f21419d = jSONArray2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", string);
                } catch (Exception unused4) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "headers", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("error_code", strDescription);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strDescription);
                }
                wVar.f21421f.put(jSONObject);
                wVar.a((String) null);
            }
            sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
