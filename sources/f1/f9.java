package f1;

import f1.bb;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69809c;

    public f9(String str, String str2, String str3) {
        this.f69807a = str;
        this.f69808b = str2;
        this.f69809c = str3;
    }

    public static Map c(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            eg.d("deserializeAssets assetsJson is null", null);
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                map.put(next2, new f9(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return map;
    }

    public static Map d(JSONObject jSONObject, int i10) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int iMin = Math.min(i10, jSONArrayOptJSONArray.length());
            for (int i11 = 0; i11 < iMin; i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                Iterator it = c(jSONObject2 != null ? f(jSONObject2.getJSONArray("elements")) : null).entrySet().iterator();
                while (it.hasNext()) {
                    f9 f9Var = (f9) ((Map.Entry) it.next()).getValue();
                    map.put(f9Var.f69808b, f9Var);
                }
            }
        }
        return map;
    }

    public static Map e(JSONObject jSONObject, String str) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String string = jSONObject2.getString("name");
                map.put(string, new f9(str, string, jSONObject2.getString("value")));
            }
        }
        return map;
    }

    public static JSONObject f(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectC = bb.c(new bb.a[0]);
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String strOptString = jSONObject.optString("name");
                String strOptString2 = jSONObject.optString("type");
                String strOptString3 = jSONObject.optString("value");
                String strOptString4 = jSONObject.optString("param");
                if (!"param".equals(strOptString2) && strOptString4.isEmpty()) {
                    JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(strOptString2);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = bb.c(new bb.a[0]);
                        jSONObjectC.put(strOptString2, jSONObjectOptJSONObject);
                    }
                    jSONObjectOptJSONObject.put("html".equals(strOptString2) ? "body" : strOptString, bb.c(bb.a("filename", strOptString), bb.a("url", strOptString3)));
                }
            }
        }
        return jSONObjectC;
    }

    public static Map g(JSONObject jSONObject, int i10) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("templates".equals(next)) {
                        map.putAll(d(jSONObject2, i10));
                    } else {
                        map.putAll(e(jSONObject2, next));
                    }
                }
            } catch (JSONException e10) {
                eg.i("v2PrefetchToAssets: " + e10, null);
            }
        }
        return map;
    }

    public File a(File file) {
        if (this.f69807a == null || this.f69808b == null) {
            eg.d("Cannot create file. Directory or filename is null.", null);
        } else {
            String str = this.f69807a + "/" + this.f69808b;
            try {
                return new File(file, str);
            } catch (Exception e10) {
                eg.d("Cannot create file for path: " + str + ". Error: " + e10, null);
            }
        }
        return null;
    }

    public String b() {
        return this.f69809c;
    }

    public String toString() {
        return "Asset{directory='" + this.f69807a + "', filename='" + this.f69808b + "', url='" + this.f69809c + "'}";
    }
}
