package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.models.bidstream.DeviceExtension;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Device extends JsonModel {

    @BindField
    private String carrier;

    @BindField
    private Integer connectiontype;

    @BindField
    private Integer devicetype;

    @BindField
    private String didmd5;

    @BindField
    private String didsha1;

    @BindField
    private Integer dnt;

    @BindField
    private String dpidmd5;

    @BindField
    private String dpidsha1;

    @BindField
    private DeviceExtension ext;

    @BindField
    private String flashver;

    @BindField
    private Geo geo;

    @BindField
    private Integer geofetch;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @BindField
    private Integer f95899h;

    @BindField
    private String hmw;

    @BindField
    private String ifa;

    @BindField
    private String ip;

    @BindField
    private String ipv6;

    @BindField
    private Integer js;

    @BindField
    private String language;

    @BindField
    private Integer lmt;

    @BindField
    private String macmd5;

    @BindField
    private String macsha1;

    @BindField
    private String make;

    @BindField
    private String mccmnc;

    @BindField
    private String mccmncsim;

    @BindField
    private String model;

    @BindField
    private String os;

    @BindField
    private String osv;

    @BindField
    private Integer ppi;

    @BindField
    private Float pxratio;

    @BindField
    private UserAgent sua;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    @BindField
    private String f95900ua;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @BindField
    private Integer f95901w;

    public Device() {
    }

    public String getCarrier() {
        return this.carrier;
    }

    public Integer getConnectiontype() {
        return this.connectiontype;
    }

    public Integer getDeviceType() {
        return this.devicetype;
    }

    public String getDidmd5() {
        return this.didmd5;
    }

    public String getDidsha1() {
        return this.didsha1;
    }

    public Integer getDnt() {
        return this.dnt;
    }

    public String getDpidmd5() {
        return this.dpidmd5;
    }

    public String getDpidsha1() {
        return this.dpidsha1;
    }

    public DeviceExtension getExt() {
        return this.ext;
    }

    public String getFlashver() {
        return this.flashver;
    }

    public Geo getGeo() {
        return this.geo;
    }

    public Integer getGeofetch() {
        return this.geofetch;
    }

    public Integer getH() {
        return this.f95899h;
    }

    public String getHmw() {
        return this.hmw;
    }

    public String getIfa() {
        return this.ifa;
    }

    public String getIp() {
        return this.ip;
    }

    public String getIpv6() {
        return this.ipv6;
    }

    public Integer getJs() {
        return this.js;
    }

    public String getLanguage() {
        return this.language;
    }

    public Integer getLmt() {
        return this.lmt;
    }

    public String getMacmd5() {
        return this.macmd5;
    }

    public String getMacsha1() {
        return this.macsha1;
    }

    public String getMake() {
        return this.make;
    }

    public String getMccmnc() {
        return this.mccmnc;
    }

    public String getMccmncsim() {
        return this.mccmncsim;
    }

    public String getModel() {
        return this.model;
    }

    public String getOs() {
        return this.os;
    }

    public String getOsVersion() {
        return this.osv;
    }

    public Integer getPpi() {
        return this.ppi;
    }

    public Float getPxratio() {
        return this.pxratio;
    }

    public UserAgent getSua() {
        return this.sua;
    }

    public String getUserAgent() {
        return this.f95900ua;
    }

    public Integer getW() {
        return this.f95901w;
    }

    public void setCarrier(String str) {
        this.carrier = str;
    }

    public void setConnectiontype(Integer num) {
        this.connectiontype = num;
    }

    public void setDeviceType(Integer num) {
        this.devicetype = num;
    }

    public void setDidmd5(String str) {
        this.didmd5 = str;
    }

    public void setDidsha1(String str) {
        this.didsha1 = str;
    }

    public void setDnt(Integer num) {
        this.dnt = num;
    }

    public void setDpidmd5(String str) {
        this.dpidmd5 = str;
    }

    public void setDpidsha1(String str) {
        this.dpidsha1 = str;
    }

    public void setExt(DeviceExtension deviceExtension) {
        this.ext = deviceExtension;
    }

    public void setFlashver(String str) {
        this.flashver = str;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setGeofetch(Integer num) {
        this.geofetch = num;
    }

    public void setH(Integer num) {
        this.f95899h = num;
    }

    public void setHmw(String str) {
        this.hmw = str;
    }

    public void setIfa(String str) {
        this.ifa = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setIpv6(String str) {
        this.ipv6 = str;
    }

    public void setJs(Integer num) {
        this.js = num;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLmt(Integer num) {
        this.lmt = num;
    }

    public void setMacmd5(String str) {
        this.macmd5 = str;
    }

    public void setMacsha1(String str) {
        this.macsha1 = str;
    }

    public void setMake(String str) {
        this.make = str;
    }

    public void setMccmnc(String str) {
        this.mccmnc = str;
    }

    public void setMccmncsim(String str) {
        this.mccmncsim = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setOsVersion(String str) {
        this.osv = str;
    }

    public void setPpi(Integer num) {
        this.ppi = num;
    }

    public void setPxratio(Float f10) {
        this.pxratio = f10;
    }

    public void setSua(UserAgent userAgent) {
        this.sua = userAgent;
    }

    public void setUserAgent(String str) {
        this.f95900ua = str;
    }

    public void setW(Integer num) {
        this.f95901w = num;
    }

    public Device(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
