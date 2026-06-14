package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20423a = new HashMap();

    public m() {
    }

    public m(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONArray jSONArrayNames2 = jSONObject.names();
        for (int i10 = 0; i10 < jSONArrayNames2.length(); i10++) {
            String strOptString = jSONArrayNames2.optString(i10, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strOptString);
            l lVar = new l();
            if (jSONObjectOptJSONObject != null && (jSONArrayNames = jSONObjectOptJSONObject.names()) != null) {
                for (int i11 = 0; i11 < jSONArrayNames.length(); i11++) {
                    String strOptString2 = jSONArrayNames.optString(i11, null);
                    String strOptString3 = jSONObjectOptJSONObject.optString(strOptString2, null);
                    if (strOptString2 != null && strOptString3 != null) {
                        lVar.f20418a.put(strOptString2, strOptString3);
                    }
                }
            }
            this.f20423a.put(strOptString, lVar);
        }
    }
}
