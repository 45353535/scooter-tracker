package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IdDevice extends JsonModel {

    @BindField
    public IdBattery battery;

    @BindField
    public String brand;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    public String f95867id;

    @BindField
    public String manufacture;

    @BindField
    public String model;

    @BindField
    public IdOs os;

    public IdDevice() {
    }

    public IdDevice(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
