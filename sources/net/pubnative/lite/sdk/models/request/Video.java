package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Video extends JsonModel {

    @BindField
    private List<Integer> api;

    @BindField
    private List<Integer> battr;

    @BindField
    private Integer clktype;

    @BindField
    private List<Banner> companionad;

    @BindField
    private List<Integer> companiontype;

    @BindField
    private List<Integer> delivery;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @BindField
    private Integer f95912h;

    @BindField
    private Integer linearity;

    @BindField
    private Integer maxbitrate;

    @BindField
    private Integer maxduration;

    @BindField
    private Integer maxextended;

    @BindField
    private List<String> mimes;

    @BindField
    private Integer minbitrate;

    @BindField
    private Integer minduration;

    @BindField
    private Boolean mraidendcard;

    @BindField
    private Integer placement;

    @BindField
    private Integer playbackend;

    @BindField
    private List<Integer> playbackmethod;

    @BindField
    private Integer plcmt;

    @BindField
    private Integer pos;

    @BindField
    private Integer protocol;

    @BindField
    private List<Integer> protocols;

    @BindField
    private Integer sequence;

    @BindField
    private Integer skip;

    @BindField
    private Integer startdelay;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @BindField
    private Integer f95913w;

    @BindField
    private Integer skipmin = 0;

    @BindField
    private Integer skipafter = 0;

    @BindField
    private Integer boxingallowed = 1;

    public Video() {
    }

    public List<Integer> getApi() {
        return this.api;
    }

    public List<Integer> getBlockedAttr() {
        return this.battr;
    }

    public Integer getBoxingAllowed() {
        return this.boxingallowed;
    }

    public Integer getClickType() {
        return this.clktype;
    }

    public List<Banner> getCompanionAds() {
        return this.companionad;
    }

    public List<Integer> getCompanionType() {
        return this.companiontype;
    }

    public List<Integer> getDelivery() {
        return this.delivery;
    }

    public Integer getHeight() {
        return this.f95912h;
    }

    public Integer getLinearity() {
        return this.linearity;
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

    public List<String> getMimes() {
        return this.mimes;
    }

    public Integer getMinBitRate() {
        return this.minbitrate;
    }

    public Integer getMinDuration() {
        return this.minduration;
    }

    public Boolean getMraidEndcard() {
        return this.mraidendcard;
    }

    public Integer getPlacement() {
        return this.placement;
    }

    public Integer getPlacementSubtype() {
        return this.plcmt;
    }

    public Integer getPlaybackEnd() {
        return this.playbackend;
    }

    public List<Integer> getPlaybackMethod() {
        return this.playbackmethod;
    }

    public Integer getPos() {
        return this.pos;
    }

    public Integer getProtocol() {
        return this.protocol;
    }

    public List<Integer> getProtocols() {
        return this.protocols;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Integer getSkip() {
        return this.skip;
    }

    public Integer getSkipAfter() {
        return this.skipafter;
    }

    public Integer getSkipMin() {
        return this.skipmin;
    }

    public Integer getStartDelay() {
        return this.startdelay;
    }

    public Integer getWidth() {
        return this.f95913w;
    }

    public void setApi(List<Integer> list) {
        this.api = list;
    }

    public void setBlockedAttr(List<Integer> list) {
        this.battr = list;
    }

    public void setBoxingAllowed(Integer num) {
        this.boxingallowed = num;
    }

    public void setClickType(Integer num) {
        this.clktype = num;
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

    public void setHeight(Integer num) {
        this.f95912h = num;
    }

    public void setLinearity(Integer num) {
        this.linearity = num;
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

    public void setMimes(List<String> list) {
        this.mimes = list;
    }

    public void setMinBitRate(Integer num) {
        this.minbitrate = num;
    }

    public void setMinDuration(Integer num) {
        this.minduration = num;
    }

    public void setMraidEndcard(Boolean bool) {
        this.mraidendcard = bool;
    }

    public void setPlacement(Integer num) {
        this.placement = num;
    }

    public void setPlacementSubtype(Integer num) {
        this.plcmt = num;
    }

    public void setPlaybackEnd(Integer num) {
        this.playbackend = num;
    }

    public void setPlaybackMethod(List<Integer> list) {
        this.playbackmethod = list;
    }

    public void setPos(Integer num) {
        this.pos = num;
    }

    public void setProtocol(Integer num) {
        this.protocol = num;
    }

    public void setProtocols(List<Integer> list) {
        this.protocols = list;
    }

    public void setSequence(Integer num) {
        this.sequence = num;
    }

    public void setSkip(Integer num) {
        this.skip = num;
    }

    public void setSkipAfter(Integer num) {
        this.skipafter = num;
    }

    public void setSkipMin(Integer num) {
        this.skipmin = num;
    }

    public void setStartDelay(Integer num) {
        this.startdelay = num;
    }

    public void setWidth(Integer num) {
        this.f95913w = num;
    }

    public Video(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
