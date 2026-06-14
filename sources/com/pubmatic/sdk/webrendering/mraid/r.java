package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class r implements g {
    r() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return false;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return "unload";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z10) {
        nVar.unload();
        return null;
    }
}
