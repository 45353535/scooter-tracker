package u2;

import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105198b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f105197a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f105199c = new HashMap();

    private f() {
    }

    public static final void a() {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            f105197a.c();
            if (f105199c.isEmpty()) {
                return;
            }
            f105198b = true;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    private final String b(String str) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            for (String str2 : f105199c.keySet()) {
                HashSet hashSet = (HashSet) f105199c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final void c() {
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
                f105199c = new HashMap();
                JSONArray jSONArrayO = iVarU.o();
                if (jSONArrayO == null || jSONArrayO.length() == 0) {
                    return;
                }
                int length = jSONArrayO.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArrayO.getJSONObject(i10);
                    boolean zHas = jSONObject.has(C4240b4.i.W);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(C4240b4.i.W);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetL = z.l(jSONArray)) != null) {
                            f105199c.put(string, hashSetL);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final String d(String eventName) {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f105198b) {
                String strB = f105197a.b(eventName);
                if (strB != null) {
                    return strB;
                }
            }
            return eventName;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }
}
