package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Segment extends JsonModel {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95908id;

    @BindField
    private String name;

    @BindField
    private String signal;

    @BindField
    private String value;

    public Segment() {
    }

    public String getId() {
        return this.f95908id;
    }

    public String getName() {
        return this.name;
    }

    public String getSignal() {
        return this.signal;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(String str) {
        this.f95908id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSignal(String str) {
        this.signal = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Segment(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
