package m2;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import m2.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SensorManager f94417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l f94418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f94419e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f94422h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f94415a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f94416b = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f94420f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f94421g = new AtomicBoolean(false);

    private e() {
    }

    private final void c(final String str) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (f94422h) {
                return;
            }
            f94422h = true;
            s.t().execute(new Runnable() { // from class: m2.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str) {
        boolean z10 = true;
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.internal.a aVarE = com.facebook.internal.a.f19837f.e(s.m());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((aVarE != null ? aVarE.h() : null) != null) {
                jSONArray.put(aVarE.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(v2.h.e() ? "1" : "0");
            Locale localeY = z.y();
            jSONArray.put(localeY.getLanguage() + '_' + localeY.getCountry());
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", string);
            GraphRequest.c cVar = GraphRequest.f19547n;
            a1 a1Var = a1.f93282a;
            String str3 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
            JSONObject jSONObjectC = cVar.B(null, str3, bundle, null).k().c();
            AtomicBoolean atomicBoolean = f94421g;
            if (jSONObjectC == null || !jSONObjectC.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = f94418d;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                f94419e = null;
            }
            f94422h = false;
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final void e() {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            f94420f.set(false);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final void f() {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            f94420f.set(true);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final String g() {
        if (e3.a.d(e.class)) {
            return null;
        }
        try {
            if (f94419e == null) {
                f94419e = UUID.randomUUID().toString();
            }
            String str = f94419e;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (e3.a.d(e.class)) {
            return false;
        }
        try {
            return f94421g.get();
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return false;
        }
    }

    private final boolean i() {
        e3.a.d(this);
        return false;
    }

    public static final void j(Activity activity) {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g.f94424f.a().f(activity);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f94420f.get()) {
                g.f94424f.a().h(activity);
                l lVar = f94418d;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager = f94417c;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(f94416b);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final void l(Activity activity) {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f94420f.get()) {
                g.f94424f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strN = s.n();
                final com.facebook.internal.i iVarF = com.facebook.internal.m.f(strN);
                if ((iVarF != null && iVarF.d()) || f94415a.i()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f94417c = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    l lVar = new l(activity);
                    f94418d = lVar;
                    m mVar = f94416b;
                    mVar.a(new m.b() { // from class: m2.c
                        @Override // m2.m.b
                        public final void a() {
                            e.m(iVarF, strN);
                        }
                    });
                    sensorManager.registerListener(mVar, defaultSensor, 2);
                    if (iVarF != null && iVarF.d()) {
                        lVar.h();
                    }
                }
                e eVar = f94415a;
                if (!eVar.i() || f94421g.get()) {
                    return;
                }
                eVar.c(strN);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(com.facebook.internal.i iVar, String appId) {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z10 = iVar != null && iVar.d();
            boolean zS = s.s();
            if (z10 && zS) {
                f94415a.c(appId);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final void n(boolean z10) {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            f94421g.set(z10);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }
}
