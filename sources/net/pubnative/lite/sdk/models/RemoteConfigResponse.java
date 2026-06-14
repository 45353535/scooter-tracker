package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigResponse extends JsonModel {

    @BindField
    public SdkConfig configs;

    @BindField
    public String error_message;

    @BindField
    public String status;

    public interface Status {
        public static final String ERROR = "error";
        public static final String OK = "ok";
    }

    public RemoteConfigResponse() {
    }

    public RemoteConfigResponse(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
