package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class p implements g {
    p() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return "playVideo";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z10) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for playVideo event");
        }
        String strOptString = jSONObjectOptJSONObject.optString("url", null);
        if (strOptString == null) {
            return new POBError(1009, "Invalid MRAID Url for playVideo event");
        }
        nVar.playVideo(strOptString, z10);
        return null;
    }
}
