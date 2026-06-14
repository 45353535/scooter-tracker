package f1;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wa {
    public final String a(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("url", "") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final n2 b(JSONObject jSONObject) {
        return new n2(a(jSONObject), c(jSONObject));
    }

    public final Boolean c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return tb.a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}
