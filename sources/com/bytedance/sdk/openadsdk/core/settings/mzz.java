package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.aaj;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface mzz {
    public static final ud<JSONObject> qdl = new ud<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mzz.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public JSONObject ud(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                aaj.qdl("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final ud<Set<String>> f17472ud = new ud<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mzz.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Set<String> ud(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
            } catch (Exception e10) {
                aaj.qdl("ISettingsDataRepository", "", e10);
            }
            return hashSet;
        }
    };

    public interface qdl {
        qdl qdl(String str);

        qdl qdl(String str, float f10);

        qdl qdl(String str, int i10);

        qdl qdl(String str, long j10);

        qdl qdl(String str, String str2);

        qdl qdl(String str, boolean z10);

        void qdl();
    }

    public interface ud<T> {
        T ud(String str);
    }

    void qdl(JSONObject jSONObject);
}
