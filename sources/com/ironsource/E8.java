package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class E8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        if (strOptString.length() == 0) {
            return null;
        }
        return strOptString;
    }
}
