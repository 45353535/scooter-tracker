package u1;

import android.text.TextUtils;
import l1.c;
import org.json.JSONObject;
import p1.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            t1.b.b("%s : empty one dt", "OneDTParser");
            return new c("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new c(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e10) {
            p1.b.a(d.ONE_DT_PARSE_ERROR, e10);
            t1.b.b("%s : failed parse one dt", "OneDTParser");
        }
        return new c("", -1L);
    }
}
