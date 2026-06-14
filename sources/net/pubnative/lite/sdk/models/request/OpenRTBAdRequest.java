package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.utils.json.BindField;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class OpenRTBAdRequest extends AdRequest {

    @BindField
    private App app;

    @BindField
    private List<String> badv;

    @BindField
    private List<String> bapp;

    @BindField
    private List<String> bcat;

    @BindField
    private List<String> bseat;

    @BindField
    private List<String> cur;

    @BindField
    private Device device;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95905id;

    @BindField
    private List<Imp> imp;

    @BindField
    private Regs regs;

    @BindField
    private Site site;

    @BindField
    private Source source;

    @BindField
    private Integer tmax;

    @BindField
    private User user;

    @BindField
    private List<String> wlang;

    @BindField
    private List<String> wseat;

    @BindField
    private Integer test = 0;

    @BindField
    private Integer at = 2;

    @BindField
    private Integer allimps = 0;

    public OpenRTBAdRequest(String str, String str2) {
        this.appToken = str;
        this.zoneId = str2;
    }

    public Integer getAllimps() {
        return this.allimps;
    }

    public App getApp() {
        return this.app;
    }

    public Integer getAt() {
        return this.at;
    }

    public List<String> getBadv() {
        return this.badv;
    }

    public List<String> getBapp() {
        return this.bapp;
    }

    public List<String> getBcat() {
        return this.bcat;
    }

    public List<String> getBseat() {
        return this.bseat;
    }

    public List<String> getCur() {
        return this.cur;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getId() {
        return this.f95905id;
    }

    public List<Imp> getImp() {
        return this.imp;
    }

    public Regs getRegs() {
        return this.regs;
    }

    public Site getSite() {
        return this.site;
    }

    public Source getSource() {
        return this.source;
    }

    public Integer getTest() {
        return this.test;
    }

    public Integer getTmax() {
        return this.tmax;
    }

    public User getUser() {
        return this.user;
    }

    public List<String> getWlang() {
        return this.wlang;
    }

    public List<String> getWseat() {
        return this.wseat;
    }

    public void setAllimps(Integer num) {
        this.allimps = num;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setAt(Integer num) {
        this.at = num;
    }

    public void setBadv(List<String> list) {
        this.badv = list;
    }

    public void setBapp(List<String> list) {
        this.bapp = list;
    }

    public void setBcat(List<String> list) {
        this.bcat = list;
    }

    public void setBseat(List<String> list) {
        this.bseat = list;
    }

    public void setCur(List<String> list) {
        this.cur = list;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setId(String str) {
        this.f95905id = str;
    }

    public void setImp(List<Imp> list) {
        this.imp = list;
    }

    public void setRegs(Regs regs) {
        this.regs = regs;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setTest(Integer num) {
        this.test = num;
    }

    public void setTmax(Integer num) {
        this.tmax = num;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setWlang(List<String> list) {
        this.wlang = list;
    }

    public void setWseat(List<String> list) {
        this.wseat = list;
    }

    public OpenRTBAdRequest(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
