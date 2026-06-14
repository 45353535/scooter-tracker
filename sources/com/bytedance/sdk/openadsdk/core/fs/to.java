package com.bytedance.sdk.openadsdk.core.fs;

import android.text.TextUtils;
import com.taurusx.tax.f.z;
import com.taurusx.tax.vast.ViewabilityVendor;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    private final String lnr;
    private final String mml;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final URL f17240ud;

    private to(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.qdl = str2;
        this.f17240ud = new URL(str);
        this.lnr = str3;
        this.mml = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        if (qdl(this.qdl, toVar.qdl) && qdl(this.f17240ud, toVar.f17240ud) && qdl(this.lnr, toVar.lnr)) {
            return qdl(this.mml, toVar.mml);
        }
        return false;
    }

    public int hashCode() {
        String str = this.qdl;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f17240ud.hashCode()) * 31;
        String str2 = this.lnr;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mml;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL lnr() {
        return this.f17240ud;
    }

    public JSONObject mml() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put(ViewabilityVendor.f67064a, this.f17240ud.toString());
            if (!TextUtils.isEmpty(this.qdl)) {
                jSONObject.put("vendorKey", this.qdl);
            }
            if (!TextUtils.isEmpty(this.lnr)) {
                jSONObject.put(ViewabilityVendor.f67069t, this.lnr);
            }
            if (!TextUtils.isEmpty(this.mml)) {
                jSONObject.put(z.f66064m, this.mml);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.lnr;
    }

    private boolean qdl(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static to qdl(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new to(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static to qdl(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString(ViewabilityVendor.f67064a);
            if ("omid".equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new to(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString(ViewabilityVendor.f67069t), jSONObject.optString(z.f66064m));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<to> qdl(JSONArray jSONArray) {
        HashSet<to> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(qdl(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
