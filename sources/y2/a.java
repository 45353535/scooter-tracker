package y2;

import android.util.Log;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f108345b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108344a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f108346c = a.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f108347d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f108348e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    public static final class C1335a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f108349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f108350b;

        public C1335a(String eventName, Map restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.f108349a = eventName;
            this.f108350b = restrictiveParams;
        }

        public final String a() {
            return this.f108349a;
        }

        public final Map b() {
            return this.f108350b;
        }

        public final void c(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f108350b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            f108345b = true;
            f108344a.c();
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }

    private final String b(String str, String str2) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            try {
            } catch (Exception e10) {
                Log.w(f108346c, "getMatchedRuleType failed", e10);
            }
            for (C1335a c1335a : new ArrayList(f108347d)) {
                if (c1335a != null && Intrinsics.areEqual(str, c1335a.a())) {
                    for (String str3 : c1335a.b().keySet()) {
                        if (Intrinsics.areEqual(str2, str3)) {
                            return (String) c1335a.b().get(str3);
                        }
                        return null;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final void c() {
        String strP;
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null || (strP = iVarU.p()) == null || strP.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strP);
            f108347d.clear();
            f108348e.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    C1335a c1335a = new C1335a(key, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        c1335a.c(z.o(jSONObjectOptJSONObject));
                        f108347d.add(c1335a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f108348e.add(c1335a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final boolean d(String str) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return f108348e.contains(str);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final String e(String eventName) {
        if (e3.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f108345b) {
                if (f108344a.d(eventName)) {
                    return "_removed_";
                }
            }
            return eventName;
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
            return null;
        }
    }

    public static final void f(Map parameters, String eventName) {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f108345b) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String strB = f108344a.b(eventName, str);
                    if (strB != null) {
                        map.put(str, strB);
                        parameters.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }
}
