package f1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bb {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f69449b;

        public a(String str, Object obj) {
            this.f69448a = str;
            this.f69449b = obj;
        }
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }

    public static JSONObject b(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static JSONObject c(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            d(jSONObject, aVar.f69448a, aVar.f69449b);
        }
        return jSONObject;
    }

    public static void d(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            eg.i("put (" + str + ")", e10);
        }
    }
}
