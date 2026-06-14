package o2;

import com.facebook.appevents.d;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f96317b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f96316a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f96318c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f96319d = new HashSet();

    /* JADX INFO: renamed from: o2.a$a, reason: collision with other inner class name */
    public static final class C1103a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f96320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f96321b;

        public C1103a(String eventName, List deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.f96320a = eventName;
            this.f96321b = deprecateParams;
        }

        public final List a() {
            return this.f96321b;
        }

        public final String b() {
            return this.f96320a;
        }

        public final void c(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f96321b = list;
        }
    }

    private a() {
    }

    public static final void a() {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            f96317b = true;
            f96316a.b();
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }

    private final synchronized void b() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null) {
                return;
            }
            String strP = iVarU.p();
            if (strP != null && strP.length() > 0) {
                JSONObject jSONObject = new JSONObject(strP);
                f96318c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set set = f96319d;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            set.add(key);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            C1103a c1103a = new C1103a(key, new ArrayList());
                            if (jSONArrayOptJSONArray != null) {
                                c1103a.c(z.m(jSONArrayOptJSONArray));
                            }
                            f96318c.add(c1103a);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void c(Map parameters, String eventName) {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f96317b) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C1103a c1103a : new ArrayList(f96318c)) {
                    if (Intrinsics.areEqual(c1103a.b(), eventName)) {
                        for (String str : arrayList) {
                            if (c1103a.a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }

    public static final void d(List events) {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (f96317b) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (f96319d.contains(((d) it.next()).k())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }
}
