package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Audio extends JsonModel {

    @BindField
    private List<Integer> api;

    @BindField
    private List<Integer> battr;

    @BindField
    private List<Banner> companionad;

    @BindField
    private List<Integer> companiontype;

    @BindField
    private List<Integer> delivery;

    @BindField
    private Integer feed;

    @BindField
    private Integer maxbitrate;

    @BindField
    private Integer maxduration;

    @BindField
    private Integer maxextended;

    @BindField
    private Integer maxseq;

    @BindField
    private List<String> mimes;

    @BindField
    private Integer minbitrate;

    @BindField
    private Integer minduration;

    @BindField
    private Integer nvol;

    @BindField
    private Integer protocol;

    @BindField
    private List<Integer> protocols;

    @BindField
    private Integer startdelay;

    @BindField
    private Integer stitched;

    public Audio() {
    }

    public List<Integer> getApi() {
        return this.api;
    }

    public List<Integer> getBlockedAttr() {
        return this.battr;
    }

    public List<Banner> getCompanionAds() {
        return this.companionad;
    }

    public List<Integer> getCompanionTypes() {
        return this.companiontype;
    }

    public List<Integer> getDelivery() {
        return this.delivery;
    }

    public Integer getFeed() {
        return this.feed;
    }

    public Integer getMaxBitRate() {
        return this.maxbitrate;
    }

    public Integer getMaxDuration() {
        return this.maxduration;
    }

    public Integer getMaxExtended() {
        return this.maxextended;
    }

    public Integer getMaxSeq() {
        return this.maxseq;
    }

    public List<String> getMimes() {
        return this.mimes;
    }

    public Integer getMinBitRate() {
        return this.minbitrate;
    }

    public Integer getMinDuration() {
        return this.minduration;
    }

    public Integer getProtocol() {
        return this.protocol;
    }

    public List<Integer> getProtocols() {
        return this.protocols;
    }

    public Integer getStartDelay() {
        return this.startdelay;
    }

    public Integer getStitched() {
        return this.stitched;
    }

    public Integer getVolumeNormalizationMode() {
        return this.nvol;
    }

    public void setApi(List<Integer> list) {
        this.api = list;
    }

    public void setBlockedAttr(List<Integer> list) {
        this.battr = list;
    }

    public void setCompanionAds(List<Banner> list) {
        this.companionad = list;
    }

    public void setCompanionTypes(List<Integer> list) {
        this.companiontype = list;
    }

    public void setDelivery(List<Integer> list) {
        this.delivery = list;
    }

    public void setFeed(Integer num) {
        this.feed = num;
    }

    public void setMaxBitRate(Integer num) {
        this.maxbitrate = num;
    }

    public void setMaxDuration(Integer num) {
        this.maxduration = num;
    }

    public void setMaxExtended(Integer num) {
        this.maxextended = num;
    }

    public void setMaxSeq(Integer num) {
        this.maxseq = num;
    }

    public void setMimes(List<String> list) {
        this.mimes = list;
    }

    public void setMinBitRate(Integer num) {
        this.minbitrate = num;
    }

    public void setMinDuration(Integer num) {
        this.minduration = num;
    }

    public void setProtocol(Integer num) {
        this.protocol = num;
    }

    public void setProtocols(List<Integer> list) {
        this.protocols = list;
    }

    public void setStartDelay(Integer num) {
        this.startdelay = num;
    }

    public void setStitched(Integer num) {
        this.stitched = num;
    }

    public void setVolumeNormalizationMode(Integer num) {
        this.nvol = num;
    }

    public Audio(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
