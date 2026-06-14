package f1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e2 {
    public static final List a(JSONObject jSONObject) {
        List<JSONObject> listB;
        j8 j8Var;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("verification");
        if (jSONArrayOptJSONArray == null || (listB = vd.b(jSONArrayOptJSONArray)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject2 : listB) {
            try {
                String string = jSONObject2.getString("url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject2.getString(com.taurusx.tax.f.z.f66061c);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = jSONObject2.getString("params");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                j8Var = new j8(string, string2, string3);
            } catch (Exception unused) {
                j8Var = null;
            }
            if (j8Var != null) {
                arrayList.add(j8Var);
            }
        }
        return arrayList;
    }

    public static final n1 b(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        List listA = a(config);
        JSONObject jSONObjectOptJSONObject = config.optJSONObject("viewabilitySettings");
        return jSONObjectOptJSONObject != null ? new n1(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), jSONObjectOptJSONObject.optInt("minVisibleDips", 1), jSONObjectOptJSONObject.optInt("minVisibleDurationMs", 0), jSONObjectOptJSONObject.optLong("visibilityCheckIntervalMs", 100L), jSONObjectOptJSONObject.optInt("traversalLimit", 25), listA) : new n1(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), 0, 0, 0L, 0, listA, 60, null);
    }
}
