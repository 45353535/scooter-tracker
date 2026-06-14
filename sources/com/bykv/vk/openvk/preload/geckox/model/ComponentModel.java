package com.bykv.vk.openvk.preload.geckox.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ComponentModel {
    private Map<String, List<UpdatePackage>> packages;
    private Map<String, b> universalStrategies;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Long> f15854c;

        public final a a(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                        this.f15852a = (String) com.bykv.vk.openvk.preload.falconx.a.a.a(jSONObject, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, String.class);
                    }
                    if (jSONObject.has("clean_type")) {
                        this.f15853b = jSONObject.optInt("clean_type");
                    }
                    if (jSONObject.has("version") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("version")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f15854c = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            this.f15854c.add(Long.valueOf(jSONArrayOptJSONArray.optLong(i10)));
                        }
                    }
                    if (jSONObject.has("status")) {
                        jSONObject.optInt("status");
                    }
                    if (jSONObject.has("pkg_id")) {
                        jSONObject.optInt("pkg_id");
                    }
                    if (jSONObject.has("err_code")) {
                        jSONObject.optInt("err_code");
                    }
                    if (jSONObject.has("err_msg")) {
                        com.bykv.vk.openvk.preload.falconx.a.a.a(jSONObject, "err_msg", String.class);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<a> f15855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f15856b;

        public final b a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("specified_clean") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("specified_clean")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f15855a = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject2 != null) {
                                a aVar = new a();
                                aVar.a(jSONObjectOptJSONObject2);
                                this.f15855a.add(aVar);
                            }
                        }
                    }
                    if (jSONObject.has("group_clean") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("group_clean")) != null) {
                        c cVar = new c();
                        this.f15856b = cVar;
                        cVar.a(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static class c {
        public final c a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("rule")) {
                        jSONObject.optInt("rule");
                    }
                    if (jSONObject.has("policy")) {
                        jSONObject.optInt("policy");
                    }
                    if (jSONObject.has("limit")) {
                        jSONObject.optInt("limit");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public ComponentModel fromJson(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("packages") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("packages")) != null) {
                    this.packages = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i10);
                                if (jSONObjectOptJSONObject3 != null) {
                                    UpdatePackage updatePackage = new UpdatePackage();
                                    updatePackage.fromJson(jSONObjectOptJSONObject3);
                                    arrayList.add(updatePackage);
                                }
                            }
                            this.packages.put(next, arrayList);
                        }
                    }
                }
                if (jSONObject.has("universal_strategies") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("universal_strategies")) != null) {
                    this.universalStrategies = new HashMap();
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(next2);
                        if (jSONObjectOptJSONObject4 != null) {
                            b bVar = new b();
                            bVar.a(jSONObjectOptJSONObject4);
                            this.universalStrategies.put(next2, bVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
