package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4365ia;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.q;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AdData {
    private final Map<String, Object> mAdUnitData;
    private final Map<String, Object> mConfiguration;
    private final String mServerData;

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static AdData createAdDataForNetworkAdapter(@NotNull JSONObject jSONObject, @NotNull IronSource.a aVar, @Nullable String str) {
        return createAdDataForNetworkAdapter(jSONObject, aVar, str, null);
    }

    public Map<String, Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.mConfiguration.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.mConfiguration;
    }

    public Integer getInt(String str) {
        return (Integer) this.mConfiguration.get(str);
    }

    public String getServerData() {
        return this.mServerData;
    }

    public String getString(String str) {
        return (String) this.mConfiguration.get(str);
    }

    public static AdData createAdDataForNetworkAdapter(@NotNull JSONObject jSONObject, @NotNull IronSource.a aVar, @Nullable String str, @Nullable q qVar) {
        HashMap map = new HashMap();
        map.put("adUnit", aVar);
        if (str != null) {
            map.put("userId", str);
        }
        if (qVar != null) {
            map.put("bannerSize", qVar.getSize());
        }
        return new AdData(null, C4365ia.a(jSONObject), map);
    }
}
