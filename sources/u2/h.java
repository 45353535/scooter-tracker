package u2;

import android.os.Bundle;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105205b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f105204a = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f105206c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f105207d = new HashMap();

    private h() {
    }

    private final void a(JSONArray jSONArray) {
        if (e3.a.d(this) || jSONArray == null) {
            return;
        }
        try {
            if (f105205b) {
                return;
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String key = jSONObject.getString(C4240b4.i.W);
                if (key != null && key.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            boolean z10 = jSONArray2.getJSONObject(i11).getBoolean("require_exact_match");
                            HashSet hashSetF = f(jSONArray2.getJSONObject(i11).getJSONArray("potential_matches"));
                            if (z10) {
                                Map map = f105207d;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet hashSet = (HashSet) f105207d.get(key);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetF);
                                    hashSetF = hashSet;
                                }
                                map.put(key, hashSetF);
                            } else {
                                Map map2 = f105206c;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet hashSet2 = (HashSet) f105206c.get(key);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetF);
                                    hashSetF = hashSet2;
                                }
                                map2.put(key, hashSetF);
                            }
                        }
                    } catch (Exception unused) {
                        f105207d.remove(key);
                        f105206c.remove(key);
                    }
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void b() {
        if (e3.a.d(h.class)) {
            return;
        }
        try {
            if (f105205b) {
                return;
            }
            f105204a.e();
            f105205b = (f105206c.isEmpty() && f105207d.isEmpty()) ? false : true;
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
        }
    }

    private final boolean c(String str, Set set) {
        if (!e3.a.d(this) && set != null) {
            try {
                Set<String> set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                for (String str2 : set2) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
        return false;
    }

    private final boolean d(String str, Set set) {
        if (!e3.a.d(this) && set != null) {
            try {
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (new Regex((String) it.next()).g(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
        return false;
    }

    private final void e() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null) {
                return;
            }
            a(iVarU.q());
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final HashSet f(JSONArray jSONArray) {
        try {
            if (e3.a.d(this)) {
                return null;
            }
            try {
                HashSet hashSetL = z.l(jSONArray);
                return hashSetL == null ? new HashSet() : hashSetL;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final void g(Bundle bundle) {
        if (e3.a.d(h.class)) {
            return;
        }
        try {
            if (f105205b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(key));
                    boolean z10 = f105206c.get(key) != null;
                    boolean z11 = f105207d.get(key) != null;
                    if (z10 || z11) {
                        h hVar = f105204a;
                        boolean zD = hVar.d(strValueOf, (Set) f105206c.get(key));
                        boolean zC = hVar.c(strValueOf, (Set) f105207d.get(key));
                        if (!zD && !zC) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
        }
    }
}
