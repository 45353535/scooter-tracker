package net.pubnative.lite.sdk.models;

import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SdkConfig extends JsonModel {

    @BindField
    public List<AdData> app_level;

    public SdkConfig() {
    }

    public Boolean isAtomEnabled() {
        AdData next;
        List<AdData> list = this.app_level;
        if (list == null || list.isEmpty()) {
            return Boolean.FALSE;
        }
        Iterator<AdData> it = this.app_level.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.type.equals(ConfigAssets.ATOM_ENABLED)) {
                break;
            }
        }
        return Boolean.valueOf(next != null && next.getBoolean().booleanValue());
    }

    public Boolean isExperienceEnabled() {
        AdData next;
        List<AdData> list = this.app_level;
        if (list == null || list.isEmpty()) {
            return Boolean.FALSE;
        }
        Iterator<AdData> it = this.app_level.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.type.equals(ConfigAssets.EXPERIENCE_ENABLED)) {
                break;
            }
        }
        return Boolean.valueOf(next != null && next.getBoolean().booleanValue());
    }

    public SdkConfig(JSONObject jSONObject) throws IllegalAccessException {
        fromJson(jSONObject);
    }
}
