package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class e implements g {
    e() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return "createCalendarEvent";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z10) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for createcalendarevent");
        }
        nVar.createCalendarEvent(jSONObjectOptJSONObject, z10);
        return null;
    }
}
