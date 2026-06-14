package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class pc1 {
    public static HashMap a(JSONObject jSONObject) {
        Object obj;
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    map.put(next, a((JSONObject) obj));
                } else {
                    map.put(next, obj);
                }
            }
        }
        return map;
    }
}
