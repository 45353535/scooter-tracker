package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Imp extends JsonModel {

    @BindField
    private Native aNative;

    @BindField
    private Audio audio;

    @BindField
    private Banner banner;

    @BindField
    private Integer clickbrowser;

    @BindField
    private String displaymanager;

    @BindField
    private String displaymanagerver;

    @BindField
    private Integer exp;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95904id;

    @BindField
    private List<String> iframebuster;

    @BindField
    private List<Metric> metric;

    @BindField
    private Pmp pmp;

    @BindField
    private Integer secure;

    @BindField
    private String tagid;

    @BindField
    private Video video;

    @BindField
    private Integer instl = 0;

    @BindField
    private Float bidfloor = Float.valueOf(0.0f);

    @BindField
    private String bidfloorcur = "USD";

    public Imp() {
    }

    public Audio getAudio() {
        return this.audio;
    }

    public Banner getBanner() {
        return this.banner;
    }

    public Float getBidfloor() {
        return this.bidfloor;
    }

    public String getBidfloorcur() {
        return this.bidfloorcur;
    }

    public Integer getClickbrowser() {
        return this.clickbrowser;
    }

    public String getDisplaymanager() {
        return this.displaymanager;
    }

    public String getDisplaymanagerver() {
        return this.displaymanagerver;
    }

    public Integer getExp() {
        return this.exp;
    }

    public String getId() {
        return this.f95904id;
    }

    public List<String> getIframebuster() {
        return this.iframebuster;
    }

    public Integer getInstl() {
        return this.instl;
    }

    public List<Metric> getMetric() {
        return this.metric;
    }

    public Native getNative() {
        return this.aNative;
    }

    public Pmp getPmp() {
        return this.pmp;
    }

    public Integer getSecure() {
        return this.secure;
    }

    public String getTagid() {
        return this.tagid;
    }

    public Video getVideo() {
        return this.video;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public void setBidfloor(Float f10) {
        this.bidfloor = f10;
    }

    public void setBidfloorcur(String str) {
        this.bidfloorcur = str;
    }

    public void setClickbrowser(Integer num) {
        this.clickbrowser = num;
    }

    public void setDisplaymanager(String str) {
        this.displaymanager = str;
    }

    public void setDisplaymanagerver(String str) {
        this.displaymanagerver = str;
    }

    public void setExp(Integer num) {
        this.exp = num;
    }

    public void setId(String str) {
        this.f95904id = str;
    }

    public void setIframebuster(List<String> list) {
        this.iframebuster = list;
    }

    public void setInstl(Integer num) {
        this.instl = num;
    }

    public void setMetric(List<Metric> list) {
        this.metric = list;
    }

    public void setNative(Native r12) {
        this.aNative = r12;
    }

    public void setPmp(Pmp pmp) {
        this.pmp = pmp;
    }

    public void setSecure(Integer num) {
        this.secure = num;
    }

    public void setTagid(String str) {
        this.tagid = str;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Imp(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
