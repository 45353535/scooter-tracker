package net.pubnative.lite.sdk.models;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigsDebug extends JsonModel {

    @BindField
    public List<Integer> configids;

    @BindField
    public List<Integer> sliceids;

    public RemoteConfigsDebug() {
    }

    public List<Integer> getConfigIds() {
        return this.configids;
    }

    public List<Integer> getSliceIds() {
        return this.sliceids;
    }

    public RemoteConfigsDebug(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
