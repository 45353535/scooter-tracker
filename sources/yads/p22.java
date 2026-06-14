package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p22 {
    public static final boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
