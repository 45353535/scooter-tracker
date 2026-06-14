package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IdGgl extends JsonModel {

    @BindField
    public String GAID;

    public IdGgl() {
    }

    public IdGgl(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
