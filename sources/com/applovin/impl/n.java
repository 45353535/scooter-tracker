package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f9855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f9856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f9857e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f9853a = JsonUtils.getString(jSONObject, "name", "");
        this.f9854b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f9855c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f9857e = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f9857e.add(new o(jSONObject2, map, this.f9855c, kVar));
            }
        }
        this.f9856d = this.f9857e.isEmpty() ? null : (o) this.f9857e.get(0);
    }

    public MaxAdFormat a() {
        return this.f9855c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f9855c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f9853a;
    }

    public String d() {
        return this.f9854b;
    }

    public String e() {
        return "\n---------- " + this.f9854b + " ----------\nIdentifier - " + this.f9853a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f9856d;
    }

    public List g() {
        return this.f9857e;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f9854b.compareToIgnoreCase(nVar.f9854b);
    }
}
