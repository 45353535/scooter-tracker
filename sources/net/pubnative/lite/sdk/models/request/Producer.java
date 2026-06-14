package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Producer extends JsonModel {

    @BindField
    private List<String> cat;

    @BindField
    private String domain;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95906id;

    @BindField
    private String name;

    public Producer() {
    }

    public List<String> getCategories() {
        return this.cat;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getId() {
        return this.f95906id;
    }

    public String getName() {
        return this.name;
    }

    public void setCategories(List<String> list) {
        this.cat = list;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setId(String str) {
        this.f95906id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Producer(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
