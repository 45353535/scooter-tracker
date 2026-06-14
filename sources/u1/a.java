package u1;

import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static o1.a a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        boolean z10 = true;
        String str = "";
        try {
        } catch (Exception e10) {
            e = e10;
        }
        if (!jSONObject.has("data") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            z10 = false;
        } else {
            String strOptString = jSONObjectOptJSONObject.optString("igniteVersion", "");
            try {
                if (!jSONObjectOptJSONObject.has(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY) || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY)) == null) {
                    z10 = false;
                    str = strOptString;
                } else {
                    for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0; length--) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                        if (jSONObjectOptJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(jSONObjectOptJSONObject2.optString("type", ""))) {
                            break;
                        }
                    }
                    z10 = false;
                    str = strOptString;
                }
            } catch (Exception e11) {
                e = e11;
                str = strOptString;
                t1.b.b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                z10 = false;
            }
        }
        return new o1.a(z10, str);
    }
}
