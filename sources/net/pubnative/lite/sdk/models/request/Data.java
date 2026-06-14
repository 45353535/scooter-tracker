package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Data extends JsonModel {

    @BindField
    private DataExtension ext;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @BindField
    private String f95897id;

    @BindField
    private String name;

    @BindField
    private List<Segment> segment;

    public Data() {
    }

    public DataExtension getExt() {
        return this.ext;
    }

    public String getId() {
        return this.f95897id;
    }

    public String getName() {
        return this.name;
    }

    public List<Segment> getSegment() {
        return this.segment;
    }

    public void setExt(DataExtension dataExtension) {
        this.ext = dataExtension;
    }

    public void setId(String str) {
        this.f95897id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSegment(List<Segment> list) {
        this.segment = list;
    }

    public Data(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
