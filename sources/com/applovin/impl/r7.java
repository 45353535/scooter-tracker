package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class r7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w7 f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f10359e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f10360f = new HashMap();

    private r7() {
    }

    public static r7 a(p8 p8Var, r7 r7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 p8VarC;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (r7Var == null) {
            try {
                r7Var = new r7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastCompanionAd", th2);
                return null;
            }
        }
        if (r7Var.f10355a == 0 && r7Var.f10356b == 0) {
            int i10 = StringUtils.parseInt((String) p8Var.a().get("width"));
            int i11 = StringUtils.parseInt((String) p8Var.a().get("height"));
            if (i10 > 0 && i11 > 0) {
                r7Var.f10355a = i10;
                r7Var.f10356b = i11;
            }
        }
        r7Var.f10358d = w7.a(p8Var, r7Var.f10358d, kVar);
        if (r7Var.f10357c == null && (p8VarC = p8Var.c(com.taurusx.tax.f.c.f66001o)) != null) {
            String strD = p8VarC.d();
            if (StringUtils.isValidString(strD)) {
                r7Var.f10357c = Uri.parse(strD);
            }
        }
        a8.a(p8Var.a(com.taurusx.tax.f.c.f66002s), r7Var.f10359e, s7Var, kVar);
        a8.a(p8Var, r7Var.f10360f, s7Var, kVar);
        return r7Var;
    }

    public Set b() {
        return this.f10359e;
    }

    public Uri c() {
        return this.f10357c;
    }

    public Map d() {
        return this.f10360f;
    }

    public w7 e() {
        return this.f10358d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.f10355a != r7Var.f10355a || this.f10356b != r7Var.f10356b) {
            return false;
        }
        Uri uri = this.f10357c;
        if (uri == null ? r7Var.f10357c != null : !uri.equals(r7Var.f10357c)) {
            return false;
        }
        w7 w7Var = this.f10358d;
        if (w7Var == null ? r7Var.f10358d != null : !w7Var.equals(r7Var.f10358d)) {
            return false;
        }
        Set set = this.f10359e;
        if (set == null ? r7Var.f10359e != null : !set.equals(r7Var.f10359e)) {
            return false;
        }
        Map map = this.f10360f;
        Map map2 = r7Var.f10360f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i10 = ((this.f10355a * 31) + this.f10356b) * 31;
        Uri uri = this.f10357c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        w7 w7Var = this.f10358d;
        int iHashCode2 = (iHashCode + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.f10359e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f10360f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f10355a + ", height=" + this.f10356b + ", destinationUri=" + this.f10357c + ", nonVideoResource=" + this.f10358d + ", clickTrackers=" + this.f10359e + ", eventTrackers=" + this.f10360f + '}';
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        w7 w7VarA = w7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.taurusx.tax.g.n.f66153a, new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i12, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        r7 r7Var = new r7();
        r7Var.f10355a = i10;
        r7Var.f10356b = i11;
        r7Var.f10357c = uri;
        r7Var.f10358d = w7VarA;
        r7Var.f10359e.addAll(hashSet);
        return r7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f10355a);
        JsonUtils.putInt(jSONObject, "height", this.f10356b);
        Uri uri = this.f10357c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        w7 w7Var = this.f10358d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", w7Var != null ? w7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f10359e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, com.taurusx.tax.g.n.f66153a, jSONArray);
        return jSONObject;
    }
}
