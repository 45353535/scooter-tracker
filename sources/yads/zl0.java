package yads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.SetsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zl0 {
    public static Set a(JSONArray jSONArray) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                setCreateSetBuilder.add(new xl0(yl0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            objB = Result.b(SetsKt.build(setCreateSetBuilder));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            Objects.toString(jSONArray);
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (Set) objB;
    }

    public static String a(Set set) throws JSONException {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            xl0 xl0Var = (xl0) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", xl0Var.f117862a.name());
            jSONObject.put("value", xl0Var.f117863b);
            jSONArray = jSONArray.put(jSONObject);
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }

    public static Set a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(a(new JSONArray(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (Set) objB;
    }
}
