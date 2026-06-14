package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.m;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f7939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f7940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<String, String> f7942d;

    static boolean a() {
        return f7940b;
    }

    static boolean b() {
        return f7941c;
    }

    static void c() {
        if (f7940b) {
            return;
        }
        f7941c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, IOUtils.LINE_SEPARATOR_UNIX)), false);
                f7940b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f7942d;
        if (map != null) {
            map.clear();
        }
    }

    static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = f7942d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            f7942d = mapC;
            if (mapC == null) {
                f7942d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f7942d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = false;
            for (Map.Entry<String, String> entry : f7942d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.a.a(th2);
                }
            }
            if (z10) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z10;
        } catch (Throwable th3) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th3);
            return true;
        }
    }

    @NonNull
    private static File h() {
        if (f7939a == null) {
            f7939a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f7939a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), f7942d);
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str) {
        if (f7942d == null) {
            f7942d = new HashMap();
        }
        f7942d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
