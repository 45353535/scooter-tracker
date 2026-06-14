package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DataExtension extends JsonModel {

    @BindField
    public String segclass;

    @BindField
    public Long segtax;

    public DataExtension() {
    }

    public DataExtension(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }

    public DataExtension(Long l10, String str) {
        this.segtax = l10;
        this.segclass = str;
    }
}
