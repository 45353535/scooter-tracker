package f1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tb {
    public static final Boolean a(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONObject b(JSONObject jSONObject, String name, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            jSONObject.put(name, obj);
            return jSONObject;
        } catch (JSONException e10) {
            eg.j("put (" + name + ")" + e10, null, 2, null);
            return jSONObject;
        }
    }

    public static final byte[] c(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
