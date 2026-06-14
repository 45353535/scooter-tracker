package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> f48295a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    static class C0510b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f48296a = new b();
    }

    public static b a() {
        return C0510b.f48296a;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e10;
        if (this.f48295a == null) {
            this.f48295a = new HashMap<>();
        }
        if (this.f48295a.containsKey(str)) {
            return this.f48295a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("c_cb", 0);
                    jSONObject.put("t_disc", 0.95d);
                    jSONObject.put("u_disc", 0.95d);
                    jSONObject.put("max_ecppv_diff", 0);
                    jSONObject.put("max_cache_num", 20);
                    jSONObject.put("max_usage_limit", 10);
                    jSONObject.put("time_interval", 7200);
                    jSONArray2.put(jSONObject);
                } catch (Exception e11) {
                    e10 = e11;
                    Log.e("CandidateController", e10.getMessage());
                }
            } catch (Exception e12) {
                jSONArray2 = jSONArray;
                e10 = e12;
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private b() {
        this.f48295a = new HashMap<>();
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        if (this.f48295a == null) {
            this.f48295a = new HashMap<>();
        }
        if (this.f48295a.containsKey(str)) {
            return this.f48295a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.f48295a.put(str, dVar);
        return dVar;
    }
}
