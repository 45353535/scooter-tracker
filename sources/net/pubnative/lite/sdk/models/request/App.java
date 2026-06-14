package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class App extends JsonModel {

    @BindField
    private String bundle;

    @BindField
    private List<String> cat;

    @BindField
    private Content content;

    @BindField
    private String domain;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95892id;

    @BindField
    private String keywords;

    @BindField
    private String name;

    @BindField
    private List<String> pagecat;

    @BindField
    private Integer paid;

    @BindField
    private Integer privacypolicy;

    @BindField
    private Publisher publisher;

    @BindField
    private List<String> sectioncat;

    @BindField
    private String storeurl;

    @BindField
    private String ver;

    public App() {
    }

    public String getBundle() {
        return this.bundle;
    }

    public List<String> getCategories() {
        return this.cat;
    }

    public Content getContent() {
        return this.content;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getId() {
        return this.f95892id;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPageCategories() {
        return this.pagecat;
    }

    public Integer getPaid() {
        return this.paid;
    }

    public Integer getPrivacyPolicy() {
        return this.privacypolicy;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public List<String> getSectionCategories() {
        return this.sectioncat;
    }

    public String getStoreUrl() {
        return this.storeurl;
    }

    public String getVersion() {
        return this.ver;
    }

    public void setBundle(String str) {
        this.bundle = str;
    }

    public void setCategories(List<String> list) {
        this.cat = list;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setId(String str) {
        this.f95892id = str;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPageCategories(List<String> list) {
        this.pagecat = list;
    }

    public void setPaid(Integer num) {
        this.paid = num;
    }

    public void setPrivacyPolicy(Integer num) {
        this.privacypolicy = num;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setSectionCategories(List<String> list) {
        this.sectioncat = list;
    }

    public void setStoreUrl(String str) {
        this.storeurl = str;
    }

    public void setVersion(String str) {
        this.ver = str;
    }

    public App(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
