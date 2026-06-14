package sg.bigo.ads.ad.banner;

import androidx.annotation.NonNull;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.AdSize;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @NonNull
    public static JSONArray a(@NonNull List<AdSize> list) {
        JSONArray jSONArray = new JSONArray();
        for (AdSize adSize : list) {
            if (adSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, adSize.getWidth());
                    jSONObject.put("h", adSize.getHeight());
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, AdSize.ADAPTIVE.equals(adSize.f102081a) ? 1 : 0);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
