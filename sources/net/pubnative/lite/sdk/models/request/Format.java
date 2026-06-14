package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Format extends JsonModel {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @BindField
    private Integer f95902h;

    @BindField
    private Integer hratio;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @BindField
    private Integer f95903w;

    @BindField
    private Integer wmin;

    @BindField
    private Integer wratio;

    public Format() {
    }

    public Integer getHeight() {
        return this.f95902h;
    }

    public Integer getHeightRatio() {
        return this.hratio;
    }

    public Integer getWidth() {
        return this.f95903w;
    }

    public Integer getWidthMin() {
        return this.wmin;
    }

    public Integer getWidthRatio() {
        return this.wratio;
    }

    public void setHeight(Integer num) {
        this.f95902h = num;
    }

    public void setHeightRatio(Integer num) {
        this.hratio = num;
    }

    public void setWidth(Integer num) {
        this.f95903w = num;
    }

    public void setWidthMin(Integer num) {
        this.wmin = num;
    }

    public void setWidthRatio(Integer num) {
        this.wratio = num;
    }

    public Format(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
