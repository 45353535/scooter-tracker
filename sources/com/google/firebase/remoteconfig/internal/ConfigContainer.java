package com.google.firebase.remoteconfig.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigContainer {
    public static final String ROLLOUT_METADATA_AFFECTED_KEYS = "affectedParameterKeys";
    public static final String ROLLOUT_METADATA_ID = "rolloutId";
    public static final String ROLLOUT_METADATA_VARIANT_ID = "variantId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Date f33022h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f33023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f33024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f33025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONArray f33026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f33027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f33029g;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f33030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f33031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f33032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f33033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f33034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JSONArray f33035f;

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.f33030a, this.f33031b, this.f33032c, this.f33033d, this.f33034e, this.f33035f);
        }

        @CanIgnoreReturnValue
        public Builder replaceConfigsWith(Map<String, String> map) {
            this.f33030a = new JSONObject(map);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withAbtExperiments(JSONArray jSONArray) {
            try {
                this.f33032c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withFetchTime(Date date) {
            this.f33031b = date;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
            try {
                this.f33033d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withRolloutMetadata(JSONArray jSONArray) {
            try {
                this.f33035f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withTemplateVersionNumber(long j10) {
            this.f33034e = j10;
            return this;
        }

        private Builder() {
            this.f33030a = new JSONObject();
            this.f33031b = ConfigContainer.f33022h;
            this.f33032c = new JSONArray();
            this.f33033d = new JSONObject();
            this.f33034e = 0L;
            this.f33035f = new JSONArray();
        }

        @CanIgnoreReturnValue
        public Builder replaceConfigsWith(JSONObject jSONObject) {
            try {
                this.f33030a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder(ConfigContainer configContainer) {
            this.f33030a = configContainer.getConfigs();
            this.f33031b = configContainer.getFetchTime();
            this.f33032c = configContainer.getAbtExperiments();
            this.f33033d = configContainer.getPersonalizationMetadata();
            this.f33034e = configContainer.getTemplateVersionNumber();
            this.f33035f = configContainer.getRolloutMetadata();
        }
    }

    static ConfigContainer b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map c() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getRolloutMetadata().length(); i10++) {
            JSONObject jSONObject = getRolloutMetadata().getJSONObject(i10);
            String string = jSONObject.getString(ROLLOUT_METADATA_ID);
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray(ROLLOUT_METADATA_AFFECTED_KEYS);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static ConfigContainer d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigContainer) {
            return this.f33023a.toString().equals(((ConfigContainer) obj).toString());
        }
        return false;
    }

    public JSONArray getAbtExperiments() {
        return this.f33026d;
    }

    public Set<String> getChangedParams(ConfigContainer configContainer) throws JSONException {
        JSONObject configs = d(configContainer.f33023a).getConfigs();
        Map mapC = c();
        Map mapC2 = configContainer.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = getConfigs().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!configContainer.getConfigs().has(next)) {
                hashSet.add(next);
            } else if (!getConfigs().get(next).equals(configContainer.getConfigs().get(next))) {
                hashSet.add(next);
            } else if ((getPersonalizationMetadata().has(next) && !configContainer.getPersonalizationMetadata().has(next)) || (!getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next))) {
                hashSet.add(next);
            } else if (getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next) && !getPersonalizationMetadata().getJSONObject(next).toString().equals(configContainer.getPersonalizationMetadata().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                configs.remove(next);
            }
        }
        Iterator<String> itKeys2 = configs.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject getConfigs() {
        return this.f33024b;
    }

    public Date getFetchTime() {
        return this.f33025c;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.f33027e;
    }

    public JSONArray getRolloutMetadata() {
        return this.f33029g;
    }

    public long getTemplateVersionNumber() {
        return this.f33028f;
    }

    public int hashCode() {
        return this.f33023a.hashCode();
    }

    public String toString() {
        return this.f33023a.toString();
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f33024b = jSONObject;
        this.f33025c = date;
        this.f33026d = jSONArray;
        this.f33027e = jSONObject2;
        this.f33028f = j10;
        this.f33029g = jSONArray2;
        this.f33023a = jSONObject3;
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }
}
