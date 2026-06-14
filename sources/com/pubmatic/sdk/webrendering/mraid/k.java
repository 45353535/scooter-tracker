package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class k implements g {
    k() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return "resize";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z10) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for orientation event");
        }
        nVar.resize(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0), jSONObjectOptJSONObject.optInt("offsetX", 0), jSONObjectOptJSONObject.optInt("offsetY", 0), jSONObjectOptJSONObject.optBoolean("allowOffscreen", false), z10);
        return null;
    }
}
