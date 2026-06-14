package net.pubnative.lite.sdk.db;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SessionImpression extends JsonModel {

    @BindField
    private Long age_of_app;

    @BindField
    private Integer count;

    @BindField
    private Long session_duration;

    @BindField
    private Long timestamp;

    @BindField
    private String zone_id;

    public SessionImpression() {
    }

    public Long getAgeOfApp() {
        return this.age_of_app;
    }

    public Integer getCount() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num;
    }

    public Long getSessionDuration() {
        return this.session_duration;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getZoneId() {
        return this.zone_id;
    }

    public void setAgeOfApp(Long l10) {
        this.age_of_app = l10;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setSessionDuration(Long l10) {
        this.session_duration = l10;
    }

    public void setTimestamp(Long l10) {
        this.timestamp = l10;
    }

    public void setZoneId(String str) {
        this.zone_id = str;
    }

    public SessionImpression(JSONObject jSONObject) {
        try {
            fromJson(jSONObject);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
