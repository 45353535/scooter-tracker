package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Site extends JsonModel {

    @BindField
    private List<String> cat;

    @BindField
    private Content content;

    @BindField
    private String domain;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95909id;

    @BindField
    private String keywords;

    @BindField
    private Integer mobile;

    @BindField
    private String name;

    @BindField
    private String page;

    @BindField
    private List<String> pagecat;

    @BindField
    private Integer privacypolicy;

    @BindField
    private Publisher publisher;

    @BindField
    private String ref;

    @BindField
    private String search;

    @BindField
    private List<String> sectioncat;

    public Site() {
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
        return this.f95909id;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Integer getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getPage() {
        return this.page;
    }

    public List<String> getPageCategories() {
        return this.pagecat;
    }

    public Integer getPrivacyPolicy() {
        return this.privacypolicy;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public String getRef() {
        return this.ref;
    }

    public String getSearch() {
        return this.search;
    }

    public List<String> getSectionCategories() {
        return this.sectioncat;
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
        this.f95909id = str;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setMobile(Integer num) {
        this.mobile = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPage(String str) {
        this.page = str;
    }

    public void setPageCategories(List<String> list) {
        this.pagecat = list;
    }

    public void setPrivacyPolicy(Integer num) {
        this.privacypolicy = num;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setRef(String str) {
        this.ref = str;
    }

    public void setSearch(String str) {
        this.search = str;
    }

    public void setSectionCategories(List<String> list) {
        this.sectioncat = list;
    }

    public Site(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
