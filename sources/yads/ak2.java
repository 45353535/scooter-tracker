package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ak2 {
    public static yj2 a(String str) throws JSONException {
        new zj2();
        JSONObject jSONObject = new JSONObject(dn.b(str));
        HashMap map = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        return new yj2(string, map);
    }
}
