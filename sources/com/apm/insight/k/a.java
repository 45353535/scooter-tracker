package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.Nullable;
import com.apm.insight.runtime.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Runnable f7862a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.apm.insight.l.k.b(com.apm.insight.e.g())) {
                a.i();
            }
            if (a.f7863b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                    m.a().a(a.f7862a, 15000L);
                } else {
                    m.a().a(a.f7862a, 60000L);
                }
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7863b = 0;

    public static void a() {
        f7863b = 40;
        m.a().a(f7862a);
    }

    public static void b() {
        if (!j.b()) {
            j.c();
        }
        if (com.apm.insight.l.k.b(com.apm.insight.e.g()) && j.g()) {
            i();
        }
    }

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    @Nullable
    private static byte[] h() {
        try {
            return e.a(com.apm.insight.e.i().getConfigUrl(), com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th2) {
            com.apm.insight.a.a(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        try {
            int i10 = f7863b;
            if (i10 > 0) {
                f7863b = i10 - 1;
            }
            com.apm.insight.a.a((Object) "try fetchApmConfig");
            if (!com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                j.c();
                if (j.a()) {
                    f7863b = 0;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = null;
            try {
                byte[] bArrH = h();
                if (bArrH != null) {
                    jSONArrayOptJSONArray = new JSONObject(new String(bArrH)).optJSONArray("data");
                }
            } catch (Throwable th2) {
                if (com.apm.insight.e.i().isDebugMode()) {
                    Log.e("npth", "npth NPTH Catch Error", th2);
                }
            }
            com.apm.insight.a.a((Object) "after fetchApmConfig net ".concat(String.valueOf(jSONArrayOptJSONArray)));
            if (jSONArrayOptJSONArray == null) {
                f7863b -= 10;
            } else {
                com.apm.insight.runtime.a.a(jSONArrayOptJSONArray, true);
                f7863b = 0;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
