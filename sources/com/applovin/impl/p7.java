package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class p7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f10119d;

    private p7(String str, List list, String str2, Set set) {
        this.f10116a = str;
        this.f10117b = list;
        this.f10118c = str2;
        this.f10119d = set;
    }

    public static p7 a(p8 p8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) p8Var.a().get(com.taurusx.tax.f.z.f66061c);
            p8 p8VarB = p8Var.b(com.taurusx.tax.f.z.f66065n);
            String strD = p8VarB != null ? p8VarB.d() : null;
            List listA = p8Var.a(com.taurusx.tax.f.z.f66066o);
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                v7 v7VarA = v7.a((p8) it.next(), kVar);
                if (v7VarA != null) {
                    arrayList.add(v7VarA);
                }
            }
            HashMap map = new HashMap();
            a8.a(p8Var, map, s7Var, kVar);
            return new p7(str, arrayList, strD, (Set) map.get(com.taurusx.tax.f.z.f66064m));
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastAdVerification", th2);
            return null;
        }
    }

    public Set b() {
        return this.f10119d;
    }

    public List c() {
        return this.f10117b;
    }

    public String d() {
        return this.f10116a;
    }

    public String e() {
        return this.f10118c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f10116a;
            if (str == null ? p7Var.f10116a != null : !str.equals(p7Var.f10116a)) {
                return false;
            }
            List list = this.f10117b;
            if (list == null ? p7Var.f10117b != null : !list.equals(p7Var.f10117b)) {
                return false;
            }
            String str2 = this.f10118c;
            if (str2 == null ? p7Var.f10118c != null : !str2.equals(p7Var.f10118c)) {
                return false;
            }
            Set set = this.f10119d;
            Set set2 = p7Var.f10119d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f10116a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f10117b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f10118c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f10119d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f10116a + "'javascriptResources='" + this.f10117b + "'verificationParameters='" + this.f10118c + "'errorEventTrackers='" + this.f10119d + "'}";
    }

    public static p7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (v7VarA != null) {
                arrayList.add(v7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, POBCoreNativeConstants.NATIVE_VERIFICATION_PARAMETERS, null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        return new p7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f10116a);
        if (this.f10117b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f10117b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, POBCoreNativeConstants.NATIVE_VERIFICATION_PARAMETERS, this.f10118c);
        if (this.f10119d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f10119d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
