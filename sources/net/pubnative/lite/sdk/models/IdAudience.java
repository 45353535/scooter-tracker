package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IdAudience extends JsonModel {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    public String f95866id;

    @BindField
    public String ts;

    @BindField
    public String type;

    public IdAudience() {
    }

    public IdAudience(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
