package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class ExpandProperty extends MraidProperty {
    int height;
    int width;

    ExpandProperty(JSONObject jSONObject) throws JSONException {
        super("expandProperty");
        this.width = jSONObject.getInt("width");
        this.height = jSONObject.getInt("height");
    }

    @Override // com.amazon.device.ads.MraidProperty
    void formJSON(JSONObject jSONObject) throws JSONException {
    }
}
