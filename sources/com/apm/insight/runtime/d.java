package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f8080a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f8081b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f8082c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8083d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8084e;

    private d(JSONObject jSONObject, String str) {
        this.f8084e = str;
        a(jSONObject);
        f8080a.put(this.f8084e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f8081b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f8083d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    @Nullable
    public static JSONObject b(String str) {
        d dVar = f8080a.get(str);
        if (dVar != null) {
            return dVar.f8081b;
        }
        return null;
    }

    public static d c(String str) {
        return f8080a.get(str);
    }

    public static long d(String str) {
        d dVar = f8080a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f8081b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f8080a.get(str);
        return (dVar == null || (jSONObject = dVar.f8081b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f8080a.get(str);
        return (dVar == null || (jSONObject = dVar.f8081b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f8080a.get(str);
        return (dVar == null || (jSONObject = dVar.f8081b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f8081b == null) {
            return false;
        }
        return this.f8083d;
    }

    public static boolean a(String str) {
        return f8080a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f8080a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
