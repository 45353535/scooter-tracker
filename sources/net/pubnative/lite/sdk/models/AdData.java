package net.pubnative.lite.sdk.models;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdData extends JsonModel implements Serializable {

    @BindField
    public Map<String, Object> data;

    @BindField
    public String type;

    public AdData() {
    }

    public Boolean getBoolean() {
        return getBooleanField(TypedValues.Custom.S_BOOLEAN);
    }

    public Boolean getBooleanField(String str) {
        if (getDataField(str) instanceof Boolean) {
            return (Boolean) getDataField(str);
        }
        return null;
    }

    protected Object getDataField(String str) {
        Map<String, Object> map = this.data;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.data.get(str);
    }

    public Double getDoubleField(String str) {
        if (getDataField(str) instanceof Number) {
            return Double.valueOf(((Number) getDataField(str)).doubleValue());
        }
        return null;
    }

    public int getHeight() {
        Integer intField = getIntField("h");
        if (intField == null) {
            return 0;
        }
        return intField.intValue();
    }

    public String getHtml() {
        return getStringField("html");
    }

    public Integer getIntField(String str) {
        Object dataField = getDataField(str);
        if (dataField instanceof Integer) {
            return (Integer) dataField;
        }
        return null;
    }

    public String getJS() {
        return getStringField("js");
    }

    public JSONObject getJSONObjectField(String str) {
        Object dataField = getDataField(str);
        if (dataField instanceof JSONObject) {
            return (JSONObject) dataField;
        }
        return null;
    }

    public Double getNumber() {
        return getDoubleField("number");
    }

    public String getStringField(String str) {
        try {
            return (String) getDataField(str);
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public String getText() {
        return getStringField("text");
    }

    public String getURL() {
        return getStringField("url");
    }

    public int getWidth() {
        Integer intField = getIntField(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        if (intField == null) {
            return 0;
        }
        return intField.intValue();
    }

    public Boolean hasField(String str) {
        Map<String, Object> map = this.data;
        return Boolean.valueOf(map != null && map.containsKey(str));
    }

    public AdData(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }

    public AdData(String str, String str2, String str3) {
        HashMap map = new HashMap();
        this.data = map;
        map.put(str, str3);
        this.type = str2;
    }
}
