package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Source extends JsonModel {

    /* JADX INFO: renamed from: fd, reason: collision with root package name */
    @BindField
    private Integer f95910fd;

    @BindField
    private String pchain;

    @BindField
    private String tid;

    public Source() {
    }

    public Integer getFinalDecision() {
        return this.f95910fd;
    }

    public String getPaymentIdChain() {
        return this.pchain;
    }

    public String getTransactionId() {
        return this.tid;
    }

    public Source(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
