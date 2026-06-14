package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class K6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f41203b = "userId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41204c = "appKey";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static K6 f41205d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f41206a = new JSONObject();

    private K6() {
    }

    public static synchronized K6 a() {
        try {
            if (f41205d == null) {
                f41205d = new K6();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41205d;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Ib.U().g().e()) {
            return new JSONObject(this.f41206a.toString());
        }
        return this.f41206a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f41206a.put(str, obj);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }

    public synchronized String a(String str) {
        return this.f41206a.optString(str);
    }
}
