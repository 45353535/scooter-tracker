package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Deal extends JsonModel {

    @BindField
    private Integer at;

    @BindField
    private Float bidfloor = Float.valueOf(0.0f);

    @BindField
    private String bidfloorcur = "USD";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95898id;

    @BindField
    private List<String> wadomain;

    @BindField
    private List<String> wseat;

    public Deal() {
    }

    public Integer getAuctionType() {
        return this.at;
    }

    public Float getBidFloor() {
        return this.bidfloor;
    }

    public String getBidFloorCurrency() {
        return this.bidfloorcur;
    }

    public String getId() {
        return this.f95898id;
    }

    public List<String> getWAdomain() {
        return this.wadomain;
    }

    public List<String> getWSeat() {
        return this.wseat;
    }

    public void setAuctionType(Integer num) {
        this.at = num;
    }

    public void setBidFloor(Float f10) {
        this.bidfloor = f10;
    }

    public void setBidFloorCurrency(String str) {
        this.bidfloorcur = str;
    }

    public void setId(String str) {
        this.f95898id = str;
    }

    public void setWAdomain(List<String> list) {
        this.wadomain = list;
    }

    public void setWSeat(List<String> list) {
        this.wseat = list;
    }

    public Deal(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
