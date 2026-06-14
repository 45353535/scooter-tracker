package z2;

import android.app.Activity;
import com.facebook.internal.m;
import com.facebook.s;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.f;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f119156a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f119157b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f119158c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f119159d = new LinkedHashSet();

    private e() {
    }

    public static final synchronized void b() {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            s.t().execute(new Runnable() { // from class: z2.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c();
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f119157b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f119156a.d();
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    private final void d() {
        String strU;
        if (e3.a.d(this)) {
            return;
        }
        try {
            com.facebook.internal.i iVarU = m.u(s.n(), false);
            if (iVarU != null && (strU = iVarU.u()) != null) {
                g(strU);
                if (f119158c.isEmpty() && f119159d.isEmpty()) {
                    return;
                }
                File fileL = w2.f.l(f.a.MTML_APP_EVENT_PREDICTION);
                if (fileL == null) {
                    return;
                }
                a.d(fileL);
                Activity activityM = v2.g.m();
                if (activityM != null) {
                    h(activityM);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final boolean e(String event) {
        if (e3.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f119159d.contains(event);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (e3.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f119158c.contains(event);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (!f119157b.get() || !a.f() || (f119158c.isEmpty() && f119159d.isEmpty())) {
                    g.f119161e.b(activity);
                    return;
                }
                g.f119161e.a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public final void g(String str) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Set set = f119158c;
                    String string = jSONArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    Set set2 = f119159d;
                    String string2 = jSONArray2.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
