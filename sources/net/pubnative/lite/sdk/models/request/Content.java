package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Content extends JsonModel {

    @BindField
    private String album;

    @BindField
    private String artist;

    @BindField
    private List<String> cat;

    @BindField
    private String contentrating;

    @BindField
    private Integer context;

    @BindField
    private List<Data> data;

    @BindField
    private Integer embeddable;

    @BindField
    private Integer episode;

    @BindField
    private String genre;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95896id;

    @BindField
    private String isrc;

    @BindField
    private String keywords;

    @BindField
    private String language;

    @BindField
    private Integer len;

    @BindField
    private Integer livestream;

    @BindField
    private Integer prodq;

    @BindField
    private Producer producer;

    @BindField
    private Integer qagmediarating;

    @BindField
    private String season;

    @BindField
    private String series;

    @BindField
    private Integer sourcerelationship;

    @BindField
    private String title;

    @BindField
    private String url;

    @BindField
    private String userrating;

    @BindField
    private Integer videoquality;

    public Content() {
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtist() {
        return this.artist;
    }

    public List<String> getCategories() {
        return this.cat;
    }

    public String getContentRating() {
        return this.contentrating;
    }

    public Integer getContext() {
        return this.context;
    }

    public List<Data> getData() {
        return this.data;
    }

    public Integer getEmbeddable() {
        return this.embeddable;
    }

    public Integer getEpisode() {
        return this.episode;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getId() {
        return this.f95896id;
    }

    public String getIsrc() {
        return this.isrc;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public String getLanguage() {
        return this.language;
    }

    public Integer getLen() {
        return this.len;
    }

    public Integer getLivestream() {
        return this.livestream;
    }

    public Producer getProducer() {
        return this.producer;
    }

    public Integer getProductionQuality() {
        return this.prodq;
    }

    public Integer getQagMediaRating() {
        return this.qagmediarating;
    }

    public String getSeason() {
        return this.season;
    }

    public String getSeries() {
        return this.series;
    }

    public Integer getSourceRelationship() {
        return this.sourcerelationship;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserRating() {
        return this.userrating;
    }

    public Integer getVideoQuality() {
        return this.videoquality;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public void setCategories(List<String> list) {
        this.cat = list;
    }

    public void setContentRating(String str) {
        this.contentrating = str;
    }

    public void setContext(Integer num) {
        this.context = num;
    }

    public void setData(List<Data> list) {
        this.data = list;
    }

    public void setEmbeddable(Integer num) {
        this.embeddable = num;
    }

    public void setEpisode(Integer num) {
        this.episode = num;
    }

    public void setGenre(String str) {
        this.genre = str;
    }

    public void setId(String str) {
        this.f95896id = str;
    }

    public void setIsrc(String str) {
        this.isrc = str;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLen(Integer num) {
        this.len = num;
    }

    public void setLivestream(Integer num) {
        this.livestream = num;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setProductionQuality(Integer num) {
        this.prodq = num;
    }

    public void setQagMediaRating(Integer num) {
        this.qagmediarating = num;
    }

    public void setSeason(String str) {
        this.season = str;
    }

    public void setSeries(String str) {
        this.series = str;
    }

    public void setSourceRelationship(Integer num) {
        this.sourcerelationship = num;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserRating(String str) {
        this.userrating = str;
    }

    public void setVideoQuality(Integer num) {
        this.videoquality = num;
    }

    public Content(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
