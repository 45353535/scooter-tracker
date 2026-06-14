package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class GAMTypeConfigFactory {

    @NonNull
    private static final String KEY_AD_UNIT_ID = "ad_unit_id";

    @NonNull
    private static final String KEY_CACHE_SIZE = "cache_size";

    @NonNull
    private static final String KEY_FORMAT = "format";

    @NonNull
    private static final String KEY_UNITS = "units";

    @Nullable
    public static GAMTypeConfig create(@NonNull JSONObject jSONObject) {
        try {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(jSONObject.getString(KEY_FORMAT));
            if (adsFormatByRemoteName == null) {
                return null;
            }
            String string = jSONObject.getString(KEY_AD_UNIT_ID);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(KEY_UNITS);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(GAMUnitDataFactory.create(string, jSONArray.getJSONObject(i10)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new GAMTypeConfig(adsFormatByRemoteName, arrayList, jSONObject.optInt(KEY_CACHE_SIZE, 2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
