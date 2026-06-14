package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UserAgent extends JsonModel {

    @BindField
    private String architecture;

    @BindField
    private String bitness;

    @BindField
    private List<BrandVersion> browsers;

    @BindField
    private Integer mobile;

    @BindField
    private String model;

    @BindField
    private BrandVersion platform;

    @BindField
    private Integer source = 0;

    public UserAgent() {
    }

    public String getArchitecture() {
        return this.architecture;
    }

    public String getBitness() {
        return this.bitness;
    }

    public List<BrandVersion> getBrowsers() {
        return this.browsers;
    }

    public Integer getMobile() {
        return this.mobile;
    }

    public String getModel() {
        return this.model;
    }

    public BrandVersion getPlatform() {
        return this.platform;
    }

    public Integer getSource() {
        return this.source;
    }

    public void setArchitecture(String str) {
        this.architecture = str;
    }

    public void setBitness(String str) {
        this.bitness = str;
    }

    public void setBrowsers(List<BrandVersion> list) {
        this.browsers = list;
    }

    public void setMobile(Integer num) {
        this.mobile = num;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setPlatform(BrandVersion brandVersion) {
        this.platform = brandVersion;
    }

    public void setSource(Integer num) {
        this.source = num;
    }

    public UserAgent(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
