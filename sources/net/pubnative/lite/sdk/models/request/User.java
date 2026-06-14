package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class User extends JsonModel {

    @BindField
    private String buyeruid;

    @BindField
    private String customdata;

    @BindField
    private List<Data> data;

    @BindField
    private String gender;

    @BindField
    private Geo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95911id;

    @BindField
    private String keywords;

    @BindField
    private Integer yob;

    public User() {
    }

    public String getBuyeruid() {
        return this.buyeruid;
    }

    public String getCustomData() {
        return this.customdata;
    }

    public List<Data> getData() {
        return this.data;
    }

    public String getGender() {
        return this.gender;
    }

    public Geo getGeo() {
        return this.geo;
    }

    public String getId() {
        return this.f95911id;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Integer getYearOfBirth() {
        return this.yob;
    }

    public void setBuyeruid(String str) {
        this.buyeruid = str;
    }

    public void setCustomData(String str) {
        this.customdata = str;
    }

    public void setData(List<Data> list) {
        this.data = list;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setId(String str) {
        this.f95911id = str;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setYearOfBirth(Integer num) {
        this.yob = num;
    }

    public User(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
