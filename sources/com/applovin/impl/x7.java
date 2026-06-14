package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class x7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11483b;

    private x7() {
    }

    public static x7 a(p8 p8Var, x7 x7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (x7Var == null) {
            try {
                x7Var = new x7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastSystemInfo", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastSystemInfo", th2);
                return null;
            }
        }
        if (!StringUtils.isValidString(x7Var.f11482a)) {
            String strD = p8Var.d();
            if (StringUtils.isValidString(strD)) {
                x7Var.f11482a = strD;
            }
        }
        if (!StringUtils.isValidString(x7Var.f11483b)) {
            String str = (String) p8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                x7Var.f11483b = str;
            }
        }
        return x7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        String str = this.f11482a;
        if (str == null ? x7Var.f11482a != null : !str.equals(x7Var.f11482a)) {
            return false;
        }
        String str2 = this.f11483b;
        String str3 = x7Var.f11483b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f11482a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11483b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f11482a + "', version='" + this.f11483b + "'}";
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        x7Var.f11482a = JsonUtils.getString(jSONObject, "name", null);
        x7Var.f11483b = JsonUtils.getString(jSONObject, "version", null);
        return x7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f11482a);
        JsonUtils.putString(jSONObject, "version", this.f11483b);
        return jSONObject;
    }
}
