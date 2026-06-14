package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Geo extends JsonModel {

    @BindField
    private Integer accuracy;

    @BindField
    private String city;

    @BindField
    private String country;

    @BindField
    private Integer ipservice;

    @BindField
    private Integer lastfix;

    @BindField
    private Float lat;

    @BindField
    private Float lon;

    @BindField
    private String metro;

    @BindField
    private String region;

    @BindField
    private String regionfips104;

    @BindField
    private Integer type;

    @BindField
    private Integer utcoffset;

    @BindField
    private String zip;

    public Geo() {
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public Integer getIpservice() {
        return this.ipservice;
    }

    public Integer getLastfix() {
        return this.lastfix;
    }

    public Float getLat() {
        return this.lat;
    }

    public Float getLon() {
        return this.lon;
    }

    public String getMetro() {
        return this.metro;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegionfips104() {
        return this.regionfips104;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUtcoffset() {
        return this.utcoffset;
    }

    public String getZip() {
        return this.zip;
    }

    public void setAccuracy(Integer num) {
        this.accuracy = num;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setIpservice(Integer num) {
        this.ipservice = num;
    }

    public void setLastfix(Integer num) {
        this.lastfix = num;
    }

    public void setLat(Float f10) {
        this.lat = f10;
    }

    public void setLon(Float f10) {
        this.lon = f10;
    }

    public void setMetro(String str) {
        this.metro = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegionfips104(String str) {
        this.regionfips104 = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUtcoffset(Integer num) {
        this.utcoffset = num;
    }

    public void setZip(String str) {
        this.zip = str;
    }

    public Geo(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
