package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class m implements g {
    m() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return MRAIDNativeFeature.STORE_PICTURE;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z10) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for storepicture event");
        }
        nVar.storePicture(jSONObjectOptJSONObject.optString(MRAIDNativeFeature.STORE_PICTURE, jSONObjectOptJSONObject.optString("url")), z10);
        return null;
    }
}
