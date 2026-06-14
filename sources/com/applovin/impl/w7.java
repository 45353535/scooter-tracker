package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.taurusx.tax.vast.VastResourceXmlManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class w7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f11223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f11224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11225c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private w7() {
    }

    static w7 a(p8 p8Var, w7 w7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (w7Var == null) {
            try {
                w7Var = new w7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastNonVideoResource", th2);
                return null;
            }
        }
        if (w7Var.f11224b == null && !StringUtils.isValidString(w7Var.f11225c)) {
            String strA = a(p8Var, VastResourceXmlManager.STATIC_RESOURCE);
            if (URLUtil.isValidUrl(strA)) {
                w7Var.f11224b = Uri.parse(strA);
                w7Var.f11223a = a.STATIC;
                return w7Var;
            }
            String strA2 = a(p8Var, VastResourceXmlManager.IFRAME_RESOURCE);
            if (StringUtils.isValidString(strA2)) {
                w7Var.f11223a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    w7Var.f11224b = Uri.parse(strA2);
                    return w7Var;
                }
                w7Var.f11225c = strA2;
                return w7Var;
            }
            String strA3 = a(p8Var, VastResourceXmlManager.HTML_RESOURCE);
            if (StringUtils.isValidString(strA3)) {
                w7Var.f11223a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    w7Var.f11224b = Uri.parse(strA3);
                    return w7Var;
                }
                w7Var.f11225c = strA3;
            }
        }
        return w7Var;
    }

    public String b() {
        return this.f11225c;
    }

    public Uri c() {
        return this.f11224b;
    }

    public a d() {
        return this.f11223a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.f11223a != w7Var.f11223a) {
            return false;
        }
        Uri uri = this.f11224b;
        if (uri == null ? w7Var.f11224b != null : !uri.equals(w7Var.f11224b)) {
            return false;
        }
        String str = this.f11225c;
        String str2 = w7Var.f11225c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f11223a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f11224b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f11225c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f11223a + ", resourceUri=" + this.f11224b + ", resourceContents='" + this.f11225c + "'}";
    }

    private static String a(p8 p8Var, String str) {
        p8 p8VarC = p8Var.c(str);
        if (p8VarC != null) {
            return p8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f11224b = uri;
    }

    public void a(String str) {
        this.f11225c = str;
    }

    public static w7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        w7 w7Var = new w7();
        w7Var.f11223a = aVarValueOf;
        w7Var.f11224b = uri;
        w7Var.f11225c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return w7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f11223a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f11224b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f11225c);
        return jSONObject;
    }
}
