package u2;

import android.os.Bundle;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105201b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f105200a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashSet f105202c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f105203d = new HashMap();

    private g() {
    }

    public static final void a() {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            f105200a.b();
            if (f105202c.isEmpty() && f105203d.isEmpty()) {
                f105201b = false;
            } else {
                f105201b = true;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    private final void b() {
        HashSet hashSetL;
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null) {
                return;
            }
            try {
                f105202c = new HashSet();
                f105203d = new HashMap();
                JSONArray jSONArrayS = iVarU.s();
                if (jSONArrayS == null || jSONArrayS.length() == 0) {
                    return;
                }
                int length = jSONArrayS.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArrayS.getJSONObject(i10);
                    boolean zHas = jSONObject.has(C4240b4.i.W);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String sensitiveParamsScope = jSONObject.getString(C4240b4.i.W);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (jSONArray != null && (hashSetL = z.l(jSONArray)) != null) {
                            if (sensitiveParamsScope.equals("_MTSDK_Default_")) {
                                f105202c = hashSetL;
                            } else {
                                Map map = f105203d;
                                Intrinsics.checkNotNullExpressionValue(sensitiveParamsScope, "sensitiveParamsScope");
                                map.put(sensitiveParamsScope, hashSetL);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void c(Bundle bundle, String eventName) {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f105201b && bundle != null) {
                if (!f105202c.isEmpty() || f105203d.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f105203d.get(eventName);
                        for (String key : new ArrayList(bundle.keySet())) {
                            g gVar = f105200a;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            if (gVar.d(key, hashSet)) {
                                bundle.remove(key);
                                jSONArray.put(key);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    private final boolean d(String str, HashSet hashSet) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            if (f105202c.contains(str)) {
                return true;
            }
            if (hashSet != null && !hashSet.isEmpty()) {
                if (hashSet.contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }
}
