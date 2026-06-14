package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f48827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48828b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f48829a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48830b;

        public b(String str) {
            this.f48830b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            q0.b("SameCommonReporter", e10.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f48828b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.W, this.f48828b);
            a(this.f48827a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("SameCommonReporter", th2.getMessage());
        }
    }

    private l(b bVar) {
        this.f48828b = bVar.f48830b;
        this.f48827a = bVar.f48829a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, D5.N);
        } catch (Exception unused) {
            return str;
        }
    }
}
