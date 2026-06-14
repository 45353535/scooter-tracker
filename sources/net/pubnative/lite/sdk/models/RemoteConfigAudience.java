package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigAudience extends JsonModel {

    @BindField
    public RemoteConfigDependencies dependencies;

    @BindField
    public Double min_score;

    @BindField
    public String name;

    @BindField
    public RemoteConfigParams params;

    @BindField
    public Boolean requires_geolocation;

    public RemoteConfigAudience() {
    }

    public RemoteConfigAudience(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
