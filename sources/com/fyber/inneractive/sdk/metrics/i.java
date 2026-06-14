package com.fyber.inneractive.sdk.metrics;

import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21152a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21153b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21155d;

    public static JSONArray a(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (h hVar : linkedHashMap.keySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("outcome", hVar.f21151b);
                jSONObject.putOpt("time", linkedHashMap.get(hVar));
                jSONObject.putOpt("idx", Integer.valueOf(jSONArray.length()));
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
