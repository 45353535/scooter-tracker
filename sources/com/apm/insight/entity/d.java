package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static JSONObject f7781b;

    private static void a() {
        if (f7780a == null) {
            f7780a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + e.g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f7781b == null) {
            try {
                f7781b = new JSONObject(f.a(f7780a, IOUtils.LINE_SEPARATOR_UNIX));
            } catch (IOException unused) {
                f7781b = new JSONObject();
            } catch (JSONException unused2) {
                f7781b = new JSONObject();
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            a();
            JSONObject jSONObject2 = f7781b;
            if (jSONObject2 != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("slardar_filter");
                if (com.apm.insight.a.a(jSONObjectOptJSONObject)) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", jSONObjectOptJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                a.b(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null) {
            return;
        }
        try {
            a();
            JSONObject jSONObject2 = f7781b;
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"slardar_filter".equals(next) && (objOpt = f7781b.opt(next)) != null) {
                        try {
                            jSONObject.put(next, objOpt);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
