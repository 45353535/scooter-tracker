package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigMLModel extends JsonModel {

    @BindField
    public RemoteConfigLastVersion last_version;

    @BindField
    public Double min_score;

    @BindField
    public String name;

    public RemoteConfigMLModel() {
    }

    public RemoteConfigMLModel(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
