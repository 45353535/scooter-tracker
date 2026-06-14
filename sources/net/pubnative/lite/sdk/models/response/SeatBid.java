package net.pubnative.lite.sdk.models.response;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SeatBid extends JsonModel {

    @BindField
    private List<Bid> bid;

    @BindField
    private Integer group = 0;

    @BindField
    private String seat;

    public SeatBid() {
    }

    public List<Bid> getBids() {
        return this.bid;
    }

    public Integer getGroup() {
        return this.group;
    }

    public String getSeat() {
        return this.seat;
    }

    public SeatBid(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
