package net.pubnative.lite.sdk.models;

import java.util.Map;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdExt extends JsonModel {

    @BindField
    protected Map<String, Object> meta;

    public AdExt() {
    }

    public AdExt(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
