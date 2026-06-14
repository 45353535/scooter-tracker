package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Pmp extends JsonModel {

    @BindField
    private List<Deal> deals;

    @BindField
    private Integer private_auction = 0;

    public Pmp() {
    }

    public List<Deal> getDeals() {
        return this.deals;
    }

    public Integer getPrivateAuction() {
        return this.private_auction;
    }

    public void setDeals(List<Deal> list) {
        this.deals = list;
    }

    public void setPrivateAuction(Integer num) {
        this.private_auction = num;
    }

    public Pmp(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
