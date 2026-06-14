package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class l implements g {
    l() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return false;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return MRAIDPresenter.SET_ORIENTATION_PROPERTIES;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z10) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for orientation event");
        }
        nVar.setOrientation(jSONObjectOptJSONObject.optBoolean("allowOrientationChange", false), jSONObjectOptJSONObject.optString("forceOrientation", null), z10);
        return null;
    }
}
